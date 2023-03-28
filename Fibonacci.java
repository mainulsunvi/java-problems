import java.util.Scanner;

// Fibonacci number generation

public class Fibonacci {
	public static void main(String[] args) {
		int first, second, third, n, i;
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter the Counter: " );
		n = scn.nextInt();
		first = 0;
		second = 1;

		System.out.println(first);
		System.out.println(second);

		for (i = 0; i < n; i++) {
			third = first + second;

			System.out.println(third);

			first = second;
			second = third;
		}
	}	
}
