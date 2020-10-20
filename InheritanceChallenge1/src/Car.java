public class Car extends Vehicle{

    private int passengerCapacity;
    private int horsepower;

    public Car() {

        this("understeers",6,200,4,200);
    }

    public Car(String steering, int numberOfGears, int maxSpeed, int passengerCapacity, int horsepower) {
        super(steering, numberOfGears, maxSpeed);
        this.passengerCapacity = passengerCapacity;
        this.horsepower = horsepower;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
}
