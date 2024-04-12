package uni_assignments.sem_2.asdl;

public class Main {

    public static void main(String[] args) {

        Algorithm algo = new Algorithm();
        long[] arr = { 3, 12, 2, 1, 15, 10, 11, 14, 9, 4, 8, 7, 6, 5, 13};

        algo.mergeSort(arr);
        for (long x: arr) {
            System.out.print(x + " ");
        }
    }
}
