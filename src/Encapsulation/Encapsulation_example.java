 package Encapsulation;

public class Encapsulation_example {

	public static void main(String[] args) {
		
		emp e = new emp();
		e.Setname("sumeet");
		e.Setage(8);
	
		System.out.println("name :"+e.getname());
		System.out.println("age :"+e.getage());
			
		}
	}
class emp{
	private String name;
	private int age;

    public String Setname(String name) {
    	this.name=name;
    	return name;
    }
    	public void Setage(int age) {
    		if (age>18) {
    			this.age=age;
    			System.out.println("Can vote");
    		}else {
    			this.age=age;
    			System.out.println("cant vote");
    		
    		}
    	}
    public int getage() {
    	return age;
    	
    }
    public String getname() {
    	return name;
    }
    	
}
