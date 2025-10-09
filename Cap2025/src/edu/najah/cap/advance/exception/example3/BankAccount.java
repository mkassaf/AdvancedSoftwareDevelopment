package edu.najah.cap.advance.exception.example3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static java.lang.System.exit;

public class BankAccount implements AutoCloseable {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    /**
     * Withdraw method with validation for insufficient funds.
     *
     * @param amount the amount to be withdrawn
     * @return the amount withdrawn
     */
    double withdraw(double amount) throws InsufficientFundsExecption {
        //validation to ensure that the amount to be withdrawn is not greater than the balance
        if (amount > balance) {
            throw new InsufficientFundsExecption("Insufficient funds for withdrawal");
        }
        updateDb();

        balance -= amount;

        return amount;

    }

    void updateDb() {
        if(new java.util.Random().nextInt(10) > 3){
            throw new TimeOutException("Timeout Error");//unchecked exception
        }
        System.out.println("Connected to DB");
    }


    public static void main(String[] args) {
        BankAccount account = new BankAccount(0);
        account.deposit(500);
        System.out.println("Balance after deposit: " + account.balance);

        int maxNumberOfRetries = 10;

        while (maxNumberOfRetries > 0) {
            try {
                account.withdraw(50);
                System.out.println("Balance after withdrawal: " + account.balance);
                break;
            } catch (TimeOutException e) {
                //try again
                if (maxNumberOfRetries == 1) {
                    throw new RuntimeException("Max number of retries reached. Please try again later.");
                }
                System.out.println("Retrying... Attempts left: " + --maxNumberOfRetries);
            } catch (Exception e) {
                System.err.println(e.getMessage());
                break;
            }
        }


        FileInputStream file = null;
        try {
            file = new FileInputStream("non_existent_file.txt");
        } catch (IOException e) {
            System.err.println("File operation failed: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    System.err.println("Failed to close the file: " + e.getMessage());
                }
            }
        }

        try(var file2 = new FileInputStream("non_existent_file.txt")) {
            // Use the file
        } catch (IOException e) {
            System.err.println("File operation failed: " + e.getMessage());
        }

        try (BankAccount account2 = new BankAccount(1000)) {
            account2.deposit(200);
            System.out.println("Account2 Balance after deposit: " + account2.balance);
        } catch (Exception e) {
            System.err.println("Error with account2: " + e.getMessage());
        }

    }

    @Override
    public void close() throws Exception {
        System.out.println("BankAccount resources are being released.");
    }
}
