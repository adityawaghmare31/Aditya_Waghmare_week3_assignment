package task1;

//bike class is Derived class which extend Vehical class which is base class
public class Bike extends Vehical {

	// detail method takes parameter like maker, model engine specification,
	// transmission
	public void Details(String BikeMaker, String model, int engine, String transmission) {
		VehicalMaker = BikeMaker;
		Model = model;
		Engine = engine;
		Transmission = transmission;
	}

	// display cars specification
	//override display method
	@Override
	public void display() {
		System.out.println("Car Maker= " + VehicalMaker);
		System.out.println("Model= " + Model);
		System.out.println("Engine= " + Engine + "cc");
		System.out.println("Transmission= " + Transmission);

	}
}
