package uni_assignments;

public class Matrix01 {
    public static void main(String[] args) {
        double[][] matrix = new double[3][];
        matrix[0] = new double[]{29.3, 30.1, 32  , 35.9, 36.7, 33, 29};
        matrix[1] = new double[]{31  , 27  , 32.3, 29  , 25.8, 33, 30};
        matrix[2] = new double[]{32  , 29  , 21  , 22.5, 26  , 25, 23};

        for (int i = 0; i < 3; ++i) {
            double mean = 0;
            for (double x: matrix[i]) {
                mean += x;
            }
            mean /= 7;
            System.out.println(mean);
        }
    }
}