package codePractice;

import java.util.Scanner;

public class CodeWithBanti {
	
	//1. Write a program with a method that takes two numbers as parameters and returns their sum.
	
	public static void sum(int a, int b) {
		 int result = a+b;
		 System.out.println(result);
		 
		
	}
	
// 2. Write a program to calculate the area of a rectangle using a method
	
	public static int area(int l, int b, int h) {
		
		int areaOfRectangle = l*b*h;
		return areaOfRectangle;
	}
	public static void main(String[] args) {
		
		
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter the num1:");
		 int num1 = input.nextInt();
		 
		 System.out.println("Enter num 2:");
		 int num2 = input.nextInt();
		 CodeWithBanti res = new CodeWithBanti();
		 res.sum(num1,num2);
		 input.close();
		 
		 
		System.out.println("AreaOf rectangle:"+area(2,3,4));
		
	}
	
	
}
