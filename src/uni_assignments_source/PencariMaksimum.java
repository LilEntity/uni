package uni_assignments_source;
import java.util.Scanner;

public class PencariMaksimum {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			double max = 0;

			System.out.print("Masukkan banyak angka yang akan diinput\t: ");
			while (!scan.hasNextInt()) {
				scan.next();
				System.out.println("\nMaaf, input yang anda masukkan tidak sesuai.");
				System.out.print("\t\tMasukkan input kembali\t: ");
			}
			int amount = scan.nextInt();

			System.out.print("\nMasukkan angka-angka yang ingin diuji\t: \n\n");
			while (amount!=0) {
				while (!scan.hasNextDouble()) {
					scan.next();
					System.out.println("Maaf, input yang anda masukkan tidak sesuai.");
					System.out.print("Masukkan input kembali\t: \n\n");
				}
				double currentNumber = scan.nextDouble();
				if (max < currentNumber) {
					max = currentNumber;
				}
				--amount;
			}

			System.out.print("\nAngka terbesar yang ditemukan adalah\t: ");
			System.out.println(max);
		}
	}
}
