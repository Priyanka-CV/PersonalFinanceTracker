import java.util.ArrayList;

public class Account {
    double balance;
    ArrayList<Transaction> transactions;

    public Account() {
        balance = 0;
        transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction t) {
        t.apply(this);
        transactions.add(t);
    }

    public double getBalance() {
        return balance;
    }
}

