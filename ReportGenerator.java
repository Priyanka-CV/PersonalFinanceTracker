public class ReportGenerator {

    public void generateReport(Account account) {

        double income = 0;
        double expense = 0;

        for (Transaction t : account.transactions) {
            if (t instanceof Income) {
                income += t.amount;
            } else if (t instanceof Expense) {
                expense += t.amount;
            }
        }

        System.out.println("----- REPORT -----");
        System.out.println("Income:Rs." + income);
        System.out.println("Expense:RS." + expense);
        System.out.println("Balance:Rs." + account.balance);
    }
}