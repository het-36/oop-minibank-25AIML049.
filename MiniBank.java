import java.util.Scanner;

public class MiniBank {

    // Record for bank information
    record BankInfo(String name, String branch) {}

    // Enum for menu options
    enum MenuOption {
        OPEN_ACCOUNT,
        DEPOSIT,
        WITHDRAW,
        TRANSFER,
        EXIT
    }

    public static void main(String[] args) {

       

        System.out.println("=================================");
        System.out.println("       PRACTICAL 2 - MINIBANK");
        System.out.println("=================================");

        Account account1 = new Account("Riya", 5000);
        Account account2 = new Account("Rahul", 3000);
        Account account3 = new Account("Het");

        Account[] accounts = {account1, account2, account3};

        // Account 1 operations
        System.out.println("\nAccount 1:");
        System.out.println("Opening Balance: " + account1.getBalance());

        account1.deposit(2000);
        System.out.println("After Deposit 2000: " + account1.getBalance());

        boolean result1 = account1.withdraw(3000);
        System.out.println("Withdraw 3000 successful: " + result1);
        System.out.println("Balance: " + account1.getBalance());

        boolean result2 = account1.withdraw(10000);
        System.out.println("Withdraw 10000 successful: " + result2);
        System.out.println("Balance: " + account1.getBalance());

        // Print all accounts
        System.out.println("\n----- All Accounts -----");

        for (Account account : accounts) {
            System.out.println(
                "Account Number: " + account.getAccountNumber()
                + ", Owner: " + account.getOwnerName()
                + ", Balance: " + account.getBalance()
                + ", Active: " + account.isActive()
            );
        }

        
        Customer customer1 =
                new Customer("Riya", "riya@gmail.com", "9876543210");

        Customer customer2 =
                new Customer("Rahul", "rahul@gmail.com", "9876543211");

        System.out.println("\n----- Customers -----");

        System.out.println(
                customer1.getCustomerId() + " - " +
                customer1.getName() + " - " +
                customer1.getEmail()
        );

        System.out.println(
                customer2.getCustomerId() + " - " +
                customer2.getName() + " - " +
                customer2.getEmail()
        );

        // --------------------------------
        // Practical 1 Menu
        // --------------------------------

        Scanner scanner = new Scanner(System.in);

        BankInfo bank = new BankInfo("MiniBank", "CHARUSAT Branch");

        System.out.println("\n=================================");
        System.out.println("          " + bank.name());
        System.out.println("          " + bank.branch());
        System.out.println("=================================");

        boolean running = true;

        while (running) {

            System.out.println("\n----- MiniBank Menu -----");
            System.out.println("1. Open Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            MenuOption option = switch (choice) {
                case 1 -> MenuOption.OPEN_ACCOUNT;
                case 2 -> MenuOption.DEPOSIT;
                case 3 -> MenuOption.WITHDRAW;
                case 4 -> MenuOption.TRANSFER;
                case 5 -> MenuOption.EXIT;
                default -> null;
            };

            if (option == null) {
                System.out.println("Invalid choice! Please enter 1 to 5.");
                continue;
            }

            switch (option) {

                case OPEN_ACCOUNT ->
                    System.out.println(
                        "Open Account — to be implemented in a later lab."
                    );

                case DEPOSIT ->
                    System.out.println(
                        "Deposit — to be implemented in a later lab."
                    );

                case WITHDRAW ->
                    System.out.println(
                        "Withdraw — to be implemented in a later lab."
                    );

                case TRANSFER ->
                    System.out.println(
                        "Transfer — to be implemented in a later lab."
                    );

                case EXIT -> {
                    System.out.println("\nThank you for using MiniBank!");
                    System.out.println("Goodbye!");
                    running = false;
                }
            }
        }

        scanner.close();
    }
}