package string_datastructure;

import java.util.Arrays;

public class Anagram {
	public static boolean areAnagram(String s1, String s2) {
		//sorting both string
		char[] charArray1=s1.toCharArray();
		char[] charArray2 =s2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		return Arrays.equals(charArray1, charArray2);
	}

	public static void main(String[] args) {
		 String str1 = "listen";
	        String str2 = "silent";

	        if (areAnagram(str1, str2)) {
	            System.out.println("True");
	        }
	        else {
	            System.out.println("False");
	        }

	        str1 = "gram";
	        str2 = "arm";

	        if (areAnagram(str1, str2)) {
	            System.out.println("True");
	        }
	        else {
	            System.out.println("False");
	        }

	}

}
