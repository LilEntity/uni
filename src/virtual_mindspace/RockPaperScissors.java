package virtual_mindspace;

import java.util.Scanner;
import java.lang.Math;

public class RockPaperScissors {
    public static void main(String[] args) {

        String[] res = {"rock", "paper", "scissors"};
        int guessIndex = 0;
        Scanner scan = new Scanner(System.in);

        while (guessIndex != 4) {
            int index = (int) (Math.random() * 3);
            String answer = res[index];
            System.out.print("enter your guess : ");
            String guess = scan.nextLine();
            guess = guess.toLowerCase();
            switch (guess) {
                case "rock", "r":
                    guessIndex = 0;
                    break;
                case "paper", "p":
                    guessIndex = 1;
                    break;
                case "scissors", "s":
                    guessIndex = 2;
                    break;
                case "quit", "end", "close":
                    guessIndex = 4;
                    continue;
                default:
                    System.out.println("...please try again");
                    continue;
            }

            if (index == guessIndex) {
                System.out.println("The computer chose " + answer + ", it's a tie!\n");
                continue;
            } else if ((index + 1)%3 == guessIndex) {
                System.out.println("The computer chose " + answer + ", congratulations!\n");
                continue;
            }
            System.out.println("Not quite... the computer chose " + answer + "!\n");
        }
        scan.close();
    }
}
