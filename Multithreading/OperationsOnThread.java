/**
 * Various Operations on Thread:	 
 *
 * 
 */


/* This class is created to understand the run()/start() methods */
class UserThread extends Thread{
	public void run() {
		
		// run() method always contains the task of the Thread
		System.out.println("This is user defined Thread.");
	}
}


public class threadOperations {
	
	public static void main(String[] args) {
		
		// Start the Program:
		System.out.println("Program Started...");
		
		
		/*******************************************************/
		int x = 19+15;
		System.out.println(x);
		
		/* To get the object of Current Thread: (using threadObject.getName() )  */
		Thread t = Thread.currentThread();
		String tName = t.getName();   // to use getName(), first create the thread object by using currentThread method. 
		System.out.println("Current running Thread: "+tName);
		
		
		/* To rename the Thread: (using setName() method )*/
		t.setName("TK_Thread");
		
		System.out.println("Printing New name: "+t.getName());
		
		
		/* thread.sleep() : to wait/sleep the thread (always use Try/Catch if using the sleep() method )  */
		try {
			Thread.sleep(2000);   // It is a static method, so don't need to call it using object.
		} catch (Exception e) {
			
		}
		
		
		/* To get the Id of the Thread: t.getId() method */
		System.out.println("Id: "+ t.getId());
		
		
		/* run() method: to store the task & start() method: which is used to run the user defined Thread */
		UserThread thread = new UserThread();
		thread.start();
		
		
		/********************************************************/
		
		// End the Program:
		System.out.println("Program Ended.");
	}
}
