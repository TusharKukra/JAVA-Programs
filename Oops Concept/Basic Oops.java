package basic;


//The class remains as it is in the Memory till we create any of its objects
//Class is like a Blueprint, and with the help of objects of those class we can build anything
class Person{
	String name;
	int age;
	
	static int number = 4; // when we define a variable, static variable then we dont need to call it using object
	
	// In a class we have properties : like above two variables
	// And we have behaviors (methods)
	void walk(){
		System.out.println("Walk");
	}
	
	void eat() {
		System.out.println("Eat");
	}
	 
	// Polymorphism (multiple forms) - This is compile time polymorphism
	void walk(int steps) {
		System.out.println("Walked steps: "+steps);
	}
	
}


public class OopsClass {
	
	// we have only 1 public class in .java file
	public static void main(String[] args) {
		
		// Object of Class person
		Person p1 = new Person();
		p1.age = 99;
		p1.name = "ABC";
		
		System.out.println(p1.age+" "+p1.name);
		
		// To access Methods:
		p1.eat();
		p1.walk();
		p1.walk(4); // Polymorphism
		
		System.out.println("Static Variable called direct by using Class Name: "+Person.number);
	}
}

