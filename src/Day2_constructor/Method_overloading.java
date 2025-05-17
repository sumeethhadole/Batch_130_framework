package Day2_constructor;

public class Method_overloading {

	public static void main(String[] args) {

		System.out.println(" This is Beginning");
		emp e = new emp(101,"sumeet");
		emp e1 = new emp(102,"jitesh",9032381399l);
	}

}
class emp{
	int id;
	String name;
	long mobile;
	String Address;
	
	emp(int i,String n){
		System.out.println(i+" "+n);
	}
	emp(int i, String n,long m){
		System.out.println(i+" "+n+" "+m);
	}
}
