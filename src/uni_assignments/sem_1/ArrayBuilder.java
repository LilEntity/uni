package uni_assignments.sem_1;

import java.util.Scanner;

public class ArrayBuilder {

    public static Scanner scan = new Scanner(System.in);

    public static long getInteger() {

        while (!scan.hasNextLong()) {
            scan.nextLine();
            System.out.print("\nMaaf, input tidak sesuai");
            System.out.print("\nMasukkan input kembali : ");
        }
        long output = scan.nextLong();
        return output;

    }

    public static long getIntegerWBound(long low, long up) {

        long input = getInteger();
        if (input >= low && input <= up) {
            return input;
        } else {
            scan.nextLine();
            System.out.print("\nInput diluar jangkauan");
            System.out.print("\nMasukkan input kembali : ");
            return getIntegerWBound(low, up);
        }

    }

    public static long[] buildArray(int length) {

        long[] arr = new long[length];
        for (int i = 0; i < length; ++i) {
            arr[i] = getInteger();
        }
        return arr;

    }

    public static long sumArrayElements(long[] arr) {

        long sum = 0;
        for (long elem : arr) {
            sum += elem;
        }
        return sum;

    }

    public static void displayArrayElements(long[] arr) {

        for (long elem : arr) {
            System.out.print(elem + " ");;
        }

    }

    public static void main(String[] args) {

        System.out.print("Masukkan besar array (1-50) : ");
        int length = (int) getIntegerWBound(1, 50);

        System.out.print("\nMasukkan elemen-elemen array : ");
        long[] arr = buildArray(length);

        System.out.print("\nElemen-elemen array :\n");
        displayArrayElements(arr);

        System.out.print("\n\nJumlah seluruh elemen array  : ");
        long sum = sumArrayElements(arr);
        System.out.print(sum);

    }
}