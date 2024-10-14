package codeWithBanti;

public class AverageOfArray {
	// Write a program with a method that accepts an array and returns the average of its elements.

	// arr[] = {10,20,30,40,50}/5;
	
	static void average(int arr[]) {
		
		int average_sum = 0;//10 
		int array_result;
		for(int i = 0;i<arr.length;i++) {
			System.out.println("Loop"+i+"Element:"+arr[i]);//1,2,3,4
			
			
			average_sum = average_sum +arr[i];// 10+20+30+40+50/5
			
			array_result = average_sum/arr.length;// 10+20+30+40+50/5
			System.out.println("FInal result"+ array_result);
		}
		
		//return;
	}
	public static void main(String[] args) {
		
		int x[]= {10,20,30,40,50};
		AverageOfArray arr_res = new AverageOfArray();
		arr_res.average(x);
	}

}
