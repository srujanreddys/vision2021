package Assignment2;

public class PersonWithStrength extends Nodles {
		private double Strength;
		private boolean alive;
		
	public PersonWithStrength(String Name, double Strength) {
		super(Name);
		if (Strength < 0) {
			this.Strength = 0;
		}
		this.Strength=Strength;
	}
	public void setStrength(double strength) {
		Strength = strength;
	}

	@Override
	public double getStrength() {
		// TODO Auto-generated method stub
		return Strength;
	}
	@Override
	public void wonTheWar(double remaningStrength) {
		this.setStrength(remaningStrength);
	}

	@Override
	public void lostTheWar() {
		this.setStrength(0);
		this.alive=false;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getName());
		sb.append(" : ");
		sb.append(this.getStrength());		
		return sb.toString();
	}
}
