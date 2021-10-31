package triangleClassAssignment;

public class RightTriangle {

	double base; //base of triangle
	double height; //height of triangle
	
	public RightTriangle(double b, double h) { //constructor that takes base and height arguments
		base = b;
		height = h;
	}
	
	public RightTriangle() { //constructor that takes no arguments and sets base and height to zero
		base = 0.0;
		height = 0.0;
	}
	
	public void setBase(double b) { // sets base
		base = b;
	}
	
	public double getBase() { // returns base
		return base;
	}
	
	public void setHeight(double h) { //sets height
		height = h;
	}
	
	public double getHeight() { // returns height
		return height;
	}
	
	public double area() { // calculates area
		return (base * height) / 2;
	}
	
	public double perimeter() { //calculates perimeter
		double hypotenuse = Math.sqrt((base * base) + (height * height)); // calculates hypotenuse
		return hypotenuse + height + base;
	}
}
