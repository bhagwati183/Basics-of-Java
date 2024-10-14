package codePractice;

//import java.util.Scanner;

public class FactorialNumber {
	
//	public static int findfactorial(int n) {
//		
//		int factorial = 1;
//		for(int i =1; i<= n; i++) {
//			
//			factorial = factorial*i;
//		}
//		
//		return factorial;
//	}
	
	public static void main(String[] args) {
		
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter the number:");
//		int number = input.nextInt();
//		
//		System.out.println("Factorial Number of: "+ number + " is " + findfactorial(number));
//		input.close();
		
		int factorial = 1;
		for(int i = 5;i>=1;i--) {
			 factorial = i*factorial;
			 System.out.println(i + "-"+ factorial);
	}
		 System.out.println("Result:"+factorial);
	}
	}
	

	
