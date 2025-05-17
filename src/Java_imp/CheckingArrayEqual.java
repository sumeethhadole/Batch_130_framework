package Java_imp;

import java.util.Arrays;

public class CheckingArrayEqual {

	public static void main(String[] args) {

		
		/*int a[]= {2,3,4};
		int b[]= {1,2,3,4};
		
		boolean result = Arrays.equals(a, b);
		
		if(result==true) {
			System.out.println("equals");
		}else {
			System.out.println("not equals");
		}*/
		
		int a[]= {1,2,3,4,5};
		int b[]= {2,2,3,4,5};
		
		boolean result = true;
		
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
				result=false;
			}
			}	
		}else{
			result=false;
		}
		if(result==true) {
			System.out.println("equal");
		}else{
			System.out.println("not equal");
		}
	}

}
