/**
 */
package etlMetaModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see etlMetaModel.EtlMetaModelFactory
 * @model kind="package"
 * @generated
 */
public interface EtlMetaModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "etlMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "etlMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EtlMetaModelPackage eINSTANCE = etlMetaModel.impl.EtlMetaModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.MofNamedElementImpl <em>Mof Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.MofNamedElementImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getMofNamedElement()
	 * @generated
	 */
	int MOF_NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Mof Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mof Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.MofTypeImpl <em>Mof Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.MofTypeImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getMofType()
	 * @generated
	 */
	int MOF_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_TYPE__NAME = MOF_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Typed Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_TYPE__TYPED_ELEMENTS = MOF_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mof Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_TYPE_FEATURE_COUNT = MOF_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mof Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_TYPE_OPERATION_COUNT = MOF_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.MofClassImpl <em>Mof Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.MofClassImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getMofClass()
	 * @generated
	 */
	int MOF_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_CLASS__NAME = MOF_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Typed Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_CLASS__TYPED_ELEMENTS = MOF_TYPE__TYPED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Owned Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_CLASS__OWNED_PROPERTIES = MOF_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Superclasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_CLASS__SUPERCLASSES = MOF_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_CLASS__CLAZZ = MOF_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mof Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_CLASS_FEATURE_COUNT = MOF_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Mof Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_CLASS_OPERATION_COUNT = MOF_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.MofTypedElementImpl <em>Mof Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.MofTypedElementImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getMofTypedElement()
	 * @generated
	 */
	int MOF_TYPED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_TYPED_ELEMENT__NAME = MOF_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_TYPED_ELEMENT__TYPE = MOF_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mof Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_TYPED_ELEMENT_FEATURE_COUNT = MOF_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mof Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_TYPED_ELEMENT_OPERATION_COUNT = MOF_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.MofMultiplicityElementImpl <em>Mof Multiplicity Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.MofMultiplicityElementImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getMofMultiplicityElement()
	 * @generated
	 */
	int MOF_MULTIPLICITY_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_MULTIPLICITY_ELEMENT__UPPER = 0;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_MULTIPLICITY_ELEMENT__LOWER = 1;

	/**
	 * The number of structural features of the '<em>Mof Multiplicity Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_MULTIPLICITY_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mof Multiplicity Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_MULTIPLICITY_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.MofPropertyImpl <em>Mof Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.MofPropertyImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getMofProperty()
	 * @generated
	 */
	int MOF_PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_PROPERTY__NAME = MOF_TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_PROPERTY__TYPE = MOF_TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_PROPERTY__UPPER = MOF_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_PROPERTY__LOWER = MOF_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_PROPERTY__CLAZZ = MOF_TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_PROPERTY__ASSOCIATION = MOF_TYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_PROPERTY__IS_COMPOSITE = MOF_TYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Mof Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_PROPERTY_FEATURE_COUNT = MOF_TYPED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Mof Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_PROPERTY_OPERATION_COUNT = MOF_TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.MofAssociationImpl <em>Mof Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.MofAssociationImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getMofAssociation()
	 * @generated
	 */
	int MOF_ASSOCIATION = 6;

	/**
	 * The feature id for the '<em><b>Member Ends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_ASSOCIATION__MEMBER_ENDS = 0;

	/**
	 * The number of structural features of the '<em>Mof Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_ASSOCIATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mof Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_ASSOCIATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.MofPrimitiveTypeImpl <em>Mof Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.MofPrimitiveTypeImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getMofPrimitiveType()
	 * @generated
	 */
	int MOF_PRIMITIVE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_PRIMITIVE_TYPE__NAME = MOF_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Typed Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_PRIMITIVE_TYPE__TYPED_ELEMENTS = MOF_TYPE__TYPED_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Mof Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_PRIMITIVE_TYPE_FEATURE_COUNT = MOF_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mof Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_PRIMITIVE_TYPE_OPERATION_COUNT = MOF_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.MofBooleanImpl <em>Mof Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.MofBooleanImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getMofBoolean()
	 * @generated
	 */
	int MOF_BOOLEAN = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_BOOLEAN__NAME = MOF_PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Typed Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_BOOLEAN__TYPED_ELEMENTS = MOF_PRIMITIVE_TYPE__TYPED_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Mof Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_BOOLEAN_FEATURE_COUNT = MOF_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mof Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_BOOLEAN_OPERATION_COUNT = MOF_PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.MofIntegerImpl <em>Mof Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.MofIntegerImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getMofInteger()
	 * @generated
	 */
	int MOF_INTEGER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_INTEGER__NAME = MOF_PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Typed Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_INTEGER__TYPED_ELEMENTS = MOF_PRIMITIVE_TYPE__TYPED_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Mof Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_INTEGER_FEATURE_COUNT = MOF_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mof Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_INTEGER_OPERATION_COUNT = MOF_PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.MofStringImpl <em>Mof String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.MofStringImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getMofString()
	 * @generated
	 */
	int MOF_STRING = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_STRING__NAME = MOF_PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Typed Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_STRING__TYPED_ELEMENTS = MOF_PRIMITIVE_TYPE__TYPED_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Mof String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_STRING_FEATURE_COUNT = MOF_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mof String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_STRING_OPERATION_COUNT = MOF_PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolLibraryModuleImpl <em>Eol Library Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolLibraryModuleImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolLibraryModule()
	 * @generated
	 */
	int EOL_LIBRARY_MODULE = 14;

	/**
	 * The number of structural features of the '<em>Eol Library Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_LIBRARY_MODULE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Eol Library Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_LIBRARY_MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EtlModuleImpl <em>Etl Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EtlModuleImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEtlModule()
	 * @generated
	 */
	int ETL_MODULE = 11;

	/**
	 * The feature id for the '<em><b>Mof Classes Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_MODULE__MOF_CLASSES_SOURCE = EOL_LIBRARY_MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mof Associations Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_MODULE__MOF_ASSOCIATIONS_SOURCE = EOL_LIBRARY_MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mof Classes Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_MODULE__MOF_CLASSES_TARGET = EOL_LIBRARY_MODULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mof Associations Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_MODULE__MOF_ASSOCIATIONS_TARGET = EOL_LIBRARY_MODULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_MODULE__PRE = EOL_LIBRARY_MODULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transformation Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_MODULE__TRANSFORMATION_RULES = EOL_LIBRARY_MODULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_MODULE__POST = EOL_LIBRARY_MODULE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_MODULE__OPERATIONS = EOL_LIBRARY_MODULE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Etl Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_MODULE_FEATURE_COUNT = EOL_LIBRARY_MODULE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Etl Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_MODULE_OPERATION_COUNT = EOL_LIBRARY_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.ErlNamedRuleImpl <em>Erl Named Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.ErlNamedRuleImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getErlNamedRule()
	 * @generated
	 */
	int ERL_NAMED_RULE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERL_NAMED_RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERL_NAMED_RULE__BODY = 1;

	/**
	 * The number of structural features of the '<em>Erl Named Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERL_NAMED_RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Erl Named Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERL_NAMED_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EtlTransformationRuleImpl <em>Etl Transformation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EtlTransformationRuleImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEtlTransformationRule()
	 * @generated
	 */
	int ETL_TRANSFORMATION_RULE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_TRANSFORMATION_RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Guard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_TRANSFORMATION_RULE__GUARD_NAME = 1;

	/**
	 * The feature id for the '<em><b>Extends Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_TRANSFORMATION_RULE__EXTENDS_RULES = 2;

	/**
	 * The feature id for the '<em><b>Source Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_TRANSFORMATION_RULE__SOURCE_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Target Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_TRANSFORMATION_RULE__TARGET_PARAMETERS = 4;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_TRANSFORMATION_RULE__GUARD = 5;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_TRANSFORMATION_RULE__BODY = 6;

	/**
	 * The feature id for the '<em><b>Abstractt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_TRANSFORMATION_RULE__ABSTRACTT = 7;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_TRANSFORMATION_RULE__LAZY = 8;

	/**
	 * The feature id for the '<em><b>Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_TRANSFORMATION_RULE__PRIMARY = 9;

	/**
	 * The feature id for the '<em><b>Greedy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_TRANSFORMATION_RULE__GREEDY = 10;

	/**
	 * The number of structural features of the '<em>Etl Transformation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_TRANSFORMATION_RULE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Etl Transformation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_TRANSFORMATION_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolExpressionOrStatementBlockImpl <em>Eol Expression Or Statement Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolExpressionOrStatementBlockImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolExpressionOrStatementBlock()
	 * @generated
	 */
	int EOL_EXPRESSION_OR_STATEMENT_BLOCK = 36;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolOperationImpl <em>Eol Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolOperationImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolOperation()
	 * @generated
	 */
	int EOL_OPERATION = 15;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_OPERATION__ANNOTATIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_OPERATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Formal Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_OPERATION__FORMAL_PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_OPERATION__CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_OPERATION__BODY = 4;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_OPERATION__RETURN_TYPE = 5;

	/**
	 * The number of structural features of the '<em>Eol Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_OPERATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Eol Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolFormalParameterImpl <em>Eol Formal Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolFormalParameterImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolFormalParameter()
	 * @generated
	 */
	int EOL_FORMAL_PARAMETER = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_FORMAL_PARAMETER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Eol Formal Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_FORMAL_PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Eol Formal Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_FORMAL_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolMofClassFormalParameterImpl <em>Eol Mof Class Formal Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolMofClassFormalParameterImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolMofClassFormalParameter()
	 * @generated
	 */
	int EOL_MOF_CLASS_FORMAL_PARAMETER = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_MOF_CLASS_FORMAL_PARAMETER__NAME = EOL_FORMAL_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Referenced</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_MOF_CLASS_FORMAL_PARAMETER__REFERENCED = EOL_FORMAL_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_MOF_CLASS_FORMAL_PARAMETER__IS_SEQUENCE = EOL_FORMAL_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Eol Mof Class Formal Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_MOF_CLASS_FORMAL_PARAMETER_FEATURE_COUNT = EOL_FORMAL_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Eol Mof Class Formal Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_MOF_CLASS_FORMAL_PARAMETER_OPERATION_COUNT = EOL_FORMAL_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolExecuteableAnnotationImpl <em>Eol Executeable Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolExecuteableAnnotationImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolExecuteableAnnotation()
	 * @generated
	 */
	int EOL_EXECUTEABLE_ANNOTATION = 19;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_EXECUTEABLE_ANNOTATION__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Eol Executeable Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_EXECUTEABLE_ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Eol Executeable Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_EXECUTEABLE_ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolAnnotationImpl <em>Eol Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolAnnotationImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolAnnotation()
	 * @generated
	 */
	int EOL_ANNOTATION = 18;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_ANNOTATION__EXPRESSION = EOL_EXECUTEABLE_ANNOTATION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_ANNOTATION__NAME = EOL_EXECUTEABLE_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Eol Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_ANNOTATION_FEATURE_COUNT = EOL_EXECUTEABLE_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Eol Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_ANNOTATION_OPERATION_COUNT = EOL_EXECUTEABLE_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.SimpleAnnotationImpl <em>Simple Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.SimpleAnnotationImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getSimpleAnnotation()
	 * @generated
	 */
	int SIMPLE_ANNOTATION = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANNOTATION__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Simple Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Simple Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolTypeImpl <em>Eol Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolTypeImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolType()
	 * @generated
	 */
	int EOL_TYPE = 21;

	/**
	 * The number of structural features of the '<em>Eol Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Eol Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolAnyTypeImpl <em>Eol Any Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolAnyTypeImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolAnyType()
	 * @generated
	 */
	int EOL_ANY_TYPE = 22;

	/**
	 * The number of structural features of the '<em>Eol Any Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_ANY_TYPE_FEATURE_COUNT = EOL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Eol Any Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_ANY_TYPE_OPERATION_COUNT = EOL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.ModelElementTypeImpl <em>Model Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.ModelElementTypeImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getModelElementType()
	 * @generated
	 */
	int MODEL_ELEMENT_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_TYPE__MODEL = EOL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_TYPE__TYPE = EOL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_TYPE_FEATURE_COUNT = EOL_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Model Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_TYPE_OPERATION_COUNT = EOL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolNativeImpl <em>Eol Native</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolNativeImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolNative()
	 * @generated
	 */
	int EOL_NATIVE = 24;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_NATIVE__IMPLEMENTATION = EOL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Eol Native</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_NATIVE_FEATURE_COUNT = EOL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Eol Native</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_NATIVE_OPERATION_COUNT = EOL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolPrimitiveTypeImpl <em>Eol Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolPrimitiveTypeImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolPrimitiveType()
	 * @generated
	 */
	int EOL_PRIMITIVE_TYPE = 25;

	/**
	 * The number of structural features of the '<em>Eol Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_PRIMITIVE_TYPE_FEATURE_COUNT = EOL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Eol Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_PRIMITIVE_TYPE_OPERATION_COUNT = EOL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolBooleanTypeImpl <em>Eol Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolBooleanTypeImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolBooleanType()
	 * @generated
	 */
	int EOL_BOOLEAN_TYPE = 26;

	/**
	 * The number of structural features of the '<em>Eol Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_BOOLEAN_TYPE_FEATURE_COUNT = EOL_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Eol Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_BOOLEAN_TYPE_OPERATION_COUNT = EOL_PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolRealTypeImpl <em>Eol Real Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolRealTypeImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolRealType()
	 * @generated
	 */
	int EOL_REAL_TYPE = 27;

	/**
	 * The number of structural features of the '<em>Eol Real Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_REAL_TYPE_FEATURE_COUNT = EOL_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Eol Real Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_REAL_TYPE_OPERATION_COUNT = EOL_PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolIntegerTypeImpl <em>Eol Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolIntegerTypeImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolIntegerType()
	 * @generated
	 */
	int EOL_INTEGER_TYPE = 28;

	/**
	 * The number of structural features of the '<em>Eol Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_INTEGER_TYPE_FEATURE_COUNT = EOL_REAL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Eol Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_INTEGER_TYPE_OPERATION_COUNT = EOL_REAL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolStringTypeImpl <em>Eol String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolStringTypeImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolStringType()
	 * @generated
	 */
	int EOL_STRING_TYPE = 29;

	/**
	 * The number of structural features of the '<em>Eol String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_STRING_TYPE_FEATURE_COUNT = EOL_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Eol String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_STRING_TYPE_OPERATION_COUNT = EOL_PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolMapTypeImpl <em>Eol Map Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolMapTypeImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolMapType()
	 * @generated
	 */
	int EOL_MAP_TYPE = 30;

	/**
	 * The number of structural features of the '<em>Eol Map Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_MAP_TYPE_FEATURE_COUNT = EOL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Eol Map Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_MAP_TYPE_OPERATION_COUNT = EOL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolCollectionTypeImpl <em>Eol Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolCollectionTypeImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolCollectionType()
	 * @generated
	 */
	int EOL_COLLECTION_TYPE = 31;

	/**
	 * The number of structural features of the '<em>Eol Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_COLLECTION_TYPE_FEATURE_COUNT = EOL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Eol Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_COLLECTION_TYPE_OPERATION_COUNT = EOL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolOrderedSetTypeImpl <em>Eol Ordered Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolOrderedSetTypeImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolOrderedSetType()
	 * @generated
	 */
	int EOL_ORDERED_SET_TYPE = 32;

	/**
	 * The number of structural features of the '<em>Eol Ordered Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_ORDERED_SET_TYPE_FEATURE_COUNT = EOL_COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Eol Ordered Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_ORDERED_SET_TYPE_OPERATION_COUNT = EOL_COLLECTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolSetTypeImpl <em>Eol Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolSetTypeImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolSetType()
	 * @generated
	 */
	int EOL_SET_TYPE = 33;

	/**
	 * The number of structural features of the '<em>Eol Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_SET_TYPE_FEATURE_COUNT = EOL_COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Eol Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_SET_TYPE_OPERATION_COUNT = EOL_COLLECTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolBagTypeImpl <em>Eol Bag Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolBagTypeImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolBagType()
	 * @generated
	 */
	int EOL_BAG_TYPE = 34;

	/**
	 * The number of structural features of the '<em>Eol Bag Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_BAG_TYPE_FEATURE_COUNT = EOL_COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Eol Bag Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_BAG_TYPE_OPERATION_COUNT = EOL_COLLECTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolSequenceTypeImpl <em>Eol Sequence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolSequenceTypeImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolSequenceType()
	 * @generated
	 */
	int EOL_SEQUENCE_TYPE = 35;

	/**
	 * The number of structural features of the '<em>Eol Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_SEQUENCE_TYPE_FEATURE_COUNT = EOL_COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Eol Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_SEQUENCE_TYPE_OPERATION_COUNT = EOL_COLLECTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Eol Expression Or Statement Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_EXPRESSION_OR_STATEMENT_BLOCK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Eol Expression Or Statement Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_EXPRESSION_OR_STATEMENT_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolLogicalExpressionImpl <em>Eol Logical Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolLogicalExpressionImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolLogicalExpression()
	 * @generated
	 */
	int EOL_LOGICAL_EXPRESSION = 37;

	/**
	 * The feature id for the '<em><b>Relational Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_LOGICAL_EXPRESSION__RELATIONAL_EXPRESSION = EOL_EXPRESSION_OR_STATEMENT_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Chained Logical Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_LOGICAL_EXPRESSION__CHAINED_LOGICAL_EXPRESSION = EOL_EXPRESSION_OR_STATEMENT_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Eol Logical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_LOGICAL_EXPRESSION_FEATURE_COUNT = EOL_EXPRESSION_OR_STATEMENT_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Eol Logical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_LOGICAL_EXPRESSION_OPERATION_COUNT = EOL_EXPRESSION_OR_STATEMENT_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolChainedLogicalExpressionImpl <em>Eol Chained Logical Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolChainedLogicalExpressionImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolChainedLogicalExpression()
	 * @generated
	 */
	int EOL_CHAINED_LOGICAL_EXPRESSION = 38;

	/**
	 * The feature id for the '<em><b>Logical Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_CHAINED_LOGICAL_EXPRESSION__LOGICAL_OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Logical Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_CHAINED_LOGICAL_EXPRESSION__LOGICAL_EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Eol Chained Logical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_CHAINED_LOGICAL_EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Eol Chained Logical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_CHAINED_LOGICAL_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolRelationalExpressionImpl <em>Eol Relational Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolRelationalExpressionImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolRelationalExpression()
	 * @generated
	 */
	int EOL_RELATIONAL_EXPRESSION = 39;

	/**
	 * The feature id for the '<em><b>Additive Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_RELATIONAL_EXPRESSION__ADDITIVE_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Chained Relational Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_RELATIONAL_EXPRESSION__CHAINED_RELATIONAL_EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Eol Relational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_RELATIONAL_EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Eol Relational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_RELATIONAL_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolGenericChainedRelationalExpressionImpl <em>Eol Generic Chained Relational Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolGenericChainedRelationalExpressionImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolGenericChainedRelationalExpression()
	 * @generated
	 */
	int EOL_GENERIC_CHAINED_RELATIONAL_EXPRESSION = 40;

	/**
	 * The number of structural features of the '<em>Eol Generic Chained Relational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_GENERIC_CHAINED_RELATIONAL_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Eol Generic Chained Relational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_GENERIC_CHAINED_RELATIONAL_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolChainedRelationalExpressionImpl <em>Eol Chained Relational Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolChainedRelationalExpressionImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolChainedRelationalExpression()
	 * @generated
	 */
	int EOL_CHAINED_RELATIONAL_EXPRESSION = 41;

	/**
	 * The feature id for the '<em><b>Relational Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_CHAINED_RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR = EOL_GENERIC_CHAINED_RELATIONAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relational Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_CHAINED_RELATIONAL_EXPRESSION__RELATIONAL_EXPRESSION = EOL_GENERIC_CHAINED_RELATIONAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Eol Chained Relational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_CHAINED_RELATIONAL_EXPRESSION_FEATURE_COUNT = EOL_GENERIC_CHAINED_RELATIONAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Eol Chained Relational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_CHAINED_RELATIONAL_EXPRESSION_OPERATION_COUNT = EOL_GENERIC_CHAINED_RELATIONAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolComparingToAdditiveRelationalExpressionImpl <em>Eol Comparing To Additive Relational Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolComparingToAdditiveRelationalExpressionImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolComparingToAdditiveRelationalExpression()
	 * @generated
	 */
	int EOL_COMPARING_TO_ADDITIVE_RELATIONAL_EXPRESSION = 42;

	/**
	 * The feature id for the '<em><b>Additive Comparison Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_COMPARING_TO_ADDITIVE_RELATIONAL_EXPRESSION__ADDITIVE_COMPARISON_OPERATOR = EOL_GENERIC_CHAINED_RELATIONAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Additive Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_COMPARING_TO_ADDITIVE_RELATIONAL_EXPRESSION__ADDITIVE_EXPRESSION = EOL_GENERIC_CHAINED_RELATIONAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Eol Comparing To Additive Relational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_COMPARING_TO_ADDITIVE_RELATIONAL_EXPRESSION_FEATURE_COUNT = EOL_GENERIC_CHAINED_RELATIONAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Eol Comparing To Additive Relational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_COMPARING_TO_ADDITIVE_RELATIONAL_EXPRESSION_OPERATION_COUNT = EOL_GENERIC_CHAINED_RELATIONAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolAdditiveExpressionImpl <em>Eol Additive Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolAdditiveExpressionImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolAdditiveExpression()
	 * @generated
	 */
	int EOL_ADDITIVE_EXPRESSION = 43;

	/**
	 * The feature id for the '<em><b>Multiplicative Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_ADDITIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Chained Additive Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_ADDITIVE_EXPRESSION__CHAINED_ADDITIVE_EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Eol Additive Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_ADDITIVE_EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Eol Additive Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_ADDITIVE_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolChainedAdditiveExpressionImpl <em>Eol Chained Additive Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolChainedAdditiveExpressionImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolChainedAdditiveExpression()
	 * @generated
	 */
	int EOL_CHAINED_ADDITIVE_EXPRESSION = 44;

	/**
	 * The feature id for the '<em><b>Additive Arithmetical Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_CHAINED_ADDITIVE_EXPRESSION__ADDITIVE_ARITHMETICAL_OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Additive Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_CHAINED_ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Eol Chained Additive Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_CHAINED_ADDITIVE_EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Eol Chained Additive Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_CHAINED_ADDITIVE_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolMultiplicativeExpressionImpl <em>Eol Multiplicative Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolMultiplicativeExpressionImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolMultiplicativeExpression()
	 * @generated
	 */
	int EOL_MULTIPLICATIVE_EXPRESSION = 45;

	/**
	 * The feature id for the '<em><b>Unary Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_MULTIPLICATIVE_EXPRESSION__UNARY_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Chained Multiplicative Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_MULTIPLICATIVE_EXPRESSION__CHAINED_MULTIPLICATIVE_EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Eol Multiplicative Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_MULTIPLICATIVE_EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Eol Multiplicative Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_MULTIPLICATIVE_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolChainedMultiplicativeExpressionImpl <em>Eol Chained Multiplicative Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolChainedMultiplicativeExpressionImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolChainedMultiplicativeExpression()
	 * @generated
	 */
	int EOL_CHAINED_MULTIPLICATIVE_EXPRESSION = 46;

	/**
	 * The feature id for the '<em><b>Multiplicative Arithmetical Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_CHAINED_MULTIPLICATIVE_EXPRESSION__MULTIPLICATIVE_ARITHMETICAL_OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Unary Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_CHAINED_MULTIPLICATIVE_EXPRESSION__UNARY_EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Eol Chained Multiplicative Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_CHAINED_MULTIPLICATIVE_EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Eol Chained Multiplicative Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_CHAINED_MULTIPLICATIVE_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolUnaryExpressionImpl <em>Eol Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolUnaryExpressionImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolUnaryExpression()
	 * @generated
	 */
	int EOL_UNARY_EXPRESSION = 47;

	/**
	 * The feature id for the '<em><b>Unary Operator Nullable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_UNARY_EXPRESSION__UNARY_OPERATOR_NULLABLE = 0;

	/**
	 * The feature id for the '<em><b>Postfix Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_UNARY_EXPRESSION__POSTFIX_EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Eol Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_UNARY_EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Eol Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_UNARY_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolUnaryOpratorNullableImpl <em>Eol Unary Oprator Nullable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolUnaryOpratorNullableImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolUnaryOpratorNullable()
	 * @generated
	 */
	int EOL_UNARY_OPRATOR_NULLABLE = 48;

	/**
	 * The feature id for the '<em><b>Unary Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_UNARY_OPRATOR_NULLABLE__UNARY_OPERATOR = 0;

	/**
	 * The number of structural features of the '<em>Eol Unary Oprator Nullable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_UNARY_OPRATOR_NULLABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Eol Unary Oprator Nullable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_UNARY_OPRATOR_NULLABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolPostfixExpressionImpl <em>Eol Postfix Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolPostfixExpressionImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolPostfixExpression()
	 * @generated
	 */
	int EOL_POSTFIX_EXPRESSION = 49;

	/**
	 * The feature id for the '<em><b>Item Selector Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_POSTFIX_EXPRESSION__ITEM_SELECTOR_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Chained Feature Call Postfix Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_POSTFIX_EXPRESSION__CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Eol Postfix Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_POSTFIX_EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Eol Postfix Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_POSTFIX_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolChainedFeatureCallPostfixExpressionImpl <em>Eol Chained Feature Call Postfix Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolChainedFeatureCallPostfixExpressionImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolChainedFeatureCallPostfixExpression()
	 * @generated
	 */
	int EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION = 50;

	/**
	 * The feature id for the '<em><b>Feature Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__FEATURE_CALL = 0;

	/**
	 * The feature id for the '<em><b>Feature Call Additional Logical Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__FEATURE_CALL_ADDITIONAL_LOGICAL_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Chained Feature Call Postfix Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION = 2;

	/**
	 * The number of structural features of the '<em>Eol Chained Feature Call Postfix Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Eol Chained Feature Call Postfix Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolItemSelectorExpressionImpl <em>Eol Item Selector Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolItemSelectorExpressionImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolItemSelectorExpression()
	 * @generated
	 */
	int EOL_ITEM_SELECTOR_EXPRESSION = 51;

	/**
	 * The feature id for the '<em><b>Primitive Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_ITEM_SELECTOR_EXPRESSION__PRIMITIVE_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Additional Primitive Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_ITEM_SELECTOR_EXPRESSION__ADDITIONAL_PRIMITIVE_EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Eol Item Selector Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_ITEM_SELECTOR_EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Eol Item Selector Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_ITEM_SELECTOR_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolPrimitiveExpressionImpl <em>Eol Primitive Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolPrimitiveExpressionImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolPrimitiveExpression()
	 * @generated
	 */
	int EOL_PRIMITIVE_EXPRESSION = 60;

	/**
	 * The number of structural features of the '<em>Eol Primitive Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_PRIMITIVE_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Eol Primitive Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_PRIMITIVE_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolFeatureCallImpl <em>Eol Feature Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolFeatureCallImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolFeatureCall()
	 * @generated
	 */
	int EOL_FEATURE_CALL = 52;

	/**
	 * The number of structural features of the '<em>Eol Feature Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_FEATURE_CALL_FEATURE_COUNT = EOL_PRIMITIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Eol Feature Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_FEATURE_CALL_OPERATION_COUNT = EOL_PRIMITIVE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolSimpleFeatureCallImpl <em>Eol Simple Feature Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolSimpleFeatureCallImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolSimpleFeatureCall()
	 * @generated
	 */
	int EOL_SIMPLE_FEATURE_CALL = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_SIMPLE_FEATURE_CALL__NAME = EOL_FEATURE_CALL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_SIMPLE_FEATURE_CALL__PARAMETER_LIST = EOL_FEATURE_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Eol Simple Feature Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_SIMPLE_FEATURE_CALL_FEATURE_COUNT = EOL_FEATURE_CALL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Eol Simple Feature Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_SIMPLE_FEATURE_CALL_OPERATION_COUNT = EOL_FEATURE_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolMofPropertyFeatureCallImpl <em>Eol Mof Property Feature Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolMofPropertyFeatureCallImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolMofPropertyFeatureCall()
	 * @generated
	 */
	int EOL_MOF_PROPERTY_FEATURE_CALL = 54;

	/**
	 * The feature id for the '<em><b>Referenced Mof Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_MOF_PROPERTY_FEATURE_CALL__REFERENCED_MOF_PROPERTY = EOL_FEATURE_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Eol Mof Property Feature Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_MOF_PROPERTY_FEATURE_CALL_FEATURE_COUNT = EOL_FEATURE_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Eol Mof Property Feature Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_MOF_PROPERTY_FEATURE_CALL_OPERATION_COUNT = EOL_FEATURE_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EtlEquivalentMethodFeatureCallImpl <em>Etl Equivalent Method Feature Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EtlEquivalentMethodFeatureCallImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEtlEquivalentMethodFeatureCall()
	 * @generated
	 */
	int ETL_EQUIVALENT_METHOD_FEATURE_CALL = 55;

	/**
	 * The number of structural features of the '<em>Etl Equivalent Method Feature Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_EQUIVALENT_METHOD_FEATURE_CALL_FEATURE_COUNT = EOL_FEATURE_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Etl Equivalent Method Feature Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_EQUIVALENT_METHOD_FEATURE_CALL_OPERATION_COUNT = EOL_FEATURE_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolIsTypeOfSourceMofClassFeatureCallImpl <em>Eol Is Type Of Source Mof Class Feature Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolIsTypeOfSourceMofClassFeatureCallImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolIsTypeOfSourceMofClassFeatureCall()
	 * @generated
	 */
	int EOL_IS_TYPE_OF_SOURCE_MOF_CLASS_FEATURE_CALL = 56;

	/**
	 * The feature id for the '<em><b>Referenced Mof Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_IS_TYPE_OF_SOURCE_MOF_CLASS_FEATURE_CALL__REFERENCED_MOF_CLASS = EOL_FEATURE_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Eol Is Type Of Source Mof Class Feature Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_IS_TYPE_OF_SOURCE_MOF_CLASS_FEATURE_CALL_FEATURE_COUNT = EOL_FEATURE_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Eol Is Type Of Source Mof Class Feature Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_IS_TYPE_OF_SOURCE_MOF_CLASS_FEATURE_CALL_OPERATION_COUNT = EOL_FEATURE_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolParameterListImpl <em>Eol Parameter List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolParameterListImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolParameterList()
	 * @generated
	 */
	int EOL_PARAMETER_LIST = 57;

	/**
	 * The feature id for the '<em><b>Logical Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_PARAMETER_LIST__LOGICAL_EXPRESSIONS = 0;

	/**
	 * The number of structural features of the '<em>Eol Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_PARAMETER_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Eol Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_PARAMETER_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolNewExpressionImpl <em>Eol New Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolNewExpressionImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolNewExpression()
	 * @generated
	 */
	int EOL_NEW_EXPRESSION = 58;

	/**
	 * The feature id for the '<em><b>Instantiated Mof Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_NEW_EXPRESSION__INSTANTIATED_MOF_CLASS = EOL_PRIMITIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Eol New Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_NEW_EXPRESSION_FEATURE_COUNT = EOL_PRIMITIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Eol New Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_NEW_EXPRESSION_OPERATION_COUNT = EOL_PRIMITIVE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolVariableDeclarationExpressionImpl <em>Eol Variable Declaration Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolVariableDeclarationExpressionImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolVariableDeclarationExpression()
	 * @generated
	 */
	int EOL_VARIABLE_DECLARATION_EXPRESSION = 59;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_VARIABLE_DECLARATION_EXPRESSION__NAME = EOL_PRIMITIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Eol Variable Declaration Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_VARIABLE_DECLARATION_EXPRESSION_FEATURE_COUNT = EOL_PRIMITIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Eol Variable Declaration Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_VARIABLE_DECLARATION_EXPRESSION_OPERATION_COUNT = EOL_PRIMITIVE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolLiteralImpl <em>Eol Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolLiteralImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolLiteral()
	 * @generated
	 */
	int EOL_LITERAL = 61;

	/**
	 * The number of structural features of the '<em>Eol Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_LITERAL_FEATURE_COUNT = EOL_PRIMITIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Eol Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_LITERAL_OPERATION_COUNT = EOL_PRIMITIVE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolStringLiteralImpl <em>Eol String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolStringLiteralImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolStringLiteral()
	 * @generated
	 */
	int EOL_STRING_LITERAL = 62;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_STRING_LITERAL__VALUE = EOL_PRIMITIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Eol String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_STRING_LITERAL_FEATURE_COUNT = EOL_PRIMITIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Eol String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_STRING_LITERAL_OPERATION_COUNT = EOL_PRIMITIVE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolReferenceExpressionImpl <em>Eol Reference Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolReferenceExpressionImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolReferenceExpression()
	 * @generated
	 */
	int EOL_REFERENCE_EXPRESSION = 63;

	/**
	 * The number of structural features of the '<em>Eol Reference Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_REFERENCE_EXPRESSION_FEATURE_COUNT = EOL_PRIMITIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Eol Reference Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_REFERENCE_EXPRESSION_OPERATION_COUNT = EOL_PRIMITIVE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolFormalParameterReferenceExpressionImpl <em>Eol Formal Parameter Reference Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolFormalParameterReferenceExpressionImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolFormalParameterReferenceExpression()
	 * @generated
	 */
	int EOL_FORMAL_PARAMETER_REFERENCE_EXPRESSION = 64;

	/**
	 * The feature id for the '<em><b>Referenced Formal Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_FORMAL_PARAMETER_REFERENCE_EXPRESSION__REFERENCED_FORMAL_PARAMETER = EOL_REFERENCE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Eol Formal Parameter Reference Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_FORMAL_PARAMETER_REFERENCE_EXPRESSION_FEATURE_COUNT = EOL_REFERENCE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Eol Formal Parameter Reference Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_FORMAL_PARAMETER_REFERENCE_EXPRESSION_OPERATION_COUNT = EOL_REFERENCE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolVariableReferenceExpressionImpl <em>Eol Variable Reference Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolVariableReferenceExpressionImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolVariableReferenceExpression()
	 * @generated
	 */
	int EOL_VARIABLE_REFERENCE_EXPRESSION = 65;

	/**
	 * The feature id for the '<em><b>Referenced Varable Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_VARIABLE_REFERENCE_EXPRESSION__REFERENCED_VARABLE_DECLARATION = EOL_REFERENCE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Eol Variable Reference Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_VARIABLE_REFERENCE_EXPRESSION_FEATURE_COUNT = EOL_REFERENCE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Eol Variable Reference Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_VARIABLE_REFERENCE_EXPRESSION_OPERATION_COUNT = EOL_REFERENCE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolStatementBlockImpl <em>Eol Statement Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolStatementBlockImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolStatementBlock()
	 * @generated
	 */
	int EOL_STATEMENT_BLOCK = 66;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_STATEMENT_BLOCK__STATEMENTS = EOL_EXPRESSION_OR_STATEMENT_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Eol Statement Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_STATEMENT_BLOCK_FEATURE_COUNT = EOL_EXPRESSION_OR_STATEMENT_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Eol Statement Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_STATEMENT_BLOCK_OPERATION_COUNT = EOL_EXPRESSION_OR_STATEMENT_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolStatementImpl <em>Eol Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolStatementImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolStatement()
	 * @generated
	 */
	int EOL_STATEMENT = 67;

	/**
	 * The number of structural features of the '<em>Eol Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Eol Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolAssignmentStatementImpl <em>Eol Assignment Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolAssignmentStatementImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolAssignmentStatement()
	 * @generated
	 */
	int EOL_ASSIGNMENT_STATEMENT = 68;

	/**
	 * The feature id for the '<em><b>Is Special</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_ASSIGNMENT_STATEMENT__IS_SPECIAL = EOL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Logical Expression Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_ASSIGNMENT_STATEMENT__LOGICAL_EXPRESSION_LEFT = EOL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Logical Expression Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_ASSIGNMENT_STATEMENT__LOGICAL_EXPRESSION_RIGHT = EOL_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Eol Assignment Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_ASSIGNMENT_STATEMENT_FEATURE_COUNT = EOL_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Eol Assignment Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_ASSIGNMENT_STATEMENT_OPERATION_COUNT = EOL_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolExpressionStatementImpl <em>Eol Expression Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolExpressionStatementImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolExpressionStatement()
	 * @generated
	 */
	int EOL_EXPRESSION_STATEMENT = 69;

	/**
	 * The number of structural features of the '<em>Eol Expression Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_EXPRESSION_STATEMENT_FEATURE_COUNT = EOL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Eol Expression Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_EXPRESSION_STATEMENT_OPERATION_COUNT = EOL_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolAssignmentExpressionStatementImpl <em>Eol Assignment Expression Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolAssignmentExpressionStatementImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolAssignmentExpressionStatement()
	 * @generated
	 */
	int EOL_ASSIGNMENT_EXPRESSION_STATEMENT = 70;

	/**
	 * The feature id for the '<em><b>Postfix Expression Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_ASSIGNMENT_EXPRESSION_STATEMENT__POSTFIX_EXPRESSION_LEFT = EOL_EXPRESSION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Logical Expression Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_ASSIGNMENT_EXPRESSION_STATEMENT__LOGICAL_EXPRESSION_RIGHT = EOL_EXPRESSION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Eol Assignment Expression Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_ASSIGNMENT_EXPRESSION_STATEMENT_FEATURE_COUNT = EOL_EXPRESSION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Eol Assignment Expression Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_ASSIGNMENT_EXPRESSION_STATEMENT_OPERATION_COUNT = EOL_EXPRESSION_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolLogicalExpressionStatementImpl <em>Eol Logical Expression Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolLogicalExpressionStatementImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolLogicalExpressionStatement()
	 * @generated
	 */
	int EOL_LOGICAL_EXPRESSION_STATEMENT = 71;

	/**
	 * The feature id for the '<em><b>Logical Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_LOGICAL_EXPRESSION_STATEMENT__LOGICAL_EXPRESSION = EOL_EXPRESSION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Eol Logical Expression Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_LOGICAL_EXPRESSION_STATEMENT_FEATURE_COUNT = EOL_EXPRESSION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Eol Logical Expression Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_LOGICAL_EXPRESSION_STATEMENT_OPERATION_COUNT = EOL_EXPRESSION_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.impl.EolForImpl <em>Eol For</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.impl.EolForImpl
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolFor()
	 * @generated
	 */
	int EOL_FOR = 72;

	/**
	 * The feature id for the '<em><b>Formal Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_FOR__FORMAL_PARAMETER = EOL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iterated Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_FOR__ITERATED_SEQUENCE = EOL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Statement Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_FOR__STATEMENT_BLOCK = EOL_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Eol For</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_FOR_FEATURE_COUNT = EOL_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Eol For</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_FOR_OPERATION_COUNT = EOL_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link etlMetaModel.EolLogicalOperator <em>Eol Logical Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.EolLogicalOperator
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolLogicalOperator()
	 * @generated
	 */
	int EOL_LOGICAL_OPERATOR = 73;

	/**
	 * The meta object id for the '{@link etlMetaModel.EolRelationalOperator <em>Eol Relational Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.EolRelationalOperator
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolRelationalOperator()
	 * @generated
	 */
	int EOL_RELATIONAL_OPERATOR = 74;

	/**
	 * The meta object id for the '{@link etlMetaModel.EolAdditiveComparisonOperator <em>Eol Additive Comparison Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.EolAdditiveComparisonOperator
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolAdditiveComparisonOperator()
	 * @generated
	 */
	int EOL_ADDITIVE_COMPARISON_OPERATOR = 75;

	/**
	 * The meta object id for the '{@link etlMetaModel.EolAdditiveArithmeticalOperator <em>Eol Additive Arithmetical Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.EolAdditiveArithmeticalOperator
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolAdditiveArithmeticalOperator()
	 * @generated
	 */
	int EOL_ADDITIVE_ARITHMETICAL_OPERATOR = 76;

	/**
	 * The meta object id for the '{@link etlMetaModel.EolMultiplicativeArithmeticalOperator <em>Eol Multiplicative Arithmetical Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.EolMultiplicativeArithmeticalOperator
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolMultiplicativeArithmeticalOperator()
	 * @generated
	 */
	int EOL_MULTIPLICATIVE_ARITHMETICAL_OPERATOR = 77;

	/**
	 * The meta object id for the '{@link etlMetaModel.EolUnaryOprator <em>Eol Unary Oprator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see etlMetaModel.EolUnaryOprator
	 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolUnaryOprator()
	 * @generated
	 */
	int EOL_UNARY_OPRATOR = 78;


	/**
	 * Returns the meta object for class '{@link etlMetaModel.MofNamedElement <em>Mof Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mof Named Element</em>'.
	 * @see etlMetaModel.MofNamedElement
	 * @generated
	 */
	EClass getMofNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link etlMetaModel.MofNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see etlMetaModel.MofNamedElement#getName()
	 * @see #getMofNamedElement()
	 * @generated
	 */
	EAttribute getMofNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.MofType <em>Mof Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mof Type</em>'.
	 * @see etlMetaModel.MofType
	 * @generated
	 */
	EClass getMofType();

	/**
	 * Returns the meta object for the containment reference list '{@link etlMetaModel.MofType#getTypedElements <em>Typed Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Typed Elements</em>'.
	 * @see etlMetaModel.MofType#getTypedElements()
	 * @see #getMofType()
	 * @generated
	 */
	EReference getMofType_TypedElements();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.MofClass <em>Mof Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mof Class</em>'.
	 * @see etlMetaModel.MofClass
	 * @generated
	 */
	EClass getMofClass();

	/**
	 * Returns the meta object for the containment reference list '{@link etlMetaModel.MofClass#getOwnedProperties <em>Owned Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Properties</em>'.
	 * @see etlMetaModel.MofClass#getOwnedProperties()
	 * @see #getMofClass()
	 * @generated
	 */
	EReference getMofClass_OwnedProperties();

	/**
	 * Returns the meta object for the reference list '{@link etlMetaModel.MofClass#getSuperclasses <em>Superclasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Superclasses</em>'.
	 * @see etlMetaModel.MofClass#getSuperclasses()
	 * @see #getMofClass()
	 * @generated
	 */
	EReference getMofClass_Superclasses();

	/**
	 * Returns the meta object for the reference list '{@link etlMetaModel.MofClass#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clazz</em>'.
	 * @see etlMetaModel.MofClass#getClazz()
	 * @see #getMofClass()
	 * @generated
	 */
	EReference getMofClass_Clazz();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.MofTypedElement <em>Mof Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mof Typed Element</em>'.
	 * @see etlMetaModel.MofTypedElement
	 * @generated
	 */
	EClass getMofTypedElement();

	/**
	 * Returns the meta object for the container reference '{@link etlMetaModel.MofTypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Type</em>'.
	 * @see etlMetaModel.MofTypedElement#getType()
	 * @see #getMofTypedElement()
	 * @generated
	 */
	EReference getMofTypedElement_Type();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.MofMultiplicityElement <em>Mof Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mof Multiplicity Element</em>'.
	 * @see etlMetaModel.MofMultiplicityElement
	 * @generated
	 */
	EClass getMofMultiplicityElement();

	/**
	 * Returns the meta object for the attribute '{@link etlMetaModel.MofMultiplicityElement#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see etlMetaModel.MofMultiplicityElement#getUpper()
	 * @see #getMofMultiplicityElement()
	 * @generated
	 */
	EAttribute getMofMultiplicityElement_Upper();

	/**
	 * Returns the meta object for the attribute '{@link etlMetaModel.MofMultiplicityElement#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see etlMetaModel.MofMultiplicityElement#getLower()
	 * @see #getMofMultiplicityElement()
	 * @generated
	 */
	EAttribute getMofMultiplicityElement_Lower();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.MofProperty <em>Mof Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mof Property</em>'.
	 * @see etlMetaModel.MofProperty
	 * @generated
	 */
	EClass getMofProperty();

	/**
	 * Returns the meta object for the container reference '{@link etlMetaModel.MofProperty#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Clazz</em>'.
	 * @see etlMetaModel.MofProperty#getClazz()
	 * @see #getMofProperty()
	 * @generated
	 */
	EReference getMofProperty_Clazz();

	/**
	 * Returns the meta object for the reference '{@link etlMetaModel.MofProperty#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Association</em>'.
	 * @see etlMetaModel.MofProperty#getAssociation()
	 * @see #getMofProperty()
	 * @generated
	 */
	EReference getMofProperty_Association();

	/**
	 * Returns the meta object for the attribute '{@link etlMetaModel.MofProperty#getIsComposite <em>Is Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Composite</em>'.
	 * @see etlMetaModel.MofProperty#getIsComposite()
	 * @see #getMofProperty()
	 * @generated
	 */
	EAttribute getMofProperty_IsComposite();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.MofAssociation <em>Mof Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mof Association</em>'.
	 * @see etlMetaModel.MofAssociation
	 * @generated
	 */
	EClass getMofAssociation();

	/**
	 * Returns the meta object for the reference list '{@link etlMetaModel.MofAssociation#getMemberEnds <em>Member Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member Ends</em>'.
	 * @see etlMetaModel.MofAssociation#getMemberEnds()
	 * @see #getMofAssociation()
	 * @generated
	 */
	EReference getMofAssociation_MemberEnds();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.MofPrimitiveType <em>Mof Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mof Primitive Type</em>'.
	 * @see etlMetaModel.MofPrimitiveType
	 * @generated
	 */
	EClass getMofPrimitiveType();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.MofBoolean <em>Mof Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mof Boolean</em>'.
	 * @see etlMetaModel.MofBoolean
	 * @generated
	 */
	EClass getMofBoolean();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.MofInteger <em>Mof Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mof Integer</em>'.
	 * @see etlMetaModel.MofInteger
	 * @generated
	 */
	EClass getMofInteger();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.MofString <em>Mof String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mof String</em>'.
	 * @see etlMetaModel.MofString
	 * @generated
	 */
	EClass getMofString();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EtlModule <em>Etl Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Etl Module</em>'.
	 * @see etlMetaModel.EtlModule
	 * @generated
	 */
	EClass getEtlModule();

	/**
	 * Returns the meta object for the containment reference list '{@link etlMetaModel.EtlModule#getMofClassesSource <em>Mof Classes Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mof Classes Source</em>'.
	 * @see etlMetaModel.EtlModule#getMofClassesSource()
	 * @see #getEtlModule()
	 * @generated
	 */
	EReference getEtlModule_MofClassesSource();

	/**
	 * Returns the meta object for the containment reference list '{@link etlMetaModel.EtlModule#getMofAssociationsSource <em>Mof Associations Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mof Associations Source</em>'.
	 * @see etlMetaModel.EtlModule#getMofAssociationsSource()
	 * @see #getEtlModule()
	 * @generated
	 */
	EReference getEtlModule_MofAssociationsSource();

	/**
	 * Returns the meta object for the containment reference list '{@link etlMetaModel.EtlModule#getMofClassesTarget <em>Mof Classes Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mof Classes Target</em>'.
	 * @see etlMetaModel.EtlModule#getMofClassesTarget()
	 * @see #getEtlModule()
	 * @generated
	 */
	EReference getEtlModule_MofClassesTarget();

	/**
	 * Returns the meta object for the containment reference list '{@link etlMetaModel.EtlModule#getMofAssociationsTarget <em>Mof Associations Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mof Associations Target</em>'.
	 * @see etlMetaModel.EtlModule#getMofAssociationsTarget()
	 * @see #getEtlModule()
	 * @generated
	 */
	EReference getEtlModule_MofAssociationsTarget();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EtlModule#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre</em>'.
	 * @see etlMetaModel.EtlModule#getPre()
	 * @see #getEtlModule()
	 * @generated
	 */
	EReference getEtlModule_Pre();

	/**
	 * Returns the meta object for the containment reference list '{@link etlMetaModel.EtlModule#getTransformationRules <em>Transformation Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformation Rules</em>'.
	 * @see etlMetaModel.EtlModule#getTransformationRules()
	 * @see #getEtlModule()
	 * @generated
	 */
	EReference getEtlModule_TransformationRules();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EtlModule#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post</em>'.
	 * @see etlMetaModel.EtlModule#getPost()
	 * @see #getEtlModule()
	 * @generated
	 */
	EReference getEtlModule_Post();

	/**
	 * Returns the meta object for the containment reference list '{@link etlMetaModel.EtlModule#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see etlMetaModel.EtlModule#getOperations()
	 * @see #getEtlModule()
	 * @generated
	 */
	EReference getEtlModule_Operations();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.ErlNamedRule <em>Erl Named Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erl Named Rule</em>'.
	 * @see etlMetaModel.ErlNamedRule
	 * @generated
	 */
	EClass getErlNamedRule();

	/**
	 * Returns the meta object for the attribute '{@link etlMetaModel.ErlNamedRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see etlMetaModel.ErlNamedRule#getName()
	 * @see #getErlNamedRule()
	 * @generated
	 */
	EAttribute getErlNamedRule_Name();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.ErlNamedRule#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see etlMetaModel.ErlNamedRule#getBody()
	 * @see #getErlNamedRule()
	 * @generated
	 */
	EReference getErlNamedRule_Body();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EtlTransformationRule <em>Etl Transformation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Etl Transformation Rule</em>'.
	 * @see etlMetaModel.EtlTransformationRule
	 * @generated
	 */
	EClass getEtlTransformationRule();

	/**
	 * Returns the meta object for the attribute '{@link etlMetaModel.EtlTransformationRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see etlMetaModel.EtlTransformationRule#getName()
	 * @see #getEtlTransformationRule()
	 * @generated
	 */
	EAttribute getEtlTransformationRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link etlMetaModel.EtlTransformationRule#getGuardName <em>Guard Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Name</em>'.
	 * @see etlMetaModel.EtlTransformationRule#getGuardName()
	 * @see #getEtlTransformationRule()
	 * @generated
	 */
	EAttribute getEtlTransformationRule_GuardName();

	/**
	 * Returns the meta object for the reference list '{@link etlMetaModel.EtlTransformationRule#getExtendsRules <em>Extends Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extends Rules</em>'.
	 * @see etlMetaModel.EtlTransformationRule#getExtendsRules()
	 * @see #getEtlTransformationRule()
	 * @generated
	 */
	EReference getEtlTransformationRule_ExtendsRules();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EtlTransformationRule#getSourceParameter <em>Source Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Parameter</em>'.
	 * @see etlMetaModel.EtlTransformationRule#getSourceParameter()
	 * @see #getEtlTransformationRule()
	 * @generated
	 */
	EReference getEtlTransformationRule_SourceParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link etlMetaModel.EtlTransformationRule#getTargetParameters <em>Target Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Parameters</em>'.
	 * @see etlMetaModel.EtlTransformationRule#getTargetParameters()
	 * @see #getEtlTransformationRule()
	 * @generated
	 */
	EReference getEtlTransformationRule_TargetParameters();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EtlTransformationRule#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see etlMetaModel.EtlTransformationRule#getGuard()
	 * @see #getEtlTransformationRule()
	 * @generated
	 */
	EReference getEtlTransformationRule_Guard();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EtlTransformationRule#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see etlMetaModel.EtlTransformationRule#getBody()
	 * @see #getEtlTransformationRule()
	 * @generated
	 */
	EReference getEtlTransformationRule_Body();

	/**
	 * Returns the meta object for the attribute '{@link etlMetaModel.EtlTransformationRule#getAbstractt <em>Abstractt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstractt</em>'.
	 * @see etlMetaModel.EtlTransformationRule#getAbstractt()
	 * @see #getEtlTransformationRule()
	 * @generated
	 */
	EAttribute getEtlTransformationRule_Abstractt();

	/**
	 * Returns the meta object for the attribute '{@link etlMetaModel.EtlTransformationRule#getLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see etlMetaModel.EtlTransformationRule#getLazy()
	 * @see #getEtlTransformationRule()
	 * @generated
	 */
	EAttribute getEtlTransformationRule_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link etlMetaModel.EtlTransformationRule#getPrimary <em>Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary</em>'.
	 * @see etlMetaModel.EtlTransformationRule#getPrimary()
	 * @see #getEtlTransformationRule()
	 * @generated
	 */
	EAttribute getEtlTransformationRule_Primary();

	/**
	 * Returns the meta object for the attribute '{@link etlMetaModel.EtlTransformationRule#getGreedy <em>Greedy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Greedy</em>'.
	 * @see etlMetaModel.EtlTransformationRule#getGreedy()
	 * @see #getEtlTransformationRule()
	 * @generated
	 */
	EAttribute getEtlTransformationRule_Greedy();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolLibraryModule <em>Eol Library Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Library Module</em>'.
	 * @see etlMetaModel.EolLibraryModule
	 * @generated
	 */
	EClass getEolLibraryModule();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolOperation <em>Eol Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Operation</em>'.
	 * @see etlMetaModel.EolOperation
	 * @generated
	 */
	EClass getEolOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link etlMetaModel.EolOperation#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see etlMetaModel.EolOperation#getAnnotations()
	 * @see #getEolOperation()
	 * @generated
	 */
	EReference getEolOperation_Annotations();

	/**
	 * Returns the meta object for the attribute '{@link etlMetaModel.EolOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see etlMetaModel.EolOperation#getName()
	 * @see #getEolOperation()
	 * @generated
	 */
	EAttribute getEolOperation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link etlMetaModel.EolOperation#getFormalParameters <em>Formal Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formal Parameters</em>'.
	 * @see etlMetaModel.EolOperation#getFormalParameters()
	 * @see #getEolOperation()
	 * @generated
	 */
	EReference getEolOperation_FormalParameters();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolOperation#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see etlMetaModel.EolOperation#getContext()
	 * @see #getEolOperation()
	 * @generated
	 */
	EReference getEolOperation_Context();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolOperation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see etlMetaModel.EolOperation#getBody()
	 * @see #getEolOperation()
	 * @generated
	 */
	EReference getEolOperation_Body();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolOperation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see etlMetaModel.EolOperation#getReturnType()
	 * @see #getEolOperation()
	 * @generated
	 */
	EReference getEolOperation_ReturnType();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolFormalParameter <em>Eol Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Formal Parameter</em>'.
	 * @see etlMetaModel.EolFormalParameter
	 * @generated
	 */
	EClass getEolFormalParameter();

	/**
	 * Returns the meta object for the attribute '{@link etlMetaModel.EolFormalParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see etlMetaModel.EolFormalParameter#getName()
	 * @see #getEolFormalParameter()
	 * @generated
	 */
	EAttribute getEolFormalParameter_Name();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolMofClassFormalParameter <em>Eol Mof Class Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Mof Class Formal Parameter</em>'.
	 * @see etlMetaModel.EolMofClassFormalParameter
	 * @generated
	 */
	EClass getEolMofClassFormalParameter();

	/**
	 * Returns the meta object for the reference '{@link etlMetaModel.EolMofClassFormalParameter#getReferenced <em>Referenced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced</em>'.
	 * @see etlMetaModel.EolMofClassFormalParameter#getReferenced()
	 * @see #getEolMofClassFormalParameter()
	 * @generated
	 */
	EReference getEolMofClassFormalParameter_Referenced();

	/**
	 * Returns the meta object for the attribute '{@link etlMetaModel.EolMofClassFormalParameter#getIsSequence <em>Is Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Sequence</em>'.
	 * @see etlMetaModel.EolMofClassFormalParameter#getIsSequence()
	 * @see #getEolMofClassFormalParameter()
	 * @generated
	 */
	EAttribute getEolMofClassFormalParameter_IsSequence();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolAnnotation <em>Eol Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Annotation</em>'.
	 * @see etlMetaModel.EolAnnotation
	 * @generated
	 */
	EClass getEolAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link etlMetaModel.EolAnnotation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see etlMetaModel.EolAnnotation#getName()
	 * @see #getEolAnnotation()
	 * @generated
	 */
	EAttribute getEolAnnotation_Name();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolExecuteableAnnotation <em>Eol Executeable Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Executeable Annotation</em>'.
	 * @see etlMetaModel.EolExecuteableAnnotation
	 * @generated
	 */
	EClass getEolExecuteableAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolExecuteableAnnotation#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see etlMetaModel.EolExecuteableAnnotation#getExpression()
	 * @see #getEolExecuteableAnnotation()
	 * @generated
	 */
	EReference getEolExecuteableAnnotation_Expression();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.SimpleAnnotation <em>Simple Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Annotation</em>'.
	 * @see etlMetaModel.SimpleAnnotation
	 * @generated
	 */
	EClass getSimpleAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link etlMetaModel.SimpleAnnotation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see etlMetaModel.SimpleAnnotation#getValue()
	 * @see #getSimpleAnnotation()
	 * @generated
	 */
	EAttribute getSimpleAnnotation_Value();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolType <em>Eol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Type</em>'.
	 * @see etlMetaModel.EolType
	 * @generated
	 */
	EClass getEolType();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolAnyType <em>Eol Any Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Any Type</em>'.
	 * @see etlMetaModel.EolAnyType
	 * @generated
	 */
	EClass getEolAnyType();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.ModelElementType <em>Model Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element Type</em>'.
	 * @see etlMetaModel.ModelElementType
	 * @generated
	 */
	EClass getModelElementType();

	/**
	 * Returns the meta object for the attribute '{@link etlMetaModel.ModelElementType#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see etlMetaModel.ModelElementType#getModel()
	 * @see #getModelElementType()
	 * @generated
	 */
	EAttribute getModelElementType_Model();

	/**
	 * Returns the meta object for the attribute '{@link etlMetaModel.ModelElementType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see etlMetaModel.ModelElementType#getType()
	 * @see #getModelElementType()
	 * @generated
	 */
	EAttribute getModelElementType_Type();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolNative <em>Eol Native</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Native</em>'.
	 * @see etlMetaModel.EolNative
	 * @generated
	 */
	EClass getEolNative();

	/**
	 * Returns the meta object for the attribute '{@link etlMetaModel.EolNative#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation</em>'.
	 * @see etlMetaModel.EolNative#getImplementation()
	 * @see #getEolNative()
	 * @generated
	 */
	EAttribute getEolNative_Implementation();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolPrimitiveType <em>Eol Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Primitive Type</em>'.
	 * @see etlMetaModel.EolPrimitiveType
	 * @generated
	 */
	EClass getEolPrimitiveType();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolBooleanType <em>Eol Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Boolean Type</em>'.
	 * @see etlMetaModel.EolBooleanType
	 * @generated
	 */
	EClass getEolBooleanType();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolRealType <em>Eol Real Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Real Type</em>'.
	 * @see etlMetaModel.EolRealType
	 * @generated
	 */
	EClass getEolRealType();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolIntegerType <em>Eol Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Integer Type</em>'.
	 * @see etlMetaModel.EolIntegerType
	 * @generated
	 */
	EClass getEolIntegerType();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolStringType <em>Eol String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol String Type</em>'.
	 * @see etlMetaModel.EolStringType
	 * @generated
	 */
	EClass getEolStringType();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolMapType <em>Eol Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Map Type</em>'.
	 * @see etlMetaModel.EolMapType
	 * @generated
	 */
	EClass getEolMapType();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolCollectionType <em>Eol Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Collection Type</em>'.
	 * @see etlMetaModel.EolCollectionType
	 * @generated
	 */
	EClass getEolCollectionType();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolOrderedSetType <em>Eol Ordered Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Ordered Set Type</em>'.
	 * @see etlMetaModel.EolOrderedSetType
	 * @generated
	 */
	EClass getEolOrderedSetType();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolSetType <em>Eol Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Set Type</em>'.
	 * @see etlMetaModel.EolSetType
	 * @generated
	 */
	EClass getEolSetType();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolBagType <em>Eol Bag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Bag Type</em>'.
	 * @see etlMetaModel.EolBagType
	 * @generated
	 */
	EClass getEolBagType();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolSequenceType <em>Eol Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Sequence Type</em>'.
	 * @see etlMetaModel.EolSequenceType
	 * @generated
	 */
	EClass getEolSequenceType();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolExpressionOrStatementBlock <em>Eol Expression Or Statement Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Expression Or Statement Block</em>'.
	 * @see etlMetaModel.EolExpressionOrStatementBlock
	 * @generated
	 */
	EClass getEolExpressionOrStatementBlock();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolLogicalExpression <em>Eol Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Logical Expression</em>'.
	 * @see etlMetaModel.EolLogicalExpression
	 * @generated
	 */
	EClass getEolLogicalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolLogicalExpression#getRelationalExpression <em>Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relational Expression</em>'.
	 * @see etlMetaModel.EolLogicalExpression#getRelationalExpression()
	 * @see #getEolLogicalExpression()
	 * @generated
	 */
	EReference getEolLogicalExpression_RelationalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolLogicalExpression#getChainedLogicalExpression <em>Chained Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Chained Logical Expression</em>'.
	 * @see etlMetaModel.EolLogicalExpression#getChainedLogicalExpression()
	 * @see #getEolLogicalExpression()
	 * @generated
	 */
	EReference getEolLogicalExpression_ChainedLogicalExpression();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolChainedLogicalExpression <em>Eol Chained Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Chained Logical Expression</em>'.
	 * @see etlMetaModel.EolChainedLogicalExpression
	 * @generated
	 */
	EClass getEolChainedLogicalExpression();

	/**
	 * Returns the meta object for the attribute '{@link etlMetaModel.EolChainedLogicalExpression#getLogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logical Operator</em>'.
	 * @see etlMetaModel.EolChainedLogicalExpression#getLogicalOperator()
	 * @see #getEolChainedLogicalExpression()
	 * @generated
	 */
	EAttribute getEolChainedLogicalExpression_LogicalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolChainedLogicalExpression#getLogicalExpression <em>Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logical Expression</em>'.
	 * @see etlMetaModel.EolChainedLogicalExpression#getLogicalExpression()
	 * @see #getEolChainedLogicalExpression()
	 * @generated
	 */
	EReference getEolChainedLogicalExpression_LogicalExpression();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolRelationalExpression <em>Eol Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Relational Expression</em>'.
	 * @see etlMetaModel.EolRelationalExpression
	 * @generated
	 */
	EClass getEolRelationalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolRelationalExpression#getAdditiveExpression <em>Additive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additive Expression</em>'.
	 * @see etlMetaModel.EolRelationalExpression#getAdditiveExpression()
	 * @see #getEolRelationalExpression()
	 * @generated
	 */
	EReference getEolRelationalExpression_AdditiveExpression();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolRelationalExpression#getChainedRelationalExpression <em>Chained Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Chained Relational Expression</em>'.
	 * @see etlMetaModel.EolRelationalExpression#getChainedRelationalExpression()
	 * @see #getEolRelationalExpression()
	 * @generated
	 */
	EReference getEolRelationalExpression_ChainedRelationalExpression();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolGenericChainedRelationalExpression <em>Eol Generic Chained Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Generic Chained Relational Expression</em>'.
	 * @see etlMetaModel.EolGenericChainedRelationalExpression
	 * @generated
	 */
	EClass getEolGenericChainedRelationalExpression();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolChainedRelationalExpression <em>Eol Chained Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Chained Relational Expression</em>'.
	 * @see etlMetaModel.EolChainedRelationalExpression
	 * @generated
	 */
	EClass getEolChainedRelationalExpression();

	/**
	 * Returns the meta object for the attribute '{@link etlMetaModel.EolChainedRelationalExpression#getRelationalOperator <em>Relational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relational Operator</em>'.
	 * @see etlMetaModel.EolChainedRelationalExpression#getRelationalOperator()
	 * @see #getEolChainedRelationalExpression()
	 * @generated
	 */
	EAttribute getEolChainedRelationalExpression_RelationalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolChainedRelationalExpression#getRelationalExpression <em>Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relational Expression</em>'.
	 * @see etlMetaModel.EolChainedRelationalExpression#getRelationalExpression()
	 * @see #getEolChainedRelationalExpression()
	 * @generated
	 */
	EReference getEolChainedRelationalExpression_RelationalExpression();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolComparingToAdditiveRelationalExpression <em>Eol Comparing To Additive Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Comparing To Additive Relational Expression</em>'.
	 * @see etlMetaModel.EolComparingToAdditiveRelationalExpression
	 * @generated
	 */
	EClass getEolComparingToAdditiveRelationalExpression();

	/**
	 * Returns the meta object for the attribute '{@link etlMetaModel.EolComparingToAdditiveRelationalExpression#getAdditiveComparisonOperator <em>Additive Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additive Comparison Operator</em>'.
	 * @see etlMetaModel.EolComparingToAdditiveRelationalExpression#getAdditiveComparisonOperator()
	 * @see #getEolComparingToAdditiveRelationalExpression()
	 * @generated
	 */
	EAttribute getEolComparingToAdditiveRelationalExpression_AdditiveComparisonOperator();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolComparingToAdditiveRelationalExpression#getAdditiveExpression <em>Additive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additive Expression</em>'.
	 * @see etlMetaModel.EolComparingToAdditiveRelationalExpression#getAdditiveExpression()
	 * @see #getEolComparingToAdditiveRelationalExpression()
	 * @generated
	 */
	EReference getEolComparingToAdditiveRelationalExpression_AdditiveExpression();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolAdditiveExpression <em>Eol Additive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Additive Expression</em>'.
	 * @see etlMetaModel.EolAdditiveExpression
	 * @generated
	 */
	EClass getEolAdditiveExpression();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolAdditiveExpression#getMultiplicativeExpression <em>Multiplicative Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplicative Expression</em>'.
	 * @see etlMetaModel.EolAdditiveExpression#getMultiplicativeExpression()
	 * @see #getEolAdditiveExpression()
	 * @generated
	 */
	EReference getEolAdditiveExpression_MultiplicativeExpression();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolAdditiveExpression#getChainedAdditiveExpression <em>Chained Additive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Chained Additive Expression</em>'.
	 * @see etlMetaModel.EolAdditiveExpression#getChainedAdditiveExpression()
	 * @see #getEolAdditiveExpression()
	 * @generated
	 */
	EReference getEolAdditiveExpression_ChainedAdditiveExpression();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolChainedAdditiveExpression <em>Eol Chained Additive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Chained Additive Expression</em>'.
	 * @see etlMetaModel.EolChainedAdditiveExpression
	 * @generated
	 */
	EClass getEolChainedAdditiveExpression();

	/**
	 * Returns the meta object for the attribute '{@link etlMetaModel.EolChainedAdditiveExpression#getAdditiveArithmeticalOperator <em>Additive Arithmetical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additive Arithmetical Operator</em>'.
	 * @see etlMetaModel.EolChainedAdditiveExpression#getAdditiveArithmeticalOperator()
	 * @see #getEolChainedAdditiveExpression()
	 * @generated
	 */
	EAttribute getEolChainedAdditiveExpression_AdditiveArithmeticalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolChainedAdditiveExpression#getAdditiveExpression <em>Additive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additive Expression</em>'.
	 * @see etlMetaModel.EolChainedAdditiveExpression#getAdditiveExpression()
	 * @see #getEolChainedAdditiveExpression()
	 * @generated
	 */
	EReference getEolChainedAdditiveExpression_AdditiveExpression();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolMultiplicativeExpression <em>Eol Multiplicative Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Multiplicative Expression</em>'.
	 * @see etlMetaModel.EolMultiplicativeExpression
	 * @generated
	 */
	EClass getEolMultiplicativeExpression();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolMultiplicativeExpression#getUnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unary Expression</em>'.
	 * @see etlMetaModel.EolMultiplicativeExpression#getUnaryExpression()
	 * @see #getEolMultiplicativeExpression()
	 * @generated
	 */
	EReference getEolMultiplicativeExpression_UnaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolMultiplicativeExpression#getChainedMultiplicativeExpression <em>Chained Multiplicative Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Chained Multiplicative Expression</em>'.
	 * @see etlMetaModel.EolMultiplicativeExpression#getChainedMultiplicativeExpression()
	 * @see #getEolMultiplicativeExpression()
	 * @generated
	 */
	EReference getEolMultiplicativeExpression_ChainedMultiplicativeExpression();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolChainedMultiplicativeExpression <em>Eol Chained Multiplicative Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Chained Multiplicative Expression</em>'.
	 * @see etlMetaModel.EolChainedMultiplicativeExpression
	 * @generated
	 */
	EClass getEolChainedMultiplicativeExpression();

	/**
	 * Returns the meta object for the attribute '{@link etlMetaModel.EolChainedMultiplicativeExpression#getMultiplicativeArithmeticalOperator <em>Multiplicative Arithmetical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicative Arithmetical Operator</em>'.
	 * @see etlMetaModel.EolChainedMultiplicativeExpression#getMultiplicativeArithmeticalOperator()
	 * @see #getEolChainedMultiplicativeExpression()
	 * @generated
	 */
	EAttribute getEolChainedMultiplicativeExpression_MultiplicativeArithmeticalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolChainedMultiplicativeExpression#getUnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unary Expression</em>'.
	 * @see etlMetaModel.EolChainedMultiplicativeExpression#getUnaryExpression()
	 * @see #getEolChainedMultiplicativeExpression()
	 * @generated
	 */
	EReference getEolChainedMultiplicativeExpression_UnaryExpression();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolUnaryExpression <em>Eol Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Unary Expression</em>'.
	 * @see etlMetaModel.EolUnaryExpression
	 * @generated
	 */
	EClass getEolUnaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolUnaryExpression#getUnaryOperatorNullable <em>Unary Operator Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unary Operator Nullable</em>'.
	 * @see etlMetaModel.EolUnaryExpression#getUnaryOperatorNullable()
	 * @see #getEolUnaryExpression()
	 * @generated
	 */
	EReference getEolUnaryExpression_UnaryOperatorNullable();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolUnaryExpression#getPostfixExpression <em>Postfix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postfix Expression</em>'.
	 * @see etlMetaModel.EolUnaryExpression#getPostfixExpression()
	 * @see #getEolUnaryExpression()
	 * @generated
	 */
	EReference getEolUnaryExpression_PostfixExpression();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolUnaryOpratorNullable <em>Eol Unary Oprator Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Unary Oprator Nullable</em>'.
	 * @see etlMetaModel.EolUnaryOpratorNullable
	 * @generated
	 */
	EClass getEolUnaryOpratorNullable();

	/**
	 * Returns the meta object for the attribute '{@link etlMetaModel.EolUnaryOpratorNullable#getUnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unary Operator</em>'.
	 * @see etlMetaModel.EolUnaryOpratorNullable#getUnaryOperator()
	 * @see #getEolUnaryOpratorNullable()
	 * @generated
	 */
	EAttribute getEolUnaryOpratorNullable_UnaryOperator();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolPostfixExpression <em>Eol Postfix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Postfix Expression</em>'.
	 * @see etlMetaModel.EolPostfixExpression
	 * @generated
	 */
	EClass getEolPostfixExpression();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolPostfixExpression#getItemSelectorExpression <em>Item Selector Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item Selector Expression</em>'.
	 * @see etlMetaModel.EolPostfixExpression#getItemSelectorExpression()
	 * @see #getEolPostfixExpression()
	 * @generated
	 */
	EReference getEolPostfixExpression_ItemSelectorExpression();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolPostfixExpression#getChainedFeatureCallPostfixExpression <em>Chained Feature Call Postfix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Chained Feature Call Postfix Expression</em>'.
	 * @see etlMetaModel.EolPostfixExpression#getChainedFeatureCallPostfixExpression()
	 * @see #getEolPostfixExpression()
	 * @generated
	 */
	EReference getEolPostfixExpression_ChainedFeatureCallPostfixExpression();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolChainedFeatureCallPostfixExpression <em>Eol Chained Feature Call Postfix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Chained Feature Call Postfix Expression</em>'.
	 * @see etlMetaModel.EolChainedFeatureCallPostfixExpression
	 * @generated
	 */
	EClass getEolChainedFeatureCallPostfixExpression();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolChainedFeatureCallPostfixExpression#getFeatureCall <em>Feature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Call</em>'.
	 * @see etlMetaModel.EolChainedFeatureCallPostfixExpression#getFeatureCall()
	 * @see #getEolChainedFeatureCallPostfixExpression()
	 * @generated
	 */
	EReference getEolChainedFeatureCallPostfixExpression_FeatureCall();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolChainedFeatureCallPostfixExpression#getFeatureCallAdditionalLogicalExpression <em>Feature Call Additional Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Call Additional Logical Expression</em>'.
	 * @see etlMetaModel.EolChainedFeatureCallPostfixExpression#getFeatureCallAdditionalLogicalExpression()
	 * @see #getEolChainedFeatureCallPostfixExpression()
	 * @generated
	 */
	EReference getEolChainedFeatureCallPostfixExpression_FeatureCallAdditionalLogicalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolChainedFeatureCallPostfixExpression#getChainedFeatureCallPostfixExpression <em>Chained Feature Call Postfix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Chained Feature Call Postfix Expression</em>'.
	 * @see etlMetaModel.EolChainedFeatureCallPostfixExpression#getChainedFeatureCallPostfixExpression()
	 * @see #getEolChainedFeatureCallPostfixExpression()
	 * @generated
	 */
	EReference getEolChainedFeatureCallPostfixExpression_ChainedFeatureCallPostfixExpression();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolItemSelectorExpression <em>Eol Item Selector Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Item Selector Expression</em>'.
	 * @see etlMetaModel.EolItemSelectorExpression
	 * @generated
	 */
	EClass getEolItemSelectorExpression();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolItemSelectorExpression#getPrimitiveExpression <em>Primitive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primitive Expression</em>'.
	 * @see etlMetaModel.EolItemSelectorExpression#getPrimitiveExpression()
	 * @see #getEolItemSelectorExpression()
	 * @generated
	 */
	EReference getEolItemSelectorExpression_PrimitiveExpression();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolItemSelectorExpression#getAdditionalPrimitiveExpression <em>Additional Primitive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Primitive Expression</em>'.
	 * @see etlMetaModel.EolItemSelectorExpression#getAdditionalPrimitiveExpression()
	 * @see #getEolItemSelectorExpression()
	 * @generated
	 */
	EReference getEolItemSelectorExpression_AdditionalPrimitiveExpression();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolFeatureCall <em>Eol Feature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Feature Call</em>'.
	 * @see etlMetaModel.EolFeatureCall
	 * @generated
	 */
	EClass getEolFeatureCall();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolSimpleFeatureCall <em>Eol Simple Feature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Simple Feature Call</em>'.
	 * @see etlMetaModel.EolSimpleFeatureCall
	 * @generated
	 */
	EClass getEolSimpleFeatureCall();

	/**
	 * Returns the meta object for the attribute '{@link etlMetaModel.EolSimpleFeatureCall#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see etlMetaModel.EolSimpleFeatureCall#getName()
	 * @see #getEolSimpleFeatureCall()
	 * @generated
	 */
	EAttribute getEolSimpleFeatureCall_Name();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolSimpleFeatureCall#getParameterList <em>Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter List</em>'.
	 * @see etlMetaModel.EolSimpleFeatureCall#getParameterList()
	 * @see #getEolSimpleFeatureCall()
	 * @generated
	 */
	EReference getEolSimpleFeatureCall_ParameterList();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolMofPropertyFeatureCall <em>Eol Mof Property Feature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Mof Property Feature Call</em>'.
	 * @see etlMetaModel.EolMofPropertyFeatureCall
	 * @generated
	 */
	EClass getEolMofPropertyFeatureCall();

	/**
	 * Returns the meta object for the reference '{@link etlMetaModel.EolMofPropertyFeatureCall#getReferencedMofProperty <em>Referenced Mof Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Mof Property</em>'.
	 * @see etlMetaModel.EolMofPropertyFeatureCall#getReferencedMofProperty()
	 * @see #getEolMofPropertyFeatureCall()
	 * @generated
	 */
	EReference getEolMofPropertyFeatureCall_ReferencedMofProperty();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EtlEquivalentMethodFeatureCall <em>Etl Equivalent Method Feature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Etl Equivalent Method Feature Call</em>'.
	 * @see etlMetaModel.EtlEquivalentMethodFeatureCall
	 * @generated
	 */
	EClass getEtlEquivalentMethodFeatureCall();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolIsTypeOfSourceMofClassFeatureCall <em>Eol Is Type Of Source Mof Class Feature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Is Type Of Source Mof Class Feature Call</em>'.
	 * @see etlMetaModel.EolIsTypeOfSourceMofClassFeatureCall
	 * @generated
	 */
	EClass getEolIsTypeOfSourceMofClassFeatureCall();

	/**
	 * Returns the meta object for the reference '{@link etlMetaModel.EolIsTypeOfSourceMofClassFeatureCall#getReferencedMofClass <em>Referenced Mof Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Mof Class</em>'.
	 * @see etlMetaModel.EolIsTypeOfSourceMofClassFeatureCall#getReferencedMofClass()
	 * @see #getEolIsTypeOfSourceMofClassFeatureCall()
	 * @generated
	 */
	EReference getEolIsTypeOfSourceMofClassFeatureCall_ReferencedMofClass();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolParameterList <em>Eol Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Parameter List</em>'.
	 * @see etlMetaModel.EolParameterList
	 * @generated
	 */
	EClass getEolParameterList();

	/**
	 * Returns the meta object for the containment reference list '{@link etlMetaModel.EolParameterList#getLogicalExpressions <em>Logical Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logical Expressions</em>'.
	 * @see etlMetaModel.EolParameterList#getLogicalExpressions()
	 * @see #getEolParameterList()
	 * @generated
	 */
	EReference getEolParameterList_LogicalExpressions();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolNewExpression <em>Eol New Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol New Expression</em>'.
	 * @see etlMetaModel.EolNewExpression
	 * @generated
	 */
	EClass getEolNewExpression();

	/**
	 * Returns the meta object for the reference '{@link etlMetaModel.EolNewExpression#getInstantiatedMofClass <em>Instantiated Mof Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instantiated Mof Class</em>'.
	 * @see etlMetaModel.EolNewExpression#getInstantiatedMofClass()
	 * @see #getEolNewExpression()
	 * @generated
	 */
	EReference getEolNewExpression_InstantiatedMofClass();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolVariableDeclarationExpression <em>Eol Variable Declaration Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Variable Declaration Expression</em>'.
	 * @see etlMetaModel.EolVariableDeclarationExpression
	 * @generated
	 */
	EClass getEolVariableDeclarationExpression();

	/**
	 * Returns the meta object for the attribute '{@link etlMetaModel.EolVariableDeclarationExpression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see etlMetaModel.EolVariableDeclarationExpression#getName()
	 * @see #getEolVariableDeclarationExpression()
	 * @generated
	 */
	EAttribute getEolVariableDeclarationExpression_Name();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolPrimitiveExpression <em>Eol Primitive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Primitive Expression</em>'.
	 * @see etlMetaModel.EolPrimitiveExpression
	 * @generated
	 */
	EClass getEolPrimitiveExpression();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolLiteral <em>Eol Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Literal</em>'.
	 * @see etlMetaModel.EolLiteral
	 * @generated
	 */
	EClass getEolLiteral();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolStringLiteral <em>Eol String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol String Literal</em>'.
	 * @see etlMetaModel.EolStringLiteral
	 * @generated
	 */
	EClass getEolStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link etlMetaModel.EolStringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see etlMetaModel.EolStringLiteral#getValue()
	 * @see #getEolStringLiteral()
	 * @generated
	 */
	EAttribute getEolStringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolReferenceExpression <em>Eol Reference Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Reference Expression</em>'.
	 * @see etlMetaModel.EolReferenceExpression
	 * @generated
	 */
	EClass getEolReferenceExpression();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolFormalParameterReferenceExpression <em>Eol Formal Parameter Reference Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Formal Parameter Reference Expression</em>'.
	 * @see etlMetaModel.EolFormalParameterReferenceExpression
	 * @generated
	 */
	EClass getEolFormalParameterReferenceExpression();

	/**
	 * Returns the meta object for the reference '{@link etlMetaModel.EolFormalParameterReferenceExpression#getReferencedFormalParameter <em>Referenced Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Formal Parameter</em>'.
	 * @see etlMetaModel.EolFormalParameterReferenceExpression#getReferencedFormalParameter()
	 * @see #getEolFormalParameterReferenceExpression()
	 * @generated
	 */
	EReference getEolFormalParameterReferenceExpression_ReferencedFormalParameter();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolVariableReferenceExpression <em>Eol Variable Reference Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Variable Reference Expression</em>'.
	 * @see etlMetaModel.EolVariableReferenceExpression
	 * @generated
	 */
	EClass getEolVariableReferenceExpression();

	/**
	 * Returns the meta object for the reference '{@link etlMetaModel.EolVariableReferenceExpression#getReferencedVarableDeclaration <em>Referenced Varable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Varable Declaration</em>'.
	 * @see etlMetaModel.EolVariableReferenceExpression#getReferencedVarableDeclaration()
	 * @see #getEolVariableReferenceExpression()
	 * @generated
	 */
	EReference getEolVariableReferenceExpression_ReferencedVarableDeclaration();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolStatementBlock <em>Eol Statement Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Statement Block</em>'.
	 * @see etlMetaModel.EolStatementBlock
	 * @generated
	 */
	EClass getEolStatementBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link etlMetaModel.EolStatementBlock#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see etlMetaModel.EolStatementBlock#getStatements()
	 * @see #getEolStatementBlock()
	 * @generated
	 */
	EReference getEolStatementBlock_Statements();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolStatement <em>Eol Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Statement</em>'.
	 * @see etlMetaModel.EolStatement
	 * @generated
	 */
	EClass getEolStatement();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolAssignmentStatement <em>Eol Assignment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Assignment Statement</em>'.
	 * @see etlMetaModel.EolAssignmentStatement
	 * @generated
	 */
	EClass getEolAssignmentStatement();

	/**
	 * Returns the meta object for the attribute '{@link etlMetaModel.EolAssignmentStatement#getIsSpecial <em>Is Special</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Special</em>'.
	 * @see etlMetaModel.EolAssignmentStatement#getIsSpecial()
	 * @see #getEolAssignmentStatement()
	 * @generated
	 */
	EAttribute getEolAssignmentStatement_IsSpecial();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolAssignmentStatement#getLogicalExpressionLeft <em>Logical Expression Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logical Expression Left</em>'.
	 * @see etlMetaModel.EolAssignmentStatement#getLogicalExpressionLeft()
	 * @see #getEolAssignmentStatement()
	 * @generated
	 */
	EReference getEolAssignmentStatement_LogicalExpressionLeft();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolAssignmentStatement#getLogicalExpressionRight <em>Logical Expression Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logical Expression Right</em>'.
	 * @see etlMetaModel.EolAssignmentStatement#getLogicalExpressionRight()
	 * @see #getEolAssignmentStatement()
	 * @generated
	 */
	EReference getEolAssignmentStatement_LogicalExpressionRight();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolExpressionStatement <em>Eol Expression Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Expression Statement</em>'.
	 * @see etlMetaModel.EolExpressionStatement
	 * @generated
	 */
	EClass getEolExpressionStatement();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolAssignmentExpressionStatement <em>Eol Assignment Expression Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Assignment Expression Statement</em>'.
	 * @see etlMetaModel.EolAssignmentExpressionStatement
	 * @generated
	 */
	EClass getEolAssignmentExpressionStatement();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolAssignmentExpressionStatement#getPostfixExpressionLeft <em>Postfix Expression Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postfix Expression Left</em>'.
	 * @see etlMetaModel.EolAssignmentExpressionStatement#getPostfixExpressionLeft()
	 * @see #getEolAssignmentExpressionStatement()
	 * @generated
	 */
	EReference getEolAssignmentExpressionStatement_PostfixExpressionLeft();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolAssignmentExpressionStatement#getLogicalExpressionRight <em>Logical Expression Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logical Expression Right</em>'.
	 * @see etlMetaModel.EolAssignmentExpressionStatement#getLogicalExpressionRight()
	 * @see #getEolAssignmentExpressionStatement()
	 * @generated
	 */
	EReference getEolAssignmentExpressionStatement_LogicalExpressionRight();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolLogicalExpressionStatement <em>Eol Logical Expression Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Logical Expression Statement</em>'.
	 * @see etlMetaModel.EolLogicalExpressionStatement
	 * @generated
	 */
	EClass getEolLogicalExpressionStatement();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolLogicalExpressionStatement#getLogicalExpression <em>Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logical Expression</em>'.
	 * @see etlMetaModel.EolLogicalExpressionStatement#getLogicalExpression()
	 * @see #getEolLogicalExpressionStatement()
	 * @generated
	 */
	EReference getEolLogicalExpressionStatement_LogicalExpression();

	/**
	 * Returns the meta object for class '{@link etlMetaModel.EolFor <em>Eol For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol For</em>'.
	 * @see etlMetaModel.EolFor
	 * @generated
	 */
	EClass getEolFor();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolFor#getFormalParameter <em>Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Formal Parameter</em>'.
	 * @see etlMetaModel.EolFor#getFormalParameter()
	 * @see #getEolFor()
	 * @generated
	 */
	EReference getEolFor_FormalParameter();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolFor#getIteratedSequence <em>Iterated Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iterated Sequence</em>'.
	 * @see etlMetaModel.EolFor#getIteratedSequence()
	 * @see #getEolFor()
	 * @generated
	 */
	EReference getEolFor_IteratedSequence();

	/**
	 * Returns the meta object for the containment reference '{@link etlMetaModel.EolFor#getStatementBlock <em>Statement Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement Block</em>'.
	 * @see etlMetaModel.EolFor#getStatementBlock()
	 * @see #getEolFor()
	 * @generated
	 */
	EReference getEolFor_StatementBlock();

	/**
	 * Returns the meta object for enum '{@link etlMetaModel.EolLogicalOperator <em>Eol Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Eol Logical Operator</em>'.
	 * @see etlMetaModel.EolLogicalOperator
	 * @generated
	 */
	EEnum getEolLogicalOperator();

	/**
	 * Returns the meta object for enum '{@link etlMetaModel.EolRelationalOperator <em>Eol Relational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Eol Relational Operator</em>'.
	 * @see etlMetaModel.EolRelationalOperator
	 * @generated
	 */
	EEnum getEolRelationalOperator();

	/**
	 * Returns the meta object for enum '{@link etlMetaModel.EolAdditiveComparisonOperator <em>Eol Additive Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Eol Additive Comparison Operator</em>'.
	 * @see etlMetaModel.EolAdditiveComparisonOperator
	 * @generated
	 */
	EEnum getEolAdditiveComparisonOperator();

	/**
	 * Returns the meta object for enum '{@link etlMetaModel.EolAdditiveArithmeticalOperator <em>Eol Additive Arithmetical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Eol Additive Arithmetical Operator</em>'.
	 * @see etlMetaModel.EolAdditiveArithmeticalOperator
	 * @generated
	 */
	EEnum getEolAdditiveArithmeticalOperator();

	/**
	 * Returns the meta object for enum '{@link etlMetaModel.EolMultiplicativeArithmeticalOperator <em>Eol Multiplicative Arithmetical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Eol Multiplicative Arithmetical Operator</em>'.
	 * @see etlMetaModel.EolMultiplicativeArithmeticalOperator
	 * @generated
	 */
	EEnum getEolMultiplicativeArithmeticalOperator();

	/**
	 * Returns the meta object for enum '{@link etlMetaModel.EolUnaryOprator <em>Eol Unary Oprator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Eol Unary Oprator</em>'.
	 * @see etlMetaModel.EolUnaryOprator
	 * @generated
	 */
	EEnum getEolUnaryOprator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EtlMetaModelFactory getEtlMetaModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.MofNamedElementImpl <em>Mof Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.MofNamedElementImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getMofNamedElement()
		 * @generated
		 */
		EClass MOF_NAMED_ELEMENT = eINSTANCE.getMofNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOF_NAMED_ELEMENT__NAME = eINSTANCE.getMofNamedElement_Name();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.MofTypeImpl <em>Mof Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.MofTypeImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getMofType()
		 * @generated
		 */
		EClass MOF_TYPE = eINSTANCE.getMofType();

		/**
		 * The meta object literal for the '<em><b>Typed Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOF_TYPE__TYPED_ELEMENTS = eINSTANCE.getMofType_TypedElements();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.MofClassImpl <em>Mof Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.MofClassImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getMofClass()
		 * @generated
		 */
		EClass MOF_CLASS = eINSTANCE.getMofClass();

		/**
		 * The meta object literal for the '<em><b>Owned Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOF_CLASS__OWNED_PROPERTIES = eINSTANCE.getMofClass_OwnedProperties();

		/**
		 * The meta object literal for the '<em><b>Superclasses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOF_CLASS__SUPERCLASSES = eINSTANCE.getMofClass_Superclasses();

		/**
		 * The meta object literal for the '<em><b>Clazz</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOF_CLASS__CLAZZ = eINSTANCE.getMofClass_Clazz();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.MofTypedElementImpl <em>Mof Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.MofTypedElementImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getMofTypedElement()
		 * @generated
		 */
		EClass MOF_TYPED_ELEMENT = eINSTANCE.getMofTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOF_TYPED_ELEMENT__TYPE = eINSTANCE.getMofTypedElement_Type();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.MofMultiplicityElementImpl <em>Mof Multiplicity Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.MofMultiplicityElementImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getMofMultiplicityElement()
		 * @generated
		 */
		EClass MOF_MULTIPLICITY_ELEMENT = eINSTANCE.getMofMultiplicityElement();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOF_MULTIPLICITY_ELEMENT__UPPER = eINSTANCE.getMofMultiplicityElement_Upper();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOF_MULTIPLICITY_ELEMENT__LOWER = eINSTANCE.getMofMultiplicityElement_Lower();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.MofPropertyImpl <em>Mof Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.MofPropertyImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getMofProperty()
		 * @generated
		 */
		EClass MOF_PROPERTY = eINSTANCE.getMofProperty();

		/**
		 * The meta object literal for the '<em><b>Clazz</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOF_PROPERTY__CLAZZ = eINSTANCE.getMofProperty_Clazz();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOF_PROPERTY__ASSOCIATION = eINSTANCE.getMofProperty_Association();

		/**
		 * The meta object literal for the '<em><b>Is Composite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOF_PROPERTY__IS_COMPOSITE = eINSTANCE.getMofProperty_IsComposite();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.MofAssociationImpl <em>Mof Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.MofAssociationImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getMofAssociation()
		 * @generated
		 */
		EClass MOF_ASSOCIATION = eINSTANCE.getMofAssociation();

		/**
		 * The meta object literal for the '<em><b>Member Ends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOF_ASSOCIATION__MEMBER_ENDS = eINSTANCE.getMofAssociation_MemberEnds();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.MofPrimitiveTypeImpl <em>Mof Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.MofPrimitiveTypeImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getMofPrimitiveType()
		 * @generated
		 */
		EClass MOF_PRIMITIVE_TYPE = eINSTANCE.getMofPrimitiveType();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.MofBooleanImpl <em>Mof Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.MofBooleanImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getMofBoolean()
		 * @generated
		 */
		EClass MOF_BOOLEAN = eINSTANCE.getMofBoolean();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.MofIntegerImpl <em>Mof Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.MofIntegerImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getMofInteger()
		 * @generated
		 */
		EClass MOF_INTEGER = eINSTANCE.getMofInteger();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.MofStringImpl <em>Mof String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.MofStringImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getMofString()
		 * @generated
		 */
		EClass MOF_STRING = eINSTANCE.getMofString();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EtlModuleImpl <em>Etl Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EtlModuleImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEtlModule()
		 * @generated
		 */
		EClass ETL_MODULE = eINSTANCE.getEtlModule();

		/**
		 * The meta object literal for the '<em><b>Mof Classes Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETL_MODULE__MOF_CLASSES_SOURCE = eINSTANCE.getEtlModule_MofClassesSource();

		/**
		 * The meta object literal for the '<em><b>Mof Associations Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETL_MODULE__MOF_ASSOCIATIONS_SOURCE = eINSTANCE.getEtlModule_MofAssociationsSource();

		/**
		 * The meta object literal for the '<em><b>Mof Classes Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETL_MODULE__MOF_CLASSES_TARGET = eINSTANCE.getEtlModule_MofClassesTarget();

		/**
		 * The meta object literal for the '<em><b>Mof Associations Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETL_MODULE__MOF_ASSOCIATIONS_TARGET = eINSTANCE.getEtlModule_MofAssociationsTarget();

		/**
		 * The meta object literal for the '<em><b>Pre</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETL_MODULE__PRE = eINSTANCE.getEtlModule_Pre();

		/**
		 * The meta object literal for the '<em><b>Transformation Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETL_MODULE__TRANSFORMATION_RULES = eINSTANCE.getEtlModule_TransformationRules();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETL_MODULE__POST = eINSTANCE.getEtlModule_Post();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETL_MODULE__OPERATIONS = eINSTANCE.getEtlModule_Operations();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.ErlNamedRuleImpl <em>Erl Named Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.ErlNamedRuleImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getErlNamedRule()
		 * @generated
		 */
		EClass ERL_NAMED_RULE = eINSTANCE.getErlNamedRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERL_NAMED_RULE__NAME = eINSTANCE.getErlNamedRule_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERL_NAMED_RULE__BODY = eINSTANCE.getErlNamedRule_Body();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EtlTransformationRuleImpl <em>Etl Transformation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EtlTransformationRuleImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEtlTransformationRule()
		 * @generated
		 */
		EClass ETL_TRANSFORMATION_RULE = eINSTANCE.getEtlTransformationRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETL_TRANSFORMATION_RULE__NAME = eINSTANCE.getEtlTransformationRule_Name();

		/**
		 * The meta object literal for the '<em><b>Guard Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETL_TRANSFORMATION_RULE__GUARD_NAME = eINSTANCE.getEtlTransformationRule_GuardName();

		/**
		 * The meta object literal for the '<em><b>Extends Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETL_TRANSFORMATION_RULE__EXTENDS_RULES = eINSTANCE.getEtlTransformationRule_ExtendsRules();

		/**
		 * The meta object literal for the '<em><b>Source Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETL_TRANSFORMATION_RULE__SOURCE_PARAMETER = eINSTANCE.getEtlTransformationRule_SourceParameter();

		/**
		 * The meta object literal for the '<em><b>Target Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETL_TRANSFORMATION_RULE__TARGET_PARAMETERS = eINSTANCE.getEtlTransformationRule_TargetParameters();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETL_TRANSFORMATION_RULE__GUARD = eINSTANCE.getEtlTransformationRule_Guard();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETL_TRANSFORMATION_RULE__BODY = eINSTANCE.getEtlTransformationRule_Body();

		/**
		 * The meta object literal for the '<em><b>Abstractt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETL_TRANSFORMATION_RULE__ABSTRACTT = eINSTANCE.getEtlTransformationRule_Abstractt();

		/**
		 * The meta object literal for the '<em><b>Lazy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETL_TRANSFORMATION_RULE__LAZY = eINSTANCE.getEtlTransformationRule_Lazy();

		/**
		 * The meta object literal for the '<em><b>Primary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETL_TRANSFORMATION_RULE__PRIMARY = eINSTANCE.getEtlTransformationRule_Primary();

		/**
		 * The meta object literal for the '<em><b>Greedy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETL_TRANSFORMATION_RULE__GREEDY = eINSTANCE.getEtlTransformationRule_Greedy();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolLibraryModuleImpl <em>Eol Library Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolLibraryModuleImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolLibraryModule()
		 * @generated
		 */
		EClass EOL_LIBRARY_MODULE = eINSTANCE.getEolLibraryModule();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolOperationImpl <em>Eol Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolOperationImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolOperation()
		 * @generated
		 */
		EClass EOL_OPERATION = eINSTANCE.getEolOperation();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_OPERATION__ANNOTATIONS = eINSTANCE.getEolOperation_Annotations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOL_OPERATION__NAME = eINSTANCE.getEolOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Formal Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_OPERATION__FORMAL_PARAMETERS = eINSTANCE.getEolOperation_FormalParameters();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_OPERATION__CONTEXT = eINSTANCE.getEolOperation_Context();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_OPERATION__BODY = eINSTANCE.getEolOperation_Body();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_OPERATION__RETURN_TYPE = eINSTANCE.getEolOperation_ReturnType();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolFormalParameterImpl <em>Eol Formal Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolFormalParameterImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolFormalParameter()
		 * @generated
		 */
		EClass EOL_FORMAL_PARAMETER = eINSTANCE.getEolFormalParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOL_FORMAL_PARAMETER__NAME = eINSTANCE.getEolFormalParameter_Name();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolMofClassFormalParameterImpl <em>Eol Mof Class Formal Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolMofClassFormalParameterImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolMofClassFormalParameter()
		 * @generated
		 */
		EClass EOL_MOF_CLASS_FORMAL_PARAMETER = eINSTANCE.getEolMofClassFormalParameter();

		/**
		 * The meta object literal for the '<em><b>Referenced</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_MOF_CLASS_FORMAL_PARAMETER__REFERENCED = eINSTANCE.getEolMofClassFormalParameter_Referenced();

		/**
		 * The meta object literal for the '<em><b>Is Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOL_MOF_CLASS_FORMAL_PARAMETER__IS_SEQUENCE = eINSTANCE.getEolMofClassFormalParameter_IsSequence();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolAnnotationImpl <em>Eol Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolAnnotationImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolAnnotation()
		 * @generated
		 */
		EClass EOL_ANNOTATION = eINSTANCE.getEolAnnotation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOL_ANNOTATION__NAME = eINSTANCE.getEolAnnotation_Name();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolExecuteableAnnotationImpl <em>Eol Executeable Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolExecuteableAnnotationImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolExecuteableAnnotation()
		 * @generated
		 */
		EClass EOL_EXECUTEABLE_ANNOTATION = eINSTANCE.getEolExecuteableAnnotation();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_EXECUTEABLE_ANNOTATION__EXPRESSION = eINSTANCE.getEolExecuteableAnnotation_Expression();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.SimpleAnnotationImpl <em>Simple Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.SimpleAnnotationImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getSimpleAnnotation()
		 * @generated
		 */
		EClass SIMPLE_ANNOTATION = eINSTANCE.getSimpleAnnotation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_ANNOTATION__VALUE = eINSTANCE.getSimpleAnnotation_Value();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolTypeImpl <em>Eol Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolTypeImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolType()
		 * @generated
		 */
		EClass EOL_TYPE = eINSTANCE.getEolType();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolAnyTypeImpl <em>Eol Any Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolAnyTypeImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolAnyType()
		 * @generated
		 */
		EClass EOL_ANY_TYPE = eINSTANCE.getEolAnyType();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.ModelElementTypeImpl <em>Model Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.ModelElementTypeImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getModelElementType()
		 * @generated
		 */
		EClass MODEL_ELEMENT_TYPE = eINSTANCE.getModelElementType();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT_TYPE__MODEL = eINSTANCE.getModelElementType_Model();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT_TYPE__TYPE = eINSTANCE.getModelElementType_Type();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolNativeImpl <em>Eol Native</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolNativeImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolNative()
		 * @generated
		 */
		EClass EOL_NATIVE = eINSTANCE.getEolNative();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOL_NATIVE__IMPLEMENTATION = eINSTANCE.getEolNative_Implementation();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolPrimitiveTypeImpl <em>Eol Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolPrimitiveTypeImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolPrimitiveType()
		 * @generated
		 */
		EClass EOL_PRIMITIVE_TYPE = eINSTANCE.getEolPrimitiveType();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolBooleanTypeImpl <em>Eol Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolBooleanTypeImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolBooleanType()
		 * @generated
		 */
		EClass EOL_BOOLEAN_TYPE = eINSTANCE.getEolBooleanType();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolRealTypeImpl <em>Eol Real Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolRealTypeImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolRealType()
		 * @generated
		 */
		EClass EOL_REAL_TYPE = eINSTANCE.getEolRealType();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolIntegerTypeImpl <em>Eol Integer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolIntegerTypeImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolIntegerType()
		 * @generated
		 */
		EClass EOL_INTEGER_TYPE = eINSTANCE.getEolIntegerType();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolStringTypeImpl <em>Eol String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolStringTypeImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolStringType()
		 * @generated
		 */
		EClass EOL_STRING_TYPE = eINSTANCE.getEolStringType();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolMapTypeImpl <em>Eol Map Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolMapTypeImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolMapType()
		 * @generated
		 */
		EClass EOL_MAP_TYPE = eINSTANCE.getEolMapType();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolCollectionTypeImpl <em>Eol Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolCollectionTypeImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolCollectionType()
		 * @generated
		 */
		EClass EOL_COLLECTION_TYPE = eINSTANCE.getEolCollectionType();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolOrderedSetTypeImpl <em>Eol Ordered Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolOrderedSetTypeImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolOrderedSetType()
		 * @generated
		 */
		EClass EOL_ORDERED_SET_TYPE = eINSTANCE.getEolOrderedSetType();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolSetTypeImpl <em>Eol Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolSetTypeImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolSetType()
		 * @generated
		 */
		EClass EOL_SET_TYPE = eINSTANCE.getEolSetType();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolBagTypeImpl <em>Eol Bag Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolBagTypeImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolBagType()
		 * @generated
		 */
		EClass EOL_BAG_TYPE = eINSTANCE.getEolBagType();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolSequenceTypeImpl <em>Eol Sequence Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolSequenceTypeImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolSequenceType()
		 * @generated
		 */
		EClass EOL_SEQUENCE_TYPE = eINSTANCE.getEolSequenceType();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolExpressionOrStatementBlockImpl <em>Eol Expression Or Statement Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolExpressionOrStatementBlockImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolExpressionOrStatementBlock()
		 * @generated
		 */
		EClass EOL_EXPRESSION_OR_STATEMENT_BLOCK = eINSTANCE.getEolExpressionOrStatementBlock();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolLogicalExpressionImpl <em>Eol Logical Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolLogicalExpressionImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolLogicalExpression()
		 * @generated
		 */
		EClass EOL_LOGICAL_EXPRESSION = eINSTANCE.getEolLogicalExpression();

		/**
		 * The meta object literal for the '<em><b>Relational Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_LOGICAL_EXPRESSION__RELATIONAL_EXPRESSION = eINSTANCE.getEolLogicalExpression_RelationalExpression();

		/**
		 * The meta object literal for the '<em><b>Chained Logical Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_LOGICAL_EXPRESSION__CHAINED_LOGICAL_EXPRESSION = eINSTANCE.getEolLogicalExpression_ChainedLogicalExpression();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolChainedLogicalExpressionImpl <em>Eol Chained Logical Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolChainedLogicalExpressionImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolChainedLogicalExpression()
		 * @generated
		 */
		EClass EOL_CHAINED_LOGICAL_EXPRESSION = eINSTANCE.getEolChainedLogicalExpression();

		/**
		 * The meta object literal for the '<em><b>Logical Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOL_CHAINED_LOGICAL_EXPRESSION__LOGICAL_OPERATOR = eINSTANCE.getEolChainedLogicalExpression_LogicalOperator();

		/**
		 * The meta object literal for the '<em><b>Logical Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_CHAINED_LOGICAL_EXPRESSION__LOGICAL_EXPRESSION = eINSTANCE.getEolChainedLogicalExpression_LogicalExpression();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolRelationalExpressionImpl <em>Eol Relational Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolRelationalExpressionImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolRelationalExpression()
		 * @generated
		 */
		EClass EOL_RELATIONAL_EXPRESSION = eINSTANCE.getEolRelationalExpression();

		/**
		 * The meta object literal for the '<em><b>Additive Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_RELATIONAL_EXPRESSION__ADDITIVE_EXPRESSION = eINSTANCE.getEolRelationalExpression_AdditiveExpression();

		/**
		 * The meta object literal for the '<em><b>Chained Relational Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_RELATIONAL_EXPRESSION__CHAINED_RELATIONAL_EXPRESSION = eINSTANCE.getEolRelationalExpression_ChainedRelationalExpression();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolGenericChainedRelationalExpressionImpl <em>Eol Generic Chained Relational Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolGenericChainedRelationalExpressionImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolGenericChainedRelationalExpression()
		 * @generated
		 */
		EClass EOL_GENERIC_CHAINED_RELATIONAL_EXPRESSION = eINSTANCE.getEolGenericChainedRelationalExpression();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolChainedRelationalExpressionImpl <em>Eol Chained Relational Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolChainedRelationalExpressionImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolChainedRelationalExpression()
		 * @generated
		 */
		EClass EOL_CHAINED_RELATIONAL_EXPRESSION = eINSTANCE.getEolChainedRelationalExpression();

		/**
		 * The meta object literal for the '<em><b>Relational Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOL_CHAINED_RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR = eINSTANCE.getEolChainedRelationalExpression_RelationalOperator();

		/**
		 * The meta object literal for the '<em><b>Relational Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_CHAINED_RELATIONAL_EXPRESSION__RELATIONAL_EXPRESSION = eINSTANCE.getEolChainedRelationalExpression_RelationalExpression();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolComparingToAdditiveRelationalExpressionImpl <em>Eol Comparing To Additive Relational Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolComparingToAdditiveRelationalExpressionImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolComparingToAdditiveRelationalExpression()
		 * @generated
		 */
		EClass EOL_COMPARING_TO_ADDITIVE_RELATIONAL_EXPRESSION = eINSTANCE.getEolComparingToAdditiveRelationalExpression();

		/**
		 * The meta object literal for the '<em><b>Additive Comparison Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOL_COMPARING_TO_ADDITIVE_RELATIONAL_EXPRESSION__ADDITIVE_COMPARISON_OPERATOR = eINSTANCE.getEolComparingToAdditiveRelationalExpression_AdditiveComparisonOperator();

		/**
		 * The meta object literal for the '<em><b>Additive Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_COMPARING_TO_ADDITIVE_RELATIONAL_EXPRESSION__ADDITIVE_EXPRESSION = eINSTANCE.getEolComparingToAdditiveRelationalExpression_AdditiveExpression();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolAdditiveExpressionImpl <em>Eol Additive Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolAdditiveExpressionImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolAdditiveExpression()
		 * @generated
		 */
		EClass EOL_ADDITIVE_EXPRESSION = eINSTANCE.getEolAdditiveExpression();

		/**
		 * The meta object literal for the '<em><b>Multiplicative Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_ADDITIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION = eINSTANCE.getEolAdditiveExpression_MultiplicativeExpression();

		/**
		 * The meta object literal for the '<em><b>Chained Additive Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_ADDITIVE_EXPRESSION__CHAINED_ADDITIVE_EXPRESSION = eINSTANCE.getEolAdditiveExpression_ChainedAdditiveExpression();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolChainedAdditiveExpressionImpl <em>Eol Chained Additive Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolChainedAdditiveExpressionImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolChainedAdditiveExpression()
		 * @generated
		 */
		EClass EOL_CHAINED_ADDITIVE_EXPRESSION = eINSTANCE.getEolChainedAdditiveExpression();

		/**
		 * The meta object literal for the '<em><b>Additive Arithmetical Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOL_CHAINED_ADDITIVE_EXPRESSION__ADDITIVE_ARITHMETICAL_OPERATOR = eINSTANCE.getEolChainedAdditiveExpression_AdditiveArithmeticalOperator();

		/**
		 * The meta object literal for the '<em><b>Additive Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_CHAINED_ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION = eINSTANCE.getEolChainedAdditiveExpression_AdditiveExpression();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolMultiplicativeExpressionImpl <em>Eol Multiplicative Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolMultiplicativeExpressionImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolMultiplicativeExpression()
		 * @generated
		 */
		EClass EOL_MULTIPLICATIVE_EXPRESSION = eINSTANCE.getEolMultiplicativeExpression();

		/**
		 * The meta object literal for the '<em><b>Unary Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_MULTIPLICATIVE_EXPRESSION__UNARY_EXPRESSION = eINSTANCE.getEolMultiplicativeExpression_UnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Chained Multiplicative Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_MULTIPLICATIVE_EXPRESSION__CHAINED_MULTIPLICATIVE_EXPRESSION = eINSTANCE.getEolMultiplicativeExpression_ChainedMultiplicativeExpression();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolChainedMultiplicativeExpressionImpl <em>Eol Chained Multiplicative Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolChainedMultiplicativeExpressionImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolChainedMultiplicativeExpression()
		 * @generated
		 */
		EClass EOL_CHAINED_MULTIPLICATIVE_EXPRESSION = eINSTANCE.getEolChainedMultiplicativeExpression();

		/**
		 * The meta object literal for the '<em><b>Multiplicative Arithmetical Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOL_CHAINED_MULTIPLICATIVE_EXPRESSION__MULTIPLICATIVE_ARITHMETICAL_OPERATOR = eINSTANCE.getEolChainedMultiplicativeExpression_MultiplicativeArithmeticalOperator();

		/**
		 * The meta object literal for the '<em><b>Unary Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_CHAINED_MULTIPLICATIVE_EXPRESSION__UNARY_EXPRESSION = eINSTANCE.getEolChainedMultiplicativeExpression_UnaryExpression();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolUnaryExpressionImpl <em>Eol Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolUnaryExpressionImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolUnaryExpression()
		 * @generated
		 */
		EClass EOL_UNARY_EXPRESSION = eINSTANCE.getEolUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Unary Operator Nullable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_UNARY_EXPRESSION__UNARY_OPERATOR_NULLABLE = eINSTANCE.getEolUnaryExpression_UnaryOperatorNullable();

		/**
		 * The meta object literal for the '<em><b>Postfix Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_UNARY_EXPRESSION__POSTFIX_EXPRESSION = eINSTANCE.getEolUnaryExpression_PostfixExpression();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolUnaryOpratorNullableImpl <em>Eol Unary Oprator Nullable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolUnaryOpratorNullableImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolUnaryOpratorNullable()
		 * @generated
		 */
		EClass EOL_UNARY_OPRATOR_NULLABLE = eINSTANCE.getEolUnaryOpratorNullable();

		/**
		 * The meta object literal for the '<em><b>Unary Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOL_UNARY_OPRATOR_NULLABLE__UNARY_OPERATOR = eINSTANCE.getEolUnaryOpratorNullable_UnaryOperator();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolPostfixExpressionImpl <em>Eol Postfix Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolPostfixExpressionImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolPostfixExpression()
		 * @generated
		 */
		EClass EOL_POSTFIX_EXPRESSION = eINSTANCE.getEolPostfixExpression();

		/**
		 * The meta object literal for the '<em><b>Item Selector Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_POSTFIX_EXPRESSION__ITEM_SELECTOR_EXPRESSION = eINSTANCE.getEolPostfixExpression_ItemSelectorExpression();

		/**
		 * The meta object literal for the '<em><b>Chained Feature Call Postfix Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_POSTFIX_EXPRESSION__CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION = eINSTANCE.getEolPostfixExpression_ChainedFeatureCallPostfixExpression();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolChainedFeatureCallPostfixExpressionImpl <em>Eol Chained Feature Call Postfix Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolChainedFeatureCallPostfixExpressionImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolChainedFeatureCallPostfixExpression()
		 * @generated
		 */
		EClass EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION = eINSTANCE.getEolChainedFeatureCallPostfixExpression();

		/**
		 * The meta object literal for the '<em><b>Feature Call</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__FEATURE_CALL = eINSTANCE.getEolChainedFeatureCallPostfixExpression_FeatureCall();

		/**
		 * The meta object literal for the '<em><b>Feature Call Additional Logical Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__FEATURE_CALL_ADDITIONAL_LOGICAL_EXPRESSION = eINSTANCE.getEolChainedFeatureCallPostfixExpression_FeatureCallAdditionalLogicalExpression();

		/**
		 * The meta object literal for the '<em><b>Chained Feature Call Postfix Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION = eINSTANCE.getEolChainedFeatureCallPostfixExpression_ChainedFeatureCallPostfixExpression();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolItemSelectorExpressionImpl <em>Eol Item Selector Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolItemSelectorExpressionImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolItemSelectorExpression()
		 * @generated
		 */
		EClass EOL_ITEM_SELECTOR_EXPRESSION = eINSTANCE.getEolItemSelectorExpression();

		/**
		 * The meta object literal for the '<em><b>Primitive Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_ITEM_SELECTOR_EXPRESSION__PRIMITIVE_EXPRESSION = eINSTANCE.getEolItemSelectorExpression_PrimitiveExpression();

		/**
		 * The meta object literal for the '<em><b>Additional Primitive Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_ITEM_SELECTOR_EXPRESSION__ADDITIONAL_PRIMITIVE_EXPRESSION = eINSTANCE.getEolItemSelectorExpression_AdditionalPrimitiveExpression();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolFeatureCallImpl <em>Eol Feature Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolFeatureCallImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolFeatureCall()
		 * @generated
		 */
		EClass EOL_FEATURE_CALL = eINSTANCE.getEolFeatureCall();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolSimpleFeatureCallImpl <em>Eol Simple Feature Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolSimpleFeatureCallImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolSimpleFeatureCall()
		 * @generated
		 */
		EClass EOL_SIMPLE_FEATURE_CALL = eINSTANCE.getEolSimpleFeatureCall();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOL_SIMPLE_FEATURE_CALL__NAME = eINSTANCE.getEolSimpleFeatureCall_Name();

		/**
		 * The meta object literal for the '<em><b>Parameter List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_SIMPLE_FEATURE_CALL__PARAMETER_LIST = eINSTANCE.getEolSimpleFeatureCall_ParameterList();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolMofPropertyFeatureCallImpl <em>Eol Mof Property Feature Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolMofPropertyFeatureCallImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolMofPropertyFeatureCall()
		 * @generated
		 */
		EClass EOL_MOF_PROPERTY_FEATURE_CALL = eINSTANCE.getEolMofPropertyFeatureCall();

		/**
		 * The meta object literal for the '<em><b>Referenced Mof Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_MOF_PROPERTY_FEATURE_CALL__REFERENCED_MOF_PROPERTY = eINSTANCE.getEolMofPropertyFeatureCall_ReferencedMofProperty();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EtlEquivalentMethodFeatureCallImpl <em>Etl Equivalent Method Feature Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EtlEquivalentMethodFeatureCallImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEtlEquivalentMethodFeatureCall()
		 * @generated
		 */
		EClass ETL_EQUIVALENT_METHOD_FEATURE_CALL = eINSTANCE.getEtlEquivalentMethodFeatureCall();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolIsTypeOfSourceMofClassFeatureCallImpl <em>Eol Is Type Of Source Mof Class Feature Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolIsTypeOfSourceMofClassFeatureCallImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolIsTypeOfSourceMofClassFeatureCall()
		 * @generated
		 */
		EClass EOL_IS_TYPE_OF_SOURCE_MOF_CLASS_FEATURE_CALL = eINSTANCE.getEolIsTypeOfSourceMofClassFeatureCall();

		/**
		 * The meta object literal for the '<em><b>Referenced Mof Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_IS_TYPE_OF_SOURCE_MOF_CLASS_FEATURE_CALL__REFERENCED_MOF_CLASS = eINSTANCE.getEolIsTypeOfSourceMofClassFeatureCall_ReferencedMofClass();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolParameterListImpl <em>Eol Parameter List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolParameterListImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolParameterList()
		 * @generated
		 */
		EClass EOL_PARAMETER_LIST = eINSTANCE.getEolParameterList();

		/**
		 * The meta object literal for the '<em><b>Logical Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_PARAMETER_LIST__LOGICAL_EXPRESSIONS = eINSTANCE.getEolParameterList_LogicalExpressions();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolNewExpressionImpl <em>Eol New Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolNewExpressionImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolNewExpression()
		 * @generated
		 */
		EClass EOL_NEW_EXPRESSION = eINSTANCE.getEolNewExpression();

		/**
		 * The meta object literal for the '<em><b>Instantiated Mof Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_NEW_EXPRESSION__INSTANTIATED_MOF_CLASS = eINSTANCE.getEolNewExpression_InstantiatedMofClass();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolVariableDeclarationExpressionImpl <em>Eol Variable Declaration Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolVariableDeclarationExpressionImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolVariableDeclarationExpression()
		 * @generated
		 */
		EClass EOL_VARIABLE_DECLARATION_EXPRESSION = eINSTANCE.getEolVariableDeclarationExpression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOL_VARIABLE_DECLARATION_EXPRESSION__NAME = eINSTANCE.getEolVariableDeclarationExpression_Name();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolPrimitiveExpressionImpl <em>Eol Primitive Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolPrimitiveExpressionImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolPrimitiveExpression()
		 * @generated
		 */
		EClass EOL_PRIMITIVE_EXPRESSION = eINSTANCE.getEolPrimitiveExpression();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolLiteralImpl <em>Eol Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolLiteralImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolLiteral()
		 * @generated
		 */
		EClass EOL_LITERAL = eINSTANCE.getEolLiteral();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolStringLiteralImpl <em>Eol String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolStringLiteralImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolStringLiteral()
		 * @generated
		 */
		EClass EOL_STRING_LITERAL = eINSTANCE.getEolStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOL_STRING_LITERAL__VALUE = eINSTANCE.getEolStringLiteral_Value();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolReferenceExpressionImpl <em>Eol Reference Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolReferenceExpressionImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolReferenceExpression()
		 * @generated
		 */
		EClass EOL_REFERENCE_EXPRESSION = eINSTANCE.getEolReferenceExpression();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolFormalParameterReferenceExpressionImpl <em>Eol Formal Parameter Reference Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolFormalParameterReferenceExpressionImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolFormalParameterReferenceExpression()
		 * @generated
		 */
		EClass EOL_FORMAL_PARAMETER_REFERENCE_EXPRESSION = eINSTANCE.getEolFormalParameterReferenceExpression();

		/**
		 * The meta object literal for the '<em><b>Referenced Formal Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_FORMAL_PARAMETER_REFERENCE_EXPRESSION__REFERENCED_FORMAL_PARAMETER = eINSTANCE.getEolFormalParameterReferenceExpression_ReferencedFormalParameter();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolVariableReferenceExpressionImpl <em>Eol Variable Reference Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolVariableReferenceExpressionImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolVariableReferenceExpression()
		 * @generated
		 */
		EClass EOL_VARIABLE_REFERENCE_EXPRESSION = eINSTANCE.getEolVariableReferenceExpression();

		/**
		 * The meta object literal for the '<em><b>Referenced Varable Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_VARIABLE_REFERENCE_EXPRESSION__REFERENCED_VARABLE_DECLARATION = eINSTANCE.getEolVariableReferenceExpression_ReferencedVarableDeclaration();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolStatementBlockImpl <em>Eol Statement Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolStatementBlockImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolStatementBlock()
		 * @generated
		 */
		EClass EOL_STATEMENT_BLOCK = eINSTANCE.getEolStatementBlock();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_STATEMENT_BLOCK__STATEMENTS = eINSTANCE.getEolStatementBlock_Statements();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolStatementImpl <em>Eol Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolStatementImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolStatement()
		 * @generated
		 */
		EClass EOL_STATEMENT = eINSTANCE.getEolStatement();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolAssignmentStatementImpl <em>Eol Assignment Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolAssignmentStatementImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolAssignmentStatement()
		 * @generated
		 */
		EClass EOL_ASSIGNMENT_STATEMENT = eINSTANCE.getEolAssignmentStatement();

		/**
		 * The meta object literal for the '<em><b>Is Special</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOL_ASSIGNMENT_STATEMENT__IS_SPECIAL = eINSTANCE.getEolAssignmentStatement_IsSpecial();

		/**
		 * The meta object literal for the '<em><b>Logical Expression Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_ASSIGNMENT_STATEMENT__LOGICAL_EXPRESSION_LEFT = eINSTANCE.getEolAssignmentStatement_LogicalExpressionLeft();

		/**
		 * The meta object literal for the '<em><b>Logical Expression Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_ASSIGNMENT_STATEMENT__LOGICAL_EXPRESSION_RIGHT = eINSTANCE.getEolAssignmentStatement_LogicalExpressionRight();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolExpressionStatementImpl <em>Eol Expression Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolExpressionStatementImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolExpressionStatement()
		 * @generated
		 */
		EClass EOL_EXPRESSION_STATEMENT = eINSTANCE.getEolExpressionStatement();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolAssignmentExpressionStatementImpl <em>Eol Assignment Expression Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolAssignmentExpressionStatementImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolAssignmentExpressionStatement()
		 * @generated
		 */
		EClass EOL_ASSIGNMENT_EXPRESSION_STATEMENT = eINSTANCE.getEolAssignmentExpressionStatement();

		/**
		 * The meta object literal for the '<em><b>Postfix Expression Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_ASSIGNMENT_EXPRESSION_STATEMENT__POSTFIX_EXPRESSION_LEFT = eINSTANCE.getEolAssignmentExpressionStatement_PostfixExpressionLeft();

		/**
		 * The meta object literal for the '<em><b>Logical Expression Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_ASSIGNMENT_EXPRESSION_STATEMENT__LOGICAL_EXPRESSION_RIGHT = eINSTANCE.getEolAssignmentExpressionStatement_LogicalExpressionRight();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolLogicalExpressionStatementImpl <em>Eol Logical Expression Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolLogicalExpressionStatementImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolLogicalExpressionStatement()
		 * @generated
		 */
		EClass EOL_LOGICAL_EXPRESSION_STATEMENT = eINSTANCE.getEolLogicalExpressionStatement();

		/**
		 * The meta object literal for the '<em><b>Logical Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_LOGICAL_EXPRESSION_STATEMENT__LOGICAL_EXPRESSION = eINSTANCE.getEolLogicalExpressionStatement_LogicalExpression();

		/**
		 * The meta object literal for the '{@link etlMetaModel.impl.EolForImpl <em>Eol For</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.impl.EolForImpl
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolFor()
		 * @generated
		 */
		EClass EOL_FOR = eINSTANCE.getEolFor();

		/**
		 * The meta object literal for the '<em><b>Formal Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_FOR__FORMAL_PARAMETER = eINSTANCE.getEolFor_FormalParameter();

		/**
		 * The meta object literal for the '<em><b>Iterated Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_FOR__ITERATED_SEQUENCE = eINSTANCE.getEolFor_IteratedSequence();

		/**
		 * The meta object literal for the '<em><b>Statement Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_FOR__STATEMENT_BLOCK = eINSTANCE.getEolFor_StatementBlock();

		/**
		 * The meta object literal for the '{@link etlMetaModel.EolLogicalOperator <em>Eol Logical Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.EolLogicalOperator
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolLogicalOperator()
		 * @generated
		 */
		EEnum EOL_LOGICAL_OPERATOR = eINSTANCE.getEolLogicalOperator();

		/**
		 * The meta object literal for the '{@link etlMetaModel.EolRelationalOperator <em>Eol Relational Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.EolRelationalOperator
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolRelationalOperator()
		 * @generated
		 */
		EEnum EOL_RELATIONAL_OPERATOR = eINSTANCE.getEolRelationalOperator();

		/**
		 * The meta object literal for the '{@link etlMetaModel.EolAdditiveComparisonOperator <em>Eol Additive Comparison Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.EolAdditiveComparisonOperator
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolAdditiveComparisonOperator()
		 * @generated
		 */
		EEnum EOL_ADDITIVE_COMPARISON_OPERATOR = eINSTANCE.getEolAdditiveComparisonOperator();

		/**
		 * The meta object literal for the '{@link etlMetaModel.EolAdditiveArithmeticalOperator <em>Eol Additive Arithmetical Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.EolAdditiveArithmeticalOperator
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolAdditiveArithmeticalOperator()
		 * @generated
		 */
		EEnum EOL_ADDITIVE_ARITHMETICAL_OPERATOR = eINSTANCE.getEolAdditiveArithmeticalOperator();

		/**
		 * The meta object literal for the '{@link etlMetaModel.EolMultiplicativeArithmeticalOperator <em>Eol Multiplicative Arithmetical Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.EolMultiplicativeArithmeticalOperator
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolMultiplicativeArithmeticalOperator()
		 * @generated
		 */
		EEnum EOL_MULTIPLICATIVE_ARITHMETICAL_OPERATOR = eINSTANCE.getEolMultiplicativeArithmeticalOperator();

		/**
		 * The meta object literal for the '{@link etlMetaModel.EolUnaryOprator <em>Eol Unary Oprator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see etlMetaModel.EolUnaryOprator
		 * @see etlMetaModel.impl.EtlMetaModelPackageImpl#getEolUnaryOprator()
		 * @generated
		 */
		EEnum EOL_UNARY_OPRATOR = eINSTANCE.getEolUnaryOprator();

	}

} //EtlMetaModelPackage
