public class Table {

    private int numberOfObjectOnTable;
    private Dimensions dimensions;

    public Table(int numberOfObjectOnTable, Dimensions dimensions) {
        this.numberOfObjectOnTable = numberOfObjectOnTable;
        this.dimensions = dimensions;
    }

    public void loadObject() {

        numberOfObjectOnTable++;
        System.out.println("Currently " + numberOfObjectOnTable + " are on the table");
    }

    public int getNumberOfObjectOnTable() {
        return numberOfObjectOnTable;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
