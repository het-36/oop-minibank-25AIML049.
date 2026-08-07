import java.util.Objects;

public class Account {

    private final String accountNumber;
    private String ownerName;
    private long balance;
    private boolean active;

    private static long accountCounter = 0;

    
    public Account(String ownerName, long openingBalance) {
        this.accountNumber = generateAccountNumber();
        this.ownerName = ownerName;
        this.balance = openingBalance;
        this.active = true;
    }

    // Constructor with only owner name
    public Account(String ownerName) {
        this(ownerName, 0);
    }

   
    private static String generateAccountNumber() {
        accountCounter++;
        return String.format("AC%04d", accountCounter);
    }

    // Deposit
    public void deposit(long amount) {
        if (amount < 0) {
            return;
        }

        balance += amount;
    }

    
    public boolean withdraw(long amount) {
        if (amount < 0) {
            return false;
        }

        if (amount <= balance) {
            balance -= amount;
            return true;
        }

        return false;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public long getBalance() {
        return balance;
    }

    public boolean isActive() {
        return active;
    }

   
    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }

   
    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (!(o instanceof Account)) {
            return false;
        }

        Account account = (Account) o;

        return accountNumber.equals(account.accountNumber);
    }

   
    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }
}