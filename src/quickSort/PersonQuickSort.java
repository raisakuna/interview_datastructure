package quickSort;

public class PersonQuickSort {
	
// This method is used to sort the array of objects
 public static void quicksort(Object[] arr, int low, int high) {
	if(low < high) {
		//Partition the array
		int pivotIndex =  partition(arr,low,high);
		// sort the left subarray
		quicksort(arr, low, pivotIndex-1);
		// Sort the right subarray
		quicksort(arr, pivotIndex +1, high);
	}
 }
 
 public static int partition(Object[] arr, int low, int high) {
		// choose the pivot element (last element)
		Object pivot = arr[high];
		//index of smaller element
		int i = low -1;
		for(int j = low; j<high; j++) {
			// if current element is smaller than or equal to pivot
			if (((Comparable)arr[j]).compareTo(pivot) < 0) {
			// Increment index of smaller element
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, high);
		return (i+1);
		
	}


public static void swap(Object[] arr, int i, int j) {
	Object temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}
	public static void main(String[] args) {
		// Sample array of objects to be sorted
        Person[] people = new Person[]{
            new Person("John", 25),
            new Person("Sarah", 32),
            new Person("Adam", 18),
            new Person("Ava", 30),
            new Person("Michael", 22),
            new Person("Emily", 27)
        };

        // Printing the unsorted array
        System.out.println("Unsorted array:");
        for (Person person : people) {
            System.out.println(person);
        }

        // Sorting the array using Quick Sort
        PersonQuickSort.quicksort(people, 0, people.length - 1);

        // Printing the sorted array
        System.out.println("\nSorted array:");
        for (Person person : people) {
            System.out.println(person);
        }
	}

}
