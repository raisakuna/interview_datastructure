package hashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Leetcode 18 
// From array nums, return an array of all unique quadruplets such nums[a] + nums[b] + nums[c] +nums[d] == target

// Brute force Approach
/*
 * public class UniqueQuadruplets {
 *  public static List<List<Integer>> fourSum(int[] nums, int target) { 
 *  List<List<Integer>> result = new ArrayList<>(); 
 *  int n = nums.length;
 * 
 * // Brute-force: Generate all quadruplets for (int a = 0; a < n - 3; a++) {
 * for (int b = a + 1; b < n - 2; b++) { for (int c = b + 1; c < n - 1; c++) {
 * for (int d = c + 1; d < n; d++) { if (nums[a] + nums[b] + nums[c] + nums[d]
 * == target) { List<Integer> quadruplet = Arrays.asList(nums[a], nums[b],
 * nums[c], nums[d]); result.add(quadruplet); } } } } }
 * 
 * return result; }
 * 
 * public static void main(String[] args) { int[] nums = {1, 0, -1, 0, -2, 2};
 * int target = 0;
 * 
 * List<List<Integer>> result = fourSum(nums, target);
 * 
 * // Print the result for (List<Integer> quadruplet : result) {
 * System.out.println(quadruplet); } } }
 */

public class UniqueQuadruplets{
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates for the first element
            }

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue; // Skip duplicates for the second element
                }

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        while (left < right && nums[left] == nums[left + 1]) {
                            left++; // Skip duplicates for the third element
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--; // Skip duplicates for the fourth element
                        }

                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        List<List<Integer>> result = fourSum(nums, target);

        // Print the result
        for (List<Integer> quadruplet : result) {
            System.out.println(quadruplet);
        }
    }
}
