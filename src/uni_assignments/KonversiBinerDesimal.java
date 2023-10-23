package uni_assignments;

import java.util.Scanner;

public class KonversiBinerDesimal {

    public static long desimalKeBiner(long desimal) {
        long biner = 0;
        int basisPengali = 1;

        while (desimal != 0) {
            biner += (desimal % 2) * basisPengali;
            desimal /= 2;
            basisPengali *= 10;
        }

        return biner;
    }

    /*
     * Struktur yang sama juga dapat digunakan
     * untuk mengubah biner ke desimal
     */
    public static long binerKeDesimal(long biner) {
        long desimal = 0;
        int basisPengali = 1;

        while (biner != 0) {
            desimal += (biner % 10) * basisPengali;
            biner /= 10;
            basisPengali *= 2;
        }

        return desimal;
    }

    public static long cekBilanganBulat() {
        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextLong()) {
            scan.nextLine();
            System.out.print("\nMaaf input anda tidak sesuai");
            System.out.print("\nTolong masukkan input kembali : ");
        }

        long bilangan = scan.nextLong();
        scan.close();

        return bilangan;
    }

    public static void main(String[] args) {
        long desimal;

        System.out.print("Input (desimal) : ");
        desimal = cekBilanganBulat();

        System.out.println("\nOutput : " + desimalKeBiner(desimal));
    }
}