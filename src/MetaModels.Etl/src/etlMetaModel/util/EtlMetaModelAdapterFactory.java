/**
 */
package etlMetaModel.util;

import etlMetaModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see etlMetaModel.EtlMetaModelPackage
 * @generated
 */
public class EtlMetaModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EtlMetaModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtlMetaModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EtlMetaModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EtlMetaModelSwitch<Adapter> modelSwitch =
		new EtlMetaModelSwitch<Adapter>() {
			@Override
			public Adapter caseMofNamedElement(MofNamedElement object) {
				return createMofNamedElementAdapter();
			}
			@Override
			public Adapter caseMofType(MofType object) {
				return createMofTypeAdapter();
			}
			@Override
			public Adapter caseMofClass(MofClass object) {
				return createMofClassAdapter();
			}
			@Override
			public Adapter caseMofTypedElement(MofTypedElement object) {
				return createMofTypedElementAdapter();
			}
			@Override
			public Adapter caseMofMultiplicityElement(MofMultiplicityElement object) {
				return createMofMultiplicityElementAdapter();
			}
			@Override
			public Adapter caseMofProperty(MofProperty object) {
				return createMofPropertyAdapter();
			}
			@Override
			public Adapter caseMofAssociation(MofAssociation object) {
				return createMofAssociationAdapter();
			}
			@Override
			public Adapter caseMofPrimitiveType(MofPrimitiveType object) {
				return createMofPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseMofBoolean(MofBoolean object) {
				return createMofBooleanAdapter();
			}
			@Override
			public Adapter caseMofInteger(MofInteger object) {
				return createMofIntegerAdapter();
			}
			@Override
			public Adapter caseMofString(MofString object) {
				return createMofStringAdapter();
			}
			@Override
			public Adapter caseEtlModule(EtlModule object) {
				return createEtlModuleAdapter();
			}
			@Override
			public Adapter caseErlNamedRule(ErlNamedRule object) {
				return createErlNamedRuleAdapter();
			}
			@Override
			public Adapter caseEtlTransformationRule(EtlTransformationRule object) {
				return createEtlTransformationRuleAdapter();
			}
			@Override
			public Adapter caseEolLibraryModule(EolLibraryModule object) {
				return createEolLibraryModuleAdapter();
			}
			@Override
			public Adapter caseEolOperation(EolOperation object) {
				return createEolOperationAdapter();
			}
			@Override
			public Adapter caseEolFormalParameter(EolFormalParameter object) {
				return createEolFormalParameterAdapter();
			}
			@Override
			public Adapter caseEolMofClassFormalParameter(EolMofClassFormalParameter object) {
				return createEolMofClassFormalParameterAdapter();
			}
			@Override
			public Adapter caseEolAnnotation(EolAnnotation object) {
				return createEolAnnotationAdapter();
			}
			@Override
			public Adapter caseEolExecuteableAnnotation(EolExecuteableAnnotation object) {
				return createEolExecuteableAnnotationAdapter();
			}
			@Override
			public Adapter caseSimpleAnnotation(SimpleAnnotation object) {
				return createSimpleAnnotationAdapter();
			}
			@Override
			public Adapter caseEolType(EolType object) {
				return createEolTypeAdapter();
			}
			@Override
			public Adapter caseEolAnyType(EolAnyType object) {
				return createEolAnyTypeAdapter();
			}
			@Override
			public Adapter caseModelElementType(ModelElementType object) {
				return createModelElementTypeAdapter();
			}
			@Override
			public Adapter caseEolNative(EolNative object) {
				return createEolNativeAdapter();
			}
			@Override
			public Adapter caseEolPrimitiveType(EolPrimitiveType object) {
				return createEolPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseEolBooleanType(EolBooleanType object) {
				return createEolBooleanTypeAdapter();
			}
			@Override
			public Adapter caseEolRealType(EolRealType object) {
				return createEolRealTypeAdapter();
			}
			@Override
			public Adapter caseEolIntegerType(EolIntegerType object) {
				return createEolIntegerTypeAdapter();
			}
			@Override
			public Adapter caseEolStringType(EolStringType object) {
				return createEolStringTypeAdapter();
			}
			@Override
			public Adapter caseEolMapType(EolMapType object) {
				return createEolMapTypeAdapter();
			}
			@Override
			public Adapter caseEolCollectionType(EolCollectionType object) {
				return createEolCollectionTypeAdapter();
			}
			@Override
			public Adapter caseEolOrderedSetType(EolOrderedSetType object) {
				return createEolOrderedSetTypeAdapter();
			}
			@Override
			public Adapter caseEolSetType(EolSetType object) {
				return createEolSetTypeAdapter();
			}
			@Override
			public Adapter caseEolBagType(EolBagType object) {
				return createEolBagTypeAdapter();
			}
			@Override
			public Adapter caseEolSequenceType(EolSequenceType object) {
				return createEolSequenceTypeAdapter();
			}
			@Override
			public Adapter caseEolExpressionOrStatementBlock(EolExpressionOrStatementBlock object) {
				return createEolExpressionOrStatementBlockAdapter();
			}
			@Override
			public Adapter caseEolLogicalExpression(EolLogicalExpression object) {
				return createEolLogicalExpressionAdapter();
			}
			@Override
			public Adapter caseEolChainedLogicalExpression(EolChainedLogicalExpression object) {
				return createEolChainedLogicalExpressionAdapter();
			}
			@Override
			public Adapter caseEolRelationalExpression(EolRelationalExpression object) {
				return createEolRelationalExpressionAdapter();
			}
			@Override
			public Adapter caseEolGenericChainedRelationalExpression(EolGenericChainedRelationalExpression object) {
				return createEolGenericChainedRelationalExpressionAdapter();
			}
			@Override
			public Adapter caseEolChainedRelationalExpression(EolChainedRelationalExpression object) {
				return createEolChainedRelationalExpressionAdapter();
			}
			@Override
			public Adapter caseEolComparingToAdditiveRelationalExpression(EolComparingToAdditiveRelationalExpression object) {
				return createEolComparingToAdditiveRelationalExpressionAdapter();
			}
			@Override
			public Adapter caseEolAdditiveExpression(EolAdditiveExpression object) {
				return createEolAdditiveExpressionAdapter();
			}
			@Override
			public Adapter caseEolChainedAdditiveExpression(EolChainedAdditiveExpression object) {
				return createEolChainedAdditiveExpressionAdapter();
			}
			@Override
			public Adapter caseEolMultiplicativeExpression(EolMultiplicativeExpression object) {
				return createEolMultiplicativeExpressionAdapter();
			}
			@Override
			public Adapter caseEolChainedMultiplicativeExpression(EolChainedMultiplicativeExpression object) {
				return createEolChainedMultiplicativeExpressionAdapter();
			}
			@Override
			public Adapter caseEolUnaryExpression(EolUnaryExpression object) {
				return createEolUnaryExpressionAdapter();
			}
			@Override
			public Adapter caseEolUnaryOpratorNullable(EolUnaryOpratorNullable object) {
				return createEolUnaryOpratorNullableAdapter();
			}
			@Override
			public Adapter caseEolPostfixExpression(EolPostfixExpression object) {
				return createEolPostfixExpressionAdapter();
			}
			@Override
			public Adapter caseEolChainedFeatureCallPostfixExpression(EolChainedFeatureCallPostfixExpression object) {
				return createEolChainedFeatureCallPostfixExpressionAdapter();
			}
			@Override
			public Adapter caseEolItemSelectorExpression(EolItemSelectorExpression object) {
				return createEolItemSelectorExpressionAdapter();
			}
			@Override
			public Adapter caseEolFeatureCall(EolFeatureCall object) {
				return createEolFeatureCallAdapter();
			}
			@Override
			public Adapter caseEolSimpleFeatureCall(EolSimpleFeatureCall object) {
				return createEolSimpleFeatureCallAdapter();
			}
			@Override
			public Adapter caseEolMofPropertyFeatureCall(EolMofPropertyFeatureCall object) {
				return createEolMofPropertyFeatureCallAdapter();
			}
			@Override
			public Adapter caseEtlEquivalentMethodFeatureCall(EtlEquivalentMethodFeatureCall object) {
				return createEtlEquivalentMethodFeatureCallAdapter();
			}
			@Override
			public Adapter caseEolIsTypeOfSourceMofClassFeatureCall(EolIsTypeOfSourceMofClassFeatureCall object) {
				return createEolIsTypeOfSourceMofClassFeatureCallAdapter();
			}
			@Override
			public Adapter caseEolParameterList(EolParameterList object) {
				return createEolParameterListAdapter();
			}
			@Override
			public Adapter caseEolNewExpression(EolNewExpression object) {
				return createEolNewExpressionAdapter();
			}
			@Override
			public Adapter caseEolVariableDeclarationExpression(EolVariableDeclarationExpression object) {
				return createEolVariableDeclarationExpressionAdapter();
			}
			@Override
			public Adapter caseEolPrimitiveExpression(EolPrimitiveExpression object) {
				return createEolPrimitiveExpressionAdapter();
			}
			@Override
			public Adapter caseEolLiteral(EolLiteral object) {
				return createEolLiteralAdapter();
			}
			@Override
			public Adapter caseEolStringLiteral(EolStringLiteral object) {
				return createEolStringLiteralAdapter();
			}
			@Override
			public Adapter caseEolReferenceExpression(EolReferenceExpression object) {
				return createEolReferenceExpressionAdapter();
			}
			@Override
			public Adapter caseEolFormalParameterReferenceExpression(EolFormalParameterReferenceExpression object) {
				return createEolFormalParameterReferenceExpressionAdapter();
			}
			@Override
			public Adapter caseEolVariableReferenceExpression(EolVariableReferenceExpression object) {
				return createEolVariableReferenceExpressionAdapter();
			}
			@Override
			public Adapter caseEolStatementBlock(EolStatementBlock object) {
				return createEolStatementBlockAdapter();
			}
			@Override
			public Adapter caseEolStatement(EolStatement object) {
				return createEolStatementAdapter();
			}
			@Override
			public Adapter caseEolAssignmentStatement(EolAssignmentStatement object) {
				return createEolAssignmentStatementAdapter();
			}
			@Override
			public Adapter caseEolExpressionStatement(EolExpressionStatement object) {
				return createEolExpressionStatementAdapter();
			}
			@Override
			public Adapter caseEolAssignmentExpressionStatement(EolAssignmentExpressionStatement object) {
				return createEolAssignmentExpressionStatementAdapter();
			}
			@Override
			public Adapter caseEolLogicalExpressionStatement(EolLogicalExpressionStatement object) {
				return createEolLogicalExpressionStatementAdapter();
			}
			@Override
			public Adapter caseEolFor(EolFor object) {
				return createEolForAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.MofNamedElement <em>Mof Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.MofNamedElement
	 * @generated
	 */
	public Adapter createMofNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.MofType <em>Mof Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.MofType
	 * @generated
	 */
	public Adapter createMofTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.MofClass <em>Mof Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.MofClass
	 * @generated
	 */
	public Adapter createMofClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.MofTypedElement <em>Mof Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.MofTypedElement
	 * @generated
	 */
	public Adapter createMofTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.MofMultiplicityElement <em>Mof Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.MofMultiplicityElement
	 * @generated
	 */
	public Adapter createMofMultiplicityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.MofProperty <em>Mof Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.MofProperty
	 * @generated
	 */
	public Adapter createMofPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.MofAssociation <em>Mof Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.MofAssociation
	 * @generated
	 */
	public Adapter createMofAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.MofPrimitiveType <em>Mof Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.MofPrimitiveType
	 * @generated
	 */
	public Adapter createMofPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.MofBoolean <em>Mof Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.MofBoolean
	 * @generated
	 */
	public Adapter createMofBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.MofInteger <em>Mof Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.MofInteger
	 * @generated
	 */
	public Adapter createMofIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.MofString <em>Mof String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.MofString
	 * @generated
	 */
	public Adapter createMofStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EtlModule <em>Etl Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EtlModule
	 * @generated
	 */
	public Adapter createEtlModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.ErlNamedRule <em>Erl Named Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.ErlNamedRule
	 * @generated
	 */
	public Adapter createErlNamedRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EtlTransformationRule <em>Etl Transformation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EtlTransformationRule
	 * @generated
	 */
	public Adapter createEtlTransformationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolLibraryModule <em>Eol Library Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolLibraryModule
	 * @generated
	 */
	public Adapter createEolLibraryModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolOperation <em>Eol Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolOperation
	 * @generated
	 */
	public Adapter createEolOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolFormalParameter <em>Eol Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolFormalParameter
	 * @generated
	 */
	public Adapter createEolFormalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolMofClassFormalParameter <em>Eol Mof Class Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolMofClassFormalParameter
	 * @generated
	 */
	public Adapter createEolMofClassFormalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolAnnotation <em>Eol Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolAnnotation
	 * @generated
	 */
	public Adapter createEolAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolExecuteableAnnotation <em>Eol Executeable Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolExecuteableAnnotation
	 * @generated
	 */
	public Adapter createEolExecuteableAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.SimpleAnnotation <em>Simple Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.SimpleAnnotation
	 * @generated
	 */
	public Adapter createSimpleAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolType <em>Eol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolType
	 * @generated
	 */
	public Adapter createEolTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolAnyType <em>Eol Any Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolAnyType
	 * @generated
	 */
	public Adapter createEolAnyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.ModelElementType <em>Model Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.ModelElementType
	 * @generated
	 */
	public Adapter createModelElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolNative <em>Eol Native</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolNative
	 * @generated
	 */
	public Adapter createEolNativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolPrimitiveType <em>Eol Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolPrimitiveType
	 * @generated
	 */
	public Adapter createEolPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolBooleanType <em>Eol Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolBooleanType
	 * @generated
	 */
	public Adapter createEolBooleanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolRealType <em>Eol Real Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolRealType
	 * @generated
	 */
	public Adapter createEolRealTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolIntegerType <em>Eol Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolIntegerType
	 * @generated
	 */
	public Adapter createEolIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolStringType <em>Eol String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolStringType
	 * @generated
	 */
	public Adapter createEolStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolMapType <em>Eol Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolMapType
	 * @generated
	 */
	public Adapter createEolMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolCollectionType <em>Eol Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolCollectionType
	 * @generated
	 */
	public Adapter createEolCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolOrderedSetType <em>Eol Ordered Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolOrderedSetType
	 * @generated
	 */
	public Adapter createEolOrderedSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolSetType <em>Eol Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolSetType
	 * @generated
	 */
	public Adapter createEolSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolBagType <em>Eol Bag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolBagType
	 * @generated
	 */
	public Adapter createEolBagTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolSequenceType <em>Eol Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolSequenceType
	 * @generated
	 */
	public Adapter createEolSequenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolExpressionOrStatementBlock <em>Eol Expression Or Statement Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolExpressionOrStatementBlock
	 * @generated
	 */
	public Adapter createEolExpressionOrStatementBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolLogicalExpression <em>Eol Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolLogicalExpression
	 * @generated
	 */
	public Adapter createEolLogicalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolChainedLogicalExpression <em>Eol Chained Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolChainedLogicalExpression
	 * @generated
	 */
	public Adapter createEolChainedLogicalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolRelationalExpression <em>Eol Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolRelationalExpression
	 * @generated
	 */
	public Adapter createEolRelationalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolGenericChainedRelationalExpression <em>Eol Generic Chained Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolGenericChainedRelationalExpression
	 * @generated
	 */
	public Adapter createEolGenericChainedRelationalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolChainedRelationalExpression <em>Eol Chained Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolChainedRelationalExpression
	 * @generated
	 */
	public Adapter createEolChainedRelationalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolComparingToAdditiveRelationalExpression <em>Eol Comparing To Additive Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolComparingToAdditiveRelationalExpression
	 * @generated
	 */
	public Adapter createEolComparingToAdditiveRelationalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolAdditiveExpression <em>Eol Additive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolAdditiveExpression
	 * @generated
	 */
	public Adapter createEolAdditiveExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolChainedAdditiveExpression <em>Eol Chained Additive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolChainedAdditiveExpression
	 * @generated
	 */
	public Adapter createEolChainedAdditiveExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolMultiplicativeExpression <em>Eol Multiplicative Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolMultiplicativeExpression
	 * @generated
	 */
	public Adapter createEolMultiplicativeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolChainedMultiplicativeExpression <em>Eol Chained Multiplicative Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolChainedMultiplicativeExpression
	 * @generated
	 */
	public Adapter createEolChainedMultiplicativeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolUnaryExpression <em>Eol Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolUnaryExpression
	 * @generated
	 */
	public Adapter createEolUnaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolUnaryOpratorNullable <em>Eol Unary Oprator Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolUnaryOpratorNullable
	 * @generated
	 */
	public Adapter createEolUnaryOpratorNullableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolPostfixExpression <em>Eol Postfix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolPostfixExpression
	 * @generated
	 */
	public Adapter createEolPostfixExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolChainedFeatureCallPostfixExpression <em>Eol Chained Feature Call Postfix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolChainedFeatureCallPostfixExpression
	 * @generated
	 */
	public Adapter createEolChainedFeatureCallPostfixExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolItemSelectorExpression <em>Eol Item Selector Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolItemSelectorExpression
	 * @generated
	 */
	public Adapter createEolItemSelectorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolFeatureCall <em>Eol Feature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolFeatureCall
	 * @generated
	 */
	public Adapter createEolFeatureCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolSimpleFeatureCall <em>Eol Simple Feature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolSimpleFeatureCall
	 * @generated
	 */
	public Adapter createEolSimpleFeatureCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolMofPropertyFeatureCall <em>Eol Mof Property Feature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolMofPropertyFeatureCall
	 * @generated
	 */
	public Adapter createEolMofPropertyFeatureCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EtlEquivalentMethodFeatureCall <em>Etl Equivalent Method Feature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EtlEquivalentMethodFeatureCall
	 * @generated
	 */
	public Adapter createEtlEquivalentMethodFeatureCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolIsTypeOfSourceMofClassFeatureCall <em>Eol Is Type Of Source Mof Class Feature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolIsTypeOfSourceMofClassFeatureCall
	 * @generated
	 */
	public Adapter createEolIsTypeOfSourceMofClassFeatureCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolParameterList <em>Eol Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolParameterList
	 * @generated
	 */
	public Adapter createEolParameterListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolNewExpression <em>Eol New Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolNewExpression
	 * @generated
	 */
	public Adapter createEolNewExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolVariableDeclarationExpression <em>Eol Variable Declaration Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolVariableDeclarationExpression
	 * @generated
	 */
	public Adapter createEolVariableDeclarationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolPrimitiveExpression <em>Eol Primitive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolPrimitiveExpression
	 * @generated
	 */
	public Adapter createEolPrimitiveExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolLiteral <em>Eol Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolLiteral
	 * @generated
	 */
	public Adapter createEolLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolStringLiteral <em>Eol String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolStringLiteral
	 * @generated
	 */
	public Adapter createEolStringLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolReferenceExpression <em>Eol Reference Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolReferenceExpression
	 * @generated
	 */
	public Adapter createEolReferenceExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolFormalParameterReferenceExpression <em>Eol Formal Parameter Reference Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolFormalParameterReferenceExpression
	 * @generated
	 */
	public Adapter createEolFormalParameterReferenceExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolVariableReferenceExpression <em>Eol Variable Reference Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolVariableReferenceExpression
	 * @generated
	 */
	public Adapter createEolVariableReferenceExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolStatementBlock <em>Eol Statement Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolStatementBlock
	 * @generated
	 */
	public Adapter createEolStatementBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolStatement <em>Eol Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolStatement
	 * @generated
	 */
	public Adapter createEolStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolAssignmentStatement <em>Eol Assignment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolAssignmentStatement
	 * @generated
	 */
	public Adapter createEolAssignmentStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolExpressionStatement <em>Eol Expression Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolExpressionStatement
	 * @generated
	 */
	public Adapter createEolExpressionStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolAssignmentExpressionStatement <em>Eol Assignment Expression Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolAssignmentExpressionStatement
	 * @generated
	 */
	public Adapter createEolAssignmentExpressionStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolLogicalExpressionStatement <em>Eol Logical Expression Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolLogicalExpressionStatement
	 * @generated
	 */
	public Adapter createEolLogicalExpressionStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link etlMetaModel.EolFor <em>Eol For</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see etlMetaModel.EolFor
	 * @generated
	 */
	public Adapter createEolForAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EtlMetaModelAdapterFactory
