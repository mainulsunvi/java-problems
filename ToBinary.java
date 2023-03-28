import java.util.Scanner;

public class ToBinary {
	public static void main(String[] args) {
		int num;

		Scanner reader = new Scanner(System.in);

		System.out.print("Enter a Decimal Number: ");
		num = reader.nextInt();

		int binary[] = new int[32];
		int index = 0;

		while (num > 0) {
			binary[index++] = num % 2;
			num = num / 2;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
	}
}
