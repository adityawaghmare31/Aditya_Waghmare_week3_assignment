package task2;

import java.util.Scanner;

//Rectangle class extends base class which is shapes
public class Rectangle extends Shape {

	double Length, Width,Area;
	Scanner sc=new Scanner(System.in);
	
	// Taking inputs for calculating area of rectangle
	public void parametersOfRectangle() {
		System.out.println("Formula of area of Rectangle = length * width");
		System.out.print("length =");
		Length = sc.nextDouble();
		System.out.print("Width =");
		Width = sc.nextDouble();
	}
	//override base class method for calculating area
	@Override
	public void calculateArea() {
		Area=Length * Width;
		System.out.println("Area of Rectangle is: "+Area);
	}
}
