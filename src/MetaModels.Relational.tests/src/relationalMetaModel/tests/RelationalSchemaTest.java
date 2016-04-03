/**
 */
package relationalMetaModel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import relationalMetaModel.RelationalMetaModelFactory;
import relationalMetaModel.RelationalSchema;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relational Schema</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationalSchemaTest extends TestCase
{

  /**
	 * The fixture for this Relational Schema test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RelationalSchema fixture = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(RelationalSchemaTest.class);
	}

  /**
	 * Constructs a new Relational Schema test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RelationalSchemaTest(String name)
  {
		super(name);
	}

  /**
	 * Sets the fixture for this Relational Schema test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void setFixture(RelationalSchema fixture)
  {
		this.fixture = fixture;
	}

  /**
	 * Returns the fixture for this Relational Schema test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RelationalSchema getFixture()
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
		setFixture(RelationalMetaModelFactory.eINSTANCE.createRelationalSchema());
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

} //RelationalSchemaTest
