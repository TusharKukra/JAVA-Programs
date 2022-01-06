package learn;



import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListCollection {
	
	public static void main(String[] args) {
		
		
		// Array List
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println("ArrayList: "+list);
		
		/* Adding element on a particular position */
		list.add(1, 5);
		System.out.println("ArrayList after adding 5 on 1 index: "+list);
		
		
		/* Adding new List into the previous List */
		List<Integer> newList = new ArrayList<>();
		newList.add(6);
		newList.add(7);
		
		// now add previous list into new one (using addAll method)
		list.addAll(newList);
		
		System.out.println("List after adding new elements of another list: "+list);
		
		
		// Get List element
		System.out.println("Element at index 2: "+list.get(2));
		  
		// Remove element by their index
		list.remove(1);
		System.out.println("List after removing element of index 1: "+list);
		
		// Remove method by the value of element (method overloading)
		list.remove(Integer.valueOf(7));
		System.out.println("List after removing element by its value 7: "+list);
		
		// Remove whole List
		// list.clear();
		// System.out.println("List after using clear fxn: "+list);
		
		// Set fxn: to update value on any position
		list.set(1, 111);
		System.out.println("List after using Set fxn: "+list);
		
		// Contains function
		System.out.println("Checking element 4: "+list.contains(4));
		
		
		/* Methods for iteration: */
		
		// for loop
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		// forEach loop
		for (Integer forEachList : list) {
			System.out.println(forEachList);
		}
		
		// Iterator
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
