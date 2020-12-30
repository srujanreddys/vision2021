package inheritance;

public class Cat extends Animal {

	public Cat(String name, String animalType, boolean alive, String location) {
		super(name, animalType, alive, location);
		// TODO Auto-generated constructor stub
	}
	public void soundIMake() {
		System.out.print("Maw maw");
	}
}
