package Banking;

public class BankAccount {

    // instance variables

    String accountType;

    double balance;

    Customer customer;


    // constructor that makes a bank account of given type for given customer
    public BankAccount(String accountType, Customer customer) {
        this.accountType = accountType;
        this.customer = customer;
    }

    // depositing given money into the account
    public void deposit(double amount) {
        this.balance+= amount;
    }


    // withdraws given money from the account
    public void withdraw(double amount) throws Exception {
        if (amount > this.balance) {
            throw new Exception("Amount is greater than available balance.");
        }
        this.balance-= amount;
    }

    // This method gets the customer's account information
    public String getAccountInfo() {
        return this.accountType + ": " + this.balance;
    }

    // This method gets the customer's information
    public String getCustomerInfo() {
        return this.customer.getName() + " from " + this.customer.getAddress();

    }

}
