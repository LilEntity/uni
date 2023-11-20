package uni_assignments;

import java.util.Scanner;

public class RataMatriks2 {
    public static void main(String[] args) {
        int baris = 3;
        int kolom = 7;
        String data = "29.3 30.1 32   35.9 36.7 33   29  " +
                      "31   27   32.3 29   25.8 33   30  " +
                      "32   29   21   22.5 26   25   23  " ;
        Scanner scan = new Scanner(data);

        double[][] matriks = new double[baris][kolom];

        for (int i = 0; i < baris; ++i) {
            for (int j = 0; j < kolom; ++j) {
                matriks[i][j] = scan.nextDouble();
            }
        }

        for (int i = 0; i < 3; ++i) {
            double mean = 0;
            for (double x: matriks[i]) {
                mean += x;
            }
            mean /= 7;
            System.out.println(mean);
        }

        scan.close();
    }
}