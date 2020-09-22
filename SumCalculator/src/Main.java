public class Main {

    public static void main(String[] args) {


        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(10.25d);
        calculator.setSecondNumber(0.25d);

        System.out.println("First number is: " + calculator.getFirstNumber());
        System.out.println("First number is: " + calculator.getSecondNumber());

        System.out.println("The addition of the numbers is: " + String.format("%.2f",calculator.getAdditionResult()));
        System.out.println("The subtraction of the numbers is: " + String.format("%.2f",calculator.getSubtractionResult()));
        System.out.println("The multiplication of the numbers is: " + String.format("%.2f",calculator.getMultiplicationResult()));
        System.out.println("The division of the numbers is: " + String.format("%.2f",calculator.getDivisionResult()));
    }
}
