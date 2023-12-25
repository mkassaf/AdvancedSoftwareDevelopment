package edu.najah.cap.payment;

import edu.najah.cap.exceptions.BadRequestException;
import edu.najah.cap.exceptions.NotFoundException;
import edu.najah.cap.exceptions.SystemBusyException;

import java.util.List;

public interface IPayment {
    void pay(Transaction transaction);
    double getBalance(String userName);
    void removeTransaction(String userName, String id) throws SystemBusyException, BadRequestException, NotFoundException;
    List<Transaction> getTransactions(String userName) throws SystemBusyException, BadRequestException, NotFoundException;
}
