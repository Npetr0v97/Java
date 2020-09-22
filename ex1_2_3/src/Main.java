public class Main {

    public static void main(String[] args) {

        int number=1;

        while (100 * MathClass.powerOfTwo(number) > MathClass.twoToPowerOfN(number)) {

            System.out.println("For the number of " + number + " 100*n^2 > 2 ^n");
            number++;
        }

        System.out.println("For the number of " + number + " 100*n^2 < 2 ^n");

        System.out.println(Long.MAX_VALUE);
        long century = 1000000l * 60l* 60l * 24l * 365l * 100l;
        System.out.println(century);
    }
}
