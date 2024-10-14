package Day_1;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int i,num=8,count=0;
		
		for(i =1;i<=10;i++) {// 1 to 10 print
			
		
			if(num%i==0) 
			{
				count ++;
			}
		}
		if(count == 2) {
			System.out.println("This is prime"+num);
						
		} 
			else {
			System.out.println("This is not prime"+ num);
		}
		

			
	}


}
