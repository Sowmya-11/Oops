package Oops.Practice;

class Account {
    public String name;
    protected String email;
    private String password;

    // To access Private we use getters and setters
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password=pass;
    }
 }
public class Encapsulation {
    public static void main(String[] args) {
        Account account1=new Account();
        account1.name="Hamara";
        account1.email="hamara12345@gmail.com";
        account1.setPassword("123abc");
        System.out.println(account1.getPassword());
    }
    
}
