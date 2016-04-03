/**
 */
package umlClassMetaModel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import umlClassMetaModel.UmlClass;
import umlClassMetaModel.UmlClassMetaModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Uml Class</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlClassTest extends TestCase
{

  /**
	 * The fixture for this Uml Class test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected UmlClass fixture = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(UmlClassTest.class);
	}

  /**
	 * Constructs a new Uml Class test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public UmlClassTest(String name)
  {
		super(name);
	}

  /**
	 * Sets the fixture for this Uml Class test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void setFixture(UmlClass fixture)
  {
		this.fixture = fixture;
	}

  /**
	 * Returns the fixture for this Uml Class test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected UmlClass getFixture()
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
		setFixture(UmlClassMetaModelFactory.eINSTANCE.createUmlClass());
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

} //UmlClassTest
