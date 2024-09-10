// time complexity: Olog(n)
// pivot and Partition as a last element
package quickSort;

public class QuickSort {
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static int partition(int[] arr, int low, int high) {
		// choose the pivot element (last element)
		int pivot = arr[high];
		//index of smaller element
		int i = low -1;
		for(int j = low; j<high; j++) {
			// if current element is smaller than or equal to pivot
			if (arr[j] <= pivot) {
			// Increment index of smaller element
				i++;
				swap(arr, i, j);
			}		}
		swap(arr, i+1, high);
		return (i+1);
		
	}
	public static void quicksort(int[] arr, int low, int high) {
		if(low < high) {
			//Partition the array
			int pivotIndex =  partition(arr,low,high);
			// sort the left subarray
			quicksort(arr, low, pivotIndex-1);
			// Sort the right subarray
			quicksort(arr, pivotIndex +1, high);
		}	
	}
	public static void main(String[] args) {
	    
	        int[] arr = { 10, 7, 8, 9, 1, 5 };
	        int N = arr.length;
	 
	        // Function call
	        quicksort(arr, 0, N - 1);
	        System.out.println("Sorted array:");
	        for (int i = 0; i < N; i++)
	            System.out.print(arr[i] + " ");	    
	}
}
