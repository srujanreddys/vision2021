package Assignment2;

import java.util.ArrayList;

public class Battle {

	private String Name;
	private double Strength;
	private boolean alive;
	private ArrayList<Lord> myArmy=new ArrayList<Lord>();
	private Lord myOwner;

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getStrength() {
		return Strength;
	}
	public void setStrength(double strength) {
		Strength = strength;
	}
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	public Battle( String name, double strength) {
		this.Name=name;
		if (strength < 0) {
			this.Strength = 0;
		}
		this.Strength=strength;
		this.alive=true;
	}
	
    public void battle(Battle enemy) {
		System.out.println(this.getName()+" battles "+enemy.getName());
		double nobleStrength = this.getStrength();
		double enemyStrength = enemy.getStrength();
		if (nobleStrength > enemyStrength) {
			if (enemyStrength==0) {
				System.out.println("He's dead, "+this.getName());
			}else {
				System.out.println(this.getName()+" defeats "+enemy.getName());
			}
		//	this.winTheWar(nobleStrength - enemyStrength);
		//	enemy.lostWar();
		}
		else if (nobleStrength < enemyStrength) {
			if (nobleStrength==0) {
				System.out.println("He's dead, "+enemy.getName());
			}else {
				System.out.println(enemy.getName()+" defeats "+this.getName());
			}
		//		enemy.winTheWar(enemyStrength - nobleStrength);
		//		this.lostWar();
		}
		else if (nobleStrength == enemyStrength) {
			if (nobleStrength==0) {
				System.out.println("Oh, NO! They're both dead! Yuck!");
			}else {
				System.out.println("Mutual Annihilation : "+this.getName()+" and "+enemy.getName()+" die at each other's hands");
			}
		//	enemy.lostWar();
		//	this.lostWar();
		}
		}
		
	}

	

