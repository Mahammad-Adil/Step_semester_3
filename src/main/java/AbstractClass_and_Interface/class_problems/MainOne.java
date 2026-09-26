import java.util.*;

interface Payment {
    double calculateFinalAmount(double amount);
    String getType();
}

class Card implements Payment {
    public double calculateFinalAmount(double amount) {
        return amount + amount * 0.02;
    }

    public String getType() {
        return "CARD";
    }
}

class Wallet implements Payment {
    public double calculateFinalAmount(double amount) {
        return amount + amount * 0.01;
    }

    public String getType() {
        return "WALLET";
    }
}

class BankTransfer implements Payment {
    public double calculateFinalAmount(double amount) {
        return amount;
    }

    public String getType() {
        return "BANKTRANSFER";
    }
}

public class MainOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double amount = sc.nextDouble();

            Payment payment;

            if (type.equals("CARD"))
                payment = new Card();
            else if (type.equals("WALLET"))
                payment = new Wallet();
            else
                payment = new BankTransfer();

            double finalAmount = payment.calculateFinalAmount(amount);

            System.out.printf("%s: %.2f%n", payment.getType(), finalAmount);

            total += finalAmount;
        }

        System.out.printf("Total: %.2f%n", total);
    }
}