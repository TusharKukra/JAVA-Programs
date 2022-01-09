package basic;

/* Encapsulation: Data Hiding for security purpose
 * 
 * To keep methods and variables together in a class
 * So that nobody can access/modify them directly
 *  
 *  It will not be visible to the user how the class is storing values in the variables
 *  
 *  The user will only know that we are passing the values to a setter method & variables are getting initialized with that value
 *   
 * */

class Company{
	
	// String name;
	int numberEmployees;
	
	// protected String name; --- if we do the name variable protected, then it will be accessible only in the parent class (own class, in which the variable is defined) and the children of the parent class
	
	// if we do private String name; then it will be only accessible in the parent class not in any other class
	// so to make it accessible we have to generate its Getters & Setters
	
	private String name;

	
	// Getter & Setter of name Variable
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	// Method
	void printCompany() {
		System.out.println("Name: "+this.name+", "+"No. Employees: "+this.numberEmployees);
	}
	
}

public class EncapsulationClass {

	public static void main(String[] args) {
		
		Company cmp = new Company();
		
		cmp.numberEmployees = 100;
		
		// to set the value of the name variable we have to call the setter method
		cmp.setName("Nagarro");
		
		cmp.printCompany();
		
	}
	
}
