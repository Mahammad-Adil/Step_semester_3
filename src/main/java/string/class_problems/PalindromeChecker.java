```java
import java.util.Scanner;

public class PalindromeChecker {

    // 1. Iterative approach
    static boolean isPalindromeIterative(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // 2. Recursive approach
    static boolean isPalindromeRecursive(String text) {

        // Base case
        if (text.length() <= 1) {
            return true;
        }

        // Compare first and last characters
        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }

        // Check the remaining substring
        return isPalindromeRecursive(
            text.substring(1, text.length() - 1)
        );
    }

    // 3. Array reversal approach
    static boolean isPalindromeArrayReversal(String text) {

        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];

        // Reverse the array
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }

        // Compare original and reversed arrays
        return new String(original).equals(new String(reversed));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        boolean iterative = isPalindromeIterative(text);
        boolean recursive = isPalindromeRecursive(text);
        boolean arrayReversal = isPalindromeArrayReversal(text);

        System.out.println("\n===== PALINDROME VERIFICATION =====");

        System.out.println("Iterative Approach      : " + iterative);
        System.out.println("Recursive Approach      : " + recursive);
        System.out.println("Array Reversal Approach : " + arrayReversal);

        // Verify that all three approaches agree
        if (iterative == recursive && recursive == arrayReversal) {
            System.out.println("\nAll three approaches agree.");
        } else {
            System.out.println("\nThe approaches do not agree.");
        }

        if (iterative) {
            System.out.println("Result: The text is a palindrome.");
        } else {
            System.out.println("Result: The text is NOT a palindrome.");
        }

        sc.close();
    }
}
```
