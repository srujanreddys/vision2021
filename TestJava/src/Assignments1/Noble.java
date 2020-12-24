package Assignments1;

import java.util.ArrayList;

public class Noble {

	private String nobleName;
	private ArrayList<Warrior> myArmy=new ArrayList<Warrior>();
	private Warrior Quit;
	 
	public String getNobleName() {
		return nobleName;
	}
	public void setNobleName(String nobleName) {
		this.nobleName = nobleName;
	}
	public Warrior getQuit() {
		return Quit;
	}
	public void setQuit(Warrior quit) {
		quit.getMyOwner().myArmy.remove(quit);
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
		System.out.println(this.nobleName+" battles "+enemy.nobleName);
		  double temp=0;
		if (this.getStrength() > enemy.getStrength()) {
			if (enemy.getStrength()==0) {
				System.out.println("He's dead, "+this.nobleName);
			}else {
				System.out.println(this.nobleName+" defeats "+enemy.nobleName);
			}
			temp = this.getStrength() - enemy.getStrength();
			this.setStrength(temp/myArmy.size());
			enemy.setStrength(0);
		}
		else if (this.getStrength() < enemy.getStrength()) {
			if (this.getStrength()==0) {
				System.out.println("He's dead, "+enemy.nobleName);
			}else {
				System.out.println(enemy.nobleName+" defeats "+this.nobleName);
			}
				temp = enemy.getStrength() - this.getStrength();
				enemy.setStrength(temp/myArmy.size());
				this.setStrength(0);
		}
		else if (this.getStrength() == enemy.getStrength()) {
			if (this.getStrength()==0) {
				System.out.println("Oh, NO! They're both dead! Yuck!");
			}else {
				System.out.println("Mutual Annihilation : "+this.nobleName+" and "+enemy.nobleName+" die at each other's hands");
			}
			temp = enemy.getStrength() - this.getStrength();
			enemy.setStrength(temp);
			this.setStrength(temp);
		}
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.nobleName);
		sb.append(" has an army of ");
		sb.append(this.myArmy.size());		
		for(Warrior w: myArmy) 
			sb.append(w.toString());
		return sb.toString();
	}
	
}
