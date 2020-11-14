public class Book {

    private String name;
    private String author;


    public Book(String name, String author) {

        this.author = author;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {

        return name + " by " + author;
    }
}
