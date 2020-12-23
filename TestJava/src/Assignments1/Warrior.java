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
		this.warriorstrength = warriorstrength;
	}
	public void runaway() {
		this.myOwner=null;
	}
}