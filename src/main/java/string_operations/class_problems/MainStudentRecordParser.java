```java
import java.util.Scanner;

// Class containing the required method
class StudentRecordParser {

    static void parseStudentRecord(String csvLine) {

        // Split CSV line using comma
        String[] fields = csvLine.split(",");

        // Check if exactly 3 fields are present
        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        // Print formatted record
        System.out.println("Name: " + fields[0]
                + " | Roll No: " + fields[1]
                + " | Dept: " + fields[2]);
    }
}


// Main class
public class MainStudentRecordParser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student record: ");
        String csvLine = sc.nextLine();

        StudentRecordParser.parseStudentRecord(csvLine);

        sc.close();
    }
}
```
