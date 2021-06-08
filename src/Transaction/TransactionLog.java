package Transaction;

import java.util.*;

public class TransactionLog implements Iterable {

    public Collection<Transaction> transactions;

    public TransactionLog() {
        transactions = new ArrayList<Transaction>();
    }

    public Collection<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public void clearTransaction() {
        transactions.clear();
    }

    @Override
    public Iterator iterator() {
        return transactions.iterator();
    }


}
