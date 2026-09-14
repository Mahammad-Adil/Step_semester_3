```java id="m7q4pz"
class Student {

    // Instance fields
    String name;
    double attendance;

    // Static fields shared by all Student objects
    static String collegeName =
        "SRM Institute of Science and Technology";

    static int studentCount = 0;

    // Constructor
    Student(String name, double attendance) {

        this.name = name;
        this.attendance = attendance;

        studentCount++;
    }

    // Static method
    static void printCollegeInfo() {

        System.out.println(collegeName);
        System.out.println("Students created: " + studentCount);
    }
}

public class MainStudent {

    public static void main(String[] args) {

        Student student1 = new Student("Ravi", 85.0);
        Student student2 = new Student("Anitha", 90.0);

        Student.printCollegeInfo();
    }
}
```
