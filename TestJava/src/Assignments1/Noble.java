package Assignments1;

import java.util.ArrayList;

public class Noble {

	private String nobleName;
	private ArrayList<Warrior> myArmy;
	 
	public String getNobleName() {
		return nobleName;
	}
	public void setNobleName(String nobleName) {
		this.nobleName = nobleName;
	}
	public Noble(String nobleName) {
		this.nobleName=nobleName;
	}
	public void hire(Warrior warrior) {
		if (warrior.getMyOwner()==null) {
			this.myArmy.add(warrior);
			warrior.setMyOwner(this);
		}
	}
	
	public double getStrength() {
		double sum=0;
		for(Warrior w: myArmy) 
			sum = sum+ w.getWarriorstrength();
		return sum;
	}
	
	public double setStrength(double Strength) {
		for (int i = 0; i < myArmy.size(); i++) {
			myArmy.get(i).setWarriorstrength(Strength);
		}
		return Strength;
	}
	
	public void battle(Noble enemy) {
		  double temp=0;
		if (this.getStrength() > enemy.getStrength()) {
			temp = this.getStrength() - enemy.getStrength();
			this.setStrength(temp/myArmy.size());
			enemy.setStrength(0);
		}
		else if (this.getStrength() < enemy.getStrength()) {
				temp = enemy.getStrength() - this.getStrength();
				enemy.setStrength(temp/myArmy.size());
				this.setStrength(0);
		}
		else if (this.getStrength() == enemy.getStrength()) {
			temp = enemy.getStrength() - this.getStrength();
			enemy.setStrength(temp);
			this.setStrength(temp);
		}
	}
	
}
