package codePractice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	
		int count = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to check it is prime number or not:");
		int number = input.nextInt();
		
		for(int i =1; i<=number;i++) {
			if(number%i==0) {
				count++;
			}
		}
			if(count == 2) {
				System.out.println("It's prime");
			}
			else {
				System.out.println("Not a prime number");
			}
			
input.close();
	    }

	}

