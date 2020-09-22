public class FactorPrinter {

    public static void printFactors(int number) {

        if (number < 1) {

            System.out.println("Invalid Value");
        }

        int factor=1;

        for (int i=factor; i <= number; i++) {

            if (number % i == 0) {

                System.out.println(i);
            }
        }
    }
}
