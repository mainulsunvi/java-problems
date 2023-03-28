import java.util.Scanner;

public class UniqueElems {
	public static void main(String[] args) {
		int i,n, sum = 0;
		Scanner reader = new Scanner(System.in);

		System.out.print("Enter the Array Size: ");
		n = reader.nextInt();

		int arr[] = new int[n];

		for (i = 0; i < arr.length; i++) {
			arr[i] = reader.nextInt();
		}

		for (i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				continue;
			}
			sum = sum + arr[i];
		}

		System.out.println(sum);

	}
}
