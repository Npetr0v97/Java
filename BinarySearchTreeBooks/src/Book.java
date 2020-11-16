public class Book {

    private String name;
    private String author;

    public Book(String name, String author) {

        this.name = name;
        this.author = author;
    }

    public void setAuthor(String author) {

        this.author = author;
    }

    public String toString() {

        return name + " by " + author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}
