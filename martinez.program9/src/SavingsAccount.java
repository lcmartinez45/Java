/* 
Name: Lillian Martinez
Course: ITSE 2321 Object-Oriented Programming Java
Program: 9
File Name: SavingsAccount.java
Due Date: 11-15-2019
Instructor: Fred Kumi
Chapter: Chapter 9
Description: This program with consist of 5 methods that calculate monthly interest,
deposits a valid amount, withdraws a valid amount, modifies interest rate between [2,5],
and returns a string representation to print the values.
 */

public class SavingsAccount {
    
    private static double annualInterestRate=0; //Variable stores annual interest rate for all account holders
    private double savingsBalance; //Indicates the amount the saver currently has on deposit
  
   // Constructor that initializes the initial balance for the account
   public SavingsAccount(double balance)
   {
       savingsBalance = balance;
   }
  
   // Method to calculate and update the balance with the monthly interest
   public void calculateMonthlyInterest()
   {
       savingsBalance += ((savingsBalance*annualInterestRate)/12);
   }
  
   // Method to deposit an amount in the account
   public void depositAmount(double amount)
   {
       // Check that the amount is not negative, or else ignore the deposit. If 
       // not negative add the amount to the balance
       if(amount >= 0)
           savingsBalance += amount;
   }
  
   // Method to withdraw an amount from the account 
   public void withdrawAmount(double amount)
   {
       // Check that the amount is not negative, or else ignore the withdrawal.
       // If it is not negative withdraw the amount from the balance
       if(amount >=0)
           savingsBalance -= amount;
   }
  
   // Method to update the annual interest rate with the passed value
   public static void modifyInterestRate(double interestRate)
   {
       // Check that the value of the parameter is between [2,5] then update,
       // if not ignore the update
       if(interestRate >= 2 && interestRate <= 5)
           annualInterestRate = interestRate;
   }
  
   // Method to return string representation of the account
   public String toString()
   {
       return "$"+String.format("%,.2f",savingsBalance); // Print the variable
   }
}
//End of SavingsAccount.java


 
