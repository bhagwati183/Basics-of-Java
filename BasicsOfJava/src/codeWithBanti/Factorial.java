package codeWithBanti;

public class Factorial {

	// 5! = 5*4*3*2*1
	// Write a program with a method to find the factorial of a number
	
	public static int findfactorial(int n) {
		
		int factorial = 1; 
		for(int i = 1; i<=n; i++) {
			factorial = factorial*i;
			System.out.println(factorial + "-"+i);
		}
		return factorial;
		
	}
	public static void main(String[] args) {
		System.out.println("factorial number:"+ findfactorial(4));
		

	}

}
