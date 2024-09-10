package string_datastructure;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0)
			return "";
		String prefix = strs[0];
		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty())
					return "";
			}
		}
		return prefix;
	}

	public static void main(String[] args) {
		String[] s = { "hello", "help", "head" };
        LongestCommonPrefix lcp = new LongestCommonPrefix(); // Create an instance of the class
        String result = lcp.longestCommonPrefix(s); // Call the method with the array
        System.out.println("Longest Common Prefix: " + result);
	}

}
