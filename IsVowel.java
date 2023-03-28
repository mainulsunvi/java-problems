import java.util.Scanner;

// Check Whether a Character is a Vowel or Consonant

class IsVowel {
	public static void main(String[] args) {
		char[] vowels = { 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' };

		char n;
		int i, flag = 0;
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter a Latter: ");
		n = scn.next().charAt(0);

		for (i = 0; i < vowels.length; i++) {
			if (n == vowels[i]) {
				flag++;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("It is a Vowel!");
		} else {
			System.out.println("It is a Consonant!");
		}
	}
}