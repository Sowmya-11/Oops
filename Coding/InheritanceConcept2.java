package Coding;

// Write a Java program to create a class called Shape with a method called getArea().
// Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

class Shape {
    void getArea() {
        System.out.println("Calculating area");
    }
}
class Rectangle extends Shape {
    @Override
    void getArea() {
        System.out.println("Area of Rectangle");
    }
}
public class InheritanceConcept2 {
    
}
