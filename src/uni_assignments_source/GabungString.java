package uni_assignments_source;

import java.util.Scanner;

public class GabungString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Masukkan input-input yang akan dijadikan paragraf:");
		System.out.println("(Masukkan \"-\" jika semua input sudah dimasukkan)\n");

		String paragraf = "";
		String input = scan.next();

		while (!input.equals("-")) {
			paragraf += input + " ";
			input = scan.next();
		}

		System.out.print("\nParagraf yang terbentuk: " + paragraf);

		// Untuk menghilangkan spasi tambahan di akhir paragraf jika output yang diminta char-sensitive
		System.out.println("\n\nParagraf yang terbentuk tanpa spasi tambahan: " + paragraf.trim());
		scan.close();
	}

}