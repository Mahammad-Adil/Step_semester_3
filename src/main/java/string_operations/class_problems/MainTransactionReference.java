```java
import java.util.Scanner;

// Class containing the required methods
class TransactionReference {

    // Method 1: Normalize the reference
    static String normalizeReference(String raw) {

        // Remove leading and trailing spaces
        raw = raw.trim();

        // Uppercase only the first 3 characters
        if (raw.length() >= 3) {
            String bankCode = raw.substring(0, 3).toUpperCase();
            String remaining = raw.substring(3);

            return bankCode + remaining;
        }

        return raw;
    }


    // Method 2: Validate and format the reference
    static String validateAndFormat(String reference) {

        // Check length
        if (reference.length() != 14) {
            return "Invalid: wrong length";
        }

        // Check first 3 characters are letters
        for (int i = 0; i < 3; i++) {

            if (!Character.isLetter(reference.charAt(i))) {
                return "Invalid: bank code must be 3 letters";
            }
        }

        // Check remaining 11 characters are digits
        for (int i = 3; i < reference.length(); i++) {

            if (!Character.isDigit(reference.charAt(i))) {
                return "Invalid: body must contain only digits";
            }
        }

        // Extract parts
        String bankCode = reference.substring(0, 3);
        String date = reference.substring(3, 9);
        String sequence = reference.substring(9, 14);

        // Format date as dd/MM/yy
        String formattedDate = date.substring(0, 2)
                + "/" + date.substring(2, 4)
                + "/" + date.substring(4, 6);

        // Build formatted output using StringBuilder
        StringBuilder result = new StringBuilder();

        result.append("[");
        result.append(bankCode);
        result.append("] DATE: ");
        result.append(formattedDate);
        result.append(" | SEQ: ");
        result.append(sequence);

        return result.toString();
    }
}


// Main class
public class MainTransactionReference {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter transaction reference: ");
        String raw = sc.nextLine();

        // Normalize the reference
        String normalized = TransactionReference.normalizeReference(raw);

        // Validate and format
        String result = TransactionReference.validateAndFormat(normalized);

        System.out.println(result);

        sc.close();
    }
}
```
