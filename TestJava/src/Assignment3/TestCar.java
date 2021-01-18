package Assignment3;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Ford = new Car(" V6 ", 240, 0.4, 2, " MRF ");
		System.out.println(Ford);
		Ford.removeWheel(2);
		Ford.removeWheel(2);
		Ford.removeWheel(3);
		Ford.addWheel(2, "Pollo", 0.5);
		Ford.addWheel(2, "MRF", 0.5);
		Ford.addWheel(3, "pollo", 0.6);
		Ford.removeEngine();
		Ford.removeEngine();
		Ford.addEngine("V5", 400);
		Ford.addEngine("V6", 450);
		System.out.println(Ford);
	}
}
