package Oops.Practice;

class Main {
   
    String word;
    

    // Default Constructor 
    Main() {
        System.out.println("Constructor called");
    }

    // Parameterized Constructor 
    Main(String word) {
        this.word=word;
    }

    public void printWord() {
        System.out.println(this.word);
    }

    // Copy Constructor 
    Main(Main obj1) {
        this.word=obj1.word;
    }
}
public class Test {
    //Constructors
    public static void main(String[] args) {
        Main obj=new Main();
        obj.word="Hi";

        Main obj1=new Main(obj);
        obj.printWord();
    }
    
}
