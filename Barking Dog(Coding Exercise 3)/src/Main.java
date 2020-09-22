public class Main {

    public static void main(String[] args) {

        boolean doesItBark = BarkingDog.shouldWakeUp(true,-1);

        if (doesItBark) {

            System.out.println("The dog is barking");
        } else {

            System.out.println("The dog is not barking");
        }
    }
}
