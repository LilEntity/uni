package uni_projects_source;

public class NegativeChecker {
    public static void main(String[] args) {

        double[][] array = {{0,7,5.5,10,-3,11}, {10,4,11,20.1,10,-1}};
        int counter = 0;
        String result = "false";

        while (counter < array.length) {
            for (double x: array[counter]) {
                if (x < 0) {
                    result = "true";
                    break;
                }
            }
            System.out.println(result);
            result = "false";
            ++counter;
        }

    }
}
