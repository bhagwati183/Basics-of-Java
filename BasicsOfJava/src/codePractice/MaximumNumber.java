package codePractice;

import java.util.Scanner;

public class MaximumNumber {
	
	public static int Maximum(int a, int b, int c) {
		
		if(a>b && a>c) {
		return a;
		}
		else if(b>a && b>c) {
			return b;
		}
		else 
			return c;
		}
		

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number1:");
		int num1 = input.nextInt();
		System.out.println("Enter the number2:");
		int num2 = input.nextInt();
		System.out.println("Enter the number3:");
		int num3 = input.nextInt();
		
		
		System.out.println("Maximum number is:"+ Maximum(num1,num2,num3));
		
		input.close();
	}

}
