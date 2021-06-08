package Account;

import Transaction.Transaction;
import Transaction.TransactionLog;

import java.util.Objects;

public abstract class Account {

    private double balance;
    private TransactionLog TransactionLog;

    private final int accountNumber;

    /**
     * Constructor for account
     * Requires: accountNumber > 0 and length should be equal to accountNumLength
     * Requires: balance >= 0
     * @param accountNumber is a unique identifier for account
     * @param balance is the initial endowment of the bank account
     */
    public Account(double balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.TransactionLog = new TransactionLog();
    }

    /**
     * Tells the customer how much money they have
     * @return the balance amount
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Get an account's unique identifier
     * @return account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public TransactionLog getTransactionLog() {
        return TransactionLog;
    }

    /**
     * Deposits money to bank account
     * Effect: returns new balance and add record to Transaction log
     */
    public double deposit(double amount) {
        TransactionLog.addTransaction(new Transaction("Deposit", amount));
        return balance += amount;
    }

    /**
     * Deposits money to account
     * Requires: deposited amount must be greater than 0. balance can not go below 0.
     * Effect: balance decrease by amount and add record to Transaction log
     */
    public double withdraw(double amount) throws WithdrawLimitException{
        if (amount > balance) {
            throw new WithdrawLimitException();
        } else {
            TransactionLog.addTransaction(new Transaction("Withdraw", amount));
            return balance -= amount;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return getAccountNumber() == account.getAccountNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAccountNumber());
    }
}
