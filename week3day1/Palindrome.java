package week3day1;

import java.util.Arrays;

public class Palindrome {
	public static void main(String[] args) {
		String input="LERREL";
		char[] newArray = input.toCharArray();
		String rev="";  
		for(int i=newArray.length-1;i>=0;i--){  
	        rev+=newArray[i];  
	    }
	    char[] a = input.toCharArray();
		char[] b = rev.toCharArray();
        if(Arrays.equals(a, b)) {
			System.out.println("LERREL is palindrome");
		}
		else 
		{
			System.out.println("LERREL is not palindrome");
}
}
}