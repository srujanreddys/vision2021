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
	/**
	 * deletes the Warrior objects from the noble
	 * @param Object Warrior ,need to delete Objects
	 * @return      None
	 */
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
	/**
	 * Adds the Strength of all Warriors in the list
	 * @param 	 None
	 * @return  Sum of the Strength
	 */
	public double getStrength() {
		double sum=0;
		for(Warrior w: myArmy) {
			sum = sum+ w.getWarriorstrength();
		}
		return sum;
	}
	/**
	 * after winning the battle Noble Strength is reduced and also as there Warriors Strength in the list
	 * @param noblePresentStrength ,remaining strength of the Noble after winning the battle
	 * @return  None
	 */
	
	public void winTheWar(double noblePresentStrength) {
		double temp = this.getStrength()/noblePresentStrength;
		for (Warrior w : myArmy) {
			w.setWarriorstrength(w.getWarriorstrength()/temp);
		}
	}
	/**
	 * after losing the battle Noble is reduced to 0 and there Warriors Strength also reduces to 0 in the list 
	 * the Noble with 0 Strength is dead that changes the Noble alive status to false
	 * @param 	None
	 * @return  None
	 */
	public void lostWar() {
		for (Warrior w : myArmy) {
			w.setWarriorstrength(0);
		}
		this.alive=false;
	}
	/**
	 * Noble battles with Noble to win the war. it is the war of the Strengths of Nobles. the Noble who as the greater Strength wins the battle
	 * and the Noble who as the lesser Strength ends up dead with 0 strength.
	 * if both Nobles Strength is equal they both end up dead with 0 Strength
	 * @param enemy , Noble 
	 * @return  None
	 */
	public void battle(Noble enemy) {
		System.out.println(this.nobleName+" battles "+enemy.nobleName);
		  double nobleStrength = this.getStrength();
		  double enemyStrength = enemy.getStrength();
		if (nobleStrength > enemyStrength) {
			if (enemyStrength==0) {
				System.out.println("He's dead, "+this.nobleName);
			}else {
				System.out.println(this.nobleName+" defeats "+enemy.nobleName);
			}
			this.winTheWar(nobleStrength - enemyStrength);
			enemy.lostWar();
		}
		else if (nobleStrength < enemyStrength) {
			if (nobleStrength==0) {
				System.out.println("He's dead, "+enemy.nobleName);
			}else {
				System.out.println(enemy.nobleName+" defeats "+this.nobleName);
			}
				enemy.winTheWar(enemyStrength - nobleStrength);
				this.lostWar();
		}
		else if (nobleStrength == enemyStrength) {
			if (nobleStrength==0) {
				System.out.println("Oh, NO! They're both dead! Yuck!");
			}else {
				System.out.println("Mutual Annihilation : "+this.nobleName+" and "+enemy.nobleName+" die at each other's hands");
			}
			enemy.lostWar();
			this.lostWar();
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
