package task2;

public class OutputOfArea {

	public static void main(String[] args) {
		Circle circle=new Circle();
		Rectangle rectangle=new Rectangle();
		Triangle triangle=new Triangle();
		
		circle.parametersOfCircle();
		System.out.println();
		rectangle.parametersOfRectangle();
		System.out.println();
		triangle.parametersOfRectangle();
		
		circle.calculateArea();
		System.out.println();
		rectangle.calculateArea();
		System.out.println();
		triangle.calculateArea();
	}

}
