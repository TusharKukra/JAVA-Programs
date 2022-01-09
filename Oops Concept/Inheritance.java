package basic;

/* Parent Class */
class Animal{

	String name;
	String breed;
	
	// Constructor (Parameterized)
	public Animal(String animalName, String animalBreed) {
		this.name = animalName;
		this.breed = animalBreed; 
	}
	
	// Methods in Animal Class
	void walk() {
		System.out.println("Walking");
	}
}

// Child Classes:
class Tiger extends Animal{

	public Tiger(String animalName, String animalBreed) {
		super(animalName, animalBreed);  // Super keyword is used to call the Parent class Method/Variable
	}
	
	// To study Runtime Polymorphism, create walk() method again
	void walk() {
		System.out.println("Tiger is Walking");
	}
	
}


public class InheritanceClass {
	
	public static void main(String[] args) {
		
		Tiger t1 = new Tiger("Tiger", "Cat");
		t1.walk();  // It will call walk() method from child class first, if walk() is not present in the Child Class, then it will go to the parent class
		
	}
	
}
