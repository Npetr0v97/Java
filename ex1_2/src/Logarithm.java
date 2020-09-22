public class Logarithm {

    public static double calculateLogarithm(int number) {
        if (number==1) {

            return 1;
        }
        double power=1;
        double lastNumber=0;
        double result=1;
        while (result<=number) {

            result=1;
            for (int i=0; i<power; i++) {

                result *= 2;
            }
            if (result<number) {
                lastNumber=power;
                power++;
            } else {

                break;
            }
        }
        result=1.0;
        for (int i=0; i<power; i++) {

            result*=2;
        }
        if (result > number) {

            return lastNumber;
        } else {

            return power;
        }


    }

    public static int powerOfTwo(int number) {

        return number*number;
    }
//
//    public static double calculateLogarithm(int number, double power) {
//        power=calculateLogarithm(number);
//        double lastNumber=power;
//        power+=0.1;
//        double rootNumber=0.1;
//        double result=1;
//        for (int i=1; i<=(int)power; i++) {
//
//            result*=2;
//        }
//
//        return result;
//    }
//
//    public static double rootOfTen(int number,) {
//
//        double lastResult=0;
//        double root=0.1;
//        double result=1;
//        while (result < number) {
//
//            for (int i=0; i<10; i++) {
//
//                result=
//            }
//        }
//    }
}
