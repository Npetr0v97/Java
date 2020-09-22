public class LargestPrime {

    public static int getLargestPrime (int number) {

        if (number <= 1) {

            return -1;
        }

        int largestPrime=1;
        boolean notPrime;
        for (int i=1; i<=number; i++) {
            notPrime=false;
            if (number % i == 0) {


                for (int j=2; j<=i/2; j++) {

                    if (i % j == 0) {

                        notPrime=true;
                    }
                }

                if (!notPrime) {

                    largestPrime=i;
                }
            }
        }

        return largestPrime;
    }
}
