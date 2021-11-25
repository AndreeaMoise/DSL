/**
 * generated by Xtext 2.25.0
 */
package assignment2.gameDSL.util;

import assignment2.gameDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see assignment2.gameDSL.GameDSLPackage
 * @generated
 */
public class GameDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GameDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = GameDSLPackage.eINSTANCE;
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
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
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
  protected GameDSLSwitch<Adapter> modelSwitch =
    new GameDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseGame(Game object)
      {
        return createGameAdapter();
      }
      @Override
      public Adapter caseGrid(Grid object)
      {
        return createGridAdapter();
      }
      @Override
      public Adapter caseSize(Size object)
      {
        return createSizeAdapter();
      }
      @Override
      public Adapter caseState(State object)
      {
        return createStateAdapter();
      }
      @Override
      public Adapter caseCell(Cell object)
      {
        return createCellAdapter();
      }
      @Override
      public Adapter caseCoordinates(Coordinates object)
      {
        return createCoordinatesAdapter();
      }
      @Override
      public Adapter caseRule(Rule object)
      {
        return createRuleAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
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
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link assignment2.gameDSL.Game <em>Game</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see assignment2.gameDSL.Game
   * @generated
   */
  public Adapter createGameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link assignment2.gameDSL.Grid <em>Grid</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see assignment2.gameDSL.Grid
   * @generated
   */
  public Adapter createGridAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link assignment2.gameDSL.Size <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see assignment2.gameDSL.Size
   * @generated
   */
  public Adapter createSizeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link assignment2.gameDSL.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see assignment2.gameDSL.State
   * @generated
   */
  public Adapter createStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link assignment2.gameDSL.Cell <em>Cell</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see assignment2.gameDSL.Cell
   * @generated
   */
  public Adapter createCellAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link assignment2.gameDSL.Coordinates <em>Coordinates</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see assignment2.gameDSL.Coordinates
   * @generated
   */
  public Adapter createCoordinatesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link assignment2.gameDSL.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see assignment2.gameDSL.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
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
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //GameDSLAdapterFactory