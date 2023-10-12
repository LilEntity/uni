package uni_assignments;

public class LatihanUTS {

	public static void main(String[] args) {

		// Buat array baru dengan besar 10
		int[] arr = new int[10];

		// isi array dengan angka dari 10 hingga 1
		for (int i=0; i<arr.length; ++i) {
			arr[i] = arr.length - i;
		}

		// Cari total jumlah semua data array
		// * 1. Buat variabel baru yang menyimpan akan jumlah semua data
		double total = 0;
		// * 2. Tambahkan setiap data kepada variabel total menggunakan perulangan
		for (int i=0; i<arr.length; ++i) {
			total += arr[i];
		}
		// * 3. Bagi hasil jumlah data dengan banyak data array
		total /= arr.length;
		System.out.println(total);

		// Cari angka terbesar dari semua data array
		/*
		 *  1. Buat variabel baru yang akan menyimpan angka terkecil,
		 *     jadikan data pertama array sebagai nilai variabel ini
		 */
		int min = arr[0];
		// * 2. Bandingkan angka yang disimpan variabel min dengan seluruh data array
		for (int i=1; i<arr.length; ++i) {
			/*
			 * 	3. Jika terdapat angka yang lebih besar dari variabel min,
			 *     gantikan nilai variabel min dengan angka tersebut
			 */
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);

		// Memperbarui nilai elemen-elemen array
		// * 1. Lakukan perulangan untuk setiap data array
		for (int i=0; i<arr.length; ++i) {
			// * 2. Tambah nilai data dengan index dimana nilai tersebut disimpan
			arr[i] += i;
			// * 3. Tampilkan data-data baru array
			System.out.print(arr[i] + " ");
		}

	}

}
