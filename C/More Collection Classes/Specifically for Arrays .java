
import java.util.Arrays;

public class ArraysClass {
	
	public static void main(String[] args) {
		// Arrays Class : contains several methods, which can be performed over Primitive Array
		
		/**********************************************************************/
		/* Arrays.binarySearch*/
		
		// Sorted array for Binary Search
		int[] num = {1,2,3,4,5,6,7,8,9};
		
		// BinarySearch Method is used to perform Binary Search Operation (it takes: (arrayName, keyValueYouWantToFind)
		int index = Arrays.binarySearch(num, 3);
		
		// It will return the index at which the key is present
		System.out.println(index);
		
		
		/**********************************************************************/
		
		/* Arrrays.sort */
		int[] number = {1,4,2,5,7,9,7,5,3};
		Arrays.sort(number);
		
		// now iterate it to print: forEach loop
		for(int i: number) {
			System.out.print(i+" ");
		}
		
		/**********************************************************************/
		System.out.println("");
		
		/* Arrays.fill : to fill a particular value in whole array */
		Arrays.fill(number, 2);
		for(int i : number) {
			System.out.print(i+" ");
		}
	}
}
