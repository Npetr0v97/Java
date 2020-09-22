public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {




        firstNumber *= 1000;
        secondNumber *= 1000;

        if ((int)firstNumber==(int)secondNumber){

            return true;
        } else {

            return false;
        }

    }

    public static void printResult(double firstNumber, double secondNumber) {

        boolean equality = areEqualByThreeDecimalPlaces(firstNumber,secondNumber);

        if (equality) {

            System.out.println("The two numbers are equal by three decimal places");
        } else {

            System.out.println("The two numbers are NOT equal by three decimal places");
        }
    }
}
