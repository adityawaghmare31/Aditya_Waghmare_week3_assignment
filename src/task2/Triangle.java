package task2;

import java.util.Scanner;

//Triangle class extends base class which is shapes
public class Triangle extends Shape {

	double base, height, area;
	Scanner sc = new Scanner(System.in);

	// Taking inputs for calculating area of Triangle
	public void parametersOfRectangle() {
		System.out.println("Formula of area of Triangle = 1/2 * base * height");
		System.out.print("base =");
		base = sc.nextDouble();
		System.out.print("height =");
		height = sc.nextDouble();
	}

	// override base class method for calculating area
	@Override
	public void calculateArea() {
		area = 0.5 * base * height;
		System.out.println("Area of Triangle is: " + area);
	}
}
