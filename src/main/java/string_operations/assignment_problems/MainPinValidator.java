```java
import java.util.Scanner;

// Class containing the required method
class PinValidator {

    static void checkPinLength(String pin) {

        if (pin.length() != 4) {
            System.out.println("Invalid PIN — must be exactly 4 digits.");
        }
        else {
            System.out.println("PIN length OK.");
        }
    }
}


// Main class
public class MainPinValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter PIN: ");
        String pin = sc.nextLine();

        PinValidator.checkPinLength(pin);

        sc.close();
    }
}
```
