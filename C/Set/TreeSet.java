package learn;

import java.util.*;

public class TreeSetClass {

	public static void main(String[] args) {
		
		// TreeSet : same as HashSet, but elements are stored in BST
		// T.C : O(logn)
		
		TreeSet<Integer> tSet = new TreeSet<>();
		
		tSet.add(1);
		tSet.add(22);
		tSet.add(0);
		tSet.add(999);
		
		System.out.println(tSet);
		
		
		
	}
	
}
