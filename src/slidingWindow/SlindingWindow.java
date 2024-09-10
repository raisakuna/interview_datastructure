package slidingWindow;

public class SlindingWindow {
	static int maxSumSubArray(int[] a, int k) {
		int wSum = 0;
		int mSum = Integer.MIN_VALUE;

		for (int i = 0; i < k; i++) {
			wSum += a[i];

		}
		for (int i = k; i < a.length; i++) {
			wSum = wSum - a[i - k] + a[i];
			mSum = Math.max(mSum, wSum);
		}
		return mSum;
	}

	public static void main(String[] args) {
		int[] a = { 2, 5, 8, 11, 54, 34 };
		int k = 3;
		System.out.println(maxSumSubArray(a, k));
	}

}
