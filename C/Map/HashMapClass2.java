package learn;

import java.util.*;
import java.util.Map.Entry;

public class MapClass {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "C");
		map.put(2, "T");
		
//		map.put(1, "T");
//		map.put(1, "CT");
		
		map.putIfAbsent(1, "T");  // If key:1 is not present then print this
		System.out.println(map);
		
		
		// Contains: used to check for a particular Value/Key
		System.out.println(map.containsValue("T1"));
		System.out.println(map.containsKey(1));
		
		map.remove(1);
		System.out.println(map);
		
		// isEmpty, clear
		
		// Iterate : forEach loop
		
		for(Entry<Integer, String> mp : map.entrySet()) {
			System.out.println(mp);
		}
		
		// Iterate only Keys
		for(Integer k : map.keySet()) {
			System.out.println(k);
		}
		
		// Iterate only Value
				for(String v : map.values()) {
					System.out.println(v);
				}
		
		
	}
}
