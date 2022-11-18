package week3day1;

public class OddIndexToUppercase {
	public static void main(String[] args) {
		String name="changeme";
		char[] charArray =name.toCharArray();
		for (int i = 0; i < charArray.length; i=i+2) {
		charArray[i]=Character.toUpperCase(charArray[i]);
		}
		System.out.println(charArray);
		}
        }


