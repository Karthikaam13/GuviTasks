package task10;

public class Account {

     // Data member
     private double balance;

     // Constructors
     // Parameterless constructor
     public Account() {
         // Default balance is set to 0
         this.balance = 0.0;
     }
 
     // Constructor with two arguments
     public Account(double initialBalance) {
         // Set the balance to the provided value
         this.balance = initialBalance;
     }
 
     // Method to withdraw balance
     public void withdraw(double amount) {
         if (amount > 0 && amount <= balance) {
             balance -= amount;
             System.out.println("Withdrawal successful. Remaining balance: " + balance);
         } else {
             System.out.println("Withdrawal failed. Insufficient funds.");
         }
     }
 
     // Method to deposit balance
     public void deposit(double amount) {
         if (amount > 0) {
             balance += amount;
             System.out.println("Deposit successful. New balance: " + balance);
         } else {
             System.out.println("Deposit failed. Invalid amount.");
         }
     }
 
    
     public double getBalance() {
         return balance;
     }
 
    
     public static void main(String[] args) {
         // Create Account objects using different constructors
         // Parameterless constructor
         Account account1 = new Account(); 

         // Constructor with initial balance
         Account account2 = new Account(1000.0); 
 
         // Perform withdraw and deposit operations
         account1.deposit(500.0);
         account1.withdraw(200.0);
 
         account2.withdraw(1500.0);
         account2.deposit(200.0);
     }
    
}
