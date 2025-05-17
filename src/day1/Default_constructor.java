package day1;

public class Default_constructor {

	public static void main(String[] args) {
		
		City c1 = new City();
	    c1.getClass();
		
		vehicle v= new vehicle();
        v.getClass();
	}

}
class City{
	City(){
		System.out.println("pune");
		System.out.println("bajaj");
		System.out.println("bajaj honda");
		System.out.println("bajaj new");
		
	}
}
class vehicle{
	vehicle(){
		System.out.println("bajaj");
	}
}
 
