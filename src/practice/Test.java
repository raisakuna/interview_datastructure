package practice;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2, sum;
		char test;
		char operation;
		do {
		System.out.println("Enter the first number");
		num1= input.nextInt();
		System.out.println("Enter the second number");
		num2 = input.nextInt();
		
		System.out.println("Enter the operation you want to perform : + - / * %");
		operation=input.next().charAt(0);
		if (operation == '+') {
		sum = num1 + num2;
		System.out.println(num1  + " + " + num2 + "=" + sum );
		}
		else if (operation == '-') {
			sum = num1 - num2;
			System.out.println(num1  + " - " + num2 + "=" + sum );
			}
		else if (operation == '/') {
			sum = num1 - num2;
			System.out.println(num1  + " / " + num2 + "=" + sum );
			}
		else if (operation == '*') {
			sum = num1 - num2;
			System.out.println(num1  + " * " + num2 + "=" + sum );
			}
		else if (operation == '%') {
			sum = num1 - num2;
			System.out.println(num1  + " % " + num2 + "=" + sum );
			}
		else
		{
			System.out.println("Invalid operator");
		}

			System.out.println("Do you want to continue or terminate? Press y  or n ");
			test = input.next().charAt(0);
		}
		while(test == 'y'); 
			
			
		
		System.out.println("Exit");
		
		
	}
		
	

}
