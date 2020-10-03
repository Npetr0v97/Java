public class Bookshelf {

    private int numberOfBooks;
    private Dimensions dimensions;

    public Bookshelf(int numberOfBooks, Dimensions dimensions) {
        this.numberOfBooks = numberOfBooks;
        this.dimensions = dimensions;
    }

    public void loadBook(String bookName) {

        numberOfBooks++;
        System.out.println(bookName + " was loaded on the shelf. Currently " + numberOfBooks + " are on the shelf");
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
