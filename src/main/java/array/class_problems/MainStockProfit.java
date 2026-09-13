```java
import java.util.Scanner;

class StockProfit {

    static int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        // Traverse the array once
        for (int i = 1; i < prices.length; i++) {

            // Update minimum price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Calculate profit if we sell today
            int profit = prices[i] - minPrice;

            // Update maximum profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}


public class MainStockProfit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter stock prices:");

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int result = StockProfit.maxProfit(prices);

        System.out.println("Maximum Profit: " + result);

        sc.close();
    }
}
```
