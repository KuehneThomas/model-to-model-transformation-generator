/**
 */
package relationalMetaModel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import relationalMetaModel.RelationalForeignKey;
import relationalMetaModel.RelationalMetaModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationalForeignKeyTest extends TestCase
{

  /**
	 * The fixture for this Relational Foreign Key test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RelationalForeignKey fixture = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(RelationalForeignKeyTest.class);
	}

  /**
	 * Constructs a new Relational Foreign Key test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RelationalForeignKeyTest(String name)
  {
		super(name);
	}

  /**
	 * Sets the fixture for this Relational Foreign Key test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void setFixture(RelationalForeignKey fixture)
  {
		this.fixture = fixture;
	}

  /**
	 * Returns the fixture for this Relational Foreign Key test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RelationalForeignKey getFixture()
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
		setFixture(RelationalMetaModelFactory.eINSTANCE.createRelationalForeignKey());
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

} //RelationalForeignKeyTest
