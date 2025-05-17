package Constructor_overload;

public class This_super_keyword {

	public static void main(String[] args) {

		emp e = new emp();
		e.display(12, "sumeet");
		
		city c = new city();
			c.Banglore();
				
	}

}
class emp{
	int id;
	String name;
	
	public void display(int id , String name) {
		this.id=id;
		this.name=name;
		System.out.println(id+" "+name);
	}
}
class city{
	public void Banglore() {
		
		System.out.println("This is Banglore");
	
		
	}
	public void chennai() {
		this.chennai();
		System.out.println("This is Chennai");
		
	}
	
}

