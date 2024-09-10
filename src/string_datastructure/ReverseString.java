package string_datastructure;

// two pointer approach
public class ReverseString {
	public void reverseString(char[] s) {
		int left =0;
		int right = s.length-1;
		while(left<right) {
			char tmp =s[left];
			s[left] =s[right];
			s[right] =tmp;
			left++;
			right--;
		}
	}

	public static void main(String[] args) {
		char[] s = {'h', 'e', 'l', 'l', 'o'};
        ReverseString rString = new ReverseString();
        rString.reverseString(s);
        
        // Print the reversed string
        for (char c : s) {
            System.out.print(c + " ");
        }}

}
