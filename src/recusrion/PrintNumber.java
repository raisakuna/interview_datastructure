package recusrion;

public class PrintNumber {
	private static void printNumber(int n) {
		// base case
		if (n == 1)
			return;
		System.out.print(String.format("%-6s ", n));
		printNumber(n - 1);
	}

	private static void printNumberAscending(int n) {
		// base case
		if (n == 6)
			return;
		System.out.print(String.format("%-4s ", n));
		printNumberAscending(n + 1);
	}

	public static void main(String[] args) {
		printNumber(5);
		System.out.println('\n');

		printNumberAscending(1);
	}

}
