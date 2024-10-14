package Day_1;

public class StaticNonStatic {
	
	int ns = 10;
	void test() {
		System.out.println("Using static variable in non static method: "+s);
	}
	static int s = 20;
	static void test1() {
		StaticNonStatic obj_access = new StaticNonStatic();
		System.out.println("using non static variable in static method:"+obj_access.ns);
	}
	

	public static void main(String[] args) {
		
		StaticNonStatic obj = new StaticNonStatic();
		obj.ns =20;
		System.out.println("Accessing non static value by creating object:"+obj.ns);
		StaticNonStatic obj2 = new StaticNonStatic();
		System.out.println(obj2.ns);
		
		obj.s=50;
		System.out.println(obj.s);
		System.out.println(obj2.s);
		
		obj.test();
		test1();
		

	}

}
