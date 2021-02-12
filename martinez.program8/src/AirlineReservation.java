/* 
Name: Lillian Martinez
Course: ITSE 2321 Object-Oriented Programming Java
Program: Eight
File Name: StudentAnswer.java
Due Date: 11-1-2019
Instructor: Fred Kumi
Chapter: Chapter 8
Description: This program will assign seats to an airline flight. The user can 
choose from two classes, First and Economy. The program will then display the
seat number and will tally the number of seats for each class. First class only
has 1-5, and Economy has 6-10. Once all the seats are filled the program ends.
 */

import java.util.Scanner;

public class AirlineReservation {

   // Array of seats on the flight
   boolean[] flightSeats = new boolean[11]; 
   Scanner input = new Scanner(System.in);

   public void start() {
       while (true) {
           bookSeat();
       }
   }

   // Method for booking a seat and reserving that seat on a certain class flight
   public void bookSeat() {
       // Asks the user for his preferred class to travel, First or Economy
       System.out.println("Choose Your preference: Type '1' for First Class or '2' for Economy Class:");
       
       int passengerClass = input.nextInt(); //Set variable for input for the type of class seat
       if (passengerClass == 1) {
           firstClassBooking(); //Call method firstClassBooking
           
       } else if (passengerClass == 2) {
           economyClassBooking(); //Call method Economy Class
           
       } else {
           System.out.println("Invalid Choice!");
       }
   }

   // This method checks and books for first class seating if the passenger chooses this class.
   public void firstClassBooking() {
       for (int count = 1; count <= 5; count++) {
           
           // Check to see if the seat is available to book
           if (flightSeats[count] == false) {
               // Book the seat
               flightSeats[count] = true;
               System.out.printf("First Class seat booking: Seat #%d\n", count);
               break;
           } else if (flightSeats[5] == true) {
               if (flightSeats[10] == true) {
                   // If both flight classes are fully booked
                   System.out.println("Sorry, all seats are booked. Next flight is scheduled in '3' hours.");
                   System.exit(0);
               } else {
                   // Provide the passenger with another available class option for booking
                   System.out.println(
                           "Sorry, First Class bookings are over. Would you like to opt for Economy class? Select '1' for Yes and '2' for No.");
                   int selection = input.nextInt();
                   if (selection == 1) {
                       //Call method for booking economy class and book
                       economyClassBooking();
                       start();
                   } else {
                       System.out.println("Next flight is scheduled in '3' hours.");
                       System.exit(0);
                   }
               }
           }
       }
   }

   // This method checks and books for economy class seating if the passenger chooses this class.
   public void economyClassBooking()
   {
       for (int count = 6; count <= 10; count++) {
           if (flightSeats[count] == false) {
               flightSeats[count] = true;
               System.out.printf("Economy Class seat booking : Seat #%d\n", count);
               break;
           } else if (flightSeats[10] == true) {
               if (flightSeats[5] == true) {
                   System.out.println("Sorry, all seats are booked. Next flight is scheduled in '3' hours.");
                   System.exit(0);
               } else {
                   System.out.println(
                           "Sorry, Economy Class seat bookings are over. Would you like to opt for First Class seat? Press '1' for Yes and '2' for No.");
                   int selection = input.nextInt();
                   if (selection == 1) {
                       firstClassBooking();
                       //Books the seat from the start method
                       start();
                   } else {
                       System.out.println("Next flight is scheduled in 3 hours.");
                       System.exit(0);
                   }
               }
           }
       }
   }

   public static void main(String[] args) {

       AirlineReservation ar = new AirlineReservation();
       Scanner scan = new Scanner(System.in);

       char option = ' ';
       // Initiates one instance of the loop before asking if they would like to
       // book again, if not equal to n they stay in the loop to continue adding seat(s)
       do {
           ar.bookSeat();
           System.out.print("Do you want to book another seat? (y/n): ");
           option = scan.nextLine().toLowerCase().charAt(0); //prevents an error by setting the users input to lowercase
       } while (option != 'n');

       scan.close();
   }
}

