import java.lang.*;

/**
 * Multithreading: is a process of executing multiple threads simultaneously.
 * 
 * A thread is a lightweight sub-process, the smallest unit of process. 
 * 
 * Eg: IDM (let's say it is a process) is downloading multiple files at a same time.
 * 
 * Multiprocessing vs Multithreading:
 * -- in a OS we have various s/w like IDM, Chrome, VLC Player etc, so they are the processes and they can do their work at a same time.
 * this is called multiprocessing. And in those processes we have various tasks or thread which also are running simultaneously, this is called Multithreading.
 */

/***************************************************************************************************************/

/**
 * In Java, we can create Threads using 2 methods:
 * 
 * -- Using Runnable Interface (which has a abstract method called run(); )
 * -- Using Thread Class (which has overridden run() method and a start() method)
 * 
 */


/**
 * Some important methods of Thread class
 * 
 * -- public string getName()  -returns the name of thread
 * -- public void setName(String name)  -set the name of thread
 * -- public void run()  -contain the task of thread
 * -- public void start()  -start thread by allocating resources
 * -- public long getId()  -returns the id of thread
 * -- setPriority(p), getPriority()  -set and get the priority
 * -- sleep(), join(), interrupt(), resume(), stop(),... etc.
 * 
 *
 */


/* Creating thread using Runnable Interface */
class ThreadUsingRunnable implements Runnable{

	@Override
	public void run() {

		// Task: to print number 1 to 10
		for(int i=1;i<=10;i++) {
			System.out.println("Thread1: "+i);
			
			// to delay the thread: use sleep method in try/catch
			try {Thread.sleep(1000);} catch(Exception e) {}
		}	
	}
}


/* Creating thread using Thread class */
class ThreadUsingThread extends Thread{
	
	// run method: Thread class already have run() method, so it will extend here using Inheritance
	public void run() {
		
		// Task: to print numbers from 10 to 1
		for(int i=10;i>=1;i--) {
			System.out.println("Thread2: "+i);
			try {Thread.sleep(2000);} catch(Exception e) {}
		}
	}
}



// Main Class:
public class learnThread{

	public static void main(String[] args) {
		
		/* ***************** Creating thread using Runnable Interface ***************** */
		// Firstly we need to create the object of our class:
		ThreadUsingRunnable tur = new ThreadUsingRunnable();
		
		// Now to start the thread, we need start() method, but Runnable Interface doesnot have a start() method
		// So, for that we need Thread class bcoz it has a start() method.
		// Now pass the Reference 'tur' inside the Thread class.
		Thread thread1 = new Thread(tur);
		thread1.start();
		
		
		/* ***************** Creating thread using Thread Class ***************** */
		// as thread class already have both run() & start() methods, so no need to do referencing
		ThreadUsingThread thread2 = new ThreadUsingThread();
		thread2.start();
	}

		
}
