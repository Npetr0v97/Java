public class FirstLastDigitSum {

        public static int sumFirstAndLastDigit(int number) {

            if (number < 0) {

                return -1;
            }

            int sumOfDigits;
            int divider=1;
            int remainder;
            sumOfDigits = number % 10;
            int originalNumber=number;
            int power=0;

            while (number!=0) {

                number/=10;
                power++;
            }

            for (int i=power; i>1; i--) {

                divider*=10;
            }
            remainder = originalNumber / divider;
            sumOfDigits += remainder;

            return sumOfDigits;
        }
}
