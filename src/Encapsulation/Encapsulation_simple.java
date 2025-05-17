package Encapsulation;

public class Encapsulation_simple {

	public static void main(String[] args) {
		name e = new name();
		e.Setname("sumeet");
		e.getname();
		System.out.println(e.getname());

	}
}

class name{
	private String name;

	public void Setname(String n) {
		name=n;
		
	}
	public String getname() {
		return name;
	}
}


