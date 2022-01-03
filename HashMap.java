package learn;

import java.util.*;

public class Map {

		
	public static void main(String[] args) {
		
		// HashMap
		HashMap<String, Integer> hm = new HashMap<>();
		
		// adding Elements
		hm.put("ABC", 1);
		hm.put("XYZ", 2);
		hm.put("GHI", 3);
		hm.put("LMN", 4);
		
		hm.put("LMN", 4); // Duplicates are not allowed in HashMap
		
		System.out.println("HashMap: " + hm);
		
		
		// forEach method (Lambda Fxn)
		
		hm.forEach((key,value)->{
			System.out.println(key+" -> "+value);
		});
		
	}
}
