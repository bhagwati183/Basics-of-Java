package Day_1;

public class This_Keyword {
	
	int a = 30;
	void test(int a) {
		a = a;
		
	}

	public static void main(String[] args) {
		
		This_Keyword var = new This_Keyword();
		System.out.println(var.a);//30 - calling global variable
		
		var.test(50);
		
		System.out.println("con "+var.a);// calling global variable
		
		
	

	}

}
