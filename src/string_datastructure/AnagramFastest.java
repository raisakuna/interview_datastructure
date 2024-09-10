package string_datastructure;

public class AnagramFastest {
	
	public static boolean areAnagram(String s1, String s2) {
		// if lengths are different, they can't be anagram
		if(s1.length()!=s2.length()) {
			return false;
		}
		
		//Use an integer array to count character occurence
		int[] charCount = new int[256];
		
		// Count occurence in str1 and decrement for str2
		for(int i =0; i <s1.length(); i++) {
			charCount[s1.charAt(i)]++;
			charCount[s2.charAt(i)]--;
		}
		
		// check if all counts are zero
		for(int count: charCount) {
			if (count != 0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(areAnagram(str1, str2)); // Should print true

        str1 = "hello";
        str2 = "world";
        System.out.println(areAnagram(str1, str2)); // Should print false

	}

}
