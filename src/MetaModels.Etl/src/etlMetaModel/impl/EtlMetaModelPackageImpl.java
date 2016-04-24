/**
 */
package etlMetaModel.impl;

import etlMetaModel.EolAdditiveArithmeticalOperator;
import etlMetaModel.EolAdditiveComparisonOperator;
import etlMetaModel.EolAdditiveExpression;
import etlMetaModel.EolAnnotation;
import etlMetaModel.EolAnyType;
import etlMetaModel.EolAssignmentExpressionStatement;
import etlMetaModel.EolAssignmentStatement;
import etlMetaModel.EolBagType;
import etlMetaModel.EolBooleanType;
import etlMetaModel.EolChainedAdditiveExpression;
import etlMetaModel.EolChainedFeatureCallPostfixExpression;
import etlMetaModel.EolChainedLogicalExpression;
import etlMetaModel.EolChainedMultiplicativeExpression;
import etlMetaModel.EolChainedRelationalExpression;
import etlMetaModel.EolCollectionType;
import etlMetaModel.EolComparingToAdditiveRelationalExpression;
import etlMetaModel.EolExecuteableAnnotation;
import etlMetaModel.EolExpressionOrStatementBlock;
import etlMetaModel.EolExpressionStatement;
import etlMetaModel.EolFeatureCall;
import etlMetaModel.EolFor;
import etlMetaModel.EolFormalParameter;
import etlMetaModel.EolFormalParameterReferenceExpression;
import etlMetaModel.EolGenericChainedRelationalExpression;
import etlMetaModel.EolIntegerType;
import etlMetaModel.EolIsTypeOfSourceMofClassFeatureCall;
import etlMetaModel.EolItemSelectorExpression;
import etlMetaModel.EolLibraryModule;
import etlMetaModel.EolLiteral;
import etlMetaModel.EolLogicalExpression;
import etlMetaModel.EolLogicalExpressionStatement;
import etlMetaModel.EolLogicalOperator;
import etlMetaModel.EolMapType;
import etlMetaModel.EolMofClassFormalParameter;
import etlMetaModel.EolMofPropertyFeatureCall;
import etlMetaModel.EolMultiplicativeArithmeticalOperator;
import etlMetaModel.EolMultiplicativeExpression;
import etlMetaModel.EolNative;
import etlMetaModel.EolNewExpression;
import etlMetaModel.EolOperation;
import etlMetaModel.EolOrderedSetType;
import etlMetaModel.EolParameterList;
import etlMetaModel.EolPostfixExpression;
import etlMetaModel.EolPrimitiveExpression;
import etlMetaModel.EolPrimitiveType;
import etlMetaModel.EolRealType;
import etlMetaModel.EolReferenceExpression;
import etlMetaModel.EolRelationalExpression;
import etlMetaModel.EolRelationalOperator;
import etlMetaModel.EolSequenceType;
import etlMetaModel.EolSetType;
import etlMetaModel.EolSimpleFeatureCall;
import etlMetaModel.EolStatement;
import etlMetaModel.EolStatementBlock;
import etlMetaModel.EolStringLiteral;
import etlMetaModel.EolStringType;
import etlMetaModel.EolType;
import etlMetaModel.EolUnaryExpression;
import etlMetaModel.EolUnaryOprator;
import etlMetaModel.EolUnaryOpratorNullable;
import etlMetaModel.EolVariableDeclarationExpression;
import etlMetaModel.EolVariableReferenceExpression;
import etlMetaModel.ErlNamedRule;
import etlMetaModel.EtlEquivalentMethodFeatureCall;
import etlMetaModel.EtlMetaModelFactory;
import etlMetaModel.EtlMetaModelPackage;
import etlMetaModel.EtlModule;
import etlMetaModel.EtlTransformationRule;
import etlMetaModel.ModelElementType;
import etlMetaModel.MofAssociation;
import etlMetaModel.MofBoolean;
import etlMetaModel.MofClass;
import etlMetaModel.MofInteger;
import etlMetaModel.MofMultiplicityElement;
import etlMetaModel.MofNamedElement;
import etlMetaModel.MofPrimitiveType;
import etlMetaModel.MofProperty;
import etlMetaModel.MofString;
import etlMetaModel.MofType;
import etlMetaModel.MofTypedElement;
import etlMetaModel.SimpleAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EtlMetaModelPackageImpl extends EPackageImpl implements EtlMetaModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mofNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mofTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mofClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mofTypedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mofMultiplicityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mofPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mofAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mofPrimitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mofBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mofIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mofStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etlModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erlNamedRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etlTransformationRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolLibraryModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolFormalParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolMofClassFormalParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolExecuteableAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolAnyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolNativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolPrimitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolBooleanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolRealTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolIntegerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolStringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolMapTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolCollectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolOrderedSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolBagTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolSequenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolExpressionOrStatementBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolLogicalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolChainedLogicalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolRelationalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolGenericChainedRelationalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolChainedRelationalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolComparingToAdditiveRelationalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolAdditiveExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolChainedAdditiveExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolMultiplicativeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolChainedMultiplicativeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolUnaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolUnaryOpratorNullableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolPostfixExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolChainedFeatureCallPostfixExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolItemSelectorExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolFeatureCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolSimpleFeatureCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolMofPropertyFeatureCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etlEquivalentMethodFeatureCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolIsTypeOfSourceMofClassFeatureCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolParameterListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolNewExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolVariableDeclarationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolPrimitiveExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolStringLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolReferenceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolFormalParameterReferenceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolVariableReferenceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolStatementBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolAssignmentStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolExpressionStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolAssignmentExpressionStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolLogicalExpressionStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eolForEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eolLogicalOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eolRelationalOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eolAdditiveComparisonOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eolAdditiveArithmeticalOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eolMultiplicativeArithmeticalOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eolUnaryOpratorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see etlMetaModel.EtlMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EtlMetaModelPackageImpl() {
		super(eNS_URI, EtlMetaModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EtlMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EtlMetaModelPackage init() {
		if (isInited) return (EtlMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(EtlMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		EtlMetaModelPackageImpl theEtlMetaModelPackage = (EtlMetaModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EtlMetaModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EtlMetaModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEtlMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theEtlMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEtlMetaModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EtlMetaModelPackage.eNS_URI, theEtlMetaModelPackage);
		return theEtlMetaModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMofNamedElement() {
		return mofNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMofNamedElement_Name() {
		return (EAttribute)mofNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMofType() {
		return mofTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMofType_TypedElements() {
		return (EReference)mofTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMofClass() {
		return mofClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMofClass_OwnedProperties() {
		return (EReference)mofClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMofClass_Superclasses() {
		return (EReference)mofClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMofClass_Clazz() {
		return (EReference)mofClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMofTypedElement() {
		return mofTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMofTypedElement_Type() {
		return (EReference)mofTypedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMofMultiplicityElement() {
		return mofMultiplicityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMofMultiplicityElement_Upper() {
		return (EAttribute)mofMultiplicityElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMofMultiplicityElement_Lower() {
		return (EAttribute)mofMultiplicityElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMofProperty() {
		return mofPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMofProperty_Clazz() {
		return (EReference)mofPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMofProperty_Association() {
		return (EReference)mofPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMofProperty_IsComposite() {
		return (EAttribute)mofPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMofAssociation() {
		return mofAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMofAssociation_MemberEnds() {
		return (EReference)mofAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMofPrimitiveType() {
		return mofPrimitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMofBoolean() {
		return mofBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMofInteger() {
		return mofIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMofString() {
		return mofStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEtlModule() {
		return etlModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEtlModule_MofClassesSource() {
		return (EReference)etlModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEtlModule_MofAssociationsSource() {
		return (EReference)etlModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEtlModule_MofClassesTarget() {
		return (EReference)etlModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEtlModule_MofAssociationsTarget() {
		return (EReference)etlModuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEtlModule_Pre() {
		return (EReference)etlModuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEtlModule_TransformationRules() {
		return (EReference)etlModuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEtlModule_Post() {
		return (EReference)etlModuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEtlModule_Operations() {
		return (EReference)etlModuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErlNamedRule() {
		return erlNamedRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErlNamedRule_Name() {
		return (EAttribute)erlNamedRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErlNamedRule_Body() {
		return (EReference)erlNamedRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEtlTransformationRule() {
		return etlTransformationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEtlTransformationRule_Name() {
		return (EAttribute)etlTransformationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEtlTransformationRule_GuardName() {
		return (EAttribute)etlTransformationRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEtlTransformationRule_ExtendsRules() {
		return (EReference)etlTransformationRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEtlTransformationRule_SourceParameter() {
		return (EReference)etlTransformationRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEtlTransformationRule_TargetParameters() {
		return (EReference)etlTransformationRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEtlTransformationRule_Guard() {
		return (EReference)etlTransformationRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEtlTransformationRule_Body() {
		return (EReference)etlTransformationRuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEtlTransformationRule_Abstractt() {
		return (EAttribute)etlTransformationRuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEtlTransformationRule_Lazy() {
		return (EAttribute)etlTransformationRuleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEtlTransformationRule_Primary() {
		return (EAttribute)etlTransformationRuleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEtlTransformationRule_Greedy() {
		return (EAttribute)etlTransformationRuleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolLibraryModule() {
		return eolLibraryModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolOperation() {
		return eolOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolOperation_Annotations() {
		return (EReference)eolOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEolOperation_Name() {
		return (EAttribute)eolOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolOperation_FormalParameters() {
		return (EReference)eolOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolOperation_Context() {
		return (EReference)eolOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolOperation_Body() {
		return (EReference)eolOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolOperation_ReturnType() {
		return (EReference)eolOperationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolFormalParameter() {
		return eolFormalParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEolFormalParameter_Name() {
		return (EAttribute)eolFormalParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolMofClassFormalParameter() {
		return eolMofClassFormalParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolMofClassFormalParameter_Referenced() {
		return (EReference)eolMofClassFormalParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEolMofClassFormalParameter_IsSequence() {
		return (EAttribute)eolMofClassFormalParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolAnnotation() {
		return eolAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEolAnnotation_Name() {
		return (EAttribute)eolAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolExecuteableAnnotation() {
		return eolExecuteableAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolExecuteableAnnotation_Expression() {
		return (EReference)eolExecuteableAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleAnnotation() {
		return simpleAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleAnnotation_Value() {
		return (EAttribute)simpleAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolType() {
		return eolTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolAnyType() {
		return eolAnyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElementType() {
		return modelElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElementType_Model() {
		return (EAttribute)modelElementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElementType_Type() {
		return (EAttribute)modelElementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolNative() {
		return eolNativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEolNative_Implementation() {
		return (EAttribute)eolNativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolPrimitiveType() {
		return eolPrimitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolBooleanType() {
		return eolBooleanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolRealType() {
		return eolRealTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolIntegerType() {
		return eolIntegerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolStringType() {
		return eolStringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolMapType() {
		return eolMapTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolCollectionType() {
		return eolCollectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolOrderedSetType() {
		return eolOrderedSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolSetType() {
		return eolSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolBagType() {
		return eolBagTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolSequenceType() {
		return eolSequenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolExpressionOrStatementBlock() {
		return eolExpressionOrStatementBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolLogicalExpression() {
		return eolLogicalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolLogicalExpression_RelationalExpression() {
		return (EReference)eolLogicalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolLogicalExpression_ChainedLogicalExpression() {
		return (EReference)eolLogicalExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolChainedLogicalExpression() {
		return eolChainedLogicalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEolChainedLogicalExpression_LogicalOperator() {
		return (EAttribute)eolChainedLogicalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolChainedLogicalExpression_LogicalExpression() {
		return (EReference)eolChainedLogicalExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolRelationalExpression() {
		return eolRelationalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolRelationalExpression_AdditiveExpression() {
		return (EReference)eolRelationalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolRelationalExpression_ChainedRelationalExpression() {
		return (EReference)eolRelationalExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolGenericChainedRelationalExpression() {
		return eolGenericChainedRelationalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolChainedRelationalExpression() {
		return eolChainedRelationalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEolChainedRelationalExpression_RelationalOperator() {
		return (EAttribute)eolChainedRelationalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolChainedRelationalExpression_RelationalExpression() {
		return (EReference)eolChainedRelationalExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolComparingToAdditiveRelationalExpression() {
		return eolComparingToAdditiveRelationalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEolComparingToAdditiveRelationalExpression_AdditiveComparisonOperator() {
		return (EAttribute)eolComparingToAdditiveRelationalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolComparingToAdditiveRelationalExpression_AdditiveExpression() {
		return (EReference)eolComparingToAdditiveRelationalExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolAdditiveExpression() {
		return eolAdditiveExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolAdditiveExpression_MultiplicativeExpression() {
		return (EReference)eolAdditiveExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolAdditiveExpression_ChainedAdditiveExpression() {
		return (EReference)eolAdditiveExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolChainedAdditiveExpression() {
		return eolChainedAdditiveExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEolChainedAdditiveExpression_AdditiveArithmeticalOperator() {
		return (EAttribute)eolChainedAdditiveExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolChainedAdditiveExpression_AdditiveExpression() {
		return (EReference)eolChainedAdditiveExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolMultiplicativeExpression() {
		return eolMultiplicativeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolMultiplicativeExpression_UnaryExpression() {
		return (EReference)eolMultiplicativeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolMultiplicativeExpression_ChainedMultiplicativeExpression() {
		return (EReference)eolMultiplicativeExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolChainedMultiplicativeExpression() {
		return eolChainedMultiplicativeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEolChainedMultiplicativeExpression_MultiplicativeArithmeticalOperator() {
		return (EAttribute)eolChainedMultiplicativeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolChainedMultiplicativeExpression_UnaryExpression() {
		return (EReference)eolChainedMultiplicativeExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolUnaryExpression() {
		return eolUnaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolUnaryExpression_UnaryOperatorNullable() {
		return (EReference)eolUnaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolUnaryExpression_PostfixExpression() {
		return (EReference)eolUnaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolUnaryOpratorNullable() {
		return eolUnaryOpratorNullableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEolUnaryOpratorNullable_UnaryOperator() {
		return (EAttribute)eolUnaryOpratorNullableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolPostfixExpression() {
		return eolPostfixExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolPostfixExpression_ItemSelectorExpression() {
		return (EReference)eolPostfixExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolPostfixExpression_ChainedFeatureCallPostfixExpression() {
		return (EReference)eolPostfixExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolChainedFeatureCallPostfixExpression() {
		return eolChainedFeatureCallPostfixExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolChainedFeatureCallPostfixExpression_FeatureCall() {
		return (EReference)eolChainedFeatureCallPostfixExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolChainedFeatureCallPostfixExpression_FeatureCallAdditionalLogicalExpression() {
		return (EReference)eolChainedFeatureCallPostfixExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolChainedFeatureCallPostfixExpression_ChainedFeatureCallPostfixExpression() {
		return (EReference)eolChainedFeatureCallPostfixExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolItemSelectorExpression() {
		return eolItemSelectorExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolItemSelectorExpression_PrimitiveExpression() {
		return (EReference)eolItemSelectorExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolItemSelectorExpression_AdditionalPrimitiveExpression() {
		return (EReference)eolItemSelectorExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolFeatureCall() {
		return eolFeatureCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolSimpleFeatureCall() {
		return eolSimpleFeatureCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEolSimpleFeatureCall_Name() {
		return (EAttribute)eolSimpleFeatureCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolSimpleFeatureCall_ParameterList() {
		return (EReference)eolSimpleFeatureCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolMofPropertyFeatureCall() {
		return eolMofPropertyFeatureCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolMofPropertyFeatureCall_ReferencedMofProperty() {
		return (EReference)eolMofPropertyFeatureCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEtlEquivalentMethodFeatureCall() {
		return etlEquivalentMethodFeatureCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolIsTypeOfSourceMofClassFeatureCall() {
		return eolIsTypeOfSourceMofClassFeatureCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolIsTypeOfSourceMofClassFeatureCall_ReferencedMofClass() {
		return (EReference)eolIsTypeOfSourceMofClassFeatureCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolParameterList() {
		return eolParameterListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolParameterList_LogicalExpressions() {
		return (EReference)eolParameterListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolNewExpression() {
		return eolNewExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolNewExpression_InstantiatedMofClass() {
		return (EReference)eolNewExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolVariableDeclarationExpression() {
		return eolVariableDeclarationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEolVariableDeclarationExpression_Name() {
		return (EAttribute)eolVariableDeclarationExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolPrimitiveExpression() {
		return eolPrimitiveExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolLiteral() {
		return eolLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolStringLiteral() {
		return eolStringLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEolStringLiteral_Value() {
		return (EAttribute)eolStringLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolReferenceExpression() {
		return eolReferenceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolFormalParameterReferenceExpression() {
		return eolFormalParameterReferenceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolFormalParameterReferenceExpression_ReferencedFormalParameter() {
		return (EReference)eolFormalParameterReferenceExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolVariableReferenceExpression() {
		return eolVariableReferenceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolVariableReferenceExpression_ReferencedVarableDeclaration() {
		return (EReference)eolVariableReferenceExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolStatementBlock() {
		return eolStatementBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolStatementBlock_Statements() {
		return (EReference)eolStatementBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolStatement() {
		return eolStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolAssignmentStatement() {
		return eolAssignmentStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEolAssignmentStatement_IsSpecial() {
		return (EAttribute)eolAssignmentStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolAssignmentStatement_LogicalExpressionLeft() {
		return (EReference)eolAssignmentStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolAssignmentStatement_LogicalExpressionRight() {
		return (EReference)eolAssignmentStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolExpressionStatement() {
		return eolExpressionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolAssignmentExpressionStatement() {
		return eolAssignmentExpressionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolAssignmentExpressionStatement_PostfixExpressionLeft() {
		return (EReference)eolAssignmentExpressionStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolAssignmentExpressionStatement_LogicalExpressionRight() {
		return (EReference)eolAssignmentExpressionStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolLogicalExpressionStatement() {
		return eolLogicalExpressionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolLogicalExpressionStatement_LogicalExpression() {
		return (EReference)eolLogicalExpressionStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEolFor() {
		return eolForEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolFor_FormalParameter() {
		return (EReference)eolForEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolFor_IteratedSequence() {
		return (EReference)eolForEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEolFor_StatementBlock() {
		return (EReference)eolForEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEolLogicalOperator() {
		return eolLogicalOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEolRelationalOperator() {
		return eolRelationalOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEolAdditiveComparisonOperator() {
		return eolAdditiveComparisonOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEolAdditiveArithmeticalOperator() {
		return eolAdditiveArithmeticalOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEolMultiplicativeArithmeticalOperator() {
		return eolMultiplicativeArithmeticalOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEolUnaryOprator() {
		return eolUnaryOpratorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtlMetaModelFactory getEtlMetaModelFactory() {
		return (EtlMetaModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mofNamedElementEClass = createEClass(MOF_NAMED_ELEMENT);
		createEAttribute(mofNamedElementEClass, MOF_NAMED_ELEMENT__NAME);

		mofTypeEClass = createEClass(MOF_TYPE);
		createEReference(mofTypeEClass, MOF_TYPE__TYPED_ELEMENTS);

		mofClassEClass = createEClass(MOF_CLASS);
		createEReference(mofClassEClass, MOF_CLASS__OWNED_PROPERTIES);
		createEReference(mofClassEClass, MOF_CLASS__SUPERCLASSES);
		createEReference(mofClassEClass, MOF_CLASS__CLAZZ);

		mofTypedElementEClass = createEClass(MOF_TYPED_ELEMENT);
		createEReference(mofTypedElementEClass, MOF_TYPED_ELEMENT__TYPE);

		mofMultiplicityElementEClass = createEClass(MOF_MULTIPLICITY_ELEMENT);
		createEAttribute(mofMultiplicityElementEClass, MOF_MULTIPLICITY_ELEMENT__UPPER);
		createEAttribute(mofMultiplicityElementEClass, MOF_MULTIPLICITY_ELEMENT__LOWER);

		mofPropertyEClass = createEClass(MOF_PROPERTY);
		createEReference(mofPropertyEClass, MOF_PROPERTY__CLAZZ);
		createEReference(mofPropertyEClass, MOF_PROPERTY__ASSOCIATION);
		createEAttribute(mofPropertyEClass, MOF_PROPERTY__IS_COMPOSITE);

		mofAssociationEClass = createEClass(MOF_ASSOCIATION);
		createEReference(mofAssociationEClass, MOF_ASSOCIATION__MEMBER_ENDS);

		mofPrimitiveTypeEClass = createEClass(MOF_PRIMITIVE_TYPE);

		mofBooleanEClass = createEClass(MOF_BOOLEAN);

		mofIntegerEClass = createEClass(MOF_INTEGER);

		mofStringEClass = createEClass(MOF_STRING);

		etlModuleEClass = createEClass(ETL_MODULE);
		createEReference(etlModuleEClass, ETL_MODULE__MOF_CLASSES_SOURCE);
		createEReference(etlModuleEClass, ETL_MODULE__MOF_ASSOCIATIONS_SOURCE);
		createEReference(etlModuleEClass, ETL_MODULE__MOF_CLASSES_TARGET);
		createEReference(etlModuleEClass, ETL_MODULE__MOF_ASSOCIATIONS_TARGET);
		createEReference(etlModuleEClass, ETL_MODULE__PRE);
		createEReference(etlModuleEClass, ETL_MODULE__TRANSFORMATION_RULES);
		createEReference(etlModuleEClass, ETL_MODULE__POST);
		createEReference(etlModuleEClass, ETL_MODULE__OPERATIONS);

		erlNamedRuleEClass = createEClass(ERL_NAMED_RULE);
		createEAttribute(erlNamedRuleEClass, ERL_NAMED_RULE__NAME);
		createEReference(erlNamedRuleEClass, ERL_NAMED_RULE__BODY);

		etlTransformationRuleEClass = createEClass(ETL_TRANSFORMATION_RULE);
		createEAttribute(etlTransformationRuleEClass, ETL_TRANSFORMATION_RULE__NAME);
		createEAttribute(etlTransformationRuleEClass, ETL_TRANSFORMATION_RULE__GUARD_NAME);
		createEReference(etlTransformationRuleEClass, ETL_TRANSFORMATION_RULE__EXTENDS_RULES);
		createEReference(etlTransformationRuleEClass, ETL_TRANSFORMATION_RULE__SOURCE_PARAMETER);
		createEReference(etlTransformationRuleEClass, ETL_TRANSFORMATION_RULE__TARGET_PARAMETERS);
		createEReference(etlTransformationRuleEClass, ETL_TRANSFORMATION_RULE__GUARD);
		createEReference(etlTransformationRuleEClass, ETL_TRANSFORMATION_RULE__BODY);
		createEAttribute(etlTransformationRuleEClass, ETL_TRANSFORMATION_RULE__ABSTRACTT);
		createEAttribute(etlTransformationRuleEClass, ETL_TRANSFORMATION_RULE__LAZY);
		createEAttribute(etlTransformationRuleEClass, ETL_TRANSFORMATION_RULE__PRIMARY);
		createEAttribute(etlTransformationRuleEClass, ETL_TRANSFORMATION_RULE__GREEDY);

		eolLibraryModuleEClass = createEClass(EOL_LIBRARY_MODULE);

		eolOperationEClass = createEClass(EOL_OPERATION);
		createEReference(eolOperationEClass, EOL_OPERATION__ANNOTATIONS);
		createEAttribute(eolOperationEClass, EOL_OPERATION__NAME);
		createEReference(eolOperationEClass, EOL_OPERATION__FORMAL_PARAMETERS);
		createEReference(eolOperationEClass, EOL_OPERATION__CONTEXT);
		createEReference(eolOperationEClass, EOL_OPERATION__BODY);
		createEReference(eolOperationEClass, EOL_OPERATION__RETURN_TYPE);

		eolFormalParameterEClass = createEClass(EOL_FORMAL_PARAMETER);
		createEAttribute(eolFormalParameterEClass, EOL_FORMAL_PARAMETER__NAME);

		eolMofClassFormalParameterEClass = createEClass(EOL_MOF_CLASS_FORMAL_PARAMETER);
		createEReference(eolMofClassFormalParameterEClass, EOL_MOF_CLASS_FORMAL_PARAMETER__REFERENCED);
		createEAttribute(eolMofClassFormalParameterEClass, EOL_MOF_CLASS_FORMAL_PARAMETER__IS_SEQUENCE);

		eolAnnotationEClass = createEClass(EOL_ANNOTATION);
		createEAttribute(eolAnnotationEClass, EOL_ANNOTATION__NAME);

		eolExecuteableAnnotationEClass = createEClass(EOL_EXECUTEABLE_ANNOTATION);
		createEReference(eolExecuteableAnnotationEClass, EOL_EXECUTEABLE_ANNOTATION__EXPRESSION);

		simpleAnnotationEClass = createEClass(SIMPLE_ANNOTATION);
		createEAttribute(simpleAnnotationEClass, SIMPLE_ANNOTATION__VALUE);

		eolTypeEClass = createEClass(EOL_TYPE);

		eolAnyTypeEClass = createEClass(EOL_ANY_TYPE);

		modelElementTypeEClass = createEClass(MODEL_ELEMENT_TYPE);
		createEAttribute(modelElementTypeEClass, MODEL_ELEMENT_TYPE__MODEL);
		createEAttribute(modelElementTypeEClass, MODEL_ELEMENT_TYPE__TYPE);

		eolNativeEClass = createEClass(EOL_NATIVE);
		createEAttribute(eolNativeEClass, EOL_NATIVE__IMPLEMENTATION);

		eolPrimitiveTypeEClass = createEClass(EOL_PRIMITIVE_TYPE);

		eolBooleanTypeEClass = createEClass(EOL_BOOLEAN_TYPE);

		eolRealTypeEClass = createEClass(EOL_REAL_TYPE);

		eolIntegerTypeEClass = createEClass(EOL_INTEGER_TYPE);

		eolStringTypeEClass = createEClass(EOL_STRING_TYPE);

		eolMapTypeEClass = createEClass(EOL_MAP_TYPE);

		eolCollectionTypeEClass = createEClass(EOL_COLLECTION_TYPE);

		eolOrderedSetTypeEClass = createEClass(EOL_ORDERED_SET_TYPE);

		eolSetTypeEClass = createEClass(EOL_SET_TYPE);

		eolBagTypeEClass = createEClass(EOL_BAG_TYPE);

		eolSequenceTypeEClass = createEClass(EOL_SEQUENCE_TYPE);

		eolExpressionOrStatementBlockEClass = createEClass(EOL_EXPRESSION_OR_STATEMENT_BLOCK);

		eolLogicalExpressionEClass = createEClass(EOL_LOGICAL_EXPRESSION);
		createEReference(eolLogicalExpressionEClass, EOL_LOGICAL_EXPRESSION__RELATIONAL_EXPRESSION);
		createEReference(eolLogicalExpressionEClass, EOL_LOGICAL_EXPRESSION__CHAINED_LOGICAL_EXPRESSION);

		eolChainedLogicalExpressionEClass = createEClass(EOL_CHAINED_LOGICAL_EXPRESSION);
		createEAttribute(eolChainedLogicalExpressionEClass, EOL_CHAINED_LOGICAL_EXPRESSION__LOGICAL_OPERATOR);
		createEReference(eolChainedLogicalExpressionEClass, EOL_CHAINED_LOGICAL_EXPRESSION__LOGICAL_EXPRESSION);

		eolRelationalExpressionEClass = createEClass(EOL_RELATIONAL_EXPRESSION);
		createEReference(eolRelationalExpressionEClass, EOL_RELATIONAL_EXPRESSION__ADDITIVE_EXPRESSION);
		createEReference(eolRelationalExpressionEClass, EOL_RELATIONAL_EXPRESSION__CHAINED_RELATIONAL_EXPRESSION);

		eolGenericChainedRelationalExpressionEClass = createEClass(EOL_GENERIC_CHAINED_RELATIONAL_EXPRESSION);

		eolChainedRelationalExpressionEClass = createEClass(EOL_CHAINED_RELATIONAL_EXPRESSION);
		createEAttribute(eolChainedRelationalExpressionEClass, EOL_CHAINED_RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR);
		createEReference(eolChainedRelationalExpressionEClass, EOL_CHAINED_RELATIONAL_EXPRESSION__RELATIONAL_EXPRESSION);

		eolComparingToAdditiveRelationalExpressionEClass = createEClass(EOL_COMPARING_TO_ADDITIVE_RELATIONAL_EXPRESSION);
		createEAttribute(eolComparingToAdditiveRelationalExpressionEClass, EOL_COMPARING_TO_ADDITIVE_RELATIONAL_EXPRESSION__ADDITIVE_COMPARISON_OPERATOR);
		createEReference(eolComparingToAdditiveRelationalExpressionEClass, EOL_COMPARING_TO_ADDITIVE_RELATIONAL_EXPRESSION__ADDITIVE_EXPRESSION);

		eolAdditiveExpressionEClass = createEClass(EOL_ADDITIVE_EXPRESSION);
		createEReference(eolAdditiveExpressionEClass, EOL_ADDITIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION);
		createEReference(eolAdditiveExpressionEClass, EOL_ADDITIVE_EXPRESSION__CHAINED_ADDITIVE_EXPRESSION);

		eolChainedAdditiveExpressionEClass = createEClass(EOL_CHAINED_ADDITIVE_EXPRESSION);
		createEAttribute(eolChainedAdditiveExpressionEClass, EOL_CHAINED_ADDITIVE_EXPRESSION__ADDITIVE_ARITHMETICAL_OPERATOR);
		createEReference(eolChainedAdditiveExpressionEClass, EOL_CHAINED_ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION);

		eolMultiplicativeExpressionEClass = createEClass(EOL_MULTIPLICATIVE_EXPRESSION);
		createEReference(eolMultiplicativeExpressionEClass, EOL_MULTIPLICATIVE_EXPRESSION__UNARY_EXPRESSION);
		createEReference(eolMultiplicativeExpressionEClass, EOL_MULTIPLICATIVE_EXPRESSION__CHAINED_MULTIPLICATIVE_EXPRESSION);

		eolChainedMultiplicativeExpressionEClass = createEClass(EOL_CHAINED_MULTIPLICATIVE_EXPRESSION);
		createEAttribute(eolChainedMultiplicativeExpressionEClass, EOL_CHAINED_MULTIPLICATIVE_EXPRESSION__MULTIPLICATIVE_ARITHMETICAL_OPERATOR);
		createEReference(eolChainedMultiplicativeExpressionEClass, EOL_CHAINED_MULTIPLICATIVE_EXPRESSION__UNARY_EXPRESSION);

		eolUnaryExpressionEClass = createEClass(EOL_UNARY_EXPRESSION);
		createEReference(eolUnaryExpressionEClass, EOL_UNARY_EXPRESSION__UNARY_OPERATOR_NULLABLE);
		createEReference(eolUnaryExpressionEClass, EOL_UNARY_EXPRESSION__POSTFIX_EXPRESSION);

		eolUnaryOpratorNullableEClass = createEClass(EOL_UNARY_OPRATOR_NULLABLE);
		createEAttribute(eolUnaryOpratorNullableEClass, EOL_UNARY_OPRATOR_NULLABLE__UNARY_OPERATOR);

		eolPostfixExpressionEClass = createEClass(EOL_POSTFIX_EXPRESSION);
		createEReference(eolPostfixExpressionEClass, EOL_POSTFIX_EXPRESSION__ITEM_SELECTOR_EXPRESSION);
		createEReference(eolPostfixExpressionEClass, EOL_POSTFIX_EXPRESSION__CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION);

		eolChainedFeatureCallPostfixExpressionEClass = createEClass(EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION);
		createEReference(eolChainedFeatureCallPostfixExpressionEClass, EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__FEATURE_CALL);
		createEReference(eolChainedFeatureCallPostfixExpressionEClass, EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__FEATURE_CALL_ADDITIONAL_LOGICAL_EXPRESSION);
		createEReference(eolChainedFeatureCallPostfixExpressionEClass, EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION);

		eolItemSelectorExpressionEClass = createEClass(EOL_ITEM_SELECTOR_EXPRESSION);
		createEReference(eolItemSelectorExpressionEClass, EOL_ITEM_SELECTOR_EXPRESSION__PRIMITIVE_EXPRESSION);
		createEReference(eolItemSelectorExpressionEClass, EOL_ITEM_SELECTOR_EXPRESSION__ADDITIONAL_PRIMITIVE_EXPRESSION);

		eolFeatureCallEClass = createEClass(EOL_FEATURE_CALL);

		eolSimpleFeatureCallEClass = createEClass(EOL_SIMPLE_FEATURE_CALL);
		createEAttribute(eolSimpleFeatureCallEClass, EOL_SIMPLE_FEATURE_CALL__NAME);
		createEReference(eolSimpleFeatureCallEClass, EOL_SIMPLE_FEATURE_CALL__PARAMETER_LIST);

		eolMofPropertyFeatureCallEClass = createEClass(EOL_MOF_PROPERTY_FEATURE_CALL);
		createEReference(eolMofPropertyFeatureCallEClass, EOL_MOF_PROPERTY_FEATURE_CALL__REFERENCED_MOF_PROPERTY);

		etlEquivalentMethodFeatureCallEClass = createEClass(ETL_EQUIVALENT_METHOD_FEATURE_CALL);

		eolIsTypeOfSourceMofClassFeatureCallEClass = createEClass(EOL_IS_TYPE_OF_SOURCE_MOF_CLASS_FEATURE_CALL);
		createEReference(eolIsTypeOfSourceMofClassFeatureCallEClass, EOL_IS_TYPE_OF_SOURCE_MOF_CLASS_FEATURE_CALL__REFERENCED_MOF_CLASS);

		eolParameterListEClass = createEClass(EOL_PARAMETER_LIST);
		createEReference(eolParameterListEClass, EOL_PARAMETER_LIST__LOGICAL_EXPRESSIONS);

		eolNewExpressionEClass = createEClass(EOL_NEW_EXPRESSION);
		createEReference(eolNewExpressionEClass, EOL_NEW_EXPRESSION__INSTANTIATED_MOF_CLASS);

		eolVariableDeclarationExpressionEClass = createEClass(EOL_VARIABLE_DECLARATION_EXPRESSION);
		createEAttribute(eolVariableDeclarationExpressionEClass, EOL_VARIABLE_DECLARATION_EXPRESSION__NAME);

		eolPrimitiveExpressionEClass = createEClass(EOL_PRIMITIVE_EXPRESSION);

		eolLiteralEClass = createEClass(EOL_LITERAL);

		eolStringLiteralEClass = createEClass(EOL_STRING_LITERAL);
		createEAttribute(eolStringLiteralEClass, EOL_STRING_LITERAL__VALUE);

		eolReferenceExpressionEClass = createEClass(EOL_REFERENCE_EXPRESSION);

		eolFormalParameterReferenceExpressionEClass = createEClass(EOL_FORMAL_PARAMETER_REFERENCE_EXPRESSION);
		createEReference(eolFormalParameterReferenceExpressionEClass, EOL_FORMAL_PARAMETER_REFERENCE_EXPRESSION__REFERENCED_FORMAL_PARAMETER);

		eolVariableReferenceExpressionEClass = createEClass(EOL_VARIABLE_REFERENCE_EXPRESSION);
		createEReference(eolVariableReferenceExpressionEClass, EOL_VARIABLE_REFERENCE_EXPRESSION__REFERENCED_VARABLE_DECLARATION);

		eolStatementBlockEClass = createEClass(EOL_STATEMENT_BLOCK);
		createEReference(eolStatementBlockEClass, EOL_STATEMENT_BLOCK__STATEMENTS);

		eolStatementEClass = createEClass(EOL_STATEMENT);

		eolAssignmentStatementEClass = createEClass(EOL_ASSIGNMENT_STATEMENT);
		createEAttribute(eolAssignmentStatementEClass, EOL_ASSIGNMENT_STATEMENT__IS_SPECIAL);
		createEReference(eolAssignmentStatementEClass, EOL_ASSIGNMENT_STATEMENT__LOGICAL_EXPRESSION_LEFT);
		createEReference(eolAssignmentStatementEClass, EOL_ASSIGNMENT_STATEMENT__LOGICAL_EXPRESSION_RIGHT);

		eolExpressionStatementEClass = createEClass(EOL_EXPRESSION_STATEMENT);

		eolAssignmentExpressionStatementEClass = createEClass(EOL_ASSIGNMENT_EXPRESSION_STATEMENT);
		createEReference(eolAssignmentExpressionStatementEClass, EOL_ASSIGNMENT_EXPRESSION_STATEMENT__POSTFIX_EXPRESSION_LEFT);
		createEReference(eolAssignmentExpressionStatementEClass, EOL_ASSIGNMENT_EXPRESSION_STATEMENT__LOGICAL_EXPRESSION_RIGHT);

		eolLogicalExpressionStatementEClass = createEClass(EOL_LOGICAL_EXPRESSION_STATEMENT);
		createEReference(eolLogicalExpressionStatementEClass, EOL_LOGICAL_EXPRESSION_STATEMENT__LOGICAL_EXPRESSION);

		eolForEClass = createEClass(EOL_FOR);
		createEReference(eolForEClass, EOL_FOR__FORMAL_PARAMETER);
		createEReference(eolForEClass, EOL_FOR__ITERATED_SEQUENCE);
		createEReference(eolForEClass, EOL_FOR__STATEMENT_BLOCK);

		// Create enums
		eolLogicalOperatorEEnum = createEEnum(EOL_LOGICAL_OPERATOR);
		eolRelationalOperatorEEnum = createEEnum(EOL_RELATIONAL_OPERATOR);
		eolAdditiveComparisonOperatorEEnum = createEEnum(EOL_ADDITIVE_COMPARISON_OPERATOR);
		eolAdditiveArithmeticalOperatorEEnum = createEEnum(EOL_ADDITIVE_ARITHMETICAL_OPERATOR);
		eolMultiplicativeArithmeticalOperatorEEnum = createEEnum(EOL_MULTIPLICATIVE_ARITHMETICAL_OPERATOR);
		eolUnaryOpratorEEnum = createEEnum(EOL_UNARY_OPRATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mofTypeEClass.getESuperTypes().add(this.getMofNamedElement());
		mofClassEClass.getESuperTypes().add(this.getMofType());
		mofTypedElementEClass.getESuperTypes().add(this.getMofNamedElement());
		mofPropertyEClass.getESuperTypes().add(this.getMofTypedElement());
		mofPropertyEClass.getESuperTypes().add(this.getMofMultiplicityElement());
		mofPrimitiveTypeEClass.getESuperTypes().add(this.getMofType());
		mofBooleanEClass.getESuperTypes().add(this.getMofPrimitiveType());
		mofIntegerEClass.getESuperTypes().add(this.getMofPrimitiveType());
		mofStringEClass.getESuperTypes().add(this.getMofPrimitiveType());
		etlModuleEClass.getESuperTypes().add(this.getEolLibraryModule());
		eolMofClassFormalParameterEClass.getESuperTypes().add(this.getEolFormalParameter());
		eolAnnotationEClass.getESuperTypes().add(this.getEolExecuteableAnnotation());
		eolAnyTypeEClass.getESuperTypes().add(this.getEolType());
		modelElementTypeEClass.getESuperTypes().add(this.getEolType());
		modelElementTypeEClass.getESuperTypes().add(this.getEolPrimitiveExpression());
		eolNativeEClass.getESuperTypes().add(this.getEolType());
		eolNativeEClass.getESuperTypes().add(this.getEolPrimitiveExpression());
		eolPrimitiveTypeEClass.getESuperTypes().add(this.getEolType());
		eolBooleanTypeEClass.getESuperTypes().add(this.getEolPrimitiveType());
		eolRealTypeEClass.getESuperTypes().add(this.getEolPrimitiveType());
		eolIntegerTypeEClass.getESuperTypes().add(this.getEolRealType());
		eolStringTypeEClass.getESuperTypes().add(this.getEolPrimitiveType());
		eolMapTypeEClass.getESuperTypes().add(this.getEolType());
		eolCollectionTypeEClass.getESuperTypes().add(this.getEolType());
		eolCollectionTypeEClass.getESuperTypes().add(this.getEolPrimitiveExpression());
		eolOrderedSetTypeEClass.getESuperTypes().add(this.getEolCollectionType());
		eolSetTypeEClass.getESuperTypes().add(this.getEolCollectionType());
		eolBagTypeEClass.getESuperTypes().add(this.getEolCollectionType());
		eolSequenceTypeEClass.getESuperTypes().add(this.getEolCollectionType());
		eolLogicalExpressionEClass.getESuperTypes().add(this.getEolExpressionOrStatementBlock());
		eolChainedRelationalExpressionEClass.getESuperTypes().add(this.getEolGenericChainedRelationalExpression());
		eolComparingToAdditiveRelationalExpressionEClass.getESuperTypes().add(this.getEolGenericChainedRelationalExpression());
		eolFeatureCallEClass.getESuperTypes().add(this.getEolPrimitiveExpression());
		eolSimpleFeatureCallEClass.getESuperTypes().add(this.getEolFeatureCall());
		eolMofPropertyFeatureCallEClass.getESuperTypes().add(this.getEolFeatureCall());
		etlEquivalentMethodFeatureCallEClass.getESuperTypes().add(this.getEolFeatureCall());
		eolIsTypeOfSourceMofClassFeatureCallEClass.getESuperTypes().add(this.getEolFeatureCall());
		eolNewExpressionEClass.getESuperTypes().add(this.getEolPrimitiveExpression());
		eolVariableDeclarationExpressionEClass.getESuperTypes().add(this.getEolPrimitiveExpression());
		eolLiteralEClass.getESuperTypes().add(this.getEolPrimitiveExpression());
		eolStringLiteralEClass.getESuperTypes().add(this.getEolPrimitiveExpression());
		eolReferenceExpressionEClass.getESuperTypes().add(this.getEolPrimitiveExpression());
		eolFormalParameterReferenceExpressionEClass.getESuperTypes().add(this.getEolReferenceExpression());
		eolVariableReferenceExpressionEClass.getESuperTypes().add(this.getEolReferenceExpression());
		eolStatementBlockEClass.getESuperTypes().add(this.getEolExpressionOrStatementBlock());
		eolAssignmentStatementEClass.getESuperTypes().add(this.getEolStatement());
		eolExpressionStatementEClass.getESuperTypes().add(this.getEolStatement());
		eolAssignmentExpressionStatementEClass.getESuperTypes().add(this.getEolExpressionStatement());
		eolLogicalExpressionStatementEClass.getESuperTypes().add(this.getEolExpressionStatement());
		eolForEClass.getESuperTypes().add(this.getEolStatement());

		// Initialize classes, features, and operations; add parameters
		initEClass(mofNamedElementEClass, MofNamedElement.class, "MofNamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMofNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, MofNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mofTypeEClass, MofType.class, "MofType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMofType_TypedElements(), this.getMofTypedElement(), this.getMofTypedElement_Type(), "typedElements", null, 0, -1, MofType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mofClassEClass, MofClass.class, "MofClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMofClass_OwnedProperties(), this.getMofProperty(), this.getMofProperty_Clazz(), "ownedProperties", null, 0, -1, MofClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMofClass_Superclasses(), this.getMofClass(), this.getMofClass_Clazz(), "superclasses", null, 0, -1, MofClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMofClass_Clazz(), this.getMofClass(), this.getMofClass_Superclasses(), "clazz", null, 0, -1, MofClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mofTypedElementEClass, MofTypedElement.class, "MofTypedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMofTypedElement_Type(), this.getMofType(), this.getMofType_TypedElements(), "type", null, 0, 1, MofTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mofMultiplicityElementEClass, MofMultiplicityElement.class, "MofMultiplicityElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMofMultiplicityElement_Upper(), ecorePackage.getEIntegerObject(), "upper", null, 0, 1, MofMultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMofMultiplicityElement_Lower(), ecorePackage.getEIntegerObject(), "lower", null, 0, 1, MofMultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mofPropertyEClass, MofProperty.class, "MofProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMofProperty_Clazz(), this.getMofClass(), this.getMofClass_OwnedProperties(), "clazz", null, 0, 1, MofProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMofProperty_Association(), this.getMofAssociation(), this.getMofAssociation_MemberEnds(), "association", null, 0, 1, MofProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMofProperty_IsComposite(), ecorePackage.getEBooleanObject(), "isComposite", null, 0, 1, MofProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mofAssociationEClass, MofAssociation.class, "MofAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMofAssociation_MemberEnds(), this.getMofProperty(), this.getMofProperty_Association(), "memberEnds", null, 2, -1, MofAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mofPrimitiveTypeEClass, MofPrimitiveType.class, "MofPrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mofBooleanEClass, MofBoolean.class, "MofBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mofIntegerEClass, MofInteger.class, "MofInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mofStringEClass, MofString.class, "MofString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(etlModuleEClass, EtlModule.class, "EtlModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEtlModule_MofClassesSource(), this.getMofClass(), null, "mofClassesSource", null, 0, -1, EtlModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEtlModule_MofAssociationsSource(), this.getMofAssociation(), null, "mofAssociationsSource", null, 0, -1, EtlModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEtlModule_MofClassesTarget(), this.getMofClass(), null, "mofClassesTarget", null, 0, -1, EtlModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEtlModule_MofAssociationsTarget(), this.getMofAssociation(), null, "mofAssociationsTarget", null, 0, -1, EtlModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEtlModule_Pre(), this.getErlNamedRule(), null, "pre", null, 0, 1, EtlModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEtlModule_TransformationRules(), this.getEtlTransformationRule(), null, "transformationRules", null, 0, -1, EtlModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEtlModule_Post(), this.getErlNamedRule(), null, "post", null, 0, 1, EtlModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEtlModule_Operations(), this.getEolOperation(), null, "operations", null, 0, -1, EtlModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(erlNamedRuleEClass, ErlNamedRule.class, "ErlNamedRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErlNamedRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, ErlNamedRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErlNamedRule_Body(), this.getEolStatementBlock(), null, "body", null, 0, 1, ErlNamedRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(etlTransformationRuleEClass, EtlTransformationRule.class, "EtlTransformationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEtlTransformationRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, EtlTransformationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEtlTransformationRule_GuardName(), ecorePackage.getEString(), "guardName", null, 0, 1, EtlTransformationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEtlTransformationRule_ExtendsRules(), this.getEtlTransformationRule(), null, "extendsRules", null, 0, -1, EtlTransformationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEtlTransformationRule_SourceParameter(), this.getEolMofClassFormalParameter(), null, "sourceParameter", null, 1, 1, EtlTransformationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEtlTransformationRule_TargetParameters(), this.getEolMofClassFormalParameter(), null, "targetParameters", null, 1, -1, EtlTransformationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEtlTransformationRule_Guard(), this.getEolLogicalExpression(), null, "guard", null, 0, 1, EtlTransformationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEtlTransformationRule_Body(), this.getEolStatementBlock(), null, "body", null, 0, 1, EtlTransformationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEtlTransformationRule_Abstractt(), ecorePackage.getEBooleanObject(), "abstractt", null, 0, 1, EtlTransformationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEtlTransformationRule_Lazy(), ecorePackage.getEBooleanObject(), "lazy", null, 0, 1, EtlTransformationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEtlTransformationRule_Primary(), ecorePackage.getEBooleanObject(), "primary", null, 0, 1, EtlTransformationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEtlTransformationRule_Greedy(), ecorePackage.getEBooleanObject(), "greedy", null, 0, 1, EtlTransformationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolLibraryModuleEClass, EolLibraryModule.class, "EolLibraryModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eolOperationEClass, EolOperation.class, "EolOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEolOperation_Annotations(), this.getEolAnnotation(), null, "annotations", null, 0, -1, EolOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEolOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, EolOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEolOperation_FormalParameters(), this.getEolFormalParameter(), null, "formalParameters", null, 0, -1, EolOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEolOperation_Context(), this.getEolType(), null, "context", null, 0, 1, EolOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEolOperation_Body(), this.getEolStatement(), null, "body", null, 0, 1, EolOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEolOperation_ReturnType(), this.getEolType(), null, "returnType", null, 0, 1, EolOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolFormalParameterEClass, EolFormalParameter.class, "EolFormalParameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEolFormalParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, EolFormalParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolMofClassFormalParameterEClass, EolMofClassFormalParameter.class, "EolMofClassFormalParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEolMofClassFormalParameter_Referenced(), this.getMofClass(), null, "referenced", null, 0, 1, EolMofClassFormalParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEolMofClassFormalParameter_IsSequence(), ecorePackage.getEBooleanObject(), "isSequence", null, 0, 1, EolMofClassFormalParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolAnnotationEClass, EolAnnotation.class, "EolAnnotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEolAnnotation_Name(), ecorePackage.getEString(), "name", null, 0, 1, EolAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolExecuteableAnnotationEClass, EolExecuteableAnnotation.class, "EolExecuteableAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEolExecuteableAnnotation_Expression(), this.getEolLogicalExpression(), null, "expression", null, 0, 1, EolExecuteableAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleAnnotationEClass, SimpleAnnotation.class, "SimpleAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleAnnotation_Value(), ecorePackage.getEString(), "value", null, 0, 1, SimpleAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolTypeEClass, EolType.class, "EolType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eolAnyTypeEClass, EolAnyType.class, "EolAnyType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelElementTypeEClass, ModelElementType.class, "ModelElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElementType_Model(), ecorePackage.getEString(), "model", null, 0, 1, ModelElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElementType_Type(), ecorePackage.getEString(), "type", null, 0, 1, ModelElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolNativeEClass, EolNative.class, "EolNative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEolNative_Implementation(), ecorePackage.getEString(), "implementation", null, 0, 1, EolNative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolPrimitiveTypeEClass, EolPrimitiveType.class, "EolPrimitiveType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eolBooleanTypeEClass, EolBooleanType.class, "EolBooleanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eolRealTypeEClass, EolRealType.class, "EolRealType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eolIntegerTypeEClass, EolIntegerType.class, "EolIntegerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eolStringTypeEClass, EolStringType.class, "EolStringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eolMapTypeEClass, EolMapType.class, "EolMapType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eolCollectionTypeEClass, EolCollectionType.class, "EolCollectionType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eolOrderedSetTypeEClass, EolOrderedSetType.class, "EolOrderedSetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eolSetTypeEClass, EolSetType.class, "EolSetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eolBagTypeEClass, EolBagType.class, "EolBagType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eolSequenceTypeEClass, EolSequenceType.class, "EolSequenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eolExpressionOrStatementBlockEClass, EolExpressionOrStatementBlock.class, "EolExpressionOrStatementBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eolLogicalExpressionEClass, EolLogicalExpression.class, "EolLogicalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEolLogicalExpression_RelationalExpression(), this.getEolRelationalExpression(), null, "relationalExpression", null, 1, 1, EolLogicalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEolLogicalExpression_ChainedLogicalExpression(), this.getEolChainedLogicalExpression(), null, "chainedLogicalExpression", null, 0, 1, EolLogicalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolChainedLogicalExpressionEClass, EolChainedLogicalExpression.class, "EolChainedLogicalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEolChainedLogicalExpression_LogicalOperator(), this.getEolLogicalOperator(), "logicalOperator", null, 1, 1, EolChainedLogicalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEolChainedLogicalExpression_LogicalExpression(), this.getEolLogicalExpression(), null, "logicalExpression", null, 1, 1, EolChainedLogicalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolRelationalExpressionEClass, EolRelationalExpression.class, "EolRelationalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEolRelationalExpression_AdditiveExpression(), this.getEolAdditiveExpression(), null, "additiveExpression", null, 1, 1, EolRelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEolRelationalExpression_ChainedRelationalExpression(), this.getEolGenericChainedRelationalExpression(), null, "chainedRelationalExpression", null, 0, 1, EolRelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolGenericChainedRelationalExpressionEClass, EolGenericChainedRelationalExpression.class, "EolGenericChainedRelationalExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eolChainedRelationalExpressionEClass, EolChainedRelationalExpression.class, "EolChainedRelationalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEolChainedRelationalExpression_RelationalOperator(), this.getEolRelationalOperator(), "relationalOperator", null, 1, 1, EolChainedRelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEolChainedRelationalExpression_RelationalExpression(), this.getEolRelationalExpression(), null, "relationalExpression", null, 1, 1, EolChainedRelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolComparingToAdditiveRelationalExpressionEClass, EolComparingToAdditiveRelationalExpression.class, "EolComparingToAdditiveRelationalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEolComparingToAdditiveRelationalExpression_AdditiveComparisonOperator(), this.getEolAdditiveComparisonOperator(), "additiveComparisonOperator", null, 1, 1, EolComparingToAdditiveRelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEolComparingToAdditiveRelationalExpression_AdditiveExpression(), this.getEolAdditiveExpression(), null, "additiveExpression", null, 1, 1, EolComparingToAdditiveRelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolAdditiveExpressionEClass, EolAdditiveExpression.class, "EolAdditiveExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEolAdditiveExpression_MultiplicativeExpression(), this.getEolMultiplicativeExpression(), null, "multiplicativeExpression", null, 1, 1, EolAdditiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEolAdditiveExpression_ChainedAdditiveExpression(), this.getEolChainedAdditiveExpression(), null, "chainedAdditiveExpression", null, 0, 1, EolAdditiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolChainedAdditiveExpressionEClass, EolChainedAdditiveExpression.class, "EolChainedAdditiveExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEolChainedAdditiveExpression_AdditiveArithmeticalOperator(), this.getEolAdditiveArithmeticalOperator(), "additiveArithmeticalOperator", null, 1, 1, EolChainedAdditiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEolChainedAdditiveExpression_AdditiveExpression(), this.getEolAdditiveExpression(), null, "additiveExpression", null, 1, 1, EolChainedAdditiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolMultiplicativeExpressionEClass, EolMultiplicativeExpression.class, "EolMultiplicativeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEolMultiplicativeExpression_UnaryExpression(), this.getEolUnaryExpression(), null, "unaryExpression", null, 1, 1, EolMultiplicativeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEolMultiplicativeExpression_ChainedMultiplicativeExpression(), this.getEolChainedMultiplicativeExpression(), null, "chainedMultiplicativeExpression", null, 0, 1, EolMultiplicativeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolChainedMultiplicativeExpressionEClass, EolChainedMultiplicativeExpression.class, "EolChainedMultiplicativeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEolChainedMultiplicativeExpression_MultiplicativeArithmeticalOperator(), this.getEolMultiplicativeArithmeticalOperator(), "multiplicativeArithmeticalOperator", null, 1, 1, EolChainedMultiplicativeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEolChainedMultiplicativeExpression_UnaryExpression(), this.getEolUnaryExpression(), null, "unaryExpression", null, 1, 1, EolChainedMultiplicativeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolUnaryExpressionEClass, EolUnaryExpression.class, "EolUnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEolUnaryExpression_UnaryOperatorNullable(), this.getEolUnaryOpratorNullable(), null, "unaryOperatorNullable", null, 0, 1, EolUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEolUnaryExpression_PostfixExpression(), this.getEolPostfixExpression(), null, "PostfixExpression", null, 1, 1, EolUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolUnaryOpratorNullableEClass, EolUnaryOpratorNullable.class, "EolUnaryOpratorNullable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEolUnaryOpratorNullable_UnaryOperator(), this.getEolUnaryOprator(), "unaryOperator", null, 1, 1, EolUnaryOpratorNullable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolPostfixExpressionEClass, EolPostfixExpression.class, "EolPostfixExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEolPostfixExpression_ItemSelectorExpression(), this.getEolItemSelectorExpression(), null, "itemSelectorExpression", null, 1, 1, EolPostfixExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEolPostfixExpression_ChainedFeatureCallPostfixExpression(), this.getEolChainedFeatureCallPostfixExpression(), null, "chainedFeatureCallPostfixExpression", null, 0, 1, EolPostfixExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolChainedFeatureCallPostfixExpressionEClass, EolChainedFeatureCallPostfixExpression.class, "EolChainedFeatureCallPostfixExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEolChainedFeatureCallPostfixExpression_FeatureCall(), this.getEolFeatureCall(), null, "featureCall", null, 1, 1, EolChainedFeatureCallPostfixExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEolChainedFeatureCallPostfixExpression_FeatureCallAdditionalLogicalExpression(), this.getEolLogicalExpression(), null, "featureCallAdditionalLogicalExpression", null, 0, 1, EolChainedFeatureCallPostfixExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEolChainedFeatureCallPostfixExpression_ChainedFeatureCallPostfixExpression(), this.getEolChainedFeatureCallPostfixExpression(), null, "chainedFeatureCallPostfixExpression", null, 0, 1, EolChainedFeatureCallPostfixExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolItemSelectorExpressionEClass, EolItemSelectorExpression.class, "EolItemSelectorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEolItemSelectorExpression_PrimitiveExpression(), this.getEolPrimitiveExpression(), null, "primitiveExpression", null, 1, 1, EolItemSelectorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEolItemSelectorExpression_AdditionalPrimitiveExpression(), this.getEolPrimitiveExpression(), null, "additionalPrimitiveExpression", null, 0, 1, EolItemSelectorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolFeatureCallEClass, EolFeatureCall.class, "EolFeatureCall", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eolSimpleFeatureCallEClass, EolSimpleFeatureCall.class, "EolSimpleFeatureCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEolSimpleFeatureCall_Name(), ecorePackage.getEString(), "name", null, 0, 1, EolSimpleFeatureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEolSimpleFeatureCall_ParameterList(), this.getEolParameterList(), null, "parameterList", null, 0, 1, EolSimpleFeatureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolMofPropertyFeatureCallEClass, EolMofPropertyFeatureCall.class, "EolMofPropertyFeatureCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEolMofPropertyFeatureCall_ReferencedMofProperty(), this.getMofProperty(), null, "referencedMofProperty", null, 1, 1, EolMofPropertyFeatureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(etlEquivalentMethodFeatureCallEClass, EtlEquivalentMethodFeatureCall.class, "EtlEquivalentMethodFeatureCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eolIsTypeOfSourceMofClassFeatureCallEClass, EolIsTypeOfSourceMofClassFeatureCall.class, "EolIsTypeOfSourceMofClassFeatureCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEolIsTypeOfSourceMofClassFeatureCall_ReferencedMofClass(), this.getMofClass(), null, "referencedMofClass", null, 0, 1, EolIsTypeOfSourceMofClassFeatureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolParameterListEClass, EolParameterList.class, "EolParameterList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEolParameterList_LogicalExpressions(), this.getEolLogicalExpression(), null, "logicalExpressions", null, 1, -1, EolParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolNewExpressionEClass, EolNewExpression.class, "EolNewExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEolNewExpression_InstantiatedMofClass(), this.getMofClass(), null, "instantiatedMofClass", null, 1, 1, EolNewExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolVariableDeclarationExpressionEClass, EolVariableDeclarationExpression.class, "EolVariableDeclarationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEolVariableDeclarationExpression_Name(), ecorePackage.getEString(), "name", null, 0, 1, EolVariableDeclarationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolPrimitiveExpressionEClass, EolPrimitiveExpression.class, "EolPrimitiveExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eolLiteralEClass, EolLiteral.class, "EolLiteral", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eolStringLiteralEClass, EolStringLiteral.class, "EolStringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEolStringLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, EolStringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolReferenceExpressionEClass, EolReferenceExpression.class, "EolReferenceExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eolFormalParameterReferenceExpressionEClass, EolFormalParameterReferenceExpression.class, "EolFormalParameterReferenceExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEolFormalParameterReferenceExpression_ReferencedFormalParameter(), this.getEolFormalParameter(), null, "referencedFormalParameter", null, 1, 1, EolFormalParameterReferenceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolVariableReferenceExpressionEClass, EolVariableReferenceExpression.class, "EolVariableReferenceExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEolVariableReferenceExpression_ReferencedVarableDeclaration(), this.getEolVariableDeclarationExpression(), null, "referencedVarableDeclaration", null, 1, 1, EolVariableReferenceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolStatementBlockEClass, EolStatementBlock.class, "EolStatementBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEolStatementBlock_Statements(), this.getEolStatement(), null, "statements", null, 0, -1, EolStatementBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolStatementEClass, EolStatement.class, "EolStatement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eolAssignmentStatementEClass, EolAssignmentStatement.class, "EolAssignmentStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEolAssignmentStatement_IsSpecial(), ecorePackage.getEBooleanObject(), "isSpecial", null, 0, 1, EolAssignmentStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEolAssignmentStatement_LogicalExpressionLeft(), this.getEolLogicalExpression(), null, "logicalExpressionLeft", null, 0, 1, EolAssignmentStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEolAssignmentStatement_LogicalExpressionRight(), this.getEolLogicalExpression(), null, "logicalExpressionRight", null, 0, 1, EolAssignmentStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolExpressionStatementEClass, EolExpressionStatement.class, "EolExpressionStatement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eolAssignmentExpressionStatementEClass, EolAssignmentExpressionStatement.class, "EolAssignmentExpressionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEolAssignmentExpressionStatement_PostfixExpressionLeft(), this.getEolPostfixExpression(), null, "postfixExpressionLeft", null, 0, 1, EolAssignmentExpressionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEolAssignmentExpressionStatement_LogicalExpressionRight(), this.getEolLogicalExpression(), null, "logicalExpressionRight", null, 0, 1, EolAssignmentExpressionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolLogicalExpressionStatementEClass, EolLogicalExpressionStatement.class, "EolLogicalExpressionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEolLogicalExpressionStatement_LogicalExpression(), this.getEolLogicalExpression(), null, "logicalExpression", null, 0, 1, EolLogicalExpressionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eolForEClass, EolFor.class, "EolFor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEolFor_FormalParameter(), this.getEolFormalParameter(), null, "formalParameter", null, 1, 1, EolFor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEolFor_IteratedSequence(), this.getEolLogicalExpression(), null, "iteratedSequence", null, 1, 1, EolFor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEolFor_StatementBlock(), this.getEolStatementBlock(), null, "statementBlock", null, 1, 1, EolFor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eolLogicalOperatorEEnum, EolLogicalOperator.class, "EolLogicalOperator");
		addEEnumLiteral(eolLogicalOperatorEEnum, EolLogicalOperator.AND);
		addEEnumLiteral(eolLogicalOperatorEEnum, EolLogicalOperator.OR);
		addEEnumLiteral(eolLogicalOperatorEEnum, EolLogicalOperator.NOT);
		addEEnumLiteral(eolLogicalOperatorEEnum, EolLogicalOperator.IMPLIES);
		addEEnumLiteral(eolLogicalOperatorEEnum, EolLogicalOperator.XOR);

		initEEnum(eolRelationalOperatorEEnum, EolRelationalOperator.class, "EolRelationalOperator");
		addEEnumLiteral(eolRelationalOperatorEEnum, EolRelationalOperator.EQUAL);
		addEEnumLiteral(eolRelationalOperatorEEnum, EolRelationalOperator.ASSIGNMENT);

		initEEnum(eolAdditiveComparisonOperatorEEnum, EolAdditiveComparisonOperator.class, "EolAdditiveComparisonOperator");
		addEEnumLiteral(eolAdditiveComparisonOperatorEEnum, EolAdditiveComparisonOperator.NOT_EQUAL);
		addEEnumLiteral(eolAdditiveComparisonOperatorEEnum, EolAdditiveComparisonOperator.GREATER_THAN);
		addEEnumLiteral(eolAdditiveComparisonOperatorEEnum, EolAdditiveComparisonOperator.SMALLER_THAN);
		addEEnumLiteral(eolAdditiveComparisonOperatorEEnum, EolAdditiveComparisonOperator.GREATER_OR_EQUAL);
		addEEnumLiteral(eolAdditiveComparisonOperatorEEnum, EolAdditiveComparisonOperator.SMALLER_OR_EQUAL);

		initEEnum(eolAdditiveArithmeticalOperatorEEnum, EolAdditiveArithmeticalOperator.class, "EolAdditiveArithmeticalOperator");
		addEEnumLiteral(eolAdditiveArithmeticalOperatorEEnum, EolAdditiveArithmeticalOperator.PLUS);
		addEEnumLiteral(eolAdditiveArithmeticalOperatorEEnum, EolAdditiveArithmeticalOperator.MINUS);

		initEEnum(eolMultiplicativeArithmeticalOperatorEEnum, EolMultiplicativeArithmeticalOperator.class, "EolMultiplicativeArithmeticalOperator");
		addEEnumLiteral(eolMultiplicativeArithmeticalOperatorEEnum, EolMultiplicativeArithmeticalOperator.MULTIPLY);
		addEEnumLiteral(eolMultiplicativeArithmeticalOperatorEEnum, EolMultiplicativeArithmeticalOperator.DIVIDE);

		initEEnum(eolUnaryOpratorEEnum, EolUnaryOprator.class, "EolUnaryOprator");
		addEEnumLiteral(eolUnaryOpratorEEnum, EolUnaryOprator.MINUS_UNARY);
		addEEnumLiteral(eolUnaryOpratorEEnum, EolUnaryOprator.NOT);

		// Create resource
		createResource(eNS_URI);
	}

} //EtlMetaModelPackageImpl
