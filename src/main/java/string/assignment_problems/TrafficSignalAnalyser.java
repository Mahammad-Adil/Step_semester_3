```java
import java.util.Scanner;

public class TrafficSignalAnalyzer {

    static void findLongestStreak(String signalLog) {

        int currentStreak = 1;
        int longestStreak = 1;
        char longestColor = signalLog.charAt(0);

        // Start from the second character
        for (int i = 1; i < signalLog.length(); i++) {

            // Same color as previous character
            if (signalLog.charAt(i) == signalLog.charAt(i - 1)) {
                currentStreak++;
            }
            else {
                currentStreak = 1;
            }

            // Update longest streak
            if (currentStreak > longestStreak) {
                longestStreak = currentStreak;
                longestColor = signalLog.charAt(i);
            }
        }

        System.out.println("\nLongest Streak: '" + longestColor
                + "' repeated " + longestStreak + " times");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter signal log: ");
        String signalLog = sc.nextLine();

        if (signalLog.length() == 0) {
            System.out.println("Signal log cannot be empty.");
        }
        else {
            findLongestStreak(signalLog);
        }

        sc.close();
    }
}
```
