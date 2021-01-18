package Assignment3;

import java.util.ArrayList;


public class Car {
	private int numberOfWheels;
	private int countOfWheels;
	private Engine carEngine;
	private ArrayList<Wheel> carWheel=new ArrayList<Wheel>(countOfWheels);

	public Engine getCarEngine() {
		return carEngine;
	} 
	public void setCarEngine(Engine carEngine) {
		this.carEngine = carEngine;
	}
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	/**
	 * it will create the engine and wheels for the car when you call this Constructor 
	 * and also stores the engine address and carEngine ,Wheels address in ArrayList
	 * @param Enginetype		type of the Engine
	 * @param horsepower		horsepower of the Engine
	 * @param wheelRadius		radius of the Wheel
	 * @param numberofWheels	number of Wheels
	 * @param brand				brand of the Wheel
	 */
	public Car(String Enginetype, double horsepower,double wheelRadius, int numberofWheels, String brand) {
		this.numberOfWheels = numberofWheels;
		this.countOfWheels=numberofWheels;
		this.carEngine = new Engine(Enginetype, horsepower);
		for (int i = 0; i < numberofWheels; i++) {
			this.carWheel.add(new Wheel(brand, wheelRadius));
		}
	}
	/**
	 * removes the Engine from the car 
	 * if there is a engine 
	 */
	public void removeEngine() {
		if (getCarEngine()!= null) {
			setCarEngine(null);
		//	getCarEngine().setEnginetype(null);
		//	getCarEngine().setHorsepower(0);
			System.out.println("Engine as been removed");
		}else {
			System.out.println("Engine can't be removed");
		}
	}
	
	public void changeEngine(Car carEngine) {
		if (carEngine != null) {
			setCarEngine(carEngine.getCarEngine());
		System.out.println("Car engine as changed");
		}else {
			System.out.println("Car engine can't be changed");
		}
	}
	/**
	 * it will add new engine to the car if there is no engine 
	 * @param Enginetype	type of the Engine
	 * @param horsepower	hoursepower of the Engine
	 */
	public void addEngine(String Enginetype, double horsepower) {
		if (getCarEngine()==null) {
			this.carEngine = new Engine(Enginetype, horsepower);
			System.out.println("New engine as been added");
		}else {
			System.out.println("Engine can't be added");
		}
	}
	/**
	 * it will remove the Wheel from the car 
	 * if there is a wheel 
	 * @param numberofWheel		which wheel should have to be removed 
	 */
	public void removeWheel(int numberofWheel) {
		if (carWheel.size() >= numberofWheel && numberofWheel >0 && carWheel.get(numberofWheel-1) != null) {
				this.carWheel.set(numberofWheel-1, null);
				setNumberOfWheels(getNumberOfWheels()-1);
				System.out.println("Wheel position  "+numberofWheel+" as been removed");
		}else {
			System.out.println("Wheel doesn't exist to remove");
		}
	}
	/**
	 * it will added new Wheel to the car 
	 * if there is no wheel 
	 * @param numberofWheel		which wheel should have to be added
	 * @param brand				brand of the Wheel
	 * @param wheelRadius		radius of the Wheel
	 */
	public void addWheel(int numberofWheel, String brand ,double wheelRadius) {
		if (carWheel.size() >=numberofWheel && numberofWheel >0 && carWheel.get(numberofWheel-1) == null) {
				this.carWheel.set(numberofWheel-1, new Wheel(brand, wheelRadius));
				System.out.println("New wheel as been added at position  "+numberofWheel);
		}else {
			System.out.println("Wheel can't be added");
		}
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Engine details of the car \n Engine type : "+carEngine.getEnginetype()+"\n Hoursepower : "+carEngine.getHorsepower());
		sb.append("\n\nWheel details of the car \n");
		sb.append(" Number of wheels : "+carWheel.size());
		for (int i = 0; i < carWheel.size(); i++) {
			sb.append("\n Wheel brand : "+carWheel.get(i).getBrand());
			sb.append("\n Wheel radius : "+carWheel.get(i).getRadius()+"\n");
		}
		return sb.toString();		
	}
}
