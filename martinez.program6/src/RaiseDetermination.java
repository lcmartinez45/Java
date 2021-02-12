/* 
Name: Lillian Martinez
Course: ITSE 2321 Object-Oriented Programming Java
Program: Six
File Name: RaiseDetermination.java
Due Date: 10-21-2019
Instructor: Fred Kumi
Chapter: Chapter 15
Description: This program will open a file, read information from a file, make 
calculations based off of the information in the file, write the calculations to
another file, then close the files.
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class RaiseDetermination
{
    private Scanner input;
    private ArrayList<Double> payroll = new ArrayList<>();
    
    /*
    Method: main
    Description: The main method of the program, doesnt make calculations only
    calls on methods
    Parameters: float
    Returns: N/A
    */
    public static void main(String[] args)
    {
        RaiseDetermination myObject = new RaiseDetermination();
        myObject.openFile();
        myObject.readPayroll();
        myObject.calculatePayrollRaise();
        myObject.closeFile();
    }

    //Open Program6.txt file to read from
    public void openFile()
    {
        try
        {
            input = new Scanner(new File("Program6.txt"));
        }
        catch (IOException e)
        {
            System.err.println("Error opening file. Terminating.");
            System.exit(-1);
        }
    }

    // Read records from the file
    public void readPayroll()
    {
        try
        {
            while(input.hasNext()) // while there is more to read
            {
                payroll.add(input.nextDouble());
            }
        }
        catch (NoSuchElementException elementException)
        {
            System.err.println("File improperly formed. Terminating.");
            System.exit(-1);
        }
        catch (IllegalStateException stateException)
        {
            System.err.println("Error reading from file. Terminating.");
            System.exit(-1);
        }
    }

    // Payroll raise calculations, determines the raises
    public void calculatePayrollRaise()
    {
        System.out.println("Before Payroll\tRaise Percent\tRaise Amount\tAfter Payroll");

        double raisePercent = 0;
        double raiseAmount = 0;
        double totalBeforePayroll = 0;
        double totalAfterPayroll = 0;

        for (int i = 0; i < payroll.size(); i++)
        {

            if (payroll.get(i) > 70000) {
                raisePercent = 4;
            }
            else if (payroll.get(i) > 50000)
            {
                raisePercent = 7;
            }
            else
            {
                raisePercent = 5.5;
            }
            raiseAmount = payroll.get(i) * raisePercent / 100;

            System.out.printf("%.2f\t\t%.1f%%\t\t%.2f\t\t%.2f%n",
                    payroll.get(i),
                    raisePercent,
                    raiseAmount,
                    payroll.get(i) + raiseAmount);

            totalBeforePayroll += payroll.get(i);
            totalAfterPayroll += payroll.get(i) + raiseAmount;
        }    
        System.out.printf("Total amount of raises: %10.2f%n", totalAfterPayroll - totalBeforePayroll);
        System.out.printf("Average raise percent : %10.2f%n", (totalAfterPayroll - totalBeforePayroll) * 100.0 / totalBeforePayroll);
        System.out.printf("Average raise amount  : %10.2f%n", (totalAfterPayroll - totalBeforePayroll) / payroll.size());
        System.out.printf("Total faculty payroll before raise: %10.2f%n", totalBeforePayroll);
        System.out.printf("Total faculty payroll average before raise: %10.2f%n", totalBeforePayroll / payroll.size());
        System.out.printf("Total faculty payroll after raise: %10.2f%n", totalAfterPayroll);
        System.out.printf("Total faculty payroll average after raise: %10.2f%n", totalAfterPayroll / payroll.size());
        
        //Write the contents to Program6-out.txt
        try
        {
            PrintWriter pr = new PrintWriter("Program6-out.txt");    

            for (int i=0; i < payroll.size(); i++)
            {
                pr.println(payroll.get(i));
                pr.println(raisePercent);
                pr.println(raiseAmount);
                pr.println(payroll.get(i)+raiseAmount+"\n");
            }
            pr.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("No such file exists.");
        }
    }
	// close file
	public void closeFile()
	{
		if (input != null)
			input.close();
	}
}