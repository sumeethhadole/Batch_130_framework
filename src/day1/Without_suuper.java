package day1;


public class Without_suuper {

	public static void main(String[] args) {
	//car v2 = new car();
	new car();
	}

}
class vehicle2{
	vehicle2(){
		System.out.println("vehicle constructor is called");
		
	}
}
class car extends vehicle2{
	car(){
		this("hello this is ");
		System.out.println("car constructor is called");
	}
	car(String model){
	System.out.println("car model"+ model);
	}
}