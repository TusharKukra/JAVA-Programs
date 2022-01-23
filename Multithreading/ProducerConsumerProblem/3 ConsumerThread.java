
public class ConsumerThread extends Thread{
		
	Company c;
	
	ConsumerThread(Company cmp){
		this.c = cmp;
	}
	
	
	public void run() {
		
		// Task: for consume_item
		while(true) {
			this.c.consume_item();
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
		
	}

	
}
