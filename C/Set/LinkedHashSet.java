package learn;

import java.util.*;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		
		// LinkedHashSet: functions/methods are same as HashSet, duplicates not allowed and Order preserved
		
		Set<Integer> set = new LinkedHashSet<>();
		
		set.add(1);
		set.add(0);
		set.add(8);
		set.add(6);
		
		set.add(1);
		
		System.out.println(set);
		
	}
	
}
