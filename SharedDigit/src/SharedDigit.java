public class SharedDigit {

    public static boolean hasSharedDigit (int firstNum, int secondNum) {

        if (firstNum < 10 || firstNum > 99 || secondNum < 10 || secondNum > 99) {

            return false;
        }

        int tempNumber= secondNum;
        int remainderOfFirstNum;
        int remainderOfSecondNum;
        while (firstNum != 0) {

            remainderOfFirstNum = firstNum % 10;

            while (secondNum != 0) {

                remainderOfSecondNum = secondNum % 10;

                if (remainderOfFirstNum == remainderOfSecondNum) {

                    return true;
                }

                secondNum /= 10;
            }
            secondNum = tempNumber;
            firstNum /= 10;
        }

        return false;
    }
}
