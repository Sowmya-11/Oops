package Coding;
// Write a Java program to create a class called "Employee" with a name,
// job title, and salary attributes, and methods to calculate and update salary.
class Employee1 {
    String name;
    String jobTitle;
    double salary;
    public Employee1(String name, String jobTitle, double salary) {
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
        Employee1 employee1=new Employee1("Alex", "Manager", 700000);
        employee1.printEmployeeDetails();
        employee1.raiseSalary(5);
        System.out.println("After raising salary: ");
        employee1.printEmployeeDetails();
    }
}
