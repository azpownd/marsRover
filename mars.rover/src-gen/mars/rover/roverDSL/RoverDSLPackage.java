/**
 * generated by Xtext 2.23.0
 */
package mars.rover.roverDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mars.rover.roverDSL.RoverDSLFactory
 * @model kind="package"
 * @generated
 */
public interface RoverDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "roverDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.rover.mars/RoverDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "roverDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RoverDSLPackage eINSTANCE = mars.rover.roverDSL.impl.RoverDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.impl.MissionImpl <em>Mission</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.impl.MissionImpl
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getMission()
   * @generated
   */
  int MISSION = 0;

  /**
   * The feature id for the '<em><b>Missiontype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISSION__MISSIONTYPE = 0;

  /**
   * The feature id for the '<em><b>Safetyproperty</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISSION__SAFETYPROPERTY = 1;

  /**
   * The feature id for the '<em><b>Lakelist</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISSION__LAKELIST = 2;

  /**
   * The feature id for the '<em><b>Beginsentence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISSION__BEGINSENTENCE = 3;

  /**
   * The feature id for the '<em><b>Border</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISSION__BORDER = 4;

  /**
   * The feature id for the '<em><b>Forwardspeed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISSION__FORWARDSPEED = 5;

  /**
   * The feature id for the '<em><b>Reversespeed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISSION__REVERSESPEED = 6;

  /**
   * The feature id for the '<em><b>Turndirection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISSION__TURNDIRECTION = 7;

  /**
   * The feature id for the '<em><b>Colorlist</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISSION__COLORLIST = 8;

  /**
   * The feature id for the '<em><b>Terminationcondition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISSION__TERMINATIONCONDITION = 9;

  /**
   * The feature id for the '<em><b>Flashingcolor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISSION__FLASHINGCOLOR = 10;

  /**
   * The feature id for the '<em><b>Finalsentence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISSION__FINALSENTENCE = 11;

  /**
   * The number of structural features of the '<em>Mission</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MISSION_FEATURE_COUNT = 12;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.MissionType <em>Mission Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.MissionType
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getMissionType()
   * @generated
   */
  int MISSION_TYPE = 1;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.Colors <em>Colors</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.Colors
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getColors()
   * @generated
   */
  int COLORS = 2;

  /**
   * The meta object id for the '{@link mars.rover.roverDSL.Safety <em>Safety</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mars.rover.roverDSL.Safety
   * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getSafety()
   * @generated
   */
  int SAFETY = 3;


  /**
   * Returns the meta object for class '{@link mars.rover.roverDSL.Mission <em>Mission</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mission</em>'.
   * @see mars.rover.roverDSL.Mission
   * @generated
   */
  EClass getMission();

  /**
   * Returns the meta object for the attribute '{@link mars.rover.roverDSL.Mission#getMissiontype <em>Missiontype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Missiontype</em>'.
   * @see mars.rover.roverDSL.Mission#getMissiontype()
   * @see #getMission()
   * @generated
   */
  EAttribute getMission_Missiontype();

  /**
   * Returns the meta object for the attribute '{@link mars.rover.roverDSL.Mission#getSafetyproperty <em>Safetyproperty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Safetyproperty</em>'.
   * @see mars.rover.roverDSL.Mission#getSafetyproperty()
   * @see #getMission()
   * @generated
   */
  EAttribute getMission_Safetyproperty();

  /**
   * Returns the meta object for the attribute list '{@link mars.rover.roverDSL.Mission#getLakelist <em>Lakelist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Lakelist</em>'.
   * @see mars.rover.roverDSL.Mission#getLakelist()
   * @see #getMission()
   * @generated
   */
  EAttribute getMission_Lakelist();

  /**
   * Returns the meta object for the attribute '{@link mars.rover.roverDSL.Mission#getBeginsentence <em>Beginsentence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Beginsentence</em>'.
   * @see mars.rover.roverDSL.Mission#getBeginsentence()
   * @see #getMission()
   * @generated
   */
  EAttribute getMission_Beginsentence();

  /**
   * Returns the meta object for the attribute '{@link mars.rover.roverDSL.Mission#getBorder <em>Border</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Border</em>'.
   * @see mars.rover.roverDSL.Mission#getBorder()
   * @see #getMission()
   * @generated
   */
  EAttribute getMission_Border();

  /**
   * Returns the meta object for the attribute '{@link mars.rover.roverDSL.Mission#getForwardspeed <em>Forwardspeed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Forwardspeed</em>'.
   * @see mars.rover.roverDSL.Mission#getForwardspeed()
   * @see #getMission()
   * @generated
   */
  EAttribute getMission_Forwardspeed();

  /**
   * Returns the meta object for the attribute '{@link mars.rover.roverDSL.Mission#getReversespeed <em>Reversespeed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reversespeed</em>'.
   * @see mars.rover.roverDSL.Mission#getReversespeed()
   * @see #getMission()
   * @generated
   */
  EAttribute getMission_Reversespeed();

  /**
   * Returns the meta object for the attribute '{@link mars.rover.roverDSL.Mission#getTurndirection <em>Turndirection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Turndirection</em>'.
   * @see mars.rover.roverDSL.Mission#getTurndirection()
   * @see #getMission()
   * @generated
   */
  EAttribute getMission_Turndirection();

  /**
   * Returns the meta object for the attribute list '{@link mars.rover.roverDSL.Mission#getColorlist <em>Colorlist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Colorlist</em>'.
   * @see mars.rover.roverDSL.Mission#getColorlist()
   * @see #getMission()
   * @generated
   */
  EAttribute getMission_Colorlist();

  /**
   * Returns the meta object for the attribute '{@link mars.rover.roverDSL.Mission#getTerminationcondition <em>Terminationcondition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Terminationcondition</em>'.
   * @see mars.rover.roverDSL.Mission#getTerminationcondition()
   * @see #getMission()
   * @generated
   */
  EAttribute getMission_Terminationcondition();

  /**
   * Returns the meta object for the attribute '{@link mars.rover.roverDSL.Mission#getFlashingcolor <em>Flashingcolor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Flashingcolor</em>'.
   * @see mars.rover.roverDSL.Mission#getFlashingcolor()
   * @see #getMission()
   * @generated
   */
  EAttribute getMission_Flashingcolor();

  /**
   * Returns the meta object for the attribute '{@link mars.rover.roverDSL.Mission#getFinalsentence <em>Finalsentence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Finalsentence</em>'.
   * @see mars.rover.roverDSL.Mission#getFinalsentence()
   * @see #getMission()
   * @generated
   */
  EAttribute getMission_Finalsentence();

  /**
   * Returns the meta object for enum '{@link mars.rover.roverDSL.MissionType <em>Mission Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Mission Type</em>'.
   * @see mars.rover.roverDSL.MissionType
   * @generated
   */
  EEnum getMissionType();

  /**
   * Returns the meta object for enum '{@link mars.rover.roverDSL.Colors <em>Colors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Colors</em>'.
   * @see mars.rover.roverDSL.Colors
   * @generated
   */
  EEnum getColors();

  /**
   * Returns the meta object for enum '{@link mars.rover.roverDSL.Safety <em>Safety</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Safety</em>'.
   * @see mars.rover.roverDSL.Safety
   * @generated
   */
  EEnum getSafety();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RoverDSLFactory getRoverDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.impl.MissionImpl <em>Mission</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.impl.MissionImpl
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getMission()
     * @generated
     */
    EClass MISSION = eINSTANCE.getMission();

    /**
     * The meta object literal for the '<em><b>Missiontype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MISSION__MISSIONTYPE = eINSTANCE.getMission_Missiontype();

    /**
     * The meta object literal for the '<em><b>Safetyproperty</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MISSION__SAFETYPROPERTY = eINSTANCE.getMission_Safetyproperty();

    /**
     * The meta object literal for the '<em><b>Lakelist</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MISSION__LAKELIST = eINSTANCE.getMission_Lakelist();

    /**
     * The meta object literal for the '<em><b>Beginsentence</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MISSION__BEGINSENTENCE = eINSTANCE.getMission_Beginsentence();

    /**
     * The meta object literal for the '<em><b>Border</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MISSION__BORDER = eINSTANCE.getMission_Border();

    /**
     * The meta object literal for the '<em><b>Forwardspeed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MISSION__FORWARDSPEED = eINSTANCE.getMission_Forwardspeed();

    /**
     * The meta object literal for the '<em><b>Reversespeed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MISSION__REVERSESPEED = eINSTANCE.getMission_Reversespeed();

    /**
     * The meta object literal for the '<em><b>Turndirection</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MISSION__TURNDIRECTION = eINSTANCE.getMission_Turndirection();

    /**
     * The meta object literal for the '<em><b>Colorlist</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MISSION__COLORLIST = eINSTANCE.getMission_Colorlist();

    /**
     * The meta object literal for the '<em><b>Terminationcondition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MISSION__TERMINATIONCONDITION = eINSTANCE.getMission_Terminationcondition();

    /**
     * The meta object literal for the '<em><b>Flashingcolor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MISSION__FLASHINGCOLOR = eINSTANCE.getMission_Flashingcolor();

    /**
     * The meta object literal for the '<em><b>Finalsentence</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MISSION__FINALSENTENCE = eINSTANCE.getMission_Finalsentence();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.MissionType <em>Mission Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.MissionType
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getMissionType()
     * @generated
     */
    EEnum MISSION_TYPE = eINSTANCE.getMissionType();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.Colors <em>Colors</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.Colors
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getColors()
     * @generated
     */
    EEnum COLORS = eINSTANCE.getColors();

    /**
     * The meta object literal for the '{@link mars.rover.roverDSL.Safety <em>Safety</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mars.rover.roverDSL.Safety
     * @see mars.rover.roverDSL.impl.RoverDSLPackageImpl#getSafety()
     * @generated
     */
    EEnum SAFETY = eINSTANCE.getSafety();

  }

} //RoverDSLPackage
