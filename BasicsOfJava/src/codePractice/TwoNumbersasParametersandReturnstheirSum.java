package codePractice;

import java.util.Scanner;

public class TwoNumbersasParametersandReturnstheirSum {
	
	public static int sum(int a, int b) {
	
		int sumOf2numbers = a+b;
		
		return sumOf2numbers;
	}

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);
		
		System.out.println("Enter the First Value A:");
		int num1 = input.nextInt();
		System.out.println("Enter the Second Value B:");
		int num2 = input.nextInt();		

		int result = sum(num1,num2);
		System.out.println("Sum of two numbers:"+ result);
		
		input.close();
	}

}
