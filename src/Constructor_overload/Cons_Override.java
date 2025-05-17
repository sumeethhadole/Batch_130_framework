package Constructor_overload;

import Constructor_overload.outerclass.Nestedclass;

public class Cons_Override {

	public static void main(String[] args) {

		outerclass.Nestedclass o = new outerclass.Nestedclass();
		o.display();	
	}

}
class  outerclass{
	static int outerstaticval=88;
	static  class Nestedclass{
		void display() {
			System.out.println("This is outer static variable = "+outerstaticval);
		}
	}
}