package uni_assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuKalkulatorSederhana {

	public static double tambah(double input1, double input2) {
		return input1 + input2;
	}

	public static double kurang(double input1, double input2) {
		return input1 - input2;
	}

	public static double kali(double input1, double input2) {
		return input1 * input2;
	}

	public static double bagi(double input1, double input2) {
		return input1 / input2;
	}

	public static void bukaMenuKalkulator() {
		Scanner scan = new Scanner(System.in);
		double input1 = 0, input2 = 0, hasil = 0;
		int operasi = 0;

		do {
			System.out.println("Menu Kalkulator Sederhana");
			System.out.println("_____________________________");
			System.out.println("Gunakan angka urut operasi");
			System.out.println("1. Tambah");
			System.out.println("2. Kurang");
			System.out.println("3. Kali");
			System.out.println("4. Bagi");
			System.out.println("5. Keluar");
			System.out.println("_____________________________");

			System.out.print("Masukkan angka pertama\t: ");
			input1 = scan.nextDouble();

			System.out.print("\nMasukkan angka kedua\t: ");
			input2 = scan.nextDouble();

			System.out.print("\nMasukkan operasi angka\t: ");
			try {
				operasi = scan.nextInt();
			} catch (InputMismatchException e) {
				scan.next();
				operasi = 6;
			}

			switch (operasi) {
				case 1:
					hasil = tambah(input1, input2);
					break;
				case 2:
					hasil = kurang(input1, input2);
					break;
				case 3:
					hasil = kali(input1, input2);
					break;
				case 4:
					hasil = bagi(input1, input2);
					break;
				case 5:
					System.out.println("\n> Mengeluarkan dari menu...");
					break;
				default:
					System.out.println("\n> Masukan anda tidak sesuai");
			}

			if (hasil % 1 == 0 && operasi >= 1 && operasi <= 4) {
				// * Menghilangkan titik jika hasil berupa integer
				System.out.println("\n> " + (int) hasil);
			} else if (hasil % 1 != 0 && operasi >= 1 && operasi <= 4) {
				System.out.println("\n> " + hasil);
			}

			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

			// * Memberi waktu kepada pengguna untuk membaca hasil
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}

		} while (operasi != 5);
		scan.close();
	}

	public static void main(String[] args) {
		bukaMenuKalkulator();
	}

}
