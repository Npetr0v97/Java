public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer("duplex");

        printer.printAPage();
        printer.printAPage();
        printer.printAPage();
        printer.printAPage();
        printer.printAPage();
        printer.printAPage();
        printer.printAPage();
        printer.fillToner();
    }
}
