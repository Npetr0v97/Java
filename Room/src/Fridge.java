public class Fridge {

    private String model;
    private String efficiencyGrade;
    private Dimensions dimensions;

    public Fridge(String model, String efficiencyGrade, Dimensions dimensions) {
        this.model = model;
        this.efficiencyGrade = efficiencyGrade;
        this.dimensions = dimensions;
    }


    public void loadFridge(String foodName) {

        System.out.println("Fridge is loaded with " + foodName);
    }

    public void printFridgeDate() {

        System.out.println("You have a " + model + " fridge with " + efficiencyGrade + " efficiency grade and it's " + dimensions.getHeight() +
                " cm high");
    }

    public String getModel() {
        return model;
    }

    public String getEfficiencyGrade() {
        return efficiencyGrade;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
