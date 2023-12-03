package edu.najah.cap.payment;

import java.util.*;

public class PaymentService implements IPayment {

    private static final Map<String, List<Transaction>> transactionMap = new HashMap<>();

    @Override
    public void pay(Transaction transaction) {
        transactionMap.computeIfAbsent(transaction.getUserName(), key -> new ArrayList<>()).add(transaction);
    }

    @Override
    public double getBalance(String userName) {
        if (transactionMap.containsKey(userName)) {
            return transactionMap.get(userName).stream().mapToDouble(Transaction::getAmount).sum();
        }
        return 0;
    }

    @Override
    public void removeTransaction(String userName, String id) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Iterator<Transaction> iterator = transactionMap.get(userName).iterator();
        while (iterator.hasNext()) {
            Transaction transaction = iterator.next();
            if (transaction.getId().equals(id)) {
                iterator.remove();
            }
        }
        transactionMap.put(userName, transactionMap.get(userName));
    }

    @Override
    public List<Transaction> getTransactions(String userName) {
        return transactionMap.get(userName);
    }


}
