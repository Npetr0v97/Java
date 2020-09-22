public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int firstNum, int secondNum) {

        if (firstNum < 10 || secondNum < 10) {

            return -1;
        }

        int greatestDivisor = 1;
        int divisor = 1;

        while (firstNum / 2 >= divisor || secondNum / 2 >= divisor) {

            if (firstNum % divisor == 0 && secondNum % divisor == 0) {

                greatestDivisor = divisor;
            }

            divisor++;
        }
        return greatestDivisor;
    }
}
