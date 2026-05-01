public class Expense extends Transaction {

    public Expense(double amount, String category, String date) {
        super(amount, category, date);
    }

    public void apply(Account account) {
        
        account.balance -= amount;
       
    }
}