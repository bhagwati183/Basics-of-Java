package inheritance;

class Animal{
	void eat() {
		System.out.println("Animal eats food");
	}
	
}

class Dog extends Animal{
	void bark() {
		System.out.println("Dog Barks bhow-bhow!!");
	}
	
}

public class Single_CodeReuseability {
	
	public static void main(String[] args) {
		Dog dog_var = new Dog();
		dog_var.bark();
		dog_var.eat();

		

	}

}
