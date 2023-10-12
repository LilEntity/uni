package uni_assignments;
import java.util.Scanner;

public class KalkulatorSederhana
{
	static Scanner scan = new Scanner(System.in);

	static double angka1, angka2, hasil;
	static String operasi;

	// Fungsi untuk menerima input
	static void terimaInput()
	{
		System.out.print("Masukkan bilangan pertama\t: ");

		// Cek apakah input pertama termasuk double
		while (!scan.hasNextDouble())
		{
			scan.next();
			System.out.print("   ... input yang anda masukkan tidak " +
					  "sesuai, tolong masukkan input kembali : ");
		}
		angka1 = scan.nextDouble();

		System.out.print("\nMasukkan bilangan kedua\t\t: ");

		// Cek apakah input kedua termasuk double
		while (!scan.hasNextDouble())
		{
			scan.next();
			System.out.print("   ... input yang anda masukkan tidak " +
					  "sesuai, tolong masukkan input kembali : ");
		}
		angka2 = scan.nextDouble();

		// Ambil input operasi
		System.out.print("\nMasukkan operator yang ingin digunakan, " +
				    "operator dapat berupa:");

		System.out.print("\n   tambah (+)\t\t    kurang (-) \n\t  " +
				    "kali (* atau x)\t   dan bagi (/ atau :)");

		System.out.print("\nAnda bisa mereset input bilangan dengan " +
				    "menulis \"reset\"");

		System.out.print("\nMasukkan operator anda\t\t: ");
		operasi = scan.next();
		operasi = operasi.toLowerCase();
	}

	// Fungsi main
	public static void main(String[] args)
	{
		terimaInput();

		// Lakukan perulangan untuk kalkulasi berikutnya
		while (true)
		{
			// Cek operasi apa yang diminta
			switch (operasi)
			{
			case "tambah", "+", "plus", "add" :
				hasil = angka1 + angka2;
				operasi = "+";
				break;
			case "kurang", "-", "minus", "subtract", "min" :
				hasil = angka1 - angka2;
				operasi = "-";
				break;
			case "kali", "*", "x", ".", "multiply" :
				hasil = angka1 * angka2;
				operasi = "*";
				break;
			case "bagi", "/", ":", "divide", "div" :
				hasil = angka1 / angka2;
				operasi = "/";
				break;
			// Jika user ingin menginput ulang angka-angka
			case "reset" :
				System.out.println();
				terimaInput();
				continue;
			// Jika input operasi tidak sesuai
			default :
				System.out.print("   ... operasi yang anda masukkan " +
				      "tidak sesuai, tolong masukkan input kembali: ");
				operasi = scan.next();
				operasi = operasi.toLowerCase();
				continue;
			}

			System.out.print("\nHasil dari " + angka1 + " " + operasi +
					    " " + angka2 + " = " + hasil + "\n\n");
			System.out.print("---------------------------------" +
					    "-----------------------------\n\n");
			terimaInput();
		}
	}
}