```java
class EmployeeSalary {

    // Instance fields
    String empName;
    double salary;

    // Static fields shared by all employees
    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    // Constructor
    Employee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;

        employeeCount++;
    }

    // Static method
    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class MainEmployeeSalary {

    public static void main(String[] args) {

        // Creating three Employee objects
        Employee employee1 = new Employee("Priya", 50000);
        Employee employee2 = new Employee("Arjun", 45000);
        Employee employee3 = new Employee("Rahul", 55000);

        // Calling static method through class name
        Employee.printCompanyInfo();
    }
}
```
