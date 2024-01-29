package Coding;

// Write a Java program to create a class called Animal with a method named move().
// Create a subclass called Cheetah that overrides the move() method to run.

class Animals {
    void move() {
        System.out.println("Animal moves");
    }
}
class Cheetah extends Animals {
    void move() {
        System.out.println("Cheetah is running!");
    }
}
public class InheritanceConcept5 {
    public static void main(String[] args) {
        Animals animal=new Animals();
        animal.move();
        Cheetah cheetah=new Cheetah();
        cheetah.move();
    }
}
