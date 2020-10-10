public class Printer {

    private int tonerLevel = 5;
    private int numberOfPagesPrinted = 0;
    private String printerType;

    public Printer(String printerType) {

        this.printerType = printerType;
    }

    public void fillToner() {

        tonerLevel = 100;
        System.out.println("Toner level is at maximum");
    }

    public void printAPage() {

        if (tonerLevel <= 0) {

            System.out.println("No toner left. Please refill");
        } else {
            numberOfPagesPrinted++;
            tonerLevel--;
            System.out.println("A page was printed. \nCurrently " + numberOfPagesPrinted + " are printed. Toner");
        }



    }

    public int getTonerLevel() {

        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {

        return numberOfPagesPrinted;
    }

    public String getPrinterType() {

        return printerType;
    }
}
