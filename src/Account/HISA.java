package Account;

/**
 * A HISA is a high interest savings account. HISA earns higher interest rate.
 */


public class HISA extends Account{

    private final int minBalance = 3000;


    /**
     * Constructor for account
     * Requires: accountNumber > 0 and length should be equal to accountNumLength
     * Requires: balance >= 0
     *
     * @param balance       is the initial endowment of the bank account
     * @param accountNumber is a unique identifier for account
     */
    public HISA(double balance, int accountNumber) {
        super(balance, accountNumber);
    }
}
