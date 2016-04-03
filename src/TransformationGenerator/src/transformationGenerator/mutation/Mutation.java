package transformationGenerator.mutation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

import etlMetaModel.MofClass;
import etlMetaModel.MofProperty;

public class Mutation {

	// Variable definition helper

	public String getSingularOf(String name) {
		return name.subSequence(0, name.length() - 1).toString();
	}

	// Etl Input/Output Meta Model helper

	public MofProperty getNameProperty(MofClass mofClass) {
		return mofClass.getOwnedProperties().stream().filter(p -> p.getName().equals("Name")).findFirst().get();
	}

	public MofClass getTypeOf(MofProperty associationProperty) {
		if (associationProperty.getAssociation() != null) {
			return associationProperty.getAssociation().getMemberEnds().stream().filter(m -> m != associationProperty).map(m -> m.getClazz()).findFirst().get();
		} else {
			// TODO select primitive type...
			return null;
		}
	}

	public List<List<ChainedMofProperty>> getChainedProperties(etlMetaModel.MofClass mofClassSource, Boolean includePrimitivePropertiesAtTheEnd, Boolean includeCollectionPropertiesAtTheEnd, Boolean excludeChainsContainigMofClassSource, int maxDepth,
			Map<MofProperty, List<MofClass>> mofPropertyWithGuardedSuperclasses) {
		List<ChainedMofProperty> sourcePropertyChains = getChainedAssociationProperties(mofClassSource, false, /* maxDepth= */maxDepth, mofPropertyWithGuardedSuperclasses);

		List<ChainedMofProperty> sourcePropertyChainsWithPrimitiveProperties = null;
		if (includePrimitivePropertiesAtTheEnd) {
			sourcePropertyChainsWithPrimitiveProperties = getDirectDescendantPrimitiveChainedProperties(sourcePropertyChains, mofPropertyWithGuardedSuperclasses);
		}
		List<ChainedMofProperty> sourcePropertyChainsWithCollectionProperties = null;
		if (includeCollectionPropertiesAtTheEnd) {
			sourcePropertyChainsWithCollectionProperties = getDirectDescendantCollectionChainedProperties(sourcePropertyChains, mofPropertyWithGuardedSuperclasses);
		}

		if (sourcePropertyChainsWithPrimitiveProperties != null) {
			sourcePropertyChains.addAll(sourcePropertyChainsWithPrimitiveProperties);
		}
		if (sourcePropertyChainsWithCollectionProperties != null) {
			sourcePropertyChains.addAll(sourcePropertyChainsWithCollectionProperties);
		}
		sourcePropertyChains.remove(0); // remove root (only required to add primitive properties / collection properties)

		// excludeChainsContainigMofClassSource:
		HashSet<MofClass> subAndSuperClassesOfSourceMofClass;
		if (excludeChainsContainigMofClassSource) {
			subAndSuperClassesOfSourceMofClass = getSubClasses(mofClassSource, /* includeself: */true);
			// add guarded = allowed superclasses:
			if (mofPropertyWithGuardedSuperclasses != null && mofPropertyWithGuardedSuperclasses.containsKey(mofClassSource)) {
				subAndSuperClassesOfSourceMofClass.addAll(mofPropertyWithGuardedSuperclasses.get(mofClassSource));
			}
			// subAndSuperClassesOfSourceMofClass.add(null);
		} else {
			subAndSuperClassesOfSourceMofClass = new HashSet<MofClass>();
		}

		List<List<ChainedMofProperty>> sourcePropertyChainsFlattened = sourcePropertyChains.stream().flatMap(chainedPropertySource ->

				chainedPropertySource.toFlatLists(/* excludeChainsEndingIn= */subAndSuperClassesOfSourceMofClass).stream().collect(Collectors.toList()).stream()

				).collect(Collectors.toList());
		return sourcePropertyChainsFlattened;
	}

	public List<ChainedMofProperty> getChainedAssociationProperties(etlMetaModel.MofClass mofClassSource, Boolean collectionProperties, int maxDepth, Map<MofProperty, List<MofClass>> mofPropertyWithGuardedSuperclasses) {
		Map<MofProperty, ChainedMofProperty> chainedMofPropertiesByMofProperty = new HashMap<MofProperty, ChainedMofProperty>();

		Map<MofClass, List<ChainedMofProperty>> chainedPropertiesByOwnedMofClass = new HashMap<MofClass, List<ChainedMofProperty>>();
		Queue<ChainedMofProperty> unprocessedChainedProperties = new LinkedList<ChainedMofProperty>();

		ChainedMofProperty root = new ChainedMofProperty(mofClassSource, /* depth= */0, maxDepth);
		unprocessedChainedProperties.add(root);
		// getMofAssociationProperties(mofClassSource, collectionProperties).stream().forEach(p -> unprocessedChainedProperties.add(new ChainedMofProperty(p, root)));

		while (!unprocessedChainedProperties.isEmpty()) {
			ChainedMofProperty chainedProperty = unprocessedChainedProperties.poll();

			// target: connect to already collected properties of the type
			if (!chainedPropertiesByOwnedMofClass.containsKey(chainedProperty.getType())) {
				chainedPropertiesByOwnedMofClass.put(chainedProperty.getType(), new ArrayList<ChainedMofProperty>());
			}

			// queue all properties for this type class (with the current element being their previous one):
			List<MofProperty> mofAssociationProperties = getMofAssociationProperties(chainedProperty.getType(), collectionProperties);
			if (chainedProperty.previous != null && mofPropertyWithGuardedSuperclasses != null && chainedProperty.previous.contains(root) && mofPropertyWithGuardedSuperclasses.containsKey(chainedProperty.getMofProperty())) {
				// include also properties of superclasses that are checked by guards (this works currently only for properties of the root class):
				List<MofProperty> additionallyGuardedMofAssociationProperties = mofPropertyWithGuardedSuperclasses.get(chainedProperty.getMofProperty()).stream()
						.flatMap(additionallyGuardedMofClass -> getMofAssociationProperties(additionallyGuardedMofClass, collectionProperties).stream())
						.distinct()
						.filter(additionallyGuardedMofAssociationProperty -> !mofAssociationProperties.contains(additionallyGuardedMofAssociationProperty))
						.collect(Collectors.toList());
				mofAssociationProperties.addAll(additionallyGuardedMofAssociationProperties);
			}

			mofAssociationProperties.stream().forEach(p -> {

				// since getMofAssociationProperties returns also properties of sub and superclasses, duplicate ChainedMofProperties must be avoided:
					if (!chainedMofPropertiesByMofProperty.containsKey(p)) {
						if (chainedProperty.getDepth() + 1 <= maxDepth) {
							ChainedMofProperty chainedMofProperty = new ChainedMofProperty(p, chainedProperty, /* depth= */chainedProperty.getDepth() + 1, maxDepth);
							chainedMofPropertiesByMofProperty.put(p, chainedMofProperty);
							unprocessedChainedProperties.add(chainedMofProperty);
						}
					} else {
						if (chainedProperty.getDepth() + 1 <= maxDepth) {
							chainedMofPropertiesByMofProperty.get(p).previous.add(chainedProperty);
						}
					}
				});

			// source:
			if (chainedProperty.getMofProperty() != null) {
				MofClass ownedClass = chainedProperty.getMofProperty().getClazz();
				if (!chainedPropertiesByOwnedMofClass.containsKey(ownedClass)) {
					// create the list for the owning class:
					chainedPropertiesByOwnedMofClass.put(ownedClass, new ArrayList<ChainedMofProperty>());
				} else if (chainedPropertiesByOwnedMofClass.get(ownedClass).size() > 0) {
					// include already added previous chains into the current element:
					chainedPropertiesByOwnedMofClass.get(ownedClass).get(0).previous.forEach(c -> {
						if (!chainedProperty.previous.contains(c)) {
							if (c.getDepth() + 1 <= maxDepth) {
								chainedProperty.previous.add(c);
							}
						}
					});
				}
				// add it to the list of the owning class:
				chainedPropertiesByOwnedMofClass.get(ownedClass).add(chainedProperty);

				chainedMofPropertiesByMofProperty.put(chainedProperty.getMofProperty(), chainedProperty);
			}

		}

		// return as a flat list
		List<ChainedMofProperty> result = new ArrayList<ChainedMofProperty>();
		result.add(root);
		chainedPropertiesByOwnedMofClass.values().stream().forEach(result::addAll);
		return result;
	}

	public List<ChainedMofProperty> getDirectDescendantCollectionChainedProperties(List<ChainedMofProperty> chainedProperties, Map<MofProperty, List<MofClass>> mofPropertyWithGuardedSuperclasses) {
		Map<MofClass, List<ChainedMofProperty>> chainedPropertiesByType = groupChainedPropertiesByType(chainedProperties);

		List<ChainedMofProperty> directDescendantCollectionChainedProperties = new ArrayList<ChainedMofProperty>();

		chainedPropertiesByType.forEach((mofClassType, chainedPropertiesOfSameType) -> {

			Set<MofProperty> processedMofProperties = new HashSet<MofProperty>();

			getMofAssociationProperties(mofClassType, /* collectionProperties= */true).stream().map(p -> new ChainedMofProperty(p, null, chainedPropertiesOfSameType.get(0).getDepth() + 1, chainedPropertiesOfSameType.get(0).getMaxDepth() + 1))
					.forEach(cp -> {
						if (!processedMofProperties.contains(cp.getMofProperty())) {
							processedMofProperties.add(cp.getMofProperty());
							cp.previous.addAll(chainedPropertiesOfSameType);
							directDescendantCollectionChainedProperties.add(cp);
						}
					});
			if (mofPropertyWithGuardedSuperclasses != null) {
				chainedPropertiesOfSameType
						.stream()
						.filter(chainedPropertyOfSameType -> mofPropertyWithGuardedSuperclasses.containsKey(chainedPropertyOfSameType.getMofProperty()))
						.forEach(
								chainedPropertyOfSameType ->
								mofPropertyWithGuardedSuperclasses.get(chainedPropertyOfSameType.getMofProperty()).forEach(
										guardedSuperClass ->
										getMofAssociationProperties(guardedSuperClass, /* collectionProperties= */true).stream()
												.map(p -> new ChainedMofProperty(p, null, chainedPropertiesOfSameType.get(0).getDepth() + 1, chainedPropertiesOfSameType.get(0).getMaxDepth() + 1)).forEach(cp -> {
													if (!processedMofProperties.contains(cp.getMofProperty())) {
														processedMofProperties.add(cp.getMofProperty());
														cp.previous.addAll(chainedPropertiesOfSameType);
														directDescendantCollectionChainedProperties.add(cp);
													}
												})));
			}
		});
		return directDescendantCollectionChainedProperties;
	}

	public List<ChainedMofProperty> getDirectDescendantPrimitiveChainedProperties(List<ChainedMofProperty> chainedProperties, Map<MofProperty, List<MofClass>> mofPropertyWithGuardedSuperclasses) {
		Map<MofClass, List<ChainedMofProperty>> chainedPropertiesByType = groupChainedPropertiesByType(chainedProperties);

		List<ChainedMofProperty> directDescendantCollectionChainedProperties = new ArrayList<ChainedMofProperty>();

		chainedPropertiesByType.forEach((mofClassType, chainedPropertiesOfSameType) -> {
			getMofPrimitiveProperties(mofClassType).stream().map(p -> new ChainedMofProperty(p, null, chainedPropertiesOfSameType.get(0).getDepth() + 1, chainedPropertiesOfSameType.get(0).getMaxDepth() + 1)).forEach(cp -> {
				cp.previous.addAll(chainedPropertiesOfSameType);
				directDescendantCollectionChainedProperties.add(cp);
			});
			// TODO consider mofPropertyWithGuardedSuperclasses
			});
		return directDescendantCollectionChainedProperties;
	}

	public Map<MofClass, List<ChainedMofProperty>> groupChainedPropertiesByType(List<ChainedMofProperty> chainedPropeties) {
		Map<MofClass, List<ChainedMofProperty>> result = new HashMap<MofClass, List<ChainedMofProperty>>();
		chainedPropeties.stream().forEach(p -> {
			result.putIfAbsent(p.getType(), new ArrayList<ChainedMofProperty>());
			result.get(p.getType()).add(p);
		});
		return result;
	}

	public List<MofProperty> getMofAssociationProperties(MofClass mofClass, Boolean collectionProperties) {
		return getMofProperties(mofClass, collectionProperties, true);
	}

	public List<MofProperty> getMofPrimitiveProperties(MofClass mofClass) {
		return getMofProperties(mofClass, false, false);
	}

	private List<MofProperty> getMofProperties(MofClass mofClass, Boolean collectionProperties, Boolean associationProperties) {
		// include also inherited properties --> this might cause problems because a super type might not be there (runtime knowledge...)
		HashSet<MofClass> subClasses = getSubClasses(mofClass, /* includeself: */true);

		List<MofProperty> result = new ArrayList<MofProperty>();
		if (associationProperties) {
			subClasses.stream().map(currentMofClass -> currentMofClass.getOwnedProperties().stream().filter(mofProperty -> mofProperty.getAssociation() != null &&
					(collectionProperties ? mofProperty.getUpper() == null : mofProperty.getUpper() != null && mofProperty.getUpper() == 1))
					.collect(Collectors.toList())).forEach(result::addAll);
		} else {
			subClasses.stream().map(currentMofClass -> currentMofClass.getOwnedProperties().stream().filter(mofProperty -> mofProperty.getAssociation() == null)
					.collect(Collectors.toList())).forEach(result::addAll);
		}

		return result;
	}

	public HashSet<MofClass> getSubClasses(MofClass mofClass, Boolean includeself) {
		List<MofClass> superAndSubClasses = new ArrayList<MofClass>();
		if (includeself) {
			superAndSubClasses.add(mofClass);
		}

		Queue<MofClass> unprocessedSuperAndSubClasses = new LinkedList<MofClass>();

		unprocessedSuperAndSubClasses.add(mofClass);
		while (!unprocessedSuperAndSubClasses.isEmpty()) {
			MofClass currentMofClass = unprocessedSuperAndSubClasses.poll();
			unprocessedSuperAndSubClasses.addAll(currentMofClass.getClazz());
			superAndSubClasses.addAll(currentMofClass.getClazz());
		}
		return new HashSet<MofClass>(superAndSubClasses);
	}

	public HashSet<MofClass> getSuperClasses(MofClass mofClass, Boolean includeself) {
		List<MofClass> superAndSubClasses = new ArrayList<MofClass>();
		if (includeself) {
			superAndSubClasses.add(mofClass);
		}

		Queue<MofClass> unprocessedSuperAndSubClasses = new LinkedList<MofClass>();

		unprocessedSuperAndSubClasses.add(mofClass);
		while (!unprocessedSuperAndSubClasses.isEmpty()) {
			MofClass currentMofClass = unprocessedSuperAndSubClasses.poll();
			unprocessedSuperAndSubClasses.addAll(currentMofClass.getSuperclasses());
			superAndSubClasses.addAll(currentMofClass.getSuperclasses());
		}

		return new HashSet<MofClass>(superAndSubClasses);
	}

	public class ChainedMofProperty {
		private MofProperty mofProperty;
		private Boolean isCollectionProperty;
		private MofClass type;
		private List<ChainedMofProperty> previous;
		private List<List<ChainedMofProperty>> flatLists;
		private int depth;
		private int maxDepth;

		public ChainedMofProperty(MofProperty mofProperty, ChainedMofProperty previous, int depth, int maxDepth) {
			this.mofProperty = mofProperty;
			this.isCollectionProperty = mofProperty.getUpper() == null;
			this.type = getTypeOf(mofProperty);
			this.previous = new ArrayList<ChainedMofProperty>();
			if (previous != null) {
				this.previous.add(previous);
			}
			this.depth = depth;
			this.maxDepth = maxDepth;
		}

		public ChainedMofProperty(MofClass type, int depth, int maxDepth) {
			this.type = type;
			this.previous = new ArrayList<ChainedMofProperty>();
			this.depth = depth;
			this.maxDepth = maxDepth;
		}

		public List<ChainedMofProperty> getPrevious() {
			return previous;
		}

		public MofProperty getMofProperty() {
			return mofProperty;
		}

		public MofClass getType() {
			return type;
		}

		public Boolean isCollectionProperty() {
			return isCollectionProperty;
		}

		public List<List<ChainedMofProperty>> toFlatLists() {
			return toFlatLists(null);
		}

		public List<List<ChainedMofProperty>> toFlatLists(HashSet<MofClass> excludeChainsEndingIn) {
			return flatLists = toFlatLists(new ArrayList<ChainedMofProperty>(), 0).stream()
					.filter(l -> l.size() <= maxDepth)
					.filter(chainedMofPropertySourceList -> excludeChainsEndingIn == null || chainedMofPropertySourceList.size() == 0 || !excludeChainsEndingIn.contains(chainedMofPropertySourceList.get(chainedMofPropertySourceList.size() - 1).getType()))
					.collect(Collectors.toList());
		}

		public List<List<ChainedMofProperty>> getFlatLists() {
			return flatLists;
		}

		public int getDepth() {
			return depth;
		}

		public int getMaxDepth() {
			return maxDepth;
		}

		@SuppressWarnings("serial")
		protected List<List<ChainedMofProperty>> toFlatLists(ArrayList<ChainedMofProperty> visited, int depth) {
			if (depth > 1000) {
				return null;
			}

			// stop at circles
			if (visited.contains(this)) {
				return null;
			} else {
				visited.add(this);
			}

			if (previous.size() == 0) {
				// ChainedMofProperty self = this;
				return new ArrayList<List<ChainedMofProperty>>() {
					{
						add(new ArrayList<ChainedMofProperty>() {
							{
								// do not add the root element to avoid unnecessary issues
								// add(self);
							}
						});
					}
				};
			} else {
				List<List<ChainedMofProperty>> previousFlatLists = previous.stream().map(p -> p.toFlatLists(new ArrayList<ChainedMofProperty>(visited), depth + 1))
						.filter(l -> l != null) // exclude circles and emergency stops due to the depth limit
						.reduce(new ArrayList<List<ChainedMofProperty>>(), (l1, l2) -> {
							l1.addAll(l2);
							return l1;
						});

				if (previousFlatLists.size() == 0) {
					// in the case all chains were longer than the allowed depth
					return null;
				}

				// .map( chain -> Throwables.propagate(() -> (List<ChainedMofProperty>) chain.clone())
				List<List<ChainedMofProperty>> clonedExtendedPreviousFlatLists = previousFlatLists.stream()
						.map(l -> l.stream().collect(Collectors.toList()))
						.map(chain -> {
							chain.add(this);
							return chain;
						})
						.collect(Collectors.toList());

				return clonedExtendedPreviousFlatLists;
			}
		}

		public String toChainStrings() {
			return this.toFlatLists().stream().map(l -> l.stream()
					.map(chainedMofProperty -> chainedMofProperty.getMofProperty().getClazz().getName() + "-" + chainedMofProperty.getMofProperty().getName())
					.reduce("", (c1, c2) -> c1 + "." + c2)).reduce("", (l1, l2) -> l1 + "\n" + l2);
		}

		public String toSelfString() {
			if (mofProperty != null) {
				return mofProperty.getClazz().getName() + "." + mofProperty.getName() + " : " + type.getName();
			} else {
				return "null.null : " + type.getName();
			}
		}

		@Override
		public String toString() {
			return toSelfString() + " (" + depth + "):\n" + toChainStrings();
		}
	}

}
