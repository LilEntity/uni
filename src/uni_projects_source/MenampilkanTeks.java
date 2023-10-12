package uni_projects_source;
import java.util.Scanner;

public class MenampilkanTeks {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			String a, b, c;

			System.out.print("Masukkan kata untuk A\t: ");
			a = scan.nextLine();

			System.out.print("\nMasukkan kata untuk B\t: ");
			b = scan.nextLine();

			System.out.print("\nMasukkan kata untuk C\t: ");
			c = scan.nextLine();

			System.out.println("\nD = A + B + C : " + a + " " + b + " " + c);
		}

	}
}