import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int average = 0;
        int counter = 1;
        int number = 0;
        boolean isAnInt;

        while (true) {
            isAnInt = scanner.hasNextInt();

            if (isAnInt) {

                number = scanner.nextInt();
                sum += number;
                average = (int) Math.round((double) sum / (double) counter);
                counter++;

            } else {

                break;
            }

            scanner.nextLine();
        }


        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}
