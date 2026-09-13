```java
import java.util.Random;

public class WellnessProgram {

    // Method to classify BMI
    static String getBmiStatus(double bmi) {

        if (bmi < 18.5) {
            return "Underweight";
        }
        else if (bmi < 25) {
            return "Normal";
        }
        else if (bmi < 30) {
            return "Overweight";
        }
        else {
            return "Obese";
        }
    }

    // Method to calculate and print report
    static void printWellnessReport(double[] heights, double[] weights) {

        System.out.println("\n================ WELLNESS REPORT ================");
        System.out.printf("%-8s %-15s %-15s %-10s %-15s%n",
                "Person", "Height (m)", "Weight (kg)", "BMI", "Status");

        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < heights.length; i++) {

            double bmi = weights[i] / (heights[i] * heights[i]);

            String status = getBmiStatus(bmi);

            System.out.printf("%-8d %-15.2f %-15.2f %-10.2f %-15s%n",
                    (i + 1), heights[i], weights[i], bmi, status);
        }
    }

    public static void main(String[] args) {

        int n = 10;

        double[] heights = new double[n];
        double[] weights = new double[n];

        Random random = new Random();

        // Generate random height and weight
        for (int i = 0; i < n; i++) {

            // Height between 1.50 and 2.00 meters
            heights[i] = 1.50 + random.nextDouble() * 0.50;

            // Weight between 45 and 100 kg
            weights[i] = 45 + random.nextDouble() * 55;
        }

        // Print wellness report
        printWellnessReport(heights, weights);
    }
}
```
