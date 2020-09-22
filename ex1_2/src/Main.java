public class Main {

    public static void main(String[] args) {


        System.out.println(Math.log(43)/Math.log(2));

       // System.out.println(Logarithm.calculateLogarithm(10, Logarithm.calculateLogarithm(10)));
        int numberOfElements=1;
        while (8 * Logarithm.powerOfTwo(numberOfElements) <= 64 * numberOfElements * Logarithm.calculateLogarithm(numberOfElements)) {
            System.out.println("For " + numberOfElements + " number of elements insertion sort is better");
            numberOfElements++;
        }

        System.out.println("For " + numberOfElements + " number of elements merge sort is better");


        numberOfElements=3;
        while (8 * Logarithm.powerOfTwo(numberOfElements) <= 64 * numberOfElements * (Math.log10(numberOfElements)/Math.log10(2))) {

            System.out.println("For " + numberOfElements + " number of elements insertion sort is better");
            numberOfElements++;
        }

        System.out.println("For " + numberOfElements + " number of elements merge sort is better");


    }
}
