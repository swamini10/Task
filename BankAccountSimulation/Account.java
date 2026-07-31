import java.util.ArrayList;

public class Account {

    private int accountNumber;
    private String accountHolder;
    private double balance;

    private ArrayList<String> transactionHistory;

    public Account(int accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;

        transactionHistory = new ArrayList<>();
        transactionHistory.add("Account Created with Balance : ₹" + initialBalance);
    }

    // Deposit Method
    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Amount!");
            return;
        }

        balance += amount;

        transactionHistory.add("Deposited : ₹" + amount);

        System.out.println("₹" + amount + " Deposited Successfully.");
    }

    // Withdraw Method
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Amount!");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient Balance!");
            transactionHistory.add("Failed Withdrawal : ₹" + amount);
            return;
        }

        balance -= amount;

        transactionHistory.add("Withdrawn : ₹" + amount);

        System.out.println("₹" + amount + " Withdrawn Successfully.");
    }

    // Display Balance
    public void displayBalance() {
        System.out.println("----------------------------");
        System.out.println("Current Balance : ₹" + balance);
        System.out.println("----------------------------");
    }

    // Display Account Details
    public void displayAccount() {

        System.out.println("\nAccount Details");
        System.out.println("----------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : ₹" + balance);
        System.out.println("----------------------------");
    }

    // Transaction History
    public void showTransactions() {

        System.out.println("\nTransaction History");

        System.out.println("----------------------------");

        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }

        System.out.println("----------------------------");
    }

}