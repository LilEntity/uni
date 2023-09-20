package uni_assignments;
import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {

        int input;
        String grade;

        try (Scanner scan = new Scanner(System.in)) {

            System.out.print("Masukkan input nilai yang akan dikonversi menjadi grade : ");
            while (!scan.hasNextInt()) {
                scan.nextLine();
                System.out.print("...Maaf input yang anda masukkan tidak sesuai, silahkan masukkan input kembali : ");
            }
            input = scan.nextInt();

        }

        if (input >= 85) {
            if (input >= 100) {
                grade = "InsyaAllah kumlaut bang";
            }
            else {
                grade = "A";
            }
        }
        else if (input >= 70) {
            grade = "B";
        }
        else if (input >= 60) {
            grade = "C";
        }
        else if (input >= 45) {
            grade = "D";
        }
        else if (input >= 0) {
            grade = "E";
        }
        else {
            grade = "Waduh gawat bang...";
        }
        System.out.println(grade);

    }
}