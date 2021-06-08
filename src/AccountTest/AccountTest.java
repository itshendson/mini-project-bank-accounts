package AccountTest;

import Account.HISA;
import Account.WithdrawLimitException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AccountTest {

    private HISA myTestAccount;
    private HISA mySecondTestAccount;

    @Before
    public void runBefore() {
        myTestAccount = new HISA( 5000, 11111);
    }

    @Test
    public void testDeposit() {
        assertEquals(6000, myTestAccount.deposit(1000), 0);
    }

    @Test
    public void testWithdraw() throws WithdrawLimitException {
        assertEquals(2000, myTestAccount.withdraw(3000), 0);
    }

    @Test
    public void testGetBalance() {
        assertEquals(5000, myTestAccount.getBalance(), 0);
    }

    @Test
    public void testWithdrawLimitException() {
        boolean thrown = false;

        try {
            myTestAccount.withdraw(6000);
        } catch (WithdrawLimitException e) {
            thrown = true;
        }

        assertTrue(thrown);
    }

    @Test
    public void testSameAccount() {
        mySecondTestAccount = new HISA( 6000, 11111);
        assertTrue(myTestAccount.equals(mySecondTestAccount));
    }

    @Test
    public void testDifferentAccount() {
        mySecondTestAccount = new HISA( 5000, 11112);
        assertTrue(!myTestAccount.equals(mySecondTestAccount));
    }




}
