```java id="x9k3q1"
class MessWallet {

    // Private field - cannot be accessed directly outside the class
    private double balance;

    // Constructor
    public MessWallet(double openingBalance) {

        if (openingBalance < 0) {
            System.out.println("Warning: Negative opening balance. Starting at 0.");
            balance = 0;
        } else {
            balance = openingBalance;
        }
    }

    // Add money to wallet
    public void topUp(double amount) {

        if (amount <= 0) {
            System.out.println("Top-up rejected: amount must be positive");
        } else {
            balance += amount;
            System.out.println("Balance after top-up: " + balance);
        }
    }

    // Deduct money from wallet
    public void deduct(double amount) {

        if (amount <= 0) {
            System.out.println("Deduction rejected: amount must be positive");
        }
        else if (amount > balance) {
            System.out.println("Deduct rejected: insufficient balance");
        }
        else {
            balance -= amount;
            System.out.println("Balance after deduction: " + balance);
        }
    }

    // Read-only access
    public double getBalance() {
        return balance;
    }
}

public class MainMessWallet {

    public static void main(String[] args) {

        MessWallet wallet = new MessWallet(500);

        wallet.topUp(200);

        wallet.deduct(1000);

        System.out.println("Final balance: " + wallet.getBalance());
    }
}
```
