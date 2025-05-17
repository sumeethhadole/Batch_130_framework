package Day2_constructor;

public class Constructor_1 {

	public static void main(String[] args) {

		one o = new one();
		two t = new two();
		t.two();
		three t3 = new three();
		four f =new four();
		
	}

}
class one{
	one(){
	System.out.println("This is new begininng");
}
}
class two{
	public void two(){
		System.out.println("this is pune");
	}
}
class three{
	three(){
		System.out.println("This is Me");
	}
}
class four{
	int id;
	String name;
	{
		System.out.println(id+" "+name);
	}
}

