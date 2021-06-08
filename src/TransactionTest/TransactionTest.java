package TransactionTest;

import Transaction.Transaction;
import org.junit.Before;
import org.junit.Test;

public class TransactionTest {

    private Transaction myTestTransaction;

    @Before
    public void TransactionTest() {
        myTestTransaction = new Transaction("Deposit", 500);
    }

    @Test
    public void getDescription() {
        System.out.println(myTestTransaction.getDescription());
    }

}
