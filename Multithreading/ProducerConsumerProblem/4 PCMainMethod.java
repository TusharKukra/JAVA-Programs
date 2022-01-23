
public class ProducerConsumerMain {

	public static void main(String[] args) {
		
		// Create objects for Company and ProcuderThread/ConsumerThread Class
		
		Company cmpny = new Company();
		ProducerThread pt = new ProducerThread(cmpny);
		ConsumerThread ct = new ConsumerThread(cmpny);
		
		// Calling both objects:
		pt.start();
		ct.start();
		
	}
}
