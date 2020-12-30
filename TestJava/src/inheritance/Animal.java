package inheritance;

public class Animal {
	private boolean alive;
	private String location;
	private String name;
	private String animalType;
	
	public Animal(String name, String animalType, boolean alive, String location) {
		this.name =name;
		this.animalType = animalType;
		this.alive=alive;
		this.location= location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void eat() {
		System.out.print("I eat food");
	}

	public void soundIMake() {
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("My name is: ");
		sb.append(name);sb.append("\n");
		sb.append("I am from the animla family type of: ");
		sb.append(animalType);sb.append("\n");
		sb.append("I live in: ");
		sb.append(location);sb.append("\n");
		return sb.toString();
	}
}
