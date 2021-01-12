package Assignment2;

public class Swordsman extends Protector {

	public Swordsman(String Name, double Strength) {
		super(Name, Strength);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void SoundOfProtector() {
		System.out.println("CLANG! "+this.getName()+" says: Take that in the name of my lord, "+this.getMyOwner().getName());
	}
	
	
}
