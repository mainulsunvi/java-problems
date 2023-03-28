import java.util.Scanner;

// Check wheater a Given Number Prime or Not

public class PrimeCheck {
	public static void main(String[] args) {
		int i, n, itr;
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter a Number: ");
		n = scn.nextInt();

		itr = n / 2;

		for (i = 2; i <= itr; i++) {
			if (n % i == 0) {
				System.out.println("Not a Prime Number!");
				return;
			}
		}

		System.out.println(n + " is a Prime Number!");

	}
}
