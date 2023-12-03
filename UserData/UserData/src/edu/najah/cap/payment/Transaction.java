package edu.najah.cap.payment;

public class Transaction {

    private final String id = java.util.UUID.randomUUID().toString();
    private final String userName;
    private final double amount;
    private final String description;

    public Transaction(String userName, double amount, String description) {
        this.userName = userName;
        this.amount = amount;
        this.description = description;
    }


    public String getUserName() {
        return userName;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

}
