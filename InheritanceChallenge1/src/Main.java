public class Main{

    public static void main(String[] args) {

        Coupe bmw = new Coupe();

        bmw.setLength(2.5);
        bmw.setWidth(1.2);
        bmw.setHorsepower(220);
        bmw.setMaxSpeed(240);
        bmw.setSteering("oversteers");
        bmw.setNumberOfGears(7);
        bmw.setPassengerCapacity(3);

        bmw.printStats();

        bmw.setCurrentGear(5);
        bmw.setCurrentSpeed(200);
        bmw.printSpeedStats();

        bmw.setCurrentSpeed(50);
        bmw.setCurrentGear(7);
        bmw.printSpeedStats();
    }
}
