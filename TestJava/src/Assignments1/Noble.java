package Assignments1;

import java.util.ArrayList;

public class Noble {

	private String nobleName;
	private ArrayList<Warrior> myArmy=new ArrayList<Warrior>();
	private boolean alive;
	 
	public String getNobleName() {
		return nobleName;
	}
	public void setNobleName(String nobleName) {
		this.nobleName = nobleName;
	}

	public void deleteWarrior(Warrior quit) {
		myArmy.remove(quit);
	}
	public Noble(String nobleName) {
		this.nobleName=nobleName;
		this.alive=true;
	}	
	/**
	 * First checks if the given new recruit is not deaad and is not 
	 *  hired already ,if successful then the warrior is hired  
	 * @param  Object Warrior  ,New Recruitment to be done
	 * @return      None
	 */
	public void hire(Warrior warrior) {
		if (this.alive==true && warrior.isAlive() && warrior.getMyOwner()==null ) {
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
	
	
	public void battle(Noble enemy) {
		System.out.println(this.nobleName+" battles "+enemy.nobleName);
		  double temp=0;
		  double temp1=0;
		  double nobleStrength = this.getStrength();
		  double enemyStrength = enemy.getStrength();
		if (nobleStrength > enemyStrength) {
			if (enemyStrength==0) {
				System.out.println("He's dead, "+this.nobleName);
			}else {
				System.out.println(this.nobleName+" defeats "+enemy.nobleName);
			}
			temp = nobleStrength - enemyStrength;
			temp1 = nobleStrength/temp;
			for(Warrior w: myArmy)  {
				w.setWarriorstrength(w.getWarriorstrength()/temp1);
			}
			for (int i = 0; i < enemy.myArmy.size(); i++) {
				enemy.myArmy.get(i).setWarriorstrength(0);
			}
			enemy.alive=false;
		}
		else if (nobleStrength < enemyStrength) {
			if (nobleStrength==0) {
				System.out.println("He's dead, "+enemy.nobleName);
			}else {
				System.out.println(enemy.nobleName+" defeats "+this.nobleName);
			}
				temp = enemyStrength - nobleStrength;
				temp1= enemyStrength/temp;
				for (int i = 0; i < enemy.myArmy.size(); i++) {
					enemy.myArmy.get(i).setWarriorstrength(myArmy.get(i).getWarriorstrength()/temp1);
				}
				for (int i = 0; i < this.myArmy.size(); i++) {
					this.myArmy.get(i).setWarriorstrength(0);
				}
				this.alive=false;
		}
		else if (nobleStrength == enemyStrength) {
			if (nobleStrength==0) {
				System.out.println("Oh, NO! They're both dead! Yuck!");
			}else {
				System.out.println("Mutual Annihilation : "+this.nobleName+" and "+enemy.nobleName+" die at each other's hands");
			}
			temp = enemyStrength - nobleStrength;
			//enemy lost war
			//noble lost war
			for (int i = 0; i < enemy.myArmy.size(); i++) {
				enemy.myArmy.get(i).setWarriorstrength(0);
			}
			for (int i = 0; i < this.myArmy.size(); i++) {
				this.myArmy.get(i).setWarriorstrength(0);
			}
			enemy.alive=false;
			this.alive=false;
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
