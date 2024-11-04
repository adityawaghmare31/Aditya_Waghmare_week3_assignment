package task1;

public class VehicalDetails {

	public static void main(String[] args) {
		Vehical vehical = new Vehical();
		Car car = new Car();
		Bike bike = new Bike();

		car.Details("TATA", "Curve", 1499, "6 speed Manual Transmission");
		bike.Details("Hero", "Karizma", 225, "5 speed Transmission");

		vehical.display();
		System.out.println();
		car.display();
		System.out.println();
		bike.display();
	}

}
