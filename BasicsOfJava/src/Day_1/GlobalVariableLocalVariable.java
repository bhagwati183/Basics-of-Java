package Day_1;

public class GlobalVariableLocalVariable {
	
	int globalVariable = 10;
	 
	public static void main(String[] args) {
		
		int localVariable = 20;
		
		System.out.println("LocalVariable" + localVariable);
		GlobalVariableLocalVariable gb = new GlobalVariableLocalVariable();// to call the global variable you need to create the object of global variable.
		System.out.println("Global Variable:" + gb.globalVariable);
		Test();
		
	}
	
	static void Test() {
		//System.out.println(localvariable); not possible
		GlobalVariableLocalVariable gb1 = new GlobalVariableLocalVariable();
		System.out.println("hi" + gb1.globalVariable);
	}

}

	
	

