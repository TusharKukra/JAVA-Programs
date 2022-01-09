package learn;

import java.util.*;

public class HashSetClass {

	public static void main(String[] args) {
		
		// HashSet : type of SEt :- No duplicates allowed, Order is not preserved
		
		// T.C : O(1)
		
		Set<Integer> chahatSet = new HashSet<>();
		
		// Add:
		chahatSet.add(4);
		chahatSet.add(6);
		chahatSet.add(1);
		chahatSet.add(2);
		chahatSet.add(99);
		
		chahatSet.add(1);
		
		System.out.println(chahatSet);
		
		// remove:
		chahatSet.remove(1);
		System.out.println(chahatSet);
		
		// Contains:
		System.out.println(chahatSet.contains(2));
		
		// IsEmpty
		System.out.println(chahatSet.isEmpty());
		
		// Set Size
		System.out.println(chahatSet.size());
		
	}
	
}
