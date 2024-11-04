package task3;

//this is main method will give output
public class OutputOfAbstractionAndInterface {
	public static void main(String[] args) {

		
		CalculationsExtends calculationsExtends=new CalculationsExtends(); // created object of calculation Extends class
		CalculationImplements calculationImplements=new CalculationImplements(); // created object of calculation Implement interface
		
		System.out.println("Abstraction");
		System.out.println();
		calculationsExtends.add(12, 54);
		calculationsExtends.sub(120, 50);
		calculationsExtends.mul(12, 9);
		
		System.out.println();
		System.out.println("Interface");
		System.out.println();
		calculationImplements.add(24, 55);
		calculationImplements.sub(51, 20);
		calculationImplements.mul(17, 8);
	}
}
