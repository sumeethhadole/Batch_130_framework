package Arrays;

public class Duplicate_count_array {

	public static void main(String[] args) {

		int a[]= {15,15,21,19,15,21};
		int num=19;
		int count=0;
		
		for(int value:a) {
			if(value==num) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
