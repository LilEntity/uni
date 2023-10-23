package virtual_mindspace;

import java.util.Scanner;

public class Playground {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            // int x = 1002010;
            // while (x != 0) {
            //     String a = scan.next();
            //     String b = scan.next();
            //     String c = b;
            //     System.out.println(a + b + c);
            // }
            double x = scan.nextDouble();
            double y = scan.nextDouble();
            double z = x+y;
            System.out.println(z);

        }
    }
}
