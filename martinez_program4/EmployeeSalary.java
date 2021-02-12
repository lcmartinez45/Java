/* 
Name: Lillian Martinez
Course: ITSE 2321 Object-Oriented Programming Java
Program: Four
File Name: EmployeeSalary.java
Due Date: 9-28-2019
Instructor: Fred Kumi
Chapter: Chapter 4
Description: This program will ask the user to input their employee ID, hourly
rate of pay, number of hours worked, and any overtime hours worked. It will then
calculate net pay, gross pay, overtime pay, and deductions.
 */
import java.util.Scanner;

public class EmployeeSalary {
    /*
    Method: main
    Description: The main method of the program
    Parameters: float
    Returns: N/A
    */
    public static void main(String[] args) {
        int employee_id;
        float basic_salary,hours_worked,overtime,total_hours,
                net_pay,regular_pay,overtime_pay,gross_pay,deductions;
        
  //create a Scanner object to obtain information from the user      
  Scanner scan = new Scanner(System.in);

  System.out.println("Enter Employee ID number: ");
  employee_id = scan.nextInt();
 
  System.out.println("Enter Hourly Rate of Pay: ");
  basic_salary = scan.nextFloat();

  System.out.println("Enter Number of Hours Worked for the Week: "); 
  hours_worked = scan.nextFloat();

  //calculate regular pay, total hours, overtime pay, gross pay, net pay,
  //and deductions
  regular_pay = hours_worked * basic_salary;
  
  if (hours_worked > 40) {
      overtime = (hours_worked - 40);
  }
  else {
      overtime = 0;
  }
  
  total_hours = hours_worked + overtime;
  overtime_pay = (float) ((1.5 * basic_salary) * overtime);
  gross_pay = total_hours * hours_worked; 
  deductions = (float) ((gross_pay * .105) + 25);
  net_pay = gross_pay - deductions;
   
  //print ID number, pay rate, regular hours, overtime hours, total hours, 
  //regular hours, overtime pay, gross pay, deductions, and net pay
  System.out.println("\nProgram 4");
  System.out.println("ID Number: "+employee_id);
  System.out.println("Pay Rate: "+basic_salary);
  System.out.println("Regular Hours: "+hours_worked);
  System.out.println("Overtime Hours: "+overtime);
  System.out.println("Total Hours: "+total_hours);
  System.out.println("Regular Pay: "+regular_pay);
  System.out.println("Overtime Pay: "+overtime_pay);
  System.out.println("Gross Pay: "+gross_pay); 
  System.out.println("Deductions: "+deductions);
  System.out.println("Net Pay: "+net_pay);
    }   
}
