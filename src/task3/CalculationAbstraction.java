package task3;

//calculation is abstract class
public abstract class CalculationAbstraction {

	// Regular method
	public void add(int a, int b) {
		int addition = a + b;
		System.out.println("addition= " + addition);
	}

	// abstract method which can extend in child class
	abstract void sub(int a, int b);

	// abstract method which can extend in child class
	abstract void mul(int a, int b);
}

class CalculationsExtends extends CalculationAbstraction {

	@Override
	void sub(int a, int b) {
		int substraction = a - b;
		System.out.println("Substraction= " + substraction);
	}

	@Override
	void mul(int a, int b) {
		int multiplication = a * b;
		System.out.println("Multiplication= " + multiplication);
	}

}