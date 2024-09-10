package slidingWindow;

// BruteForce Approach
// First we will take some maxSum value as 0
// we will take first loops, after reaching to given n element
// we will add the sum of that element, then compare to our maxSum which is 0
// if our new maxSum is greater than  previous one which in our case is 0, then we will store it in maxSum
// then we will start another loop. We will move the first element to the left and second loop to the 
// 

// 
public class MaximumSubArray {
	static int maxSumSubArray(int[] a, int k) {
		int wsum = 0;
		int msum = Integer.MIN_VALUE; // we are assigning here mimimum value to store
		for (int i = 0; i < k; i++) { 
			wsum = wsum + a[i];
		}
		for (int i = k; i < a.length; i++) {
			wsum = wsum - a[i - k] + a[i];
			msum = Math.max(msum, wsum);

		}
		return msum;
	}

	public static void main(String[] args) {
		int[] a = { 2, 7, 4, 9, 21, 11, 5, 6 };
		int k = 3;
		System.out.println(maxSumSubArray(a, k));

	}

}
