package codeWithBanti;

public class MaxNum {

	// Write a program with a method that returns the maximum of three numbers.
	
	static void max(int a, int b, int c) {
		if(a>b && b>c) {
			System.out.println("max is:"+ a);
			
		}
		else if(b>a && b>c) {
			System.out.println("Max is:"+ b);
			
		} else {
			System.out.println("Max is "+ c);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaxNum res = new MaxNum();
		res.max(10,20,30);

	}

}
