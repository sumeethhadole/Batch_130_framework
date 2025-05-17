package impp_java;

public class Factor {

	public static void main(String[] args) {

		
		int num=5;
		int fact=1;
		System.out.println( "The Factor of "+num);
		
		for(int i=1;i<=num;i++) {
			fact*=i;
			
			
		}
		System.out.println(fact);
	}

}
