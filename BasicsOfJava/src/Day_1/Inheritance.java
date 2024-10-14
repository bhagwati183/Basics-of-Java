package Day_1;

class Apple{
	int a=10;
	
	
}
class RedApple extends Apple{
	int x =10;
	
}

public class Inheritance {
	/* Inheritance: Inheriting the members of parent class to child class except
	 * We can create relationship between classes using "extends" keyword
	 * Parent class is also called as superclass
	 * child class is also called as sub class
	 * 
	 * Types of inheritance-
	 * 1. Simple : one parent -> one child
	 * 2.multilevel: grand parent -> parent -> child -> grand child 
	 * 3.Hierarchical: one parent multiple child
	 * 4.Multiple Inheritance: two parent one child*/

	public static void main(String[] args) {
		
		Apple a1 = new Apple();
		System.out.println(a1.a);
		System.out.println(a1.x);// super class can not use sub class members.
		
		RedApple a2 = new RedApple();
	//	System.out.println(a2.a);// not possible coz no relationship between apple and red apple class
		System.out.println(a2.a);// as soon as relationship is build using "extends" keyword you can access apple class mem ber.

	}

}
