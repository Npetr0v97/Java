public class Room {

    private Chair chair;
    private Fridge fridge;
    private  Bookshelf bookshelf;
    private Table table;

    public Room(Chair chair, Fridge fridge, Bookshelf bookshelf, Table table) {

        this.chair = chair;
        this.fridge = fridge;
        this.table = table;
        this.bookshelf = bookshelf;
    }


    public void putABook(String name) {

        bookshelf.loadBook(name);
    }

    public Chair getChair() {
        return chair;
    }

    public Fridge getFridge() {
        return fridge;
    }

    public Bookshelf getBookshelf() {
        return bookshelf;
    }
}
