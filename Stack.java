package learn;

import java.util.*;

public class StackCollection {
	
	// Based on Last-In First-Out Principle
	
	public static void main(String[] args) {
		
		Stack<String> animals = new Stack<>();
		
		animals.push("Tiger");
		animals.push("Lion");
		animals.push("Zebra");
		animals.push("Elephant");
		
		System.out.println("Stack: "+animals);
		
		// Peek: To check which is the topmost element (the last element entered will be on the top)
		System.out.println("Peek: "+animals.peek());
		
		// Pop: to remove/delete element of top most position
		animals.pop();
		System.out.println("After Pop: "+animals);
		
		// Iterator: for traversal
		
		// for each loop
		for(String str: animals) {
			System.out.println(str);
		}
		
		// forEach method
		animals.forEach(e->{
			System.out.println(e);
		});
		
	}
	
}
