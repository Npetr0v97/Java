import java.util.*;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Nikolay", 64.32);
        Customer anotherCustomer = customer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i=0; i<intList.size(); i++) {

            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1, 33);

        for (int i=0; i<intList.size(); i++) {

            System.out.println(i + ": " + intList.get(i));
        }

        //----------------------------------------

        LinkedList<String> placesToVisit = new LinkedList<String>();


        addInOrder(placesToVisit,"Sydney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Brisbane");
        addInOrder(placesToVisit,"Perth");
        addInOrder(placesToVisit,"Canberra");
        addInOrder(placesToVisit,"Adelaide");


        printList(placesToVisit);
        addInOrder(placesToVisit,"Alice Springs");


        printList(placesToVisit);
        addInOrder(placesToVisit,"Alice Springs");
        printList(placesToVisit);
        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {

        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());

        }
        System.out.println("===================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList,String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {

                //equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {

                //new City should appear before this one
                //Brisbane ->Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {

                // move on next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> cities) {

        Scanner scanner = new Scanner(System.in);

        boolean quit =false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {

            System.out.println("No cities in list");
        } else {

            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {

            int action = scanner.nextInt();

            switch (action) {

                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                case 1:
                    if (!goingForward) {

                        if (listIterator.hasNext()) {

                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {

                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {

                        if (listIterator.hasPrevious()) {

                            listIterator.previous();
                        }
                        goingForward=false;
                    }
                    if (listIterator.hasPrevious()) {

                        System.out.println("Now visiting " + listIterator.previous());
                    } else {

                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {

        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n"+
                "1 - go to next city\n" +
                "2 - go to previous city" +
                "3 - print the menu");
    }
}
