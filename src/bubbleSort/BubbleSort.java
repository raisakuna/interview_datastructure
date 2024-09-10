// Time Complexity O(n^2)
// To optimize the Bubble Sort algorithm and avoid unnecessary comparisons with already sorted elements, 
// you can introduce a flag to check whether any swaps were made in a pass.
// If no swaps are made in a pass, 
// it means the array is already sorted, and you can break out of the loop.
package bubbleSort;
// To optimize the bubble sort algorithm and avoid unnecessary comparisons to check with already sorted elements.
// we can introduce a flag to whether any swaps are made in a past.

public class BubbleSort {
	public static void print(int [] arr) {
		/*
		 * for(int i =0; i <arr.length;i++) {
		 *  System.out.print(arr[i] + " "); }
		 */
		for (int value: arr) {
			System.out.print(value + " ");
		}
	}
	
	public static void main(String[] args) {
	int [] arr = {4,7,3,77,22,1,6};
	
	// Outer loop for the number of passes through the array
	for(int i = 0; i<arr.length; i++) {
		int flag =0; // Flag to determine if any swaps were made during the pass
		 for (int j = 0; j <arr.length -1-i ; j++) {
			 // swap elements if they are in teh wrong order
			if( arr[j] > arr[j+1]) {
				int temp =  arr[j];
				arr[j] = arr[j+1];
				arr[j+1] =  temp;
				flag =  1; // Set flag to 1 indicating a swap was made
			}
		 }
		 
		 // if no swaps were made during the pass, the array is already sorted
		 if (flag == 0) {
			 break;
		 }
		 	// Print the sorted array
	}			print(arr);

	}

}
