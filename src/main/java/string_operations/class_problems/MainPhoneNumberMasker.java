```java
import java.util.Scanner;

// Class containing the required method
class PhoneNumberMasker {

    static String maskPhoneNumber(String phone) {

        // Validate length
        if (phone.length() != 10) {
            return "Invalid phone number";
        }

        // Validate that all characters are digits
        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return "Invalid phone number";
            }
        }

        // Get the last 4 digits
        String lastFour = phone.substring(6);

        // Create masked number using StringBuilder
        StringBuilder masked = new StringBuilder("XXXXXX");

        // Insert '-' before the last 4 digits
        masked.insert(masked.length(), "-");
        masked.append(lastFour);

        return masked.toString();
    }
}


// Main class
public class MainPhoneNumberMasker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        String result = PhoneNumberMasker.maskPhoneNumber(phone);

        System.out.println(result);

        sc.close();
    }
}
```
