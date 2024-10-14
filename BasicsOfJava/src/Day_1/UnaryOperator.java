package Day_1;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Post Increment -  first Use it then update.
		// Pre Increment -first Update it then use.
		int a = 10, b=20;
		int result = ++a + b++ + b-- + --a + --b + ++b;
		int sum = 11+20+21+10+19+20;
		System.out.println(result);
		System.out.println(a);
		System.out.println(b);
		System.out.println(sum);
	}

}
