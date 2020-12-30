package Assignments1;

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
	public void runaway() {
		if (isAlive()==true && this.myOwner!=null) {
			System.out.println("So long "+ this.getMyOwner().getNobleName() + ". I'm out'a here! -- "+ this.warriorName);
			this.myOwner.deleteWarrior(this);
			this.setMyOwner(null);
		}
	}
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