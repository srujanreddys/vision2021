package Assignments1;

public class Warrior {

	private String warriorName;
	private int warriorstrength;
	private Noble my_owner;
	
	public String getWarriorName() {
		return warriorName;
	}
	public void setWarriorName(String warriorName) {
		this.warriorName = warriorName;
	}
	public int getWarriorstrength() {
		return warriorstrength;
	}
	public void setWarriorstrength(int warriorstrength) {
		this.warriorstrength = warriorstrength;
	}
	public Warrior(String warriorName, int warriorstrength) {
		this.warriorName = warriorName;
		this.warriorstrength = warriorstrength;
	}
	public void runaway() {
		
	}
}