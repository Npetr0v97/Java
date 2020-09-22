public class MathClass {

    public static int powerOfTwo(int number) {

        return number*number;
    }

    public static int twoToPowerOfN(int power) {

        int result=1;

        for (int i=1; i<=power; i++) {

             result *= 2;
        }

        return result;
    }
}
