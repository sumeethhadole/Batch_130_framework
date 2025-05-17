package Inheritance;

public class Simple_program {

	public static void main(String[] args) {
		
		
		
		animal a = new animal();
		bus b = new bus(3,"selenium");	
	}
}
class animal{
	animal() 
	{
		System.out.println("This is animal");
	}
}
class bus{
	bus(int id , String name) {
		System.out.println(id+" "+name);
	}
}