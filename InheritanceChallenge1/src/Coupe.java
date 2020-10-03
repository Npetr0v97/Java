public class Coupe extends  Car{

    private double length;
    private double width;

    public Coupe(){

        this("understeers",6,200,4,200,4,1.5);
    }

    public Coupe(String steering, int numberOfGears, int maxSpeed, int passengerCapacity, int horsepower, double length, double width) {
        super(steering, numberOfGears, maxSpeed, passengerCapacity, horsepower);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void printStats() {

        System.out.println("Car parameters \n-----------------\n" +
                "Car length: "+this.getLength() + "\nCar width: " + this.getWidth() +
                "\nHorsepower: "+ this.getHorsepower() + "\nTop speed: " + this.getMaxSpeed() +
                "\nCar steering: "+this.getSteering() + "\nNumber of gears: " + this.getNumberOfGears() +
                "\nPassenger capacity: " + this.getPassengerCapacity());
    }

    public void printSpeedStats(){

        System.out.println("The vehicle is moving with " + this.getCurrentSpeed() + " km/h and is on " + this.getCurrentGear() + " gear");
    }
}
