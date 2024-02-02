package Coding;

// Write a Java program to create a class called "Rectangle" with 
// width and height attributes. Calculate the area and perimeter of the rectangle.
class Rectangles {
    private double width;
    private double height;
    public Rectangles(double width, double height) {
        this.width=width;
        this.height=height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width=width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height=height;
    }
    public double getArea() {
        return width*height;
    }
    public double getPerimeter() {
        return (2*(width+height));
    }
    
}
public class Exercise3 {
    public static void main(String[] args) {
        Rectangles rectangle=new Rectangles(6, 3);
        System.out.println("Area of rectangle: "+rectangle.getArea());
        System.out.println("Perimeter of a rectangle: "+rectangle.getPerimeter());
        rectangle.setWidth(7);
        rectangle.setHeight(4);
        System.out.println("Area of rectangle is now: "+rectangle.getArea());
        System.out.println("Perimeter of a rectangle is now: "+rectangle.getPerimeter());
    }
}
