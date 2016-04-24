/**
 */
package umlClassMetaModel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import umlClassMetaModel.UmlAssociation;
import umlClassMetaModel.UmlClassMetaModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Uml Association</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlAssociationTest extends TestCase
{

  /**
	 * The fixture for this Uml Association test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected UmlAssociation fixture = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(UmlAssociationTest.class);
	}

  /**
	 * Constructs a new Uml Association test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public UmlAssociationTest(String name)
  {
		super(name);
	}

  /**
	 * Sets the fixture for this Uml Association test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void setFixture(UmlAssociation fixture)
  {
		this.fixture = fixture;
	}

  /**
	 * Returns the fixture for this Uml Association test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected UmlAssociation getFixture()
  {
		return fixture;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
  @Override
  protected void setUp() throws Exception
  {
		setFixture(UmlClassMetaModelFactory.eINSTANCE.createUmlAssociation());
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
  @Override
  protected void tearDown() throws Exception
  {
		setFixture(null);
	}

} //UmlAssociationTest
