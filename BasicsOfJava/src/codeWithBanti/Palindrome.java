package codeWithBanti;

import java.util.Scanner;
// bhagwati = 8-1=7
// 01234567



public class Palindrome {
	// Write a program with a method that checks if a string is a palindrome.
	// Madam - Banti - 1.reverse = itnab 2. compare Banti equals to reverse
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string:");
		
		String word = input.nextLine();
		word = word.toLowerCase();
		String rev ="";// i//t//
		
		for(int i=word.length()-1;i>=0;i--) {
			rev = rev+word.charAt(i); // null +i+t

		}
		
		boolean checkpalindrome = word.equals(rev);
	if(checkpalindrome == true) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not palindrome");
	}
		
		
	}
}

