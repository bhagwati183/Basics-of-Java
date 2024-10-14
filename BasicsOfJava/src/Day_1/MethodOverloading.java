package Day_1;

public class MethodOverloading {
	
	static int add(int a, int b) {
		return a+b;
	}
	
	static int add(int a , int b, int c) {
		return a+b+c;
	}
	
	static int add(int a, int b , int c, int d) {
		return a+b+c+d;
	}
//2. Write overloaded methods to find the maximum of two int values and two double values.
	
	static int max(int a, int b) {
		if(a>b) {
			return a;
		} else {
			return b;
		}
	}
	
	static double max( double a, double b) {
		if(a>b) {
			return a;
		} else {
			return b;
		}
	}
// 3. Create a method to concatenate two String values, and overload it to concatenate three String values.
	
	static String concatenate(String str1, String str2) {
		return str1 + str2;
		
	}
	static String concatenate(String str1, String str2, String str3) {
		return str1 + str2+str3;
		
	}
	public static void main(String[] args) {
		
		System.out.println(add(10,20));
		System.out.println(add(10,20,30));
		System.out.println(add(10,20,30,40));
		
		System.out.println("This is greater in integer:"+max(10,20));
		System.out.println("This is greater in double:"+max(10.3,20.6));
		System.out.println("This is greater in double:"+max(10.3,20.6));
		
		System.out.println("Overloaded String values:"+concatenate("Hello ","World ", "Excited"));
		

}
}
