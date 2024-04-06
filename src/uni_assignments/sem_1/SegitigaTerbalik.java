package uni_assignments.sem_1;

import java.util.Scanner;

public class SegitigaTerbalik {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Masukkan tinggi (atau lebar alas) segitiga : ");
		int tinggi = scan.nextInt();

		// 	Jika input tidak pasti berupa integer :
		/*
		 * 	while (!scan.hasNextInt()) {
		 * 		System.out.print("\nMaaf masukkan anda tidak sesuai, masukkan input kembali : ");
		 * 		scan.next();
		 * 	}
		 * 	tinggi = scan.nextInt();
		 *
		 */

		System.out.print("\nSegitiga yang terbentuk :\n\n");
		for (int i=1; i<=tinggi; ++i) {
			for (int j=i; j<=tinggi; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}

}
