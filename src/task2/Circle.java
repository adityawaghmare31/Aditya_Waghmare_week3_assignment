package task2;

import java.util.Scanner;

//Circle class is extend shape class
public class Circle extends Shape{
	double r;
	double Area;
	Scanner sc=new Scanner(System.in);
	
	// Taking inputs for calculating area of circle
	public void parametersOfCircle() {
		System.out.println("Formula of area of circle = π * r(square)");
		System.out.print("Radius =");
		r=sc.nextDouble();
	}
	//override base class method for calculating area
	@Override
	public void calculateArea() {
		Area=Math.PI*Math.pow(r, 2);
		System.out.println("Area of Cirle is: "+Area);
		
	}
	
}
