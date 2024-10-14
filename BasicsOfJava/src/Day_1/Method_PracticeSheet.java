package Day_1;

import java.util.Scanner;

public class Method_PracticeSheet {
	
	//Create a method that prints "Hello, World!".
	
	static void display() {
		
		System.out.println("Hello World!!!");
		
	}
// Write a method that takes no arguments and prints username.
	
	static void printUserName() {
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter your good name:");
		
		String Username = userInput.nextLine();
		System.out.println("Hi "+Username);
			
	}
	
//Write a method that takes two integers as parameters from users and prints their sum.
	
	static void sum(int a, int b) {
		
		int sum = a + b;
		System.out.println("The Sum is:"+ sum);
	}
	
//4. Create a method that returns the square of an integer.
	
	static void Square(int i) {
		int sq = i*i;
		System.out.println("Square of the given number is:" + sq);
		
	}
	
//5. Write a method that takes a String as a parameter and prints it in uppercase.
	static void upperCase(String inputname) {
		String uppercaseString = inputname.toUpperCase();
		System.out.println("Uppercase Version:" + uppercaseString);
	}
	
//6. Create a method that takes two double values and returns their product.
	
	static void product(double x, double y) {
		double result = x*y;
		System.out.println("Product:"+result);
	}
	
//7. Write a method that checks if a number is even or odd.
	
	static void EvenOdd(int num) {
		
		if(num%2==0) {
			System.out.println("The number is Even:"+ num);
		}
		else {
			System.out.println("The number is odd:"+ num);
		}
		
		
	}
	
//8. Write a method that takes a number as an argument and prints whether it’s positive or negative.
	static void positiveNegative(int num) {
		
		if(num > 0) {
			System.out.println("The number is positive:"+num);
		} else if(num < 0){
			System.out.println("The number is negative:"+ num);
			
		} else {
			System.out.println("The number is zero"+ num);
		}
		
	}
//9. Create a method that prints the multiplication table of a number passed as a parameter
	
	static void table(int i) {
		
		for ( int x=1;x<=10;x++) {
			System.out.println(i+"x"+x+ "="+ (i*x));
			
		}
		
	}
	
//10. Write a method that calculates the area of a circle when given its radius.
	static void area(int r) {
		float areaofcircle = 3.14f*r*r;
		System.out.println("Area of circle of given radius is:"+areaofcircle);
	}
	public static void main(String[] args) {
		
//		display();
//		printUserName();
//		
		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Enter the first number:");
//		int x = input.nextInt();
//		
//		System.out.println("Enter the second number:");
//		int y = input.nextInt();
//		
//		
//	    sum(x, y);
//	    
//	    System.out.println("Enter the number you want the sqaure of:");
//	    int sq = input.nextInt();		
//		Square(sq);
//		
//		System.out.println("Enter your string:");
//		String userInput = input.nextLine();
//		upperCase(userInput);
//		product(10.56,11.356);
//		
//		EvenOdd(3);
//		EvenOdd(4);
		
//		positiveNegative(10);
//		positiveNegative(-11);
//		positiveNegative(0);
		
		table(10);
		area(3);
		
	}

}
