package day1;

public class Demo_paramitarised {

	public static void main(String[] args) {
		System.out.println("This is Beginning");

		Employee e1 = new Employee(101 , "sumeeth");
		e1.getClass();

	}

}
class Employee {
	Employee(int id , String name ){
		System.out.println(id+" "+name);
	}
}
