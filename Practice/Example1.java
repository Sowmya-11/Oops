package Practice;

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
        s1.name="Dora";
        s1.age=17;

        s1.printInfo();
    }
}
