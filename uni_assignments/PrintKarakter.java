package uni_assignments;
import java.util.Scanner;

public class PrintKarakter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		char karakter = input.charAt(0);

		while (karakter >= 'a' && karakter <= 'z' || karakter >= 'A' && karakter <= 'Z') {
			System.out.print(karakter);
			++karakter;
		}
	}
}