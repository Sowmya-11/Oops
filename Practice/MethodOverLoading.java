package Oops.Practice;

// Polymorphism
class Sum {

    public int printSum(int a, int b) {
        return a+b;
    }

    public int printSum(int a, int b,int c) {
        return a+b+c;
    }

    public float printSum(float a,float b) {
        return a+b;
    }
}

public class MethodOverLoading {
    
    public static void main(String[] args) {
        Sum s=new Sum();
        System.out.println(s.printSum(20,20)); 
        System.out.println(s.printSum(20,20,20)); 
        System.out.println(s.printSum(2.5f, 5.5f));
    }
    
}
