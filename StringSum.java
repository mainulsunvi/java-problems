import java.util.Scanner;



public class StringSum {
	public static double factorial(double n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		int x, i, n;
		double fact = 0, exp = 0, sum = 0; 

		Scanner reader = new Scanner(System.in);

		System.out.print("Enter Exponent Number: ");
		x = reader.nextInt();
		System.out.print("Enter Iteration Number: ");
		n = reader.nextInt();

		for (i = 1; i < n; i++) {
			if (i % 2 != 0) {
				fact = factorial(i);
			}

			if (i % 2 == 0) {
				exp = Math.pow(x, i);
			}
			sum = sum + (exp / fact);
		}

		System.out.println(sum);
	}

}
