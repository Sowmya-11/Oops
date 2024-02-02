package Coding;

// Write a Java program to create a class called "Person" with a name and age attribute.
// Create two instances of the "Person" class, set their attributes using the constructor, 
// and print their name and age

class Persons {
    private String name;
    private int age;
    public Persons(String name, int age) {
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        Persons person1=new Persons("John", 30);
        Persons person2=new Persons("Tina", 27);
        System.out.println(person1.getName()+" is "+person1.getAge()+" years old.");
        System.out.println(person2.getName()+" is "+person2.getAge()+" years old.");
    }
    
}
