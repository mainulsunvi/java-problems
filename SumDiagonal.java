import java.util.Scanner;

public class SumDiagonal {
	public static void main(String[] args){
		int i, j, sum = 0;
		Scanner reader = new Scanner(System.in);

		int[][] matrix =  new int [3][3];

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print("Enter array elements: ");
				matrix[i][j] = reader.nextInt();
			}
		}
		
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (i == j) {
					sum = sum + matrix[i][j];
				}
			}
		}
		System.out.println("The Summation is: "+sum);
	}
}
