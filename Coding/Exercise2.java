package Coding;

// Write a Java program to create a class called "Dog" with a name and breed attribute. 
// Create two instances of the "Dog" class, set their attributes using the constructor 
// and modify the attributes using the setter methods and print the updated values.
class Dog {
    String name;
    String breed;
    public Dog(String name, String breed) {
        this.name=name;
        this.breed=breed;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed=breed;
    }
} 
public class Exercise2 {
    public static void main(String[] args) {
        Dog dog=new Dog("Buddy","Golden Retriever");
        System.out.println(dog.getName()+" is a "+dog.getBreed()+".");
        System.out.println("\nSet the new Breed of dog ");
        dog.setBreed("Labrador Retriever");
        System.out.println(dog.getName() + " is now a " + dog.getBreed() + ".");
    }
    
}
