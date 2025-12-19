package Banking;

import java.util.Scanner;

// This class runs our program. It has the main method and we make
// instances of our objects from other classes here.
public class Bank {

    public static void main(String[] args) throws Exception {
        Bank bank = new Bank();
        bank.run();
    }

    public void run() throws Exception {
        System.out.println("program running.");
        System.out.println("Welcome to the bank. What's your name?");

        // Taking user input for their name and address
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Hello " + name + "! We are creating checking and savings accounts for you.");
        Customer customer = new Customer(name);

        System.out.println("What is your address?");
        String address = scanner.next();

        // setting given address and updating it in our database
        customer.setAddress(address);

        // Making a checkings and savings account through BankAccount objects.
        BankAccount checkingAccount = new BankAccount("checkings", customer);
        BankAccount savingsAccount = new BankAccount("savings", customer);

        System.out.println();
        System.out.println("Customer info: ");
        System.out.println(checkingAccount.getCustomerInfo());

        System.out.println("Checkings Account:");
        System.out.println(checkingAccount.getAccountInfo());
        System.out.println("Savings Account");
        System.out.println(savingsAccount.getAccountInfo());

        // Depositing Money into Checkings

        System.out.println();
        System.out.println("Amount (decimal) to deposit into your checkings account");
        double amount = scanner.nextDouble();
        checkingAccount.deposit(amount);


        // Depositing Money into Savings
        System.out.println();
        System.out.println("Amount (decimal) to deposit into your savings account");
        amount = scanner.nextDouble();
        savingsAccount.deposit(amount);

        // Checking updated info
        System.out.println(checkingAccount.getAccountInfo());
        System.out.println(savingsAccount.getAccountInfo());

        // Withdrawing Money from Checkings
        System.out.println();
        System.out.println("Amount (decimal) to withdraw from your checkings account");
        amount = scanner.nextDouble();
        checkingAccount.withdraw(amount);

        // Withdrawing Money from Savings
        System.out.println();
        System.out.println("Amount (decimal) to withdraw from your savings account");
        amount = scanner.nextDouble();
        savingsAccount.withdraw(amount);

        // Outputting the newly updated account information
        System.out.println(checkingAccount.getAccountInfo());
        System.out.println(savingsAccount.getAccountInfo());
    }

}
