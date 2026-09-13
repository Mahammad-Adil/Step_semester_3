```java
import java.util.Scanner;

// Class containing the required method
class WordReversalEncoder {

    static String reverseEachWord(String sentence) {

        // Split sentence into words
        String[] words = sentence.split(" ");

        StringBuilder result = new StringBuilder();

        // Reverse each word
        for (int i = 0; i < words.length; i++) {

            StringBuilder word = new StringBuilder(words[i]);

            word.reverse();

            result.append(word);

            // Add space between words
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}


// Main class
public class MainWordReversalEncoder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String result = WordReversalEncoder.reverseEachWord(sentence);

        System.out.println("Reversed sentence: " + result);

        sc.close();
    }
}
```
