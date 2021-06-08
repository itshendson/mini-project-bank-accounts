package TransactionTest;

import Transaction.Transaction;
import Transaction.TransactionLog;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TransactionLogTest {

    private TransactionLog myTransactionlog;


    @Before
    public void myTransactionLog() {
        myTransactionlog = new TransactionLog();
    }

    @Test
    public void getTransactions() {
        ArrayList<String > emptyList = new ArrayList();
        assertEquals(emptyList, myTransactionlog.getTransactions());
    }

    @Test
    public void addTransactions() {
        Transaction a = new Transaction("Deposit", 1000);
        Transaction b = new Transaction("Withdraw", 900);
        Transaction c = new Transaction("Deposit", 100);
        myTransactionlog.addTransaction(a);
        myTransactionlog.addTransaction(b);
        myTransactionlog.addTransaction(c);

        for (Transaction transaction : myTransactionlog.getTransactions()) {
            System.out.println(transaction.getDescription());
        }
    }



}
