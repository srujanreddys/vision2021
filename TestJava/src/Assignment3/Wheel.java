package Assignment3;

public class Wheel {
	private String brand;
	private double radius;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Wheel(String brand, double radius) {
		this.brand = brand;
		this.radius = radius;
	}
	/*
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Wheel details  \n");
		sb.append(" Brand : "+this.getBrand());
		sb.append("\n Radius : "+this.getRadius());
		return sb.toString();		
	}*/
}
