package learn;

import java.util.*;

public class HashSetClass {

	public static void main(String[] args) {
		
		// HashSet : type of SEt :- No duplicates allowed, Order is not preserved
		
		// T.C : O(1)
		
		Set<Integer> cSet = new HashSet<>();
		
		// Add:
		cSet.add(4);
		cSet.add(6);
		cSet.add(1);
		cSet.add(2);
		cSet.add(99);
		
		cSet.add(1);
		
		System.out.println(cSet);
		
		// remove:
		cSet.remove(1);
		System.out.println(cSet);
		
		// Contains:
		System.out.println(cSet.contains(2));
		
		// IsEmpty
		System.out.println(cSet.isEmpty());
		
		// Set Size
		System.out.println(cSet.size());
		
	}
	
}
