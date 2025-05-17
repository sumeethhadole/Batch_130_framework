package day1;

public class Demo_paramitarised1 {

	public static void main(String[] args) {
		
		System.out.println("This is beginning");
		
		String s = "java";
		s.concat("selenium");
		System.out.println(s);
		
		
	vehicle1 v = new vehicle1(2022,"Mahindra","Navy Blue");
    v.getClass();
	}

}
class  vehicle1{
	vehicle1(int year,String name , String colour){
	System.out.println(year +" "+name+" "+colour);
}
}
