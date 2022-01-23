
/**
 * 
 * Here we will use Inter-connection Method:
 * 
 * We take a boolean value f = false;
 * 
 * if f = false, so producer will produce and till then consumer will wait and vice-versa.
 * 
 * if f = false, then only producer will work, not the consumer.
 * 
 * and after producing, producer change the value of f to true and notify the company that its job is done (using notify() method)
 * 
 * 
 * 
 * if f = true, so consumer will consume and producer have to wait till consumer consume and changes f to false and notify that its job is done.
 * 
 */


	/* First create company class & in that create 2 methods: produce/consume_items */
	class Company{
		
		int n;
		
		boolean f = false;
		
		synchronized public void produce_item(int n) {
			
			/***************************************/
			if(f) {
				// if f = true then consumer have to consume, so wait
				try {
					wait();
				} catch (Exception e) {}
			}
			
			/***************************************/
			
			this.n = n;
			System.out.println("Produced: "+this.n);
			
			/***************************************/
			
			// now change the value of f to true and notify:
			f = true;
			notify();
			
			/***************************************/
			
		}
		
		synchronized public int consume_item() {
			
			/***************************************/
			if(!f) {
				// if f = false, consumer have to wait
				try { wait();} catch(Exception e) {}
			}
			
			/***************************************/ 
			
			System.out.println("Consumed: "+this.n);	
			f = false;
			notify();
			return this.n;
			
			/***************************************/
				
		}
	}
	
	
		public class ProducerConsumerInterThreadComm {

	}

