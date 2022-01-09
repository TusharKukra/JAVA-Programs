package basic;


/**
 * Polymorphism: the ability of a message to be displayed in more than one form.
 * 
 * Types of Polymorphism: CompileTime(Operator Overloading) and RunTime (Operator Overriding --only in Inheritance)
 * 
 * Polymorphism allows you to define one interface and have multiple implementations.
 *
 */

class CalculateArea{
	
	// Method 1: Area of Square
	void area(int side) {
		System.out.println("Area: "+(side*side));
	}
	
	// Method 2: Area of Rectangle
	void area(int length, int breadth) {
		System.out.println("Area: "+(length*breadth));
	}
	
}

public class PolymorphismClass {

	public static void main(String[] args) {
		
		CalculateArea cal = new CalculateArea();
		
		cal.area(4);
		
		cal.area(2,4);
		
	}
}
