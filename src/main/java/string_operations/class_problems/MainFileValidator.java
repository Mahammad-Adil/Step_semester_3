```java
import java.util.Scanner;

// Class containing the required method
class FileValidator {

    static String validateFileExtension(String filename) {

        // Find the last dot
        int dotIndex = filename.lastIndexOf('.');

        // If there is no dot or dot is the last character
        if (dotIndex == -1 || dotIndex == filename.length() - 1) {
            return "Rejected — invalid file type";
        }

        // Extract extension
        String extension = filename.substring(dotIndex + 1);

        // Check accepted extensions
        if (extension.equalsIgnoreCase("pdf") ||
            extension.equalsIgnoreCase("docx") ||
            extension.equalsIgnoreCase("zip")) {

            return "Accepted";
        }

        return "Rejected — invalid file type";
    }
}


// Main class
public class MainFileValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter filename: ");
        String filename = sc.nextLine();

        String result = FileValidator.validateFileExtension(filename);

        System.out.println(result);

        sc.close();
    }
}
```
