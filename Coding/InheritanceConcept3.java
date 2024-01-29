package Coding;

// Write a Java program to create a class called Employee with methods called work() and getSalary(). 
// Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().

class Employee {
    private int salary;
    public Employee(int salary) {
        this.salary=salary;
    }
    void work() {
        System.out.println("Working as an employee");
    }
    public int getSalary() {
        return salary;
    }
}
class HRManager extends Employee {
    public HRManager(int salary) {
        super(salary);
    }
    void work() {
        System.out.println("Managing employees");
    }
    public void addEmployee() {
        System.out.println("Adding new employee!");
    }
}
public class InheritanceConcept3 {
    public static void main(String[] args) {
        Employee employee=new Employee(40000);
        HRManager manager=new HRManager(70000);
        employee.work();
        System.out.println("Employee salary: "+employee.getSalary());
        manager.work();;
        System.out.println("Manager salary: "+manager.getSalary());
        manager.addEmployee();
    }
}
