package recusrion;

public class Fibonacci {
	private static int fibo(int n) {
		int result;
		if (n == 0 || n == 1)
			return 1;
		result = fibo(n-1) + fibo(n-2);
		return result;
	}
	
	private static void printFibonacci(int a , int b, int n) {
		if(n == 0) {
			return;
		}
		int c =  a + b;
		System.out.print(String.format("%-3s ", c));
		printFibonacci(b, c, n-1);
	}

	public static void main(String[] args) {

		Fibonacci fibonacci = new Fibonacci();
		System.out.println("Fibonacci of 4 is " + fibonacci.fibo(4));
		System.out.println("Fibonacci of 5 is " + fibonacci.fibo(5));
		
		int a = 0, b =1;
		System.out.println(a);
		System.out.println(b);
		int n = 7;
		printFibonacci(a, b, n-2);

	}

}
