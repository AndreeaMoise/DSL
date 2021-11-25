/**
 * generated by Xtext 2.25.0
 */
package assignment2.gameDSL.impl;

import assignment2.gameDSL.Cell;
import assignment2.gameDSL.CellType;
import assignment2.gameDSL.Coordinates;
import assignment2.gameDSL.GameDSLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment2.gameDSL.impl.CellImpl#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link assignment2.gameDSL.impl.CellImpl#getCellType <em>Cell Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CellImpl extends MinimalEObjectImpl.Container implements Cell
{
  /**
   * The cached value of the '{@link #getCoordinates() <em>Coordinates</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoordinates()
   * @generated
   * @ordered
   */
  protected Coordinates coordinates;

  /**
   * The default value of the '{@link #getCellType() <em>Cell Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCellType()
   * @generated
   * @ordered
   */
  protected static final CellType CELL_TYPE_EDEFAULT = CellType.DEAD;

  /**
   * The cached value of the '{@link #getCellType() <em>Cell Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCellType()
   * @generated
   * @ordered
   */
  protected CellType cellType = CELL_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CellImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GameDSLPackage.Literals.CELL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Coordinates getCoordinates()
  {
    return coordinates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCoordinates(Coordinates newCoordinates, NotificationChain msgs)
  {
    Coordinates oldCoordinates = coordinates;
    coordinates = newCoordinates;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GameDSLPackage.CELL__COORDINATES, oldCoordinates, newCoordinates);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCoordinates(Coordinates newCoordinates)
  {
    if (newCoordinates != coordinates)
    {
      NotificationChain msgs = null;
      if (coordinates != null)
        msgs = ((InternalEObject)coordinates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GameDSLPackage.CELL__COORDINATES, null, msgs);
      if (newCoordinates != null)
        msgs = ((InternalEObject)newCoordinates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GameDSLPackage.CELL__COORDINATES, null, msgs);
      msgs = basicSetCoordinates(newCoordinates, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GameDSLPackage.CELL__COORDINATES, newCoordinates, newCoordinates));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CellType getCellType()
  {
    return cellType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCellType(CellType newCellType)
  {
    CellType oldCellType = cellType;
    cellType = newCellType == null ? CELL_TYPE_EDEFAULT : newCellType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GameDSLPackage.CELL__CELL_TYPE, oldCellType, cellType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GameDSLPackage.CELL__COORDINATES:
        return basicSetCoordinates(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GameDSLPackage.CELL__COORDINATES:
        return getCoordinates();
      case GameDSLPackage.CELL__CELL_TYPE:
        return getCellType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GameDSLPackage.CELL__COORDINATES:
        setCoordinates((Coordinates)newValue);
        return;
      case GameDSLPackage.CELL__CELL_TYPE:
        setCellType((CellType)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GameDSLPackage.CELL__COORDINATES:
        setCoordinates((Coordinates)null);
        return;
      case GameDSLPackage.CELL__CELL_TYPE:
        setCellType(CELL_TYPE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GameDSLPackage.CELL__COORDINATES:
        return coordinates != null;
      case GameDSLPackage.CELL__CELL_TYPE:
        return cellType != CELL_TYPE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (cellType: ");
    result.append(cellType);
    result.append(')');
    return result.toString();
  }

} //CellImpl