public class MiniBank {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("       PRACTICAL 5 - MINIBANK");
        System.out.println("=================================");

        // Create different account types
        SavingsAccount savings =
                new SavingsAccount("Riya", 5000, 2000);

        CurrentAccount current =
                new CurrentAccount("Rahul", 5000, 2000);

        FixedDepositAccount fixedDeposit =
                new FixedDepositAccount("Het", 10000);

        // Store different account types in one Account array
        Account[] accounts = {
                savings,
                current,
                fixedDeposit
        };

        // Runtime polymorphism
        System.out.println("\n----- Account Details -----");

        for (Account account : accounts) {

            System.out.println(
                    "Account Number: " + account.getAccountNumber()
            );

            System.out.println(
                    "Owner: " + account.getOwnerName()
            );

            System.out.println(
                    "Balance: " + account.getBalance()
            );

            System.out.println(
                    "Interest Rate: " + account.interestRate() + "%"
            );

            System.out.println();
        }

        // Test withdrawal rules
        System.out.println("----- Withdrawal Tests -----");

        System.out.println(
                "Savings withdraw 3000: "
                        + savings.withdraw(3000)
        );

        System.out.println(
                "Savings balance: "
                        + savings.getBalance()
        );

        System.out.println(
                "Current withdraw 7000: "
                        + current.withdraw(7000)
        );

        System.out.println(
                "Current balance: "
                        + current.getBalance()
        );

        System.out.println(
                "Fixed Deposit withdraw 1000: "
                        + fixedDeposit.withdraw(1000)
        );

        System.out.println(
                "Fixed Deposit balance: "
                        + fixedDeposit.getBalance()
        );

        // Pattern instanceof check
        System.out.println("\n----- instanceof Pattern Test -----");

        for (Account account : accounts) {

            if (account instanceof SavingsAccount savingsAccount) {

                System.out.println(
                        "Savings Account found: "
                                + savingsAccount.getOwnerName()
                );

                System.out.println(
                        "Minimum Balance: "
                                + savingsAccount.getMinBalance()
                );
            }
        }

        System.out.println("\nPractical 5 completed successfully.");
    }
} 