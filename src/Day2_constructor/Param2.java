package Day2_constructor;

public class Param2 {

	public static void main(String[] args) {
		
		bankaccount ba = new bankaccount("sumeet",25000);
		
		bankaccount ba1 = new bankaccount("sangam", 30000);	
		
		ba.display();
		

	}

}
class bankaccount{
	
	String name;
	double amount;
	

     bankaccount(String name1,double amount1){
    	 name=name1;
    	 amount=amount1;
    	 System.out.println(name1+ " "+ amount1);
     }

public void display() {
	System.out.println(name+" "+amount);
}	
}