package uni_assignments;

import java.util.Scanner;

class Matrix {
    private int row;
    private int column;
    private double[][] matrix;

    public Matrix(int r, int c) {
        this.row = r;
        this.column = c;
        matrix = new double[r][c];
    }

    public double get(int r, int c) {
        return matrix[r][c];
    } public void set(int r, int c, double d) {
        matrix[r][c] = d;
    }

    public int getRow() {
        return this.row;
    } public int getColumn() {
        return this.column;
    }

    public void fill(String source) {
        Scanner scan = new Scanner(source);
        try {
            for (int i = 0; i < row; ++i) {
                for (int j = 0; j < column; ++j) {
                    try {
                        matrix[i][j] = scan.nextDouble();
                    } catch (Exception e) {
                        scan.next();
                        System.out.println("Masukan tidak valid");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Masukan tidak mencukupi");
        }
        scan.close();
    }

    public double mean(int r) {
        double sum = 0;
        for (double x : matrix[r]) {
            sum += x;
        }
        return sum / column;
    }

}

public class MatrixBuilder10 {
    public static void main(String[] args) {
        String input = "29.3 30.1 32   35.9 36.7 33 29 " +
                       "31   27   32.3 29   25.8 33 30 " +
                       "32   29   21   22.5 26   25 23 " ;
        Matrix matrix = new Matrix(3, 7);
        matrix.fill(input);

        for (int i = 0; i < 3; ++i) {
            System.out.println(matrix.mean(i));
        }
    }
}