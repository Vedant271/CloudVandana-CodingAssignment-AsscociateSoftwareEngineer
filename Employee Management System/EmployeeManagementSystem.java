import java.util.List;
import java.util.ArrayList;

// Defining an Employee class that will hold information about an employee.
class Employee{
    // Private fields are used to encapsulate the data.
    // The 'private' access modifier ensures these fields can't be accessed directly outside this class.
    private int id;
    private String name;
    private double salary;

    // Constructor to initialize the Employee object with id, name, and salary.
    // This constructor is public, allowing instances of Employee to be created from other classes.
    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Public method to display employee details.
    public void displayDetails(){
        System.out.printf("Id: %d, Name: %s, Salary: %.2f%n", this.id, this.name, this.salary);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args){
        // Creating Employee objects using the Employee constructor.
        // emp1, emp2, and emp3 are instances of the Employee class.
        Employee emp1 = new Employee(101, "Varun", 50000);
        Employee emp2 = new Employee(102, "Tarun", 70000);
        Employee emp3 = new Employee(103,"Navin", 60000);

        // List is an interface, and ArrayList is a concrete class implementing it.
        // We use the List interface to declare the type of employeeList.
        List<Employee> employeeList = new ArrayList<>();

        // Adding Employee objects to the ArrayList using the add method.
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        // Printing the header for the employee details
        System.out.println("Employee Details - ");

        // Enhanced for-loop (also known as a 'foreach' loop) to iterate over the employeeList.
        // This loop is a cleaner way to iterate through collections like lists.
        for(Employee employee:employeeList){
            // Calling the displayDetails method on each Employee object.
            employee.displayDetails();
        }
    }
}
