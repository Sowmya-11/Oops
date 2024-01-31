package Coding;

// Write a Java program to create a class called "Circle" with a radius attribute. 
// You can access and modify this attribute. Calculate the area and circumference of the circle.
class Circle {
    double radius;
    public Circle(double radius) {
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius=radius;
    }
    public double getArea() {
        return radius*radius;
    }
    public double getCircumference() {
        return 2*3.14*radius;
    }
}
public class Exercise4 {
    public static void main(String[] args) {
        Circle circle=new Circle(3);
        System.out.println("Area of a circle: "+circle.getArea());
        System.out.println("Circumference if a circle: "+circle.getCircumference());
        circle.setRadius(5);
        System.out.println("Area of a circle is now: "+circle.getArea());
        System.out.println("Circumference if a circle is now: "+circle.getCircumference());
    }
}
