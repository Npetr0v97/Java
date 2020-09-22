public class LastDigitChecker {

    public static boolean hasSameLastDigit (int firstNum, int secondNum, int thirdNum) {

        if (firstNum < 10 || firstNum > 1000 || secondNum < 10 || secondNum > 1000 || thirdNum < 10 || thirdNum > 1000) {

            return false;
        }

        int firstNumRemainder = firstNum % 10;
        int secondNumRemainder = secondNum % 10;
        int thirdNumRemainder = thirdNum % 10;

        if (firstNumRemainder == secondNumRemainder || firstNumRemainder == thirdNumRemainder || thirdNumRemainder == secondNumRemainder) {

            return true;
        }

        return false;
    }

    public static boolean isValid (int number) {

        if (number < 10 || number > 1000) {

            return false;
        }

        return true;

    }
}
