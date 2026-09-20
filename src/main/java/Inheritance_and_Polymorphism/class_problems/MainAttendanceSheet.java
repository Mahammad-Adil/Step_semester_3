class AttendanceSheet {

    private String[] presentStudents;
    private int presentCount;

    // Constructor
    public AttendanceSheet(int maxStudents) {
        presentStudents = new String[maxStudents];
        presentCount = 0;
    }

    // Mark a student as present
    public void markPresent(String name) {

        // Check if student is already present
        if (isPresent(name)) {
            return;
        }

        // Add student if there is space
        if (presentCount < presentStudents.length) {
            presentStudents[presentCount] = name;
            presentCount++;
        }
    }

    // Return number of present students
    public int getPresentCount() {
        return presentCount;
    }

    // Check whether a student is present
    public boolean isPresent(String name) {

        for (int i = 0; i < presentCount; i++) {
            if (presentStudents[i].equals(name)) {
                return true;
            }
        }

        return false;
    }
}

public class MainAttendanceSheet {
    public static void main(String[] args) {

        AttendanceSheet sheet = new AttendanceSheet(30);

        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana");

        System.out.println("Present Count = " + sheet.getPresentCount());
        System.out.println("Ben present? " + sheet.isPresent("Ben"));
        System.out.println("Chen present? " + sheet.isPresent("Chen"));
    }
}