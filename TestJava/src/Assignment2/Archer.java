package Assignment2;

public class Archer extends Protector {


	public Archer(String Name, double Strength) {
		super(Name, Strength);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void SoundOfProtector() {
		System.out.println("TWANG! "+this.getName()+" says: Take that in the name of my lord, "+this.getMyOwner().getName());		
	}
	
	public boolean equals(Archer obj) {
		if(this.getStrength() == obj.getStrength())
			return true;
		else
			return false;
	}
	@Override
	public int hashCode() {
		return (int) this.getStrength()*40;
	}
}
