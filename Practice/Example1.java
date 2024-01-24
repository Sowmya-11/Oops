package Oops.Practice;

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class Example1 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Sowmya";
        s1.age=23;

        s1.printInfo();
    }
}
