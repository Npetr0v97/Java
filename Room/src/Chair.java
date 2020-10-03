public class Chair {

    private int numberOfLegs;
    private String type;
    private Dimensions dimensions;

    public Chair(int numberOfLegs, String type, Dimensions dimensions) {
        this.numberOfLegs = numberOfLegs;
        this.type = type;
        this.dimensions = dimensions;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public String getType() {
        return type;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void printChairData() {

        System.out.println("You have a " + type + " chair with " + numberOfLegs +" legs");
    }
}
