package Day_1;

import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		/* Method is block of code or set of instruction or group of code
		 * Usage: */
		addition();
		substraction();
		int test = add(); // when a method is returning a value then only we can store in variable. Void methods can not be stored in variable.
		System.out.println("Return Type Method:"+ test);
		int result = area(10,20,30);
		System.out.println("Area of rectangle:"+result);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your string you want it to be in lower case:");
		
		String tolower = input.nextLine();
		lowercase(tolower);
		
	  
	}
	
	static void addition() {
		
		int a=10, b=20, sum;
		sum= a+b;
		System.out.println("Sum of two numbers are:" +sum);	
	}
	
	static void substraction() { // without return type
		int a =20, b = 10, sub;
		sub = a-b;
		System.out.println("Substarction of two numbers are:" + sub);
	}
	
	static int add() { // with return type
		int sum,a,b;
		a =70;
		b=20;
		sum = a+b;
		//System.out.println(sum);
		return sum;
	}
	
	// Method with parameter.
	static int area(int l, int b , int h) {
		
		 int areaOfRectangle = l*b*h;
		 return areaOfRectangle;
	}
	// convert the string to lowercase
	
	static void lowercase(String name) {
		
		String lowercaseString = name.toLowerCase();
		System.out.println("LowerCase Version:"+lowercaseString);
	}
	
	
	/*
	 * 1. void method - can not be stored in variable // object access
	 * 2. void with parameters- 
	 * 3. method with return - without parameter
	 * 4. method with return with parameter*/
	
	
}
