package Coding;

// Write a Java program to create a class called Shape with a method called getArea().
// Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

class Shape {
    public double getArea() {
        return 0.0;
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return length*width;
    }
}

public class InheritanceConcept2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3.0, 10.0);
        double area = rectangle.getArea();
        System.out.println("Area of Rectangle is "+area);
    }
}
