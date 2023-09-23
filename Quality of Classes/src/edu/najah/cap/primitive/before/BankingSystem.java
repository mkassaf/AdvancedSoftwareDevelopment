package edu.najah.cap.primitive.before;

import java.util.Date;

public class BankingSystem {
    private BankAccount[] accounts;
    private Transaction[] transactions;

    public BankingSystem(BankAccount[] accounts) {
        this.accounts = accounts;
        this.transactions = new Transaction[1000];
    }

    public void transferFunds(BankAccount sender, BankAccount receiver, double amount) {
        // Check if sender and receiver are valid accounts and sender has enough balance
        if (sender != null && receiver != null && sender.getBalance() >= amount) { // validate sender and receiver
            sender.withdraw(amount);
            receiver.deposit(amount);

            // Record the transaction
            Transaction transaction = new Transaction(sender, receiver, amount, new Date()); // create transaction

            //record Transaction
            for (int i = 0; i < transactions.length; i++) {
                if (transactions[i] == null) {
                    transactions[i] = transaction;
                    break;
                }
            }
        } else {
            System.out.println("Transfer failed: Insufficient funds or invalid accounts.");
        }
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("12345", "John Doe", 1000.0);
        BankAccount account2 = new BankAccount("67890", "Alice Smith", 500.0);

        BankingSystem bankingSystem = new BankingSystem(new BankAccount[]{account1, account2});

        System.out.println("Before transfer:");
        System.out.println("Account 1 balance: $" + account1.getBalance());
        System.out.println("Account 2 balance: $" + account2.getBalance());

        bankingSystem.transferFunds(account1, account2, 300.0);

        System.out.println("\nAfter transfer:");
        System.out.println("Account 1 balance: $" + account1.getBalance());
        System.out.println("Account 2 balance: $" + account2.getBalance());
    }
}

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

class Transaction {
    private BankAccount sender;
    private BankAccount receiver;
    private double amount;
    private Date date;

    public Transaction(BankAccount sender, BankAccount receiver, double amount, Date date) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.date = date;
    }
}

