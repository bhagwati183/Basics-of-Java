package Day_1;

import java.util.Scanner;

public class Scanners {

	public static void main(String[] args) {
	
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value of A: ");
		
		int A = input.nextInt();
		
		System.out.println("Enter the value of B:");
		
		int B = input.nextInt();
		
		input.nextLine();
		
		System.out.println("Enter the String value:");
		String str = input.nextLine();
		
		int result = A+B;
		
		System.out.println("Result:"+result);
		System.out.println("Result:"+ str);

	}

}
