package Day_1;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 121;
		int orginal_num = num;
		int rev_num=0;
		
		while(num!=0) {
			int digit = num%10;// extracting last digit // 123456%10 = 6
			rev_num = rev_num*10+digit;// reversing digit // 0*10 + 6
			num/=10;// removing the last digit // 123456/10= 12345
		}
		
		if(orginal_num == rev_num) {
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("It is not palindrome.");
		}

	}

}
