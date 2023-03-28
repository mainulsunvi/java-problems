import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		int mark, check;
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter your Mark: ");

		mark = reader.nextInt();

		if (mark > 100 || mark < 0) {
			System.out.println("Invalid Marks!");
			return;
		}

		switch (mark / 10) {
			case (10):
			case (9):
				System.out.println("A+");
				break;
			case (8):
				System.out.println("A");
				break;
			case (7):
				System.out.println("A-");
				break;
			case (6):
				System.out.println("B");
				break;
			case (5):
				System.out.println("C");
				break;
			case (4):
				System.out.println("D");
				break;
			default:
				System.out.println("Sorry, You're Failed!");
		}
	}
}