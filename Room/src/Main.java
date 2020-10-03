public class Main {

    public static void main(String[] args) {

        Dimensions dimensionsOfChair = new Dimensions(50,50,120);
        Dimensions dimensionsOfBookshelf = new Dimensions(60,40,160);
        Dimensions dimensionsOfTable = new Dimensions(50,150,70);
        Dimensions dimensionsOfFridge = new Dimensions(50,50,190);

        Chair chair = new Chair(4,"Director",dimensionsOfChair);
        chair.printChairData();

        Fridge fridge = new Fridge("Beko", "A+",dimensionsOfFridge);
        fridge.printFridgeDate();

        Bookshelf bookshelf = new Bookshelf(22, dimensionsOfBookshelf);
        bookshelf.loadBook("How the brain works");

        Table table = new Table(5, dimensionsOfTable);
        table.loadObject();

        Room room = new Room(chair,fridge,bookshelf, table);

        room.putABook("Naked statistics");
        room.getFridge().printFridgeDate();
    }
}
