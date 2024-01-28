package Coding;

// Write a Java program to create a class called Animal with a method called makeSound().
// Create a subclass called Cat that overrides the makeSound() method to bark.
class Animal {
    void makeSound() {
        System.out.println("This animal makes Sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat quarrels");
    }
}

public class InheritanceConcept {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.makeSound();
        Cat cat=new Cat();
        cat.makeSound();
    }
    
}
