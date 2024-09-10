package twoPointer;
// Two pointer is a pattern in which two pointers iterate across the Data Structure until one 
// or both of them satisty the necessary conditions.
// A pointer is a reference to an object.
// An easy and effective technique that is typically used for searching pairs in sorted array.
public class LeetCode_11_ContainerWithmaximumWater {
	
	public int maxArea(int[] array) {
		int left = 0; 
		int right = array.length - 1;
		int maxArea = 0;
		
		while (left < right) {
			// Math.min() & math.max() are inbuilt function which returns max  and min of two numbers
			// we are finding the area with minimum height and width (right-left)
			// because minimum height can only hold water
			int area =  Math.min(array[left], array[right]) * (right - left);
			
			// we are taking the maxArea
			maxArea = Math.max(area, maxArea);
			
			// this will check the condition if the left-bar is small to the right-bar, 
			// then move left-bar to one step right other wise move right-bar one step back to the left 
			if (array[left] < array[right]) 
				left++;
			else {
				right--;
			}
		}
		return maxArea;
	}

	public static void main(String[] args) {
		LeetCode_11_ContainerWithmaximumWater solution = new LeetCode_11_ContainerWithmaximumWater();
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = solution.maxArea(heights);
        System.out.println("Maximum water that can be trapped: " + result);
    
	}

}
