package virtual_mindspace;

//import java.util.ArrayList;
import java.util.Scanner;

public class PascalGenerator {
    public static void main(String[] args) {

        int totalIteration;

        try (Scanner scan = new Scanner(System.in)) {
            totalIteration = scan.nextInt();
        }

        long[] pascalDigitIntegers;
        pascalDigitIntegers = new long[totalIteration + 2];
        pascalDigitIntegers[0] = 1;
        long[] container;
        container = new long[totalIteration + 2];
        container[0] = 1;

        for (int i=0; i<=totalIteration; ++i) {
            for (int j=0; j<i; ++j) {
                container[j+1] = pascalDigitIntegers[j] + pascalDigitIntegers[j+1];
            }
            container[i+1] = 1;
            for (int j=0; j<=i; ++j) {
                pascalDigitIntegers[j] = container[j];
            }
            for (int j=0; j<=i; ++j) {
                System.out.print(pascalDigitIntegers[j] + " ");
            }
            System.out.println();
        }

    }
}
