package Assignment3;

public class Engine {
	
	private String enginetype;
	private double horsepower;
	

	public String getEnginetype() {
		return enginetype;
	}
	public void setEnginetype(String enginetype) {
		this.enginetype = enginetype;
	} 
	public double getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(double horsepower) {
		this.horsepower = horsepower;
	}
	public Engine(String type, double horsepower) {
		this.enginetype = type;
		this.horsepower = horsepower;
	}
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append("Engine details  \n  Type : "+this.getEnginetype()+"\n Hoursepower : "+this.getHorsepower());
		return sb.toString();
	}
}
