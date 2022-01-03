package learn;

import java.util.*;
import java.io.*;

public class TraverseExample {
	
	public static void main(String[] args) {
		
		// There are several methods for traversal of any type of collection:
		// i.e : ListIterator, Enumeration, forEach method, for each loop.
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Tata");
		names.add("Tesla");
		names.add("Volkswagen");
		names.add("Mercedes");
		
		
		/* traversing using forEach loop */
		for(String str: names) {
			
			System.out.println("ArrayList (forEach): "+str + " "+ str.length());
			
			// To print in reverse
			StringBuffer sb = new StringBuffer(str);
			System.out.println(sb.reverse());
		}
		
		System.out.println("----------------------------------");
		
		
		/* traversing using Iterator: (forward traversing) */
		Iterator<String> itr = names.iterator();
		
		while(itr.hasNext()) {
			
			// if we have next element in our list then it will print that element
			String next = itr.next();
			System.out.println(next);
		}
		
		
		System.out.println("----------------------------------");
		
		
		/* traversing using ListIterator (backward traversing) */
		ListIterator<String> litr = names.listIterator(names.size());
		
		// here we write names.size(), just to point the cursor on the last element, so that we can traverse backward from the last element
		
		while(litr.hasPrevious()) {
			
			// As the ListIterator is used for Backward traversing, so we are checking whether we have previous element or not
			String prev = litr.previous();
			System.out.println(prev);
		}
		
		System.out.println("----------------------------------");
		
		
		/* forEach method (feature of Java8) Lambda Function*/
		names.forEach(e->{
			System.out.println(e);
		});
		
		
		System.out.println("----------------Enumeration------------------");
		// Enum can only be done on Vector
		
		
		
		// Sorting of Elements
		System.out.println("Sorting of Elements: ");
		TreeSet<String> set = new TreeSet<>();
		set.addAll(names);
		
		// Traversing using forEach
		set.forEach(e->{
			System.out.println(e);
		});
	}
}
