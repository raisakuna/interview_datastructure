

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no =5432;
		int reverse=0;
		int remainder;
		while(no != 0) {
			remainder = no % 10;
			reverse = reverse *10 + remainder;
			no = no/10;
		}
		System.out.println(reverse);
	}

}
