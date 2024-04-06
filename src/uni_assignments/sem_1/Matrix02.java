package uni_assignments.sem_1;

import java.util.Scanner;

public class Matrix02 {
    public static void main(String[] args) {
        int row = 3;
        int column = 7;
        String source = "29.3 30.1 32   35.9 36.7 33   29  " +
                        "31   27   32.3 29   25.8 33   30  " +
                        "32   29   21   22.5 26   25   23  " ;
        Scanner scan = new Scanner(source);
        double[][] matrix = new double[row][column];

        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < column; ++j) {
                matrix[i][j] = scan.nextDouble();
            }
        }

        for (int i = 0; i < 3; ++i) {
            double mean = 0;
            for (double x: matrix[i]) {
                mean += x;
            }
            mean /= 7;
            System.out.println(mean);
        }

        scan.close();
    }
}