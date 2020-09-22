public class Main {

    public static void main(String[] args) {

        for (int i=125; i < 164; i+=3){

            if (SumDigits.sumDigits(i)==-1) {

                System.out.println("Invalid value");
            } else {

                System.out.println("The sum of digits of " + i + " is " + SumDigits.sumDigits(i));
            }
        }
    }
}
