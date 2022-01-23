package com.tk.learnThread;

/**
 * Producer Consumer Problem:  (here we will study about Synchronized, Inter-thread communication
 * 
 * Let's assume a company X, X have 2 machines: produce_item() & consume_item()
 * produce_item() will produce the data & consume_item will consume the item.
 * For both these machines we have 2 employees: producerThread will work on produce_item , consumerThread will work on consumer_item.
 * 
 * producerThread will produce the product & consumerThread will consume the thread.
 * 
 * Producer produce 1 item and it will store into Buffer Storage 1 at a time, and producer will not able to create 2nd item till the 1st item (which is in Buffer) did not get consumed.
 *
 * And after the consumer consumes the 1st data, producer immediately produce the new data & store in Buffer and this process will go on Synchronously
 * 
 * So for doing these, we have to synchronize both the machines (methods). [Synchronized here means : one thread at a time]
 * 
 */


/* First create company class & in that create 2 methods: produce/consume_items */
class Company1{
	
	int n;  // create a random variable & if it takes value then producer works & if the method returns the value then consumes work.
	
	// To make methods synchronized, use synchronized keyword.
	
	synchronized public void produce_item(int n) {
		this.n = n;
		System.out.println("Produced: "+this.n);
	}
	
	synchronized public int consume_item() {
		
		System.out.println("Consumed: "+this.n);	
		return this.n;	
	}
	
	
}



public class ProducerConsumerProblem {

}
