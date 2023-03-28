class TimeBook {
	TimeBook(String name) {
		System.out.println("Sorry! Enter More Info");
	}

	TimeBook(int phone) {
		System.out.println("Sorry! Enter More Info");
	}

	TimeBook(String name, String email) {
		System.out.println("Your Account is Created but We Need More info!");
	}

	TimeBook(String name, String email, int phone, int dob) {
		System.out.println("Congratulation! Your Account is Successfully Create");
	}
}

public class Main {
	public static void main(String[] args) {
		TimeBook t1 = new TimeBook("Sunvi");
		TimeBook t2 = new TimeBook("Sunvi", "sunvi@gmail.com");
		TimeBook t3 = new TimeBook("Sunvi", "sunvi@gmail.com", 29448, 14022000);
		TimeBook t4 = new TimeBook(01661);
	}
}
