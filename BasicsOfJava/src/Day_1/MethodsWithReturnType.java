package Day_1;



public class MethodsWithReturnType {
	
	//1.Write a method that takes an integer array and returns the sum of all elements.
	
	public static int sumOfArray(int numbers[] ) {
		
		int sum =0;
		for(int i=0; i<numbers.length;i++) {
			sum = sum+numbers[i];
		}
	return sum;
	}
		
// 2. Create a method that returns the reverse of a given String.
	public static String reverse(String name) {
		String rev = " ";
		for(int i=name.length()-1;i>=0;i--) {
			
			rev = rev+name.charAt(i);
			System.out.println(rev);
			
		}
		
		return rev;
	}
	
	//3. Write a method that takes an array of integers and returns the largest number.
	
	public static int largest(int [] number) {
		
		int largest_number = number[0];
		
		for(int i=0;i<number.length;i++) {
			if(number[i]>largest_number) {
				largest_number = number[i];
			}
			
		}
		
		
		return largest_number;
	}
	
	public static void main(String[] args) {
		
//		int numbers[] = {1,2,25,23,25};
//		
//		int result = sumOfArray(numbers);
//		System.out.println(result);
//		
		
		String name = "Bhagwati";
		String rev_result = reverse(name);
		System.out.println("Reversed Version:"+ rev_result);
		
		int number[] = {11,12,55,78,99};
		
		 int result = largest(number);
		 System.out.println(":"+result);
		}
		
		
	}


