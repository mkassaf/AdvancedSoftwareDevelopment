package edu.najah.cap.primitive.after;

import java.util.Date;

import static java.util.Objects.nonNull;

public class BankingSystem {
    private BankAccount[] accounts;
    private Transaction[] transactions;

    public BankingSystem(BankAccount[] accounts) {
        this.accounts = accounts;
        this.transactions = new Transaction[1000];
    }

    public void transferFunds(BankAccount sender, BankAccount receiver, double amount) {
        if (validateInputs(sender, receiver, amount)) {
            sender.withdraw(amount);
            receiver.deposit(amount);
            Transaction transaction = createNewTransaction(sender, receiver, amount);
            recordTransaction(transaction);
        } else {
            System.out.println("Transfer failed: Insufficient funds or invalid accounts.");
        }
    }

    private void recordTransaction(Transaction transaction) {
        for (int i = 0; i < transactions.length; i++) {
            if (nonNull(transactions[i])) {
                transactions[i] = transaction;
                break;
            }
        }
    }

    private Transaction createNewTransaction(BankAccount sender, BankAccount receiver, double amount) {
        return new Transaction(sender, receiver, amount, new Date());
    }

    private boolean validateInputs(BankAccount sender, BankAccount receiver, double amount) {
        return sender != null && receiver != null && sender.getBalance() >= amount;
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

