package basic;

/**
 * Abstraction: it is also called Data-hiding but it is not done for the security reasons, but
 * 				it is done to reduce the complexity of the code.
 * 
 * OR: It is a process of hiding the implementation details and showing only functionality to the user.
 * 
 * Example: sending SMS where you type the text and send the message. You don't know the internal processing about the message delivery.
 *
 * Ways to achieve Abstraction: using Abstract class (0-100%), or by using Interface(100%).
 */


abstract class Car{
	
	int price;
	
	abstract void start();  // when we create a method: abstract, then we dont have to implement it in the abstract class.
	
	void breakCar() {
		System.out.println("Breaking");
	}
}


class Audi extends Car{
	
	// here we can implement the above un-implemented method
	void start() {
		System.out.println("Starting Audi Car");
	}
}


class BMW extends Car{
	
	void start() {
		System.out.println("Starting BMW Car");
	}
}


public class AbstractionClass {

	public static void main(String[] args) {
			
		// in the main class we can only call the children of the abstract class (not the abstract class)
		Audi a1 = new Audi();
		a1.start();
		a1.breakCar();
		
		BMW b1 = new BMW();
		b1.start();
		b1.breakCar();
		
	}
	
}
