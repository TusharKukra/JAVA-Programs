import java.util.*;

public class CollectionsClass {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(5);
		list.add(1);
		list.add(99);
		list.add(88);
		list.add(99);
		
		/* Min Element */
		System.out.println("Min element: "+Collections.min(list));
		
		/* Max Element */
		System.out.println("Max element: "+Collections.max(list));
		
		/* Frequency of a Element */ 
		System.out.println("Frequency of 99: "+Collections.frequency(list, 99));
		
		/* To sort a Collection */
		Collections.sort(list);
		System.out.println("After sorting: "+list);
		
		/* To sort descending order, add a comparator */
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println("After sorting in descending order: "+list);
		
	}
}
