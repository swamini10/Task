import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========== BANK ACCOUNT ==========");

        System.out.print("Enter Account Number : ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance : ");
        double balance = sc.nextDouble();

        Account account = new Account(accNo, name, balance);

        int choice;

        do {

            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Account Details");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Transaction History");
            System.out.println("6. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    account.displayAccount();
                    break;

                case 2:

                    System.out.print("Enter Deposit Amount : ");
                    double deposit = sc.nextDouble();
                    account.deposit(deposit);
                    break;

                case 3:

                    System.out.print("Enter Withdraw Amount : ");
                    double withdraw = sc.nextDouble();
                    account.withdraw(withdraw);
                    break;

                case 4:
                    account.displayBalance();
                    break;

                case 5:
                    account.showTransactions();
                    break;

                case 6:
                    System.out.println("Thank You for Using Bank System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}