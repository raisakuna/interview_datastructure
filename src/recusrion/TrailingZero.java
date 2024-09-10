package recusrion;

// https://www.youtube.com/watch?v=57hXUDXVY8s
import java.util.Scanner;

public class TrailingZero {
	static int trailingZeros(int n) {
		int res = 0;
		int powOf5 = 5;
		while (n >= powOf5) {
			res = res + (n / powOf5);
			powOf5 = powOf5 * 5;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Enter the factorial no. ");
			int no = sc.nextInt();

			if (no < 0) {
				System.out.println("Exiting from the program.  Good bye");
				break;
			}
			System.out.println(trailingZeros(no));
		}
		sc.close();
	}

}
