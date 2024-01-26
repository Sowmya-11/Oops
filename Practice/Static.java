package Oops.Practice;

class Student {
    String name;
    static String school;

    public static void changeSchool() {
        school="newSchool";
    }
}


public class Static {
    public static void main(String[] args) {
        Student.school="ABC";
        Student s1=new Student();
        s1.name="Tony";
        // System.out.println(s1.school);

    }
    
}
