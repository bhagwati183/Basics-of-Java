package Day_1;

public class Constructor {
	int a;
	Constructor(){
		a=20;
		System.out.println("This is constructor"+ "");
	}

	public static void main(String[] args) {
	
		/*Constructor: It is block which is used to create an object.
		 * It is also used to initialize non static variables.
		 * Constructor name should same as class name
		 * Constructor doesn't have return type whereas method have return type
		 * Constructor can have parameters
		 * if no user defined constructor is present in class then complier create a default constructor.
		 * Constructor are called automatically when ever we call object
		 * constructor are of two type - 
		 * 1. Default
		 * 2. Parameterized constructor- If you want to create an object with specific data
		 * Constructor Overloading:  Create more than one constructor in a class with different signature
		 * 1.Data type should be different
		 * 2.No. of parameters should be different
		 * 3.Sequence should be different
		 * Constructor overriding: Create more than one constructor in a class with same signature*/
		
		Constructor obj = new Constructor();
		
		
		

	}

}
