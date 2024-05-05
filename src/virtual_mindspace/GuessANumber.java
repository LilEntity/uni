package virtual_mindspace;

import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {

        int guess = 0;
        Scanner scan = new Scanner(System.in);

        while (guess != 10) {
            int answer = (int) (Math.random() * 10);
            int live = 3;
            String pos;

            for (; live != 0; --live) {
                System.out.print("Input your guess (0-9) : ");
                while (!scan.hasNextInt()) {
                    scan.nextLine();
                    System.out.print("Please try again : ");
                }
                guess = scan.nextInt();
                if (guess == 10) {
                    break;
                }
                if (guess == answer) {
                    System.out.println("Congratulations!\n");
                    break;
                }
                if (live == 1) {
                    System.out.println("The number is : " + answer);
                    System.out.println("Better luck next time :)\n");
                    break;
                }

                System.out.println("Not quite there... try again");
                if (answer > guess) {
                    pos = "bigger";
                }
                else {
                    pos = "smaller";
                }
                System.out.println("The number is " + pos + " than your guess\n");
            }
        }

        scan.close();
    }
}
