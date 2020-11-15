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
            System.out.print("Write the name of the author: ");
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
        String current, next, previous;
        int choice;
        boolean isInt;
        boolean goingForward=true;
        ListIterator<Book> it = getBooks().listIterator();
        boolean quit = false;

        System.out.println("Entering presentation----------");
        while (!quit) {
            printPresentMenu();
            isInt = scanner.hasNextInt();

            if (isInt) {

                choice = scanner.nextInt();
                scanner.nextLine();

                if (choice < 1 || choice > 3) {

                    System.out.println("Invalid choice.");
                }
            } else  {

                choice = -1;
                System.out.println("Invalid choice");
            }
            if (getBooks().isEmpty()) {

                choice = -1;
                System.out.println("There are no books in category " + getCategoryName());

            }

            switch (choice) {

                case 1:
                    if (goingForward) {

                        if (it.hasPrevious()) {
                            previousChoice = it.previous();
                            previous = "Previous book: " + previousChoice.toString();
                            it.next();
                            if (it.hasNext()) {

                                currentChoice = it.next();
                                current = "Current book: " + currentChoice.toString();

                                if (it.hasNext()) {

                                    nextChoice=it.next();
                                    next = "Next book: " + nextChoice.toString();
                                } else {
                                    next = "End of the book library reached.";
                                    goingForward = false;
                                }
                            } else {
                                current = "End of the book library reached.";
                                goingForward = false;
                                next= "End 2";
                            }

                        } else {
                            previous = "Start of the book library reached.";
                            goingForward = true;
                            current = "error";
                            next = "error";

                        }
                    } else {

                        goingForward = true;
                        previousChoice = it.next();
                        previous = "Previous book: " + previousChoice.toString();
                        if (it.hasNext()) {

                            currentChoice = it.next();
                            current = "Current book: " + currentChoice.toString();

                            if (it.hasNext()) {
                                nextChoice = it.next();
                                next="Next book: " + nextChoice.toString();
                            } else {

                                goingForward = false;
                                next = "Reached end of presentation";
                            }
                        } else {

                            goingForward = false;
                            current = "Reached end of presentation";
                            next = "end 2";
                        }

                    }
                    System.out.println(previous);
                    System.out.println(current);
                    System.out.println(next);
                    break;
                case 2:
                    if (!goingForward) {

                        if (it.hasNext()) {
                            nextChoice = it.next();

                            next = "Next book: " + nextChoice.toString();
                            it.previous();
                            if (it.hasPrevious()) {

                                currentChoice = it.previous();
                                current = "Current book: " + currentChoice.toString();

                                if (it.hasPrevious()) {

                                    previousChoice=it.previous();
                                    previous = "Previous book: " + previousChoice.toString();
                                } else {
                                    previous = "Start of the book library reached.";
                                    goingForward = true;
                                }
                            } else {
                                previous = "Start of the book library reached.";
                                current = "error";
                                goingForward = true;
                            }

                        } else {
                            next = "End of the book library reached.";
                            current = "error";
                            previous = "error";
                            goingForward = false;

                        }
                    } else {

                        goingForward = false;

                        if (it.hasNext()) {

                            nextChoice = it.next();
                            next = "Next book: " + nextChoice.toString();
                            it.previous();
                            if (it.hasPrevious()) {
                                currentChoice = it.previous();
                                current = "Current book: " + currentChoice.toString();
                                if (it.hasPrevious()) {

                                    previousChoice = it.previous();
                                    previous = "Previous book: " + previousChoice.toString();
                                }

                                else {

                                    previous = "Reached start of presentation";
                                }
                            } else {

                                goingForward = true;
                                previous ="Reached start of presentation";
                                current = "error";
                            }
                        } else {

                            next = "Reached end of presentation";
                            currentChoice = it.previous();

                            current = "Current book: " +currentChoice.toString();
                            if (it.hasPrevious()) {

                                previous = "Previous book: " + it.previous().toString();
                            } else {

                                previous = "Start of presentation reached";
                            }
                        }

                    }
                    System.out.println(previous);
                    System.out.println(current);
                    System.out.println(next);
                    break;
                default:
                    quit = true;
                    System.out.println("Exiting presentation");
                    break;
            }
            // TODO: 14.11.2020 г. Switch statement with next and previous

            
        }
        
        
    }
    
    private void printPresentMenu() {

        System.out.println("1. Next");
        System.out.println("2. Previous");
        System.out.println("3. Exit presentation");
        System.out.print("Make a choice: ");
        
    }

    @Override
    public void printBookList() {
        int counter = 1;
        
        ListIterator<Book> it = getBooks().listIterator();
        System.out.println("Books in category " + getCategoryName());
        while (it.hasNext()) {

            System.out.println(counter+ ". " + it.next().toString());
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
