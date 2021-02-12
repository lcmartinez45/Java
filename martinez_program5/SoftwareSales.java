/* 
Name: Lillian Martinez
Course: ITSE 2321 Object-Oriented Programming Java
Program: Four
File Name: SoftwareSales.java
Due Date: 10-8-2019
Instructor: Fred Kumi
Chapter: Chapter 5
Description: This program will ask the user to input how many packages they have
purchased. It will then calculate the subtotal, discount percent, discount 
price, and total cost. It will display each depending on the number of packages.
 */

import java.util.Scanner;

public class SoftwareSales {

    public static void main(String[] args) {
        
		 /*
    Method: main
    Description: The main method of the program is asking for the number of 
        packages and calculating the discount if there is one, the subtotal 
        before the discount, and the total with the discount included.
    Parameters: int, double
    Returns: N/A
    */
		
        String userInput;
        String userOutput;
        int userNumOfPackages;
        double discount = 0;
        double discountPrice = 0;
        double subtotal = 0;
        double packagePrice = 99;
        double total;
        
        Scanner keyboard = new Scanner(System.in);
      
        System.out.print("Enter number of packages purchased: ");
        userNumOfPackages = keyboard.nextInt();

        
        if(userNumOfPackages < 10) {
            subtotal = packagePrice * userNumOfPackages;
            discount = 0;
            discountPrice = 0;
            total = subtotal - discountPrice;
        }
        else if(userNumOfPackages < 40) {
            subtotal = packagePrice * userNumOfPackages;
            discount = ((double)10 / 100);
            discountPrice = discount * subtotal;
            total = subtotal - discountPrice;     
        }
        else if(userNumOfPackages < 66) {
            subtotal = packagePrice * userNumOfPackages;
            discount = ((double)18 / 100);
            discountPrice = discount * subtotal;
            total = subtotal - discountPrice;     
        }
        else if(userNumOfPackages < 91) {
            subtotal = packagePrice * userNumOfPackages;
            discount = ((double)27 / 100);
            discountPrice = discount * subtotal;
            total = subtotal - discountPrice;     
        }
        else if(userNumOfPackages < 121) {
            subtotal = packagePrice * userNumOfPackages;
            discount = ((double)35 / 100);
            discountPrice = discount * subtotal;
            total = subtotal - discountPrice;     
        }
        else if(userNumOfPackages < 200) {
            subtotal = packagePrice * userNumOfPackages;
            discount = ((double)42 / 100);
            discountPrice = discount * subtotal;
            total = subtotal - discountPrice;     
        }
        else {
            subtotal = packagePrice * userNumOfPackages;
            discount = ((double)48 / 100);
            discountPrice = discount * subtotal;
            total = subtotal - discountPrice; 
        }
        
        userOutput = String.format("Number of units purchased is: %d\n"
                + "Discount applied is: %% %.0f\nTotal savings due to discount "
                + "is: $%,.2f\nYour total is: $%,.2f\n "
                , userNumOfPackages, discount * 100, discountPrice, total);
	
         System.out.println(userOutput);

    }
    
}
