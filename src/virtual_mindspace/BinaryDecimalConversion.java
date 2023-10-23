package virtual_mindspace;

import java.util.Scanner;

public class BinaryDecimalConversion {
    public static void main(String[] args) {
        Pengkonversi binDes = new Pengkonversi();

        binDes.binerKeDesimal();
        binDes.desimalKeBiner();
        // panggil method kembali jika ingin melakukan konversi lagi
    }
}

class Pengkonversi {

    private int des;
    private int bin;
    private int i;
    private int checker=2;
    private String cekBiner;
    Scanner scan = new Scanner(System.in);

    void binerKeDesimal() {

        // Checker
        System.out.print("\nMasukkan bilangan biner (kurang dari 100 0000 0000): ");
        while (!scan.hasNextInt() || checker > 1) {
            if (!scan.hasNextInt()) {
                System.out.println("  ...Bilangan yang anda masukkan tidak sesuai, coba lagi");
                scan.next();
                continue;
            }
            else {
                cekBiner = scan.next();
                for (i = 0; i < cekBiner.length(); i++) {
                    checker = cekBiner.charAt(i) - '0';
                    if (checker > 1) { break; }
                }

                if (checker > 1) {
                    System.out.println("  ...Bilangan yang anda masukkan bukan bilangan biner, coba lagi");
                    continue;
                }
                checker = 2;
                break;
            }
        }
        bin = Integer.parseInt(cekBiner);

        // Converter
        System.out.print(bin + " dalam bentuk biner adalah: ");
        for (i = 0, des = 0; bin != 0; bin /= 10, i++) {
            des += (int) Math.pow(2,i)*(bin%10);
        }
        System.out.println(des);

    }

    void desimalKeBiner() {

        // Checker
        System.out.print("\nMasukkan bilangan desimal (kurang dari 1024): ");
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("  ...Bilangan yang anda masukkan tidak sesuai, coba lagi");
            if (scan.hasNextInt()) { break; }
        }
        des = scan.nextInt();

        // Converter
        System.out.print(des + " dalam bentuk biner adalah: ");
        for (i = 0, bin = 0; des != 0; des /= 2, i++) {
            bin += (int) Math.pow(10,i)*(des%2);
        }
        System.out.println(bin);

    }
}
