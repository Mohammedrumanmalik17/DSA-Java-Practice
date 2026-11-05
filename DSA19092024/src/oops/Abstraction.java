
package oops;

//Abstract class
abstract class BankAccount {
 private String accountHolderName;
 private double balance;

 // Constructor
 public BankAccount(String accountHolderName, double balance) {
     this.accountHolderName = accountHolderName;
     this.balance = balance;
 }

 // Abstract method: must be implemented by subclasses
 abstract void calculateInterest();

 // Concrete method: shared across all accounts
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited: " + amount + ". New balance: " + balance);
 }

 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn: " + amount + ". Remaining balance: " + balance);
     } else {
         System.out.println("Insufficient funds!");
     }
 }

 public String getAccountHolderName() {
     return accountHolderName;
 }

 public double getBalance() {
     return balance;
 }
}

//Subclass: Savings Account
class SavingsAccount extends BankAccount {
 private static final double INTEREST_RATE = 0.05; // 5% interest

 public SavingsAccount(String accountHolderName, double balance) {
     super(accountHolderName, balance);
 }

 @Override
 void calculateInterest() {
     double interest = getBalance() * INTEREST_RATE;
     System.out.println("Savings Account Interest: " + interest);
 }
}

//Subclass: Current Account
class CurrentAccount extends BankAccount {
 private static final double INTEREST_RATE = 0.02; // 2% interest

 public CurrentAccount(String accountHolderName, double balance) {
     super(accountHolderName, balance);
 }

 @Override
 void calculateInterest() {
     double interest = getBalance() * INTEREST_RATE;
     System.out.println("Current Account Interest: " + interest);
 }
}

//Main class
public class Abstraction {
 public static void main(String[] args) {
     // Create a Savings Account
     BankAccount savings = new SavingsAccount("Alice", 1000.0);
     System.out.println("Account Holder: " + savings.getAccountHolderName());
     savings.deposit(500);
     savings.calculateInterest();

     // Create a Current Account
     BankAccount current = new CurrentAccount("Bob", 2000.0);
     System.out.println("Account Holder: " + current.getAccountHolderName());
     current.withdraw(300);
     current.calculateInterest();
 }
}
