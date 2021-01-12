package Assignment2;

import java.util.ArrayList;

import Assignment1.Warrior;

public class Lord extends Nodles {
	private ArrayList<Protector> myArmy=new ArrayList<Protector>();

	public Lord(String Name) {
		super(Name);
	}
	/**
	 * this will calculate the sum of strength of the Lord
	 * @return the sum
	 */
	@Override
	public double getStrength() {
		double sum=0;
		for(Protector w: myArmy) {
			sum = sum+ w.getStrength();
		}
		return sum;
	}
	/**
	 * it will hire the Warrior by checking the recruit is alive and is not 
	 * hired already ,if successful then the Warrior is hired ,
	 * if it is not successful output is Noble could not hire Warrior
	 * @param warrior ,New Recruitment to be done
	 */
	public void hire(Protector warrior) {
		if (this.isAlive()==true && warrior.isAlive()==true && warrior.getMyOwner()==null ) {
			this.myArmy.add(warrior);
			warrior.setMyOwner(this);
		}else {
			System.out.println(this.getName()+" could not hire "+warrior.getName());
		}
	}
	/**
	 * will delete the Protector from the list
	 * @param warrior ,will be deleted from the list
	 */
	public void deleteWarrior(Protector warrior) {
		myArmy.remove(warrior);
	}
	/*
	 * after winning the battle lord strength will be decreased as well as the Protector strengths
	 * @param remaningStrength  ,remaining strength of a lord after the battle
	 */
	@Override
	public void wonTheWar(double remaningStrength ) {
		double temp = this.getStrength()/remaningStrength;
		for (Protector w : myArmy) {
			w.SoundOfProtector();
			w.setStrength(w.getStrength()/temp);
		}
	}
	/*
	 * after lost the battle the lord strength as well as the Protector strengths will be reduased to 0
	 * and the lord alive status is false as he is dead
	 */
	@Override
	public void lostTheWar() {
		for (Protector w : myArmy) {
			w.setStrength(0);
			w.setAlive(false);
			w.SoundOfProtector();
		}
		this.setAlive(false);
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getName());
		sb.append(" has an army of ");
		sb.append(this.myArmy.size());		
		for(Protector w: myArmy) 
			sb.append(w.toString());
		return sb.toString();
	}
}
