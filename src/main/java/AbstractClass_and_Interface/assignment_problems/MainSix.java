import java.util.*;

abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract double calculateFinalAmount();

    abstract String getType();
}

class Card extends Payment {
    Card(double amount) {
        super(amount);
    }

    double calculateFinalAmount() {
        return amount * 1.02;
    }

    String getType() {
        return "CARD";
    }
}

class Wallet extends Payment {
    Wallet(double amount) {
        super(amount);
    }

    double calculateFinalAmount() {
        return amount * 1.01;
    }

    String getType() {
        return "WALLET";
    }
}

class BankTransfer extends Payment {
    BankTransfer(double amount) {
        super(amount);
    }

    double calculateFinalAmount() {
        return amount;
    }

    String getType() {
        return "BANKTRANSFER";
    }
}

public class MainSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double amount = sc.nextDouble();

            Payment payment;

            if (type.equals("CARD"))
                payment = new Card(amount);
            else if (type.equals("WALLET"))
                payment = new Wallet(amount);
            else
                payment = new BankTransfer(amount);

            double finalAmount = payment.calculateFinalAmount();

            System.out.printf("%s: %.2f%n",
                    payment.getType(), finalAmount);

            total += finalAmount;
        }

        System.out.printf("Total: %.2f%n", total);
    }
}