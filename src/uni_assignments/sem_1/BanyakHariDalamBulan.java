package uni_assignments.sem_1;
import java.util.Scanner;

public class BanyakHariDalamBulan {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			String bulan = scan.next();
				   bulan = bulan.toLowerCase();

			switch (bulan) {
			case "1", "januari", "january", "3", "maret", "march", "5", "mei", "may", "7", "juli", "july", "8", "agustus", "august", "10", "oktober", "october", "12", "desember", "december":
				System.out.println("31");
				break;
			case "2", "februari", "february":
				System.out.println("28");
				break;
			case "4", "april", "6", "juni", "june", "9", "september", "11", "november":
				System.out.println("30");
				break;
			default:
				System.out.println("tidak manuk akal");
			}
		}
	}
}
