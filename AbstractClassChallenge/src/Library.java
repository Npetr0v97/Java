import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Library extends BookCollection{

//    LinkedList<Book> books;
    private Scanner scanner = new Scanner(System.in);

    public Library(String categoryName) {

        super(categoryName);
    }

    @Override
    public int findBook(String name) {
        int position = 0;

        ListIterator<Book> it = getBooks().listIterator();

        while (it.hasNext()) {

            if (it.next().getName().equals(name)) {

                return position;
            }
            position++;
        }

        return -1;
    }

    @Override
    public void addBook(String name) {

        ListIterator<Book> it = getBooks().listIterator();
        int position = 0;
        boolean bookAdded = false;

        if (findBook(name)==-1) {
            System.out.print("Write the name of the author");
            String author = scanner.nextLine();
            while (it.hasNext()) {
                if (name.compareTo(it.next().getName()) < 0) {
                    
                    getBooks().add(position, new Book(name, author));
                    System.out.println("Book added");
                    bookAdded = true;
                    break;
                }
                position++;
            }
            
            if (!bookAdded) {
                
                getBooks().add(new Book(name,author));
            }
        } else {

            System.out.println("Book with the name " + name + " already exists.");
        }


    }

    @Override
    public void presentBooks() {
        Book currentChoice, nextChoice, previousChoice;
        ListIterator<Book> it = getBooks().listIterator();
        boolean quit = false;
        System.out.println("Entering presentation----------");
        while (!quit) {
            printPresentMenu();
            // TODO: 14.11.2020 г. Switch statement with next and previous 
            
        }
        
        
    }
    
    private void printPresentMenu() {

        System.out.println("1. Next");
        System.out.println("2. Previous");
        
    }

    @Override
    public void printBookList() {
        int counter = 1;
        
        ListIterator<Book> it = getBooks().listIterator();
        System.out.println("Books in category " + getCategoryName());
        while (it.hasNext()) {

            System.out.println(counter + it.next().toString());
            counter++;
        }
    }

   @Override
   public void removeBook(String name) {
      
        ListIterator<Book> it = getBooks().listIterator();
        
       if (findBook(name)==-1) {

           System.out.println("Book with the name " + name + " couldn't be found");
           
       } else {
            
           getBooks().remove(findBook(name));
           System.out.println("Book removed.");
       }

   }

    @Override
    public LinkedList<Book> getBooks() {
        return super.getBooks();
    }

    @Override
    public String getCategoryName() {
        return super.getCategoryName();
    }
}
