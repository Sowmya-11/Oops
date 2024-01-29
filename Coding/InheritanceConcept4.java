package Coding;

// Write a Java program to create a class known as "BankAccount" with
// methods called deposit() and withdraw(). 
// Create a subclass called SavingsAccount that overrides the withdraw() method to prevent
// withdrawals if the account balance falls below one hundred.

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, int balance) {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    void deposit(double amount) {
        balance+=amount;
    }
    void withdraw(double amount) {
        if(balance>=amount) {
            balance-=amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public double getBalance() {
        return balance;
    }
}
class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, int balance) {
        super(accountNumber, balance);
    }
    public void withdraw(double amount) {
        if(getBalance() -amount<100) {
            System.out.println("Minimum balance of $100 required");
        } else {
            super.withdraw(amount);
        }
    }
}
public class InheritanceConcept4 {
    public static void main(String[] args) {
        
    }
}
