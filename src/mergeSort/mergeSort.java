package mergeSort;

// tutorial Jenny's Lecture
// https://www.youtube.com/watch?v=jlHkDBEumP0&t=9s
// Understand the recursion tree
public class mergeSort {

	public static void divide(int arr[], int si, int ei) {
		if (si >= ei) {
			return;
		}
		// to prevent integer overflow
		int mid = si + (ei - si) / 2;
		divide(arr, si, mid); // left
		divide(arr, mid + 1, ei); // right
		conquer(arr, si, mid, ei);

	}

	private static void conquer(int[] arr, int si, int mid, int ei) {
		int merged[] = new int[ei - si + 1]; // creating a new array of the same size
		int idx1 = si;
		int idx2 = mid + 1;
		int x = 0;

		while (idx1 <= mid && idx2 <= ei) {

			if (arr[idx1] <= arr[idx2]) {
				merged[x] = arr[idx1]; // here we are putting the value of left sub-array in temporary array "merged"
				x++;
				idx1++; // moving to next starting index and value
			} else {
				merged[x++] = arr[idx2++]; // Putting the value of right sub-array into temporary array "merged"
			}
		}

		// either 1st while or 2nd while will run base on the condition
		while (idx1 <= mid) {
			merged[x] = arr[idx1];
			x++;
			idx1++;
		}

		while (idx2 <= ei) {
			merged[x++] = arr[idx2++];
		}

		// copying merged array to original array
		for (int i = 0, j = si; i < merged.length; i++, j++) {
			arr[j] = merged[i];
		}
	}

	public static void main(String[] args) {
		int arr[] = { 6, 3, 8, 9, 2, 5 };
		int n = arr.length;
		divide(arr, 0, n - 1);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
