public class SumDigits {

    public static int sumDigits(int number) {

        int sumOfDigits = 0;
        if (number < 10) {

            return -1;
        } else {

            while (number>0) {

                sumOfDigits += number % 10;
                number /= 10;
            }

            return sumOfDigits;
        }
    }
}
