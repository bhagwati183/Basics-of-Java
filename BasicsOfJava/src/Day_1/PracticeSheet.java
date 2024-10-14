package Day_1;

public class PracticeSheet {
	
	int globalVariable = 10;
	 
	public static void main(String[] args) {
		
		int localVariable = 20;
		
		System.out.println("LocalVariable" + localVariable);
		PracticeSheet gb = new PracticeSheet();// to call the global variable you need to create the object of global variable.
		System.out.println("Global Variable:" + gb.globalVariable);
		Test();
		
	}
	
	static void Test() {
		//System.out.println(localvariable); not possible
		PracticeSheet gb1 = new PracticeSheet();
		System.out.println("hi" + gb1.globalVariable);
	}

}
