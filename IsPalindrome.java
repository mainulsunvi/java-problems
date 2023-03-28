import java.util.Scanner;

public class IsPalindrome {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String str = reader.next();
		String revStr = "";
		int i, flag = 0, len = str.length();

		for (i = (len - 1); i >= 0; --i) {
			revStr = revStr + str.charAt(i);
		}

		if (str.toLowerCase().equals(revStr.toLowerCase())) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome!");
		}
	}
}
