package Java_imp;

import java.util.Scanner;

public class Revverse_number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int num=sc.nextInt();
		
		// using algorith
		
		/*int rev=0;
		while(num!=0){
			rev=rev*10 + num%10;
			num=num/10;
		}
		System.out.println(rev);*/
		
		// StringBuffer
		
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer reve =sb.reverse();
		System.out.println(reve);
		
			
		}
	}


