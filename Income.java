public class Income extends Transaction {

    public Income(double amount, String category, String date) {
        super(amount, category, date);
    }

    public void apply(Account account) {
        account.balance += amount;
    }
}