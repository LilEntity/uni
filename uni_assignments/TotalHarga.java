package uni_assignments;
import java.util.Scanner;

public class TotalHarga {
	public static void main(String[] args) {
		long penghapus = 500;
		long pensil = 1500;
		long penggaris = 5500;

		Scanner scan = new Scanner(System.in);
		String jenis = scan.next();
		int jumlah = scan.nextInt();

		switch (jenis) {
			case "penghapus":
				jumlah *= penghapus;
				break;
			case "pensil":
				jumlah *= pensil;
				break;
			case "penggaris":
				jumlah *= penggaris;
				break;
			default:
				System.out.println("Masukkan tidak sesuai");
				jumlah = 0;
		}

		System.out.println(jumlah);
	}
}