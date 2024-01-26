package Oops.Practice;

abstract class Animal {
    // abstract class can have abstract and non-abstract methods 
    abstract void walk();
    public void eat() {
        System.out.println("Animal eats");
    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Hen extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.walk();
        horse.eat();
    }
    
}
