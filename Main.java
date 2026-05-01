import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("\n===== PERSONAL FINANCE TRACKER =====");
        System.out.println("1. Add Income");
        System.out.println("2. Add Expense");
        System.out.println("3. View Report");
        System.out.println("4. View Balance");
        System.out.println("5. Exit");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account account = new Account();
        ReportGenerator report = new ReportGenerator();

        while (true) {

            menu();
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter income amount: ");
                double amount = sc.nextDouble();
                sc.nextLine();
                System.out.print("Enter category: ");
                String category = sc.nextLine();

                account.addTransaction(new Income(amount, category, "2026-04-10"));
                System.out.println("Income added!");
            }

            else if (choice == 2) {
                System.out.print("Enter expense amount: ");
                double amount = sc.nextDouble();
                sc.nextLine();
                System.out.print("Enter category: ");
                String category = sc.nextLine();
                if(amount<=account.getBalance()){
                account.addTransaction(new Expense(amount, category, "2026-04-10"));
                System.out.println("Expense added!");
                }
                else{
                    System.out.println("Insufficient balance!");
                }
            }

            else if (choice == 3) {
                report.generateReport(account);
            }

            else if (choice == 4) {
                System.out.println("Balance:Rs." + account.getBalance());
            }

            else if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }

            else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
