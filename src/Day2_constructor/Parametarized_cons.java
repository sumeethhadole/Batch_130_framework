package Day2_constructor;

public class Parametarized_cons {

	public static void main(String[] args) {
		
		five f = new five(115,"sumeet");
		car c1 = new car(2025,"mahindra",2016);
	}

}
class five {
	  five(int a, String s){
		  System.out.println(a+" " +s);
	  }
}
class car{
	car(int year,
	String name,
	int model)
	{
	System.out.println(year+" "+name+" "+model);	
	}
}
