package task3;

//calculation is Interface
public interface CalculationInterface {

	// In Interface Method does not have body
	
	// abstract method which can extend in child class
	public void add(int a, int b);

	// abstract method which can extend in child class

	abstract void sub(int a, int b);

	// abstract method which can extend in child class
	abstract void mul(int a, int b);

}

class CalculationImplements implements CalculationInterface {

	// Override add method
	@Override
	public void add(int a, int b) {
		int addition = a + b;
		System.out.println("Addition= " + addition);
	}

	// Override sub method
	@Override
	public void sub(int a, int b) {
		int substraction = a - b;
		System.out.println("Substraction= " + substraction);
	}

	// Override mul method
	@Override
	public void mul(int a, int b) {
		int multiplication = a * b;
		System.out.println("Multiplication= " + multiplication);
	}

}
