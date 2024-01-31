package Coding;
// Write a Java program to create a class called "Employee" with a name,
// job title, and salary attributes, and methods to calculate and update salary.
class Employee {
    private String name;
    private String jobTitle;
    private double salary;
    public Employee(String name, String jobTitle, double salary) {
        this.name=name;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle=jobTitle;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary=salary;
    }  
    public void raiseSalary(double percentage) {
        salary=salary+salary*percentage/100;
    }
    public void printEmployeeDetails() {
        System.out.println("Name: "+name);
        System.out.println("JobTitle: "+jobTitle);
        System.out.println("Salary: "+salary);
    }
}
public class Exercise6 {
    public static void main(String[] args) {
        Employee employee=new Employee("Alex", "Manager", 100000);
        System.out.println("Employee Details");
        employee.printEmployeeDetails();
    }
    
}
