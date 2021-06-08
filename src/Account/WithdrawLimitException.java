package Account;

/**
 *An exception when parameter passed to withdraw() method is less than 0
 */

public class WithdrawLimitException extends Exception{
    public WithdrawLimitException() {
        super("You cannot withdraw more than balance");
    }
}
