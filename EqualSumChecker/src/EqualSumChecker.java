public class EqualSumChecker {

    public static boolean hasEqualSum(int firstNumber, int secondNumber, int thirdNumber) {

        if ((firstNumber+secondNumber)==thirdNumber) {

            return true;
        } else {

            return false;
        }
    }

    public static void printResult(int firstNumber, int secondNumber, int thirdNumber) {

        boolean areEqual = hasEqualSum(firstNumber,secondNumber,thirdNumber);
        if (areEqual) {

            System.out.println("The sum of the first and second number is equal to the third number");
        } else {

            System.out.println("The sum of the first and second number is NOT equal to the third number");
        }
    }
}
