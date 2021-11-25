/**
 * generated by Xtext 2.25.0
 */
package assignment2.gameDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment2.gameDSL.Size#getRows <em>Rows</em>}</li>
 *   <li>{@link assignment2.gameDSL.Size#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see assignment2.gameDSL.GameDSLPackage#getSize()
 * @model
 * @generated
 */
public interface Size extends EObject
{
  /**
   * Returns the value of the '<em><b>Rows</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rows</em>' attribute.
   * @see #setRows(int)
   * @see assignment2.gameDSL.GameDSLPackage#getSize_Rows()
   * @model
   * @generated
   */
  int getRows();

  /**
   * Sets the value of the '{@link assignment2.gameDSL.Size#getRows <em>Rows</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rows</em>' attribute.
   * @see #getRows()
   * @generated
   */
  void setRows(int value);

  /**
   * Returns the value of the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' attribute.
   * @see #setColumns(int)
   * @see assignment2.gameDSL.GameDSLPackage#getSize_Columns()
   * @model
   * @generated
   */
  int getColumns();

  /**
   * Sets the value of the '{@link assignment2.gameDSL.Size#getColumns <em>Columns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Columns</em>' attribute.
   * @see #getColumns()
   * @generated
   */
  void setColumns(int value);

} // Size
