import java.util.List;
import java.util.ArrayList;

class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.printf("Id: %d, Name: %s, Salary: %.2f%n", this.id, this.name, this.salary);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args){
        Employee emp1 = new Employee(101, "Varun", 50000);
        Employee emp2 = new Employee(102, "Tarun", 70000);
        Employee emp3 = new Employee(103,"Navin", 60000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        System.out.println("Employee Details - ");
        for(Employee employee:employeeList){
            employee.displayDetails();
        }
    }
}
