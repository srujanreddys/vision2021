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
		myArmy.add(warrior);

	}
	public void battle(Noble noble) {
		
	}
	
}
