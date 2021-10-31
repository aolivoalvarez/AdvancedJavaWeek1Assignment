/* Alexis Olivo-Alvarez

INEW-2338 2801

31 OCT 2021

Write a RightTriangle class and test it in Triangle.java */

package triangleClassAssignment;

import java.util.Scanner; //to get user input

public class Triangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //user input var
		double height;
		double base;
		double area;
		double perimeter;
		
		//getting base + height from user
		
		System.out.println("Please enter triangle height: ");
		height = input.nextDouble();
		
		System.out.println("\nPlease enter triangle base: ");
		base = input.nextDouble();
		
		//triangle class creation
		
		RightTriangle triangle = new RightTriangle(base, height);
		
		//getting area and perimeter
		
		area = triangle.area();
		perimeter = triangle.perimeter();
		
		//display
		System.out.println("\nThe area of the triangle is: " + area);
		System.out.println("The perimeter of the the triangle is: " + perimeter);
		

	}

}
