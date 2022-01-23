
public class ProducerThread extends Thread{
	
	// Here we use Producer/Consumer methods.
	
	// first create their class object.
	Company c;
	
	//Create a constructor of ProducerThread class (it will take cmp value & put it into company)
	ProducerThread(Company cmp){
		this.c = cmp;
	}
	
	public void run() {
		
		// Task: for producer
		
		int i=1;
		while(true) {
			this.c.produce_item(i);
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
			
			i++;
		}
	}
}
