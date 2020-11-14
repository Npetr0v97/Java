import java.util.LinkedList;

public abstract class BookCollection {

    private LinkedList<Book> books;
    private String categoryName;

    public BookCollection(String categoryName) {

        this.categoryName = categoryName;
        this.books = new LinkedList<Book>();
    }

    public abstract int findBook(String name);

    public abstract void addBook(String name);

    public abstract void presentBooks();

    public abstract void printBookList();

    public abstract void removeBook(String name);

    public LinkedList<Book> getBooks() {
        return books;
    }

    public String getCategoryName() {
        return categoryName;
    }


}
