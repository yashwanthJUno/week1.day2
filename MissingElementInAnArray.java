package week1.day2;

import java.util.Arrays;


public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(arr);
		// Sort the array

		for (int i = 0; i < arr.length; i++) {
			int missNo = i + 1;
			if (arr[i] != missNo) {
				System.out.println("Missing Number is " + missNo);
				break;
			}
		}
		
		// loop through the array (start i from arr[0] till the length of the array)

			// check if the iterator variable is not equal to the array values respectively
			
				// print the number
				
				// once printed break the iteration

	}

}
