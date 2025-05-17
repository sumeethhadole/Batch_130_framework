package Arrays;

public class Searching_ele_EnhanceForloop {

	public static void main(String[] args) {

       int a[]= {12,21,15,13};
		
		int search_element=15;
		boolean status=false;
		
		for(int x:a) {
			if(x==search_element) {
				System.out.println("element found");
				status=true;
				break;
			}
		}
		if (status==false) {
			System.out.println("not found");
		}

	}

}
