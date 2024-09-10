package string_datastructure;

// here we are using two pointers approach
public class PalindromeString {
	public static boolean isPalindrome(String str) {
		// Remove non-alphanumeric characters and convert to lowercase
		String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		int left = 0;
		int right = cleanedStr.length() - 1;

		while (left < right) {
			if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
				return false; // Characters don't match, not a palindrome
			}
			left++;
			right--;
		}

		return true; // All characters matched, it's a palindrome
	}

	public static void main(String[] args) {
		String testString = "A man, a plan, a canal, Panama!";
		String testString2 = "Dad ,";

		if (isPalindrome(testString)) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string is not a palindrome.");
		}
		System.out.println("Checking For \"dad\" ");
		if (isPalindrome(testString2)) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string is not a palindrome.");
		}
	}
}