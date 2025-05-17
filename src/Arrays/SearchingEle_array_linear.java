package Arrays;

public class SearchingEle_array_linear {

	public static void main(String[] args) {

		int a[]= {12,21,15,13};
		
		int search_element=21;
		boolean status=false;
		
		for(int i=0;i<=a.length-1;i++) 
			if(a[i]==search_element) {
			System.out.println("element found");
			status=true;
			break;
		}
	
	if(status==false) {
		System.out.println("element not found");
	}
}
}
