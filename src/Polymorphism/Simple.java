package Polymorphism;


public class Simple {

	public static void main(String[] args) {
		
		dog de = new dog();
		de.eat();
		System.out.println(de.getClass());
	}
}
class animal{
	void eat() {
		System.out.println("animal eats");
	}
}
class dog extends animal{
	void eat() {
		super.eat();
		System.out.println("dog barks");
	}
}
