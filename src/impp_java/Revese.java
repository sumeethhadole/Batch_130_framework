package impp_java;

public class Revese {

	public static void main(String[] args) {

		
		String name = "sumeet";
		
		String rev = new StringBuilder(name).reverse().toString();
		
		System.out.println(rev);
		
		
		String n="selenium";
		
		String r = new StringBuffer(n).reverse().toString();
		System.out.println(r);
		
		String input = "Success";
		String output = "";
		
		for(int i=input.length()-1;i>=0;i--) {
			output +=input.charAt(i);
		}
		System.out.println(output);
	}

}
