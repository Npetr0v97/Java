public class SumOdd {

    public static boolean isOdd (int number) {

        if (number<=0) {

            return false;
        }

        if (number%2==1){

            return true;
        }

        return false;
    }

    public static int sumOdd(int start, int end) {

        if (start>end || start<=0 || end<=0) {

            return -1;
        } else {

            int sum=0;
            for (int i=start; i<=end; i++) {

                if (isOdd(i)){

                    sum+=i;
                }
            }

            return sum;
        }
    }

    public static void printResults(int start, int end) {

        int sum = sumOdd(start, end);
        if (sum != -1) {

            System.out.println("Sum is "+ sum);
        } else {

            System.out.println("Invalid range");
        }
    }
}
