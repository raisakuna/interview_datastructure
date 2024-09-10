package recusrion;

public class Factorial {
	// recursive method
	private static int fact(int n) {
		int result;
		// base case, every recursion has base case
		if (n == 1 || n == 0)
			return 1;
		result = fact(n - 1) * n;
		return result;
	}

	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		System.out.println("Factorial of 3 is: " + factorial.fact(3));
		System.out.println("Factorial of 4 is: " + factorial.fact(4));
		System.out.println("Factorial of 5 is: " + factorial.fact(6));

	}

}
