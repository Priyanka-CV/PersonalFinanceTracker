public abstract class Transaction {
    double amount;
    String category;
    String date;

    public Transaction(double amount, String category, String date) {
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    public abstract void apply(Account account);
}