package inheritance;

import java.util.ArrayList;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal3 = new Animal("tom","Cat",true, "House");
		Cat animal1 = new Cat("tom","Cat",true, "House");
		Dog animal2 = new Dog("jerrry","Dog",true, "House");
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(animal1);animalList.add(animal2);
		;animalList.add(animal3);
		for(Animal a: animalList) {
			a.soundIMake();
		}
		

	}

}
