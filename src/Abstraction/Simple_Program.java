package Abstraction;

public class Simple_Program {

	public static void main(String[] args) {
	 
	dog d = new dog();
	d.eat();
	d.sound();
	}
}
abstract class animal{
	
	public void eat() {
		System.out.println( "animal eats");
	}
}
class dog extends animal{
	public void sound() {
		System.out.println("dog barks");
	}
}

