/*  Q4. Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim()'
        takes length and breadth of rectangle as parameters and the second method named as 'getArea()' returns the area of the rectangle. Length and
        breadth of rectangle are entered through keyboard. [use ‘this’ keyword]
*/

import java.util.Scanner;

class Area {
	private double length, breadth;
	
	public void setDim(double length, double breadth) {
		validate(length, "length");
		validate(breadth, "breadth");
		this.length = length;
		this.breadth = breadth;
	}
	
	public double getArea() {
		return length*breadth;
	}
	public static void validate(double value, String name) {
		if(value<=0){
			System.out.println(name+ " can only be positive");
			System.exit(0);
		}
	}
}

class Main {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		Area area = new Area();
		System.out.print("Enter the length of the rectangle: ");
		double length = sc.nextDouble();
		System.out.print("Enter the breadth of the rectangle: ");
		double breadth = sc.nextDouble();
		area.setDim(length,breadth);
		System.out.println("The area of the rectangle is: " +area.getArea());
	}
}
		
		