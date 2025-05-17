package impp_java;

public class Largest_no {

	public static void main(String[] args) {
	       
		    int p=12;
	        int count=0;
	        for(int i=1;i<=p;i++)
	        if(p%i==0)
	        count++;
	        if (count==2){
	        System.out.println("prime");
	        }else {
	            System.out.println("not prime");
	}
	}
    	}
