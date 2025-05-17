package Arrays;

import java.util.Arrays;

public class Array_single {

	public static void main(String[] args) {
       // 1st approach
		int v[]= new int[6];
		v[0]=15;
		v[1]=12;
		v[2]=11;
		v[3]=32;
		v[4]=55;
		v[5]=22;
		System.out.println(Arrays.toString(v));
		
		//2nd approach
		
		int a[]= {12,13,14,15,16,21};
		System.out.println(a.length);
		
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(" "+a[i]);
		}
		
	}

}
