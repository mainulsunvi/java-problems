import java.util.Scanner;

// Sum Of Factorials (1! + 2! + 3! + ....+ n!)

public class SumFact {
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}
	public static void main(String[] args) {
		int i, n,fact, sum = 0;
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter Counter: ");
		n = scn.nextInt();

		for (i = n; i != 0; i--) {
			fact = factorial(i);
			sum = sum + fact;
		}
		System.out.println(sum);
	}
}
