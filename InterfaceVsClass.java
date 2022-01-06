


interface A {
	// In interface we cannot create methods, we only declare the method
	void show();
}

// For implementation of the method of the interface we need to create a class & implement the interface
class myClass implements A {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
}


public class InterfaceVsClass {
	public static void main(String[] args) {
		A obj; // we cannot create object of a Interface (just write them as shown)
		
		obj = new myClass();
		
		// A obj = new myClass();
		
		obj.show();
		
	}
	
}
