package searching;
// Simple searching algorithm check from the first element keep continue searching until the target element is found.
// also known as sequential search
public class LinearSearch {

	public static int search(int[] arr, int target) {
        // iterate over the array and compare each element with the target
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // target found at index i
            }
        }
        return -1; // target not found in the array
    }

    // Testing the implementation
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 4, 2, 7, 1, 9 };
        int target = 14;
        int index = search(arr, target);
        if (index == -1) {
            System.out.println(target + " not found in the array");
        } else {
            System.out.println(target + " found at index " + index);
        }
    }

}