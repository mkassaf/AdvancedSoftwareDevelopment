package edu.najah.cap.payment;

import java.util.List;

public interface IPayment {
    void pay(Transaction transaction);
    double getBalance(String userName);
    void removeTransaction(String userName, String id);
    List<Transaction> getTransactions(String userName);
}
