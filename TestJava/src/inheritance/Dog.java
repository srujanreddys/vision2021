package inheritance;

public class Dog extends Animal {

	public Dog(String name, String animalType, boolean alive, String location) {
		super(name, animalType, alive, location);
		// TODO Auto-generated constructor stub
	}
	public void soundIMake() {
		System.out.print("Bow Bow");
	}
	
}
