package learn;

import java.util.*;

public class PriorityQueueCollection {
		
	public static void main(String[] args) {
		
		// Priority Queue : 
		Queue<Integer> pq = new PriorityQueue<>();  //Min Heap
		
		// Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());  //Max Heap
		
		// add / offer elements:
		pq.add(10);
		pq.offer(1);
		pq.offer(4);
		
		System.out.println(pq);
		
		// poll() : gives use priority element
		pq.poll();
		System.out.println("After poping : "+pq);
		
		System.out.println("Peek: "+pq.peek());
		
		
		// Iterator:
		Iterator<Integer> itr = pq.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
	}
}
