package slidingWindow;

// Brute Force Approach
public class LengthOfLongestSubString {
	public static int lengthOfSubString(String s) {
		int maxLength = 0;
		for (int i =0; i< s.length(); i++) {
			StringBuilder currentSubString =new StringBuilder();
			for(int j=i; j<s.length();j++) {
				if(currentSubString.indexOf(String.valueOf(s.charAt(j)))!= -1) {
					break;
				}
				currentSubString.append(s.charAt(j));
				maxLength= Math.max(maxLength, currentSubString.length());
			}
			
		}
		return maxLength;

	}

	public static void main(String[] args) {
		System.out.println(lengthOfSubString("abcacdgankabb"));  //cdgank -> 6
		
	}

}
