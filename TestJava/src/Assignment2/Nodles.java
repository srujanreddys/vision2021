package Assignment2;

public abstract class Nodles {
	
	private String Name;
	private boolean Alive;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public boolean isAlive() {
		return Alive;
	}
	public void setAlive(boolean alive) {
		Alive = alive;
	}
	public Nodles(String Name) {
		this.Name=Name;
		this.Alive=true;
	}
	
	/**
	 *  it is the battle between two Nobles and won by the noble,
	 *  it is a battle of strengths the noble who as the higher strength will won the battle and 
	 *  the noble with the lesser strength ends up dead and the noble who wins the battle also loses the strength equal to enemy strength
	 * @param enemy, the noble who is on the other side of the war
	 */
	public void battle(Nodles enemy) {
		System.out.println(this.getName()+" battles "+enemy.getName());
		double nobleStrength= this.getStrength();
		double enemyStrength = enemy.getStrength();
		if (nobleStrength > enemyStrength) {
			if (enemyStrength==0 && enemy.isAlive() == false) {
				System.out.println("He's dead, "+this.getName());
			}else {
				this.wonTheWar(nobleStrength - enemyStrength);
				enemy.lostTheWar();
				System.out.println("AAAAARRRRR!!!");
				System.out.println(this.getName()+" defeats "+enemy.getName());
			}
		}
		else if (nobleStrength < enemyStrength) {
			if (nobleStrength==0 && this.isAlive()==false) {
				System.out.println("He's dead, "+enemy.getName());
			}else {
				enemy.wonTheWar(enemyStrength - nobleStrength);
				this.lostTheWar();
				System.out.println("AAAAARRRRR!!!");
				System.out.println(enemy.getName()+" defeats "+this.getName());
			}
		}
		else if (nobleStrength == enemyStrength) {
			if (nobleStrength==0 && this.isAlive() == false) {
				System.out.println("Oh, NO! They're both dead! Yuck!");
			}else {
				enemy.lostTheWar();
				this.lostTheWar();
				System.out.println("AAAAARRRRR!!!");
				System.out.println("Mutual Annihilation : "+this.getName()+" and "+enemy.getName()+" die at each other's hands");
			}
		}
	}
	public abstract double getStrength();
	public abstract void wonTheWar(double remaningStrength );
	public abstract void lostTheWar();
	public abstract String toString();
}
