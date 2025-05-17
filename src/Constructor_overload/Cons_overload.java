package Constructor_overload;

public class Cons_overload {

	public static void main(String[] args) {
		
		empp e = new empp(12, "sumeet");
		empp e1 = new empp(11,"sumeet",9023294848l);
		empp e2 = new empp(11,"sumeet",9023294848l,"QA");
		Pune p = new Pune();
		hyd h = new hyd();
		
	}
}
class empp {
	
	int i;
	String n;
	long mob;
	String sub;
	
	empp(int i , String n){
		System.out.println(i+" "+n);
	}
	empp(int i , String n,long m){
		System.out.println(i+" "+n+" "+m);
	}
	empp(int i , String n,long m,String s){
		System.out.println(i+" "+n+" "+m+" "+s);
	}
}
class Pune{
	Pune(){
		System.out.println("This is Pune");
	}
}
class hyd{
	 hyd(){
	System.out.println("hyderabad");}
	}

