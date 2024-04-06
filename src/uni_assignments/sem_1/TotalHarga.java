package uni_assignments.sem_1;
import java.util.Scanner;

public class TotalHarga {
	public static void main(String[] args) {
		long penghapus = 500;
		long pensil = 1500;
		long penggaris = 5500;

		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan tipe barang dan jumlah barang : ");
		System.out.println("Penghapus\t: Rp 500");
		System.out.println("Pensil\t\t: Rp 1.500");
		System.out.println("Penggaris\t: Rp 5.500");
		String jenis = scan.next();
		jenis = jenis.toLowerCase();
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
				System.out.println("Masukan tidak sesuai");
				jumlah = 0;
		}

		System.out.println("Total harga : Rp " + jumlah);
		scan.close();
	}
}