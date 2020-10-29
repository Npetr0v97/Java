import java.util.ArrayList;

public class Customer {

    private ArrayList<Double> transactions;
    private String customerName;

    public Customer(String customerName, Double initialAmount) {

        this.customerName = customerName;
        this.transactions = new ArrayList<Double>();
        this.transactions.add(initialAmount);
        System.out.println(customerName + " added with initial amount of " + initialAmount);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void addTransaction(Double value) {

        transactions.add(value);
    }
}
