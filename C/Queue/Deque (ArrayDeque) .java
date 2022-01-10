package learn;

import java.util.*;

public class DequeCollection {
	
	public static void main(String[] args) {
		
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		
		dq.offer(1);
		dq.offer(10);
		dq.offer(3);
		
		System.out.println(dq);
		
		dq.pollLast();
		// dq.poll();
		System.out.println(dq);
		
		// dq.peekFirst, Last
		// dq.offerFirst, Last
		
	}
}
