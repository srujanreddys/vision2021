package Assignment2;


abstract class Protector {

	private String Name;
	private double Strength;
	private boolean Alive;
	private Lord myOwner;

	public Nodles getMyOwner() {
		return myOwner;
	}
	public void setMyOwner(Lord myOwner) {
		this.myOwner = myOwner;
	}
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
		return Alive;
	}
	public void setAlive(boolean alive) {
		Alive = alive;
	}
	
	public Protector(String Name,double Strength) {
		this.Name= Name;
		if (Strength < 0) {
			Strength = 0;
		}
		this.Strength=Strength;
		this.Alive=true;
	}
	/**
	 * Warriors make a different kind of sounds when they go for battle
	 */
	public abstract void SoundOfProtector();
	/**
	 * checks Warrier is alive and Warrier as Owner or not. If yes 
	 * then deletes the value from the owner and
	 * changes the Warrier Owner to null
	 */
	public void runaway() {
		if (this.Alive==true && this.myOwner!=null) {
			this.myOwner.deleteWarrior(this);
			this.setMyOwner(null);
		}else {
			System.out.println(this.getName()+"  could not runaway");
		}
	}
	public String toString() {		
		StringBuilder sb = new StringBuilder();
		sb.append("\n\t");
		sb.append(getName());
		sb.append(": ");
		sb.append(getStrength());
		return sb.toString();
	}
}
