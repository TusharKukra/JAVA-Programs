package learn;

import java.util.*;

public class LinkedListCollection {
	
	// Implemented by both : List & Queue Interface
	
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		
		// add / offer: Add elements used in Queue, but in List: only use add
		queue.add(1);  // add
		queue.offer(2);
		queue.offer(4);
		
		System.out.println(queue);
		
		queue.poll();
		System.out.println(queue);
		
		System.out.println(queue.peek());
		
		
		// Iterator
		
		Iterator<Integer> chahat = queue.iterator();
		while(chahat.hasNext()) {
			System.out.println(chahat.next());
		}
		
		
	}
}
