public class MiniBank {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("       PRACTICAL 4 - MINIBANK");
        System.out.println("=================================");

    

        System.out.println("\n----- Mobile Validation -----");

        System.out.println(
                "9876543210: "
                        + Validator.isValidMobile("9876543210")
        );

        System.out.println(
                "12345: "
                        + Validator.isValidMobile("12345")
        );

      
        System.out.println("\n----- Email Validation -----");

        System.out.println(
                "abc@xyz.com: "
                        + Validator.isValidEmail("abc@xyz.com")
        );

        System.out.println(
                "abc@xyz: "
                        + Validator.isValidEmail("abc@xyz")
        );

      
        System.out.println("\n----- PAN Validation -----");

        System.out.println(
                "ABCDE1234F: "
                        + Validator.isValidPan("ABCDE1234F")
        );

        System.out.println(
                "ABC123: "
                        + Validator.isValidPan("ABC123")
        );

      

        System.out.println("\n----- IFSC Validation -----");

        System.out.println(
                "SBIN0001234: "
                        + Validator.isValidIfsc("SBIN0001234")
        );

        System.out.println(
                "SBIN123: "
                        + Validator.isValidIfsc("SBIN123")
        );

    

        System.out.println("\n----- Command Parser -----");

        String input = "DEPOSIT AC0001 500";

        Command command = CommandParser.parse(input);

        System.out.println("Input: " + input);
        System.out.println("Type: " + command.type());
        System.out.println("Account Number: " + command.accountNumber());
        System.out.println("Amount: " + command.amount());

        
        System.out.println("\n----- Account Statement -----");

        Account account = new Account("Riya", 5000);

        System.out.println(
                StatementFormatter.buildStatement(account)
        );

        System.out.println("\nPractical 4 completed successfully.");
    }
}