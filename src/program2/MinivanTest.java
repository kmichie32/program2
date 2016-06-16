package program2;

import static org.junit.Assert.*;

import org.junit.Test;

//-------------------------------------------------------------------------
/**
*  Tests the methods of the Minivan class.
*  The objective is to test each method to ensure
*  that they are working properly by testing each
*  assertion.
* 
*  @author kmichie
*  @version 2016.06.13
*/
public class MinivanTest
 extends student.TestCase
{
 //~ Fields ................................................................

 // Holds a minivan object to be used in your individual tests
 private Minivan minivan;


 //~ Constructor ...........................................................

 // ----------------------------------------------------------
 /**
  * Creates a new MinivanTest test object.
  */
 public MinivanTest()
 {
     // The constructor is usually empty in unit tests, since it runs
     // once for the whole class, not once for each test method.
     // Per-test initialization should be placed in setUp() instead.
 }


 //~ Methods ...............................................................

 // ----------------------------------------------------------
 /**
  * Sets up the test fixture.
  * Called before every test case method.
  * Here, we just create a minivan using the default constructor,
  * so a freshly created minivan is available for use in each test.
  */
 public void setUp()
 {
     minivan = new Minivan();
 }


 // ----------------------------------------------------------
 /**
  * Check that the left outside handle of the minivan 
  * is open with a boolean True value.
  */
 public void testLeftOuterHandleWithAllSwitchesOff()
 {	
     assertTrue(minivan.pullLeftOuterHandle());
 }
 
 /**
  * Check that the left inner handle of the minivan 
  * is open with a boolean True value.
  */
 public void testLeftInnerHandleWithAllSwitchesOff()
 {
     assertTrue(minivan.pullLeftInnerHandle());
 }
 
 /**
  * Check that the left dash switches of the minivan 
  * is open with a boolean True value.
  */
 public void testLeftDashSwitchesWithAllSwitchesOff()
 {
     assertTrue(minivan.pullLeftDashSwitch());
 }
 
 /**
  * Check that the right outside handle of the minivan 
  * is open with a boolean True value.
  */
 public void testRightOuterHandleWithAllSwitchesOff()
 {	
     assertTrue(minivan.pullRightOuterHandle());
 }
 
 /**
  * Check that the right inner handle of the minivan 
  * is open with a boolean True value.
  */
 public void testRightInnerHandleWithAllSwitchesOff()
 {
     assertTrue(minivan.pullRightInnerHandle());
 }
 
 /**
  * Check that the right dash switches of the minivan 
  * is open with a boolean True value.
  */
 public void testRightDashSwitchesWithAllSwitchesOff()
 {
     assertTrue(minivan.pullRightDashSwitch());
 }
 
 /**
  * Check that Child Lock is off by setting the
  * boolean value to false.
  */
 public void testChildLockIsOff()
 {	
	 minivan.setChildLock(false);
     assertEquals(minivan.getChildLock(),"off");
 }
 
 /**
  * Check that Master Unlock is off by setting the
  * boolean value to false.
  */
 public void testMasterUnlockIsOff()
 {	
	 minivan.setMasterUnlock(false);
     assertEquals(minivan.getMasterUnlock(),"off");
 }
 
 /**
  * Check that the Gear Shift Position
  * is in the park position of 'P'
  */
 public void testGearShiftPositionAsParked()
 {	
	 minivan.setGearShiftPosition('P');
     assertEquals(minivan.getGearShiftPosition(),'P');
 }
 
}
