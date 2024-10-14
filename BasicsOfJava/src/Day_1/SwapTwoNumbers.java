package Day_1;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		main(5,2,0);
		main(10,20);
		
		
	}
	public static void main(int a, int b, int temp) {
		System.out.println("Before swap:"+"a="+a+"b="+b);
		temp = a;
		a=b;
		b=temp;
		System.out.println("After swap:"+"a="+a+"b="+b);
		
	}
	public static void main(int a, int b) {
		System.out.println("Before swap:"+"a="+a + "b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap:"+"a="+a+"b="+b);
		
		
	}

}
