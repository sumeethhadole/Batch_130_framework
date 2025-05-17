package Java_imp;

public class Palindrome {

	public static void main(String[] args) {

		   String str = "radar";
	        boolean isPalindrome = true;
	        int i = 0, j = str.length() - 1;
	        while (i < j) {
	            if (str.charAt(i) != str.charAt(j)) {
	                isPalindrome = false;
	                break;
	            }
	            i++;
	            j--;
	        }
	        System.out.println(isPalindrome ? "Palindrome" : "Not a Palindrome");
	     }
	  }