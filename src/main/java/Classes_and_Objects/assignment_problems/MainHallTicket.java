```java
class HallTicket {

    String studentName;
    int seatNumber;

    HallTicket(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }
}

public class MainHallTicket {

    public static void main(String[] args) {

        // Create one HallTicket object
        HallTicket priya =
            new HallTicket("Priya", 0);

        // copy points to the SAME object
        HallTicket copy = priya;

        // Change through copy
        copy.seatNumber = 45;

        // Create a separate object
        HallTicket separate =
            new HallTicket("Priya", 45);

        // Print results
        System.out.println(
            "Priya's seatNumber (via first variable): "
            + priya.seatNumber
        );

        System.out.println(
            "copy == priya: " + (copy == priya)
        );

        System.out.println(
            "separate == priya: " + (separate == priya)
        );
    }
}
```
