```java
import java.util.*;

class WordFrequencyReport {

    static void printFilteredWordFrequency(String feedback) {

        // Stop words
        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};

        // Convert to lowercase and remove punctuation
        feedback = feedback.toLowerCase();
        feedback = feedback.replace(".", "");
        feedback = feedback.replace(",", "");

        // Split into words
        String[] words = feedback.split("\\s+");

        // HashMap to store word and frequency
        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {

            // Check whether word is a stop word
            boolean isStopWord = false;

            for (String stop : stopWords) {
                if (word.equals(stop)) {
                    isStopWord = true;
                    break;
                }
            }

            // Skip stop words
            if (isStopWord) {
                continue;
            }

            // Count frequency
            if (frequency.containsKey(word)) {
                frequency.put(word, frequency.get(word) + 1);
            } else {
                frequency.put(word, 1);
            }
        }

        // Convert HashMap entries to a list
        ArrayList<Map.Entry<String, Integer>> list =
                new ArrayList<>(frequency.entrySet());

        // Sort by frequency in descending order
        Collections.sort(list, (a, b) ->
                b.getValue() - a.getValue());

        // Print result
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}


public class MainWordFrequencyReport {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter feedback: ");
        String feedback = sc.nextLine();

        WordFrequencyReport.printFilteredWordFrequency(feedback);

        sc.close();
    }
}
```
