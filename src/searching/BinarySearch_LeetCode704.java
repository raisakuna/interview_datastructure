package searching;

// time complexity O(log n)
// it must be sorted
// always find the mid index (low + (high - low)/2)
// Check if the mid index value is equal to the target value, then return true
// else if the target value is less than mid then search between left (0) to mid
// and if the target value is more than mid value then search between (mid+1) and right index value (arr.length-1)
public class BinarySearch_LeetCode704 {
	public static int search(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == target) {
				return mid; // target found at index mid
			} else if (arr[mid] < target) {
				left = mid + 1; // search the right half
			} else {
				right = mid - 1; // search the left half
			}
		}
		return -1; // target not found in the array
	}

	// Testing the implementation
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 7, 8, 9 };
		int target = 5;
		int index = search(arr, target);
		if (index == -1) {
			System.out.println(target + " not found in the array");
		} else {
			System.out.println(target + " found at index " + index);
		}
	}

}
