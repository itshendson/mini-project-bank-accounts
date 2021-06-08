package Transaction;

import java.util.Calendar;
import java.util.Date;

public class Transaction {

    private Date timeLogged;
    private String description;
    private String type;
    private double amount;

    public Transaction(String type, double amount) {
        this.timeLogged = Calendar.getInstance().getTime();
        this.type = type;
        this.amount = amount;
    }

    /**
     * Used by TransactionLog to get an instance's transaction type (deposit/withdraw) and amount
     * @return a string with deposit/withdraw and amount
     */
    public String getDescription() {
        description = timeLogged + " : " + type + " : " + amount;
        return description;
    }
}
