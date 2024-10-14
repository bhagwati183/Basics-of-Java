package codePractice;

//Write a program with a method that accepts an array and returns the average of its elements.
public class AcceptsArrayandReturnsAverage {

	public static int returnsAverage(int arr[]) {
		int sum=0;
		int average;
		for(int i =0;i<=arr.length-1;i++) {
			sum = sum+arr[i] ;
			System.out.println(i + "-" +arr[i]);
			
		}
		average = sum/arr.length;
		
		return average;
	}
	public static void main(String[] args) {
		
		int array_ele[] = {12,20,30,40,50};
		System.out.println("Sum of array:" + returnsAverage(array_ele));
		System.out.println("Average of an array:" + returnsAverage(array_ele));

	}

}
