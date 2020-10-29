import java.util.ArrayList;

public class Branch {

    private ArrayList<Customer> customers;
    private String branchName;

    public Branch(String branchName, String firstCustomerName, Double firstCustomerInitialAmount) {

        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
        this.customers.add(new Customer(firstCustomerName,firstCustomerInitialAmount));
        System.out.println("Branch " + branchName + " created");
    }

    public void addNewCustomer(String customerName, Double initialAmount) {

        boolean customerExists = false;
        for (int i = 0; i < customers.size(); i++) {

            if (customers.get(i).getCustomerName().equals(customerName)) {

                customerExists = true;
                break;
            }
        }

        if (customerExists) {

            System.out.println("Error. Customer with the name " + customerName + " already exists.");
        } else {

            customers.add(new Customer(customerName, initialAmount));
            System.out.println(customerName + " added to current branch.");
        }
    }

    public void addNewTransaction(String customerName, Double newTransaction) {

        boolean customerExists = false;
        for (int i = 0; i < customers.size(); i++) {

            if (customers.get(i).getCustomerName().equals(customerName)) {

                customers.get(i).addTransaction(newTransaction);
                System.out.println("New transaction added to customer " + customers.get(i).getCustomerName());
                customerExists = true;
            }
        }

        if (!customerExists) {

            System.out.println("Customer doesn't exist in current branch");
        }
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getBranchName() {
        return branchName;
    }
}
