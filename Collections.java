package learn;

import java.util.*;

public class StartCode {
	
	public static void main(String[] args) {
		System.out.println("Collection Framework: ");
		
		// Two types of Collections:
		// 1. Type Safe - Same type of elements(objects) are added to collection.(eg. Array List)
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("A");
		names.add("B");
		names.add("C");
		
		System.out.println(names);
		
		// Get method (using index)
		System.out.println(names.get(0));
		
		// 2. Un-Type Safe - Different types of elements can be added to collection.
		
		LinkedList list = new LinkedList();
		list.add("A");
		list.add(123);
		list.add(12.34);
		list.add(true);
		
		System.out.println(list);
	}
}
