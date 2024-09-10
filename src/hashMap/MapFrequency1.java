package hashMap;

import java.util.HashMap;
import java.util.Map;

// Find the most frequent element in it. If there are multiple elements that appear a maximum number of times
// n=6
// arr[] = {1,2,3,1,4,1}
// answer =1
public class MapFrequency1 {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 3, 6, 7, 1, 2, 4, 3, 1, 7, 8, 2, 1, 4, 1 };
		Map<Integer, Integer> freq = new HashMap<>();
		for (int el : arr) {
			if (!freq.containsKey(el)) { // if element doesn't exist
				freq.put(el, 1); // put element
			} else {
				freq.put(el, freq.get(el) + 1); // otherwise add plus one
			}

		}
		System.out.println(freq.entrySet());

		int maxFrequency = 0, anskey = -1;
		/*
		 * for(var e: freq.entrySet()) { // traversing through entryset 
		 * if(e.getValue() > maxFrequency) { // if value is greater than maxFrequency
		 *  maxFrequency =	e.getValue(); // update maxFrequency
		 *   anskey = e.getKey(); 
		 *   } 
		 *   } 
		 * System.out.printf("%d has max frequency and it occurs %d times",
		 * anskey,maxFrequency);
		 * 
		 * }
		 */
		for (var key : freq.keySet()) {
			if (freq.get(key) > maxFrequency) {
				maxFrequency = freq.get(key);
				anskey = key;
			}
			

		}
		System.out.printf("%d has max frequency and it occurs %d times", anskey, maxFrequency);

	}
}
