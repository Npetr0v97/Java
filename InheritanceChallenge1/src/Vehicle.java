public class Vehicle {

    private String steering;
    private int numberOfGears;
    private int maxSpeed;
    private int currentGear;
    private int currentSpeed;

    public Vehicle(){

        this("understeers",5,150);
    }

    public void setCurrentGear(int currentGear){

        if (currentGear<0 || currentGear>numberOfGears) {

            this.currentGear=0;
        } else {

            this.currentGear=currentGear;
        }
    }

    public void setCurrentSpeed(int increase) {

        if (this.currentSpeed+increase > maxSpeed){

            this.currentSpeed = this.maxSpeed;
            System.out.println("Vehicle has reached top speed");
        } else {

            this.currentSpeed = this.currentSpeed + increase;
        }
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public Vehicle(String steering, int numberOfGears, int maxSpeed) {
        this.steering = steering;
        this.numberOfGears = numberOfGears;
        this.maxSpeed = maxSpeed;
    }

    public String getSteering() {
        return steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
