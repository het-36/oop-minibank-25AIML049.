public class MiniBank {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("       PRACTICAL 3 - MINIBANK");
        System.out.println("=================================");

       

        Account account1 = new Account("Riya", 5000);
        Account account2 = new Account("Rahul", 3000);
        Account account3 = new Account("Het");

        Account[] accounts = {
                account1,
                account2,
                account3
        };

       

        System.out.println("\n----- Accounts -----");

        for (Account account : accounts) {
            System.out.println(account);
        }

        

        System.out.println("\n----- equals() Test -----");

        System.out.println(
                "account1.equals(account2): "
                        + account1.equals(account2)
        );

        System.out.println(
                "account1.equals(account1): "
                        + account1.equals(account1)
        );

        // --------------------------------
        // hashCode() test
        // --------------------------------

        System.out.println("\n----- hashCode() Test -----");

        System.out.println(
                "Account 1 hashCode: "
                        + account1.hashCode()
        );

        System.out.println(
                "Account 2 hashCode: "
                        + account2.hashCode()
        );

        
        System.out.println("\n----- instanceof Test -----");

        Object object = account1;

        if (object instanceof Account) {
            System.out.println("object is an Account.");
        } else {
            System.out.println("object is not an Account.");
        }

        Customer.Address address =
                new Customer.Address(
                        "123 Main Street",
                        "Ahmedabad",
                        "380001"
                );

        Customer customer =
                new Customer(
                        "Riya",
                        "riya@gmail.com",
                        "9876543210",
                        address
                );

        System.out.println("\n----- Customer -----");

        System.out.println("Customer ID: "
                + customer.getCustomerId());

        System.out.println("Name: "
                + customer.getName());

        System.out.println("Email: "
                + customer.getEmail());

        System.out.println("Mobile: "
                + customer.getMobile());

        System.out.println("Address: "
                + customer.getAddress());

        
        Customer clonedCustomer = customer.clone();

        System.out.println("\n----- Clone Test -----");

        System.out.println(
                "Original Customer ID: "
                        + customer.getCustomerId()
        );

        System.out.println(
                "Cloned Customer ID: "
                        + clonedCustomer.getCustomerId()
        );

        System.out.println(
                "Cloned Customer Name: "
                        + clonedCustomer.getName()
        );

        System.out.println("\nPractical 3 completed successfully.");
    }
}