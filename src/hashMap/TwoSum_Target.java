package hashMap;


// Leetcode 1 # From the array we have to find two numbers when added will give us the target value.
import java.util.HashMap;
import java.util.Map;

public class TwoSum_Target {
//	public int[] twoSums(int[] nums,int target) {
//		for(int i=0; i <nums.length;i++) {
//			for(int j=i+1; j<nums.length;j++) {
//				if(nums[i] + nums[j] == target) {
//					return new int[] {i, j};
//				}
//				
//			}
//		}
//		return new int[] {};
//
//	}
	
	// https://www.youtube.com/watch?v=7jDS9KQEDbI&t=30s
	// time stamp - 11:11
	public int[] twoSums(int [] nums, int target) {
		Map<Integer, Integer> dataMap = new HashMap<>();
		
		// Iterate through the array
		for(int i=0; i<nums.length;i++) {
			int complement = target - nums[i];
		
		// check if complement is already in the map
		if (dataMap.containsKey(complement)) {
			
		//If found, return the indices of the two numbers
			return new int[] {dataMap.get(complement), i};
		}
		dataMap.put(nums[i], i);
		}
		// if no solution is found, return an empty array
		return new int[] {};
	}


	public static void main(String[] args) {
		TwoSum_Target twoSum_Target= new TwoSum_Target();
		
		//sample array
		int [] num = {2,7,11,15};
		
		 int target  = 9;
		//int target = 10;
		
		// call the two sums method
		int[] result =  twoSum_Target.twoSums(num, target);
		
		if(result.length==2) {
			System.out.println("two numbers are from indices [" + result[0] + ", " +result[1] +"]");
		}
		else{
			System.out.println("No result found");
		}
	
	}

}
