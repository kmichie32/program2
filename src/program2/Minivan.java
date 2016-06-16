package program2;
//-------------------------------------------------------------------------
/**
*  A program that sets and retrieves the state of doors and driving positions
*  of a Minivan.
*  The purpose of this class is to develop methods, a constructor,
*  instance variables, accessor and mutator methods, and a if statement
*  helper method to reduce repeating code.
*
*  @author kmichie
*  @version 2016.06.13
*/
public class Minivan
{
  //~ Fields ................................................................
  /**
   * Private String value to hold state of childLock (on or off)
   */
	private String childLock;
  /**
   * Private String value to hold state of masterUnlock (on or off)
   */
	private String masterUnlock;
  /**
   * Private character value to hold state of gearShiftPosition
   * ('P', 'R', 'N', '1', '2', '3', 'D')
   */
	private char gearShiftPosition;

  /**
   * Helper method for open and closed doors
   * @return A String value of "on" or "off"
   */
	private String locked(boolean isLocked) {
		return isLocked ? "on" : "off";
	}

  //~ Constructor ...........................................................

  // ----------------------------------------------------------
  /**
   * Creates a new minivan object with the doors closed,
   * gear shift in park, child lock switch off, and master unlock
   * switch on (unlocked).
   */
	public Minivan() {
		setGearShiftPosition('P');
        setChildLock(false);
        setMasterUnlock(true);
	}


  //~Public  Methods ........................................................

  /**
   * Gets the state of the childLock (false == off and true == on)
   * @return A String value of "on" or "off"
   */
	public String getChildLock() {
		return childLock;
	}

  /**
   * Sets the childLock state with a boolean and is converted
   * to a string value using the locked helper method.
   * @param childLock shows the boolean state of the childLock
   */
	public void setChildLock(boolean childLock) {
		this.childLock = locked(childLock);
	}

  /**
   * Gets the state of the masterUnlock (false == off and true == on)
   * @return A String value of "on" or "off"
   */
	public String getMasterUnlock() {
		return masterUnlock;
	}

  /**
   * Sets the masterUnlock state with a boolean and is converted
   * to a string value using the locked helper method.
   * @param masterUnlock is true or false for state of masterUnlock
   */
	public void setMasterUnlock(boolean masterUnlock) {
		this.masterUnlock = locked(masterUnlock);
	}

  /**
   * Gets the state of the gearShiftPosition
   * 'P' == Park, 'R' == Reverse, 'N' == Neutral,
   * '1' == 1st Position, '2' == 2nd Position,
   * '3' == 3rd Position, 'D' == Drive
   * @return A Char value of 'P', 'R', 'N', '1', '2', '3', 'D'
   */
	public char getGearShiftPosition() {
		return gearShiftPosition;
	}

  /**
   * Sets the state of the gearShiftPosition
   * @param gearShiftPosition 
   * Char value of 'P', 'R', 'N', '1', '2', '3', 'D'
   */
	public void setGearShiftPosition(char gearShiftPosition) {
		this.gearShiftPosition = gearShiftPosition;
	}

  // ----------------------------------------------------------
  /**
   * Shows the state of door if Left Outer Handle is Pulled
   * @returns True or False if getGearShiftPosition is 'P' and
   * getMasterUnlock is "on"
   */
	public boolean pullLeftOuterHandle() {
		
		return (getGearShiftPosition() == 'P' && 
				getMasterUnlock().equals("on"));

	}

  /**
   * Shows the state of door if Left Inner Handle is Pulled
   * @returns boolean the state of true or false if you can open door
   */
	public boolean pullLeftInnerHandle() {
		if (getChildLock().equals("on")) {
			return false;
		}
		if (getGearShiftPosition() == 'P' && getMasterUnlock().equals("on")) {
			return true;
		} 
		else {
			return false;
		}
	}

  /**
   * Shows the state of door if Left Dash Switch is Pulled
   * @returns boolean the state of true or false if you can open door
   */
	public boolean pullLeftDashSwitch() {
		if (getGearShiftPosition() == 'P' && getMasterUnlock().equals("on")) {
			return true;
		}
		else {
			return false;
		}
	}

  /**
   * Shows the state of door if Right Outer Handle is Pulled
   * @returns boolean the state of true or false if you can open door
   */
	public boolean pullRightOuterHandle() {
		if (getGearShiftPosition() == 'P' && getMasterUnlock().equals("on")) {
			return true;
		}
		else {
			return false;
		}
	}

  /**
   * Shows the state of door if Right Inner Handle is Pulled
   * @returns boolean the state of true or false if you can open door
   */
	public boolean pullRightInnerHandle() {		
		if (getChildLock().equals("on")) {
			return false;
		} 
		
		if (getGearShiftPosition() == 'P' && getMasterUnlock().equals("on")) {
			return true;
		}

		else {
			return false;
		}
	}

  /**
   * Shows the state of door if Right Dash Switch is Pulled
   * @returns boolean the state of true or false if you can open door
   */
	public boolean pullRightDashSwitch() {
		if (getGearShiftPosition() == 'P' && getMasterUnlock().equals("on")) {
			return true;
		}
		else {
			return false;
		}
	}
}