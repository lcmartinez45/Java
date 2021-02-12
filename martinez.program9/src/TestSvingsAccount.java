/* 
Name: Lillian Martinez
Course: ITSE 2321 Object-Oriented Programming Java
Program: 9
File Name: TestSvingsAccount.java
Due Date: 11-15-2019
Instructor: Fred Kumi
Chapter: Chapter 9
Description: This class tests SavingsAccount class with two objects, saver1 and 
saver2 that are initialized with balances and an interest rate. It will calculate
the monthly interest rate for each for 12 months and print the balances. It will 
next test the methods that deposit and withdraw from SavingsAccount class. 
 */


public class TestSvingsAccount {
  
   // Method to test the Savings Account Class
   public void tester()
   {
       SavingsAccount saver1, saver2;
       
       // Create both of the accounts saver1 and saver2 and set initial balances
       saver1 = new SavingsAccount(2000);
       saver2 = new SavingsAccount(3000);
      
       System.out.println("\tBalances for saver1");
       
       // Update the annual interest rate at 4%
       SavingsAccount.modifyInterestRate(4); // Send the interest rate to method from SavingsAccount
      
       // Loop to calculate monthly interest and display the balance at the end of month for 12 months for saver1
       for(int i=0;i<12;i++) // Loop starts at 0 and adds 1 to i
       {
           saver1.calculateMonthlyInterest(); //Sends saver1 to method from SavingsAccount
           System.out.printf("\nBalance at the end of month %d for saver1: %s",i+1,saver1);
       }
       // Loop to calculate monthly interest and display the balance at the end of month for 12 months for saver2
       System.out.println();
       System.out.println("\n\tBalances for saver2");
       
       for(int i=0;i<12;i++) // Loop starts at 0 and adds 1 to i
       {
           saver2.calculateMonthlyInterest(); //Sends saver2 to method from SavingsAccount
           System.out.printf("\nBalance at the end of month %d for saver2: %s",i+1,saver2);
       }
      
       System.out.println();
       
       // Update saver1 and saver2 depositing and withdrawing amounts   
       saver1.depositAmount(1500);
       saver2.withdrawAmount(550);
       
       // Update annual interest rate to 5%
       SavingsAccount.modifyInterestRate(5); // Send the interest rate to method from SavingsAccount
      
       System.out.println("\n\tBalances at the end of next month");
       
       saver1.calculateMonthlyInterest(); //Sends saver1 to method from SavingsAccount
       System.out.println("\nBalance at the end of next month for saver1: "+saver1);
       
       saver2.calculateMonthlyInterest(); //Sends saver2 to method from SavingsAccount
       System.out.println("Balance at the end of next month for saver2: "+saver2);
   }
   public static void main(String[] args) {
       TestSvingsAccount test = new TestSvingsAccount (); 
       test.tester(); // Call the method to test the class
   }
}
//End of TestSvingsAccount.java
    
