

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this(11111,2.50,"Default name","Default Address","Default name");
        //това е конструктор с данни по пдразбиране, в случай че липсват налични данни
        System.out.println("Empty constructor called");
    }

    //ако не всеки път имаме наличните данни, може да направим Override на конструктора с по-малко данни

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(11111,2.50,customerName,email,phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {


        //тук има варианти да се използват Setter-ите, но това не е добра практика. По-добре е да се използва валидацията тук, а не
        //чрез Setter-ите
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {

        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){

        this.balance=balance;
    }

    public void setCustomerName(String customerName) {

        this.customerName = customerName;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {

        return balance;
    }

    public int getAccountNumber() {

        return accountNumber;
    }

    public String getCustomerName() {

        return customerName;
    }

    public String getEmail() {

        return email;
    }

    public String getPhoneNumber() {

        return phoneNumber;
    }

    public void depositFunds(double deposit) {

        this.balance += deposit;

        System.out.println("Current balance is " + String.format("%.2f",balance));
    }

    public void withdrawFunds(double withdraw) {

        if (this.balance - withdraw <0) {

            System.out.println("Not enough money. Balance: " + String.format("%.2f",balance));
        } else  {

            this.balance -= withdraw;
            System.out.println("Current balance is " + String.format("%.2f",balance));
        }

    }

    public void printData() {

        System.out.println("Your data");

        System.out.println("Account number: " + this.getAccountNumber());
        System.out.println("Your name: " + this.getCustomerName());
        System.out.println("Your balance: " + String.format("%.2f",this.getBalance()) + " lv.");
        System.out.println("Your email: " + this.getEmail());
        System.out.println("Your phone number: " + this.getPhoneNumber());
    }
}
