package Assignment1;

public class Warrior {

	private String warriorName;
	private double warriorstrength;
	private Noble myOwner;
	
	public Noble getMyOwner() {
		return myOwner;
	}
	public void setMyOwner(Noble myOwner) {
		this.myOwner = myOwner;
	}
	public String getWarriorName() {
		return warriorName;
	}
	public void setWarriorName(String warriorName) {
		this.warriorName = warriorName;
	}
	public double getWarriorstrength() {
		return warriorstrength;
	}
	public void setWarriorstrength(double strength) {
		this.warriorstrength = strength;
	}
	public Warrior(String warriorName, int warriorstrength) {
		this.warriorName = warriorName;
		if (warriorstrength < 0) {
			this.warriorstrength = 0;
		}
		this.warriorstrength = warriorstrength;
	}
	/**Runaway means Warrior is Quit from the Noble.
	 * First checks given warrior isAlive and hired or not if successful
	 * after that the Warrior objects will be deleted from Noble
	 * then it changes the warrior myOwner to 'null'
	 * @param 	 None
	 * @return   None
	 */
	public void runaway() {
		if (isAlive()==true && this.myOwner!=null) {
			System.out.println("So long "+ this.getMyOwner().getNobleName() + ". I'm out'a here! -- "+ this.warriorName);
			this.myOwner.deleteWarrior(this);
			this.setMyOwner(null);
		}
	}
	/**
	 * isAlive checks the Warrior is Alive or not
	 * if Warrior Strength is 0 it returns false as Warrior is dead 
	 * if Warrior Strength is more then 0 it returns true as Warrior is Alive 
	 * @return false if dead else true
	 */
	public boolean isAlive() {
		if (warriorstrength==0) {
			return false;
		}
		return true;
	}
	public String toString() {		
		StringBuilder sb = new StringBuilder();
		sb.append("\n\t");
		sb.append(getWarriorName());
		sb.append(": ");
		sb.append(getWarriorstrength());
		
		return sb.toString();
	}
}