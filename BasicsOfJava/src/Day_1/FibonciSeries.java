package Day_1;

public class FibonciSeries {
	
	//Fibonacci means sum of two preceding numbers: 0 1 1 2 3 5 8 ...

	public static void main(String[] args) {
		
		int count = 10;
		int firstTerm = 0;
		int secondTerm = 1;
		int nextTerm;
		
		for(int i = 1; i<=count; i++) {
			
			System.out.print(firstTerm + " ");
			nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			
		
		}
		
		
		

	}

}
