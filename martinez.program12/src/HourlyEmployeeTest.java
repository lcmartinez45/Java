//********************************************************************
//
//  Developer:            Lillian Martinez
//
//  Program #:            Twelve
//
//  File Name:            HourlyEmployee.java
//
//  Course:               ITSE 2321 Objected-Oriented Programming (Java)
//
//  Instructor:           Fred Kumi 
//
//  Description:
//      This program tests HourlyEmployee methods and lets the user enter as
//      many employees as they want using "no" to break out of the program.
//
//********************************************************************;
import java.util.Scanner;

public class HourlyEmployeeTest {

public static void main(String[] args) {
//Initialize new hourly employee object  
HourlyEmployee h[] = new HourlyEmployee[50];
  
Scanner in =new Scanner(System.in);

int n=0;
  
while(true) //Use true to initiate the program
{
System.out.println("Enter First Name (type \"no\" to stop): ");
String fname=in.next();

//Controlling the program, if they enter no the program stops, ignoring case
if(fname.equalsIgnoreCase("no"))
break;
  
    System.out.println("Enter Last Name: ");
    String lname=in.next();
  
    System.out.println("Enter Pay Rate: ");
    double rate=in.nextDouble();
  
System.out.println("Enter working hours for 4 weeks : ");
//Allows the user to enter four values for each week  
double w1=in.nextDouble();
double w2=in.nextDouble();
double w3=in.nextDouble();
double w4=in.nextDouble();

h[n]=new HourlyEmployee(fname,lname,rate,w1,w2,w3,w4);
n++;
}
  
for(int i=0;i<n;i++)
System.out.println("\n\n"+h[i].toString());

} 
}

