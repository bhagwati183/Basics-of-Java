package codeWithBanti;

public class PrimeNumber {
	// 7 --- 1, 7
	
	public static void findPrime() {
		
		int n =100;
		int count = 0;
		for(int i = 1; i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		
		if(count==2) {
			System.out.println("It is Prime number:");
		}
		else {
			System.out.println("It's not prime:");
		}
		
		//return count;
	}
	
	public static void main(String[] args) {
		
		PrimeNumber pn = new PrimeNumber();
		pn.findPrime();
	
		
	}

	}
