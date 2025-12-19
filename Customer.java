package Banking;


// This class represents a customer of a bank.
public class Customer {

    // instance vars
    String name;
    String address;

    // constructor which makes a customer with the given name
    public Customer(String name) {
        this.name = name;

    }

    // sets a new address of customer to the given address
    public void setAddress(String address) {
        this.address = address;
    }

    // gets customer's name
    public String getName() {
        return this.name;
    }

    // gets customer's address
    public String getAddress() {
        return this.address;
    }


}
