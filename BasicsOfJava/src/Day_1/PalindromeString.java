package Day_1;

public class PalindromeString {

	public static void main(String[] args) {
		
		String word = "Java";
		String rev = "";
		
		for(int i=word.length()-1;i>=0;i--) {
			rev = rev+word.charAt(i);
		}
		System.out.println("reversed String:"+ rev);
		
		boolean palindrome = word.equals(rev);
		if(palindrome==true) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}

	}

}
