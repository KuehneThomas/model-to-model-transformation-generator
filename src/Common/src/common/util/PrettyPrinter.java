package common.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import javax.inject.Singleton;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.epsilon.eol.models.IModel;

import common.util.interfaces.IPrettyPrinter;

@Singleton
public class PrettyPrinter implements IPrettyPrinter {
	private static final String INDENT = "    "; //$NON-NLS-1$

	public String ToString(EObject eObject) {
		if (eObject != null) {
			EClass classDefinition = eObject.eClass();

			String outputProperties = "";
			for (EAttribute attributeDeclaration : classDefinition.getEAllAttributes()) {
				Object attributeValue = null;
				if (eObject.eIsSet(attributeDeclaration)) {
					attributeValue = eObject.eGet(attributeDeclaration);
				}
				outputProperties += String.format("%s%s=%s", (outputProperties != "" ? ";" : ""), attributeDeclaration.getName(), attributeValue);
			}

			String output = String.format("%s[%s]", classDefinition.getName(), outputProperties);
			return output;
		} else {
			return "NULL";
		}
	}

	@Override
	public String ToStringRecursive(IModel model) {
		if (model == null) {
			return "NULL";
		} else {
			return ToStringRecursive(model.allContents().toArray(new EObject[0]));
		}
	}

	@Override
	public String ToStringRecursive(Collection<EObject> eObjects) {
		return ToStringRecursive(eObjects.toArray(new EObject[0]));
	}

	@Override
	public String ToStringRecursive(EObject[] eObjects) {
		StringBuilder sb = new StringBuilder();
		for (EObject eObject : eObjects) {
			sb.append("========== EOBJECT ==========\n" + ToStringRecursive(eObject) + "\n\n");
		}
		return sb.toString();
	}

	public String ToStringRecursive(EObject eObject) {
		List<String> lines = prettyPrintAny(eObject, "", new HashSet<EObject>()); //$NON-NLS-1$
		StringBuilder sb = new StringBuilder();
		for (String line : lines) {
			sb.append(line).append('\n');
		}
		return sb.toString();
	}

	private List<String> prettyPrintAny(Object o, String indent, HashSet<EObject> alreadyPrinted) {
		List<String> lines = new ArrayList<>();

		if (o instanceof EObject) {
			EObject object = (EObject) o;
			EClass eClass = object.eClass();
			lines.add(eClass.getName() + " [" + o.getClass().getCanonicalName() + "] {"); //$NON-NLS-1$ //$NON-NLS-2$
			if (!alreadyPrinted.contains(object)) {
				alreadyPrinted.add(object);
				lines.addAll(prettyPrintRecursive(object, INDENT, alreadyPrinted));
			} else {
				lines.add("CONTENT HAS ALREADY BEEN PRINTED BEFORE: " + ToString(object));
			}
			lines.add("}"); //$NON-NLS-1$
		} else if (o instanceof Iterable) {
			lines.add("["); //$NON-NLS-1$
			for (Object obj : (Iterable<?>) o) {
				lines.addAll(prettyPrintAny(obj, INDENT, alreadyPrinted));
			}
			lines.add("]"); //$NON-NLS-1$
		} else {
			String line = String.valueOf(o) + ' ';
			if (o != null) {
				line += '[' + o.getClass().getCanonicalName() + ']';
			}
			lines.add(line);
		}
		return indentLines(lines, indent);
	}

	private List<String> indentLines(List<String> lines, String indent) {
		List<String> result = new ArrayList<>();
		for (String l : lines) {
			result.add(indent + l);
		}
		return result;
	}

	private List<String> prettyPrintRecursive(EObject o, String indent, HashSet<EObject> alreadyPrinted) {
		EClass eClass = o.eClass();
		List<String> result = new ArrayList<>();
		for (EStructuralFeature feature : eClass.getEAllStructuralFeatures()) {
			Object value = null;
			try {
				value = o.eGet(feature);
			} catch (Exception ex) {
				value = ex;
			}
			String line = feature.getName() + " = "; //$NON-NLS-1$
			List<String> list = prettyPrintAny(value, INDENT, alreadyPrinted);
			list.set(0, list.get(0).trim());
			result.add(line + list.get(0));
			list.remove(0);
			result.addAll(list);
		}
		return indentLines(result, indent);
	}
}
