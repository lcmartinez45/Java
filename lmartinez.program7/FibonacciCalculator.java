
import java.math.BigInteger;

//********************************************************************
//
//  Developer:            Lillian Martinez
//
//  Program #:            7
//
//  File Name:            FibonacciCalculator.java
//
//  Course:               ITSE 2317 Intermediate Programming (Java)
//
//  Instructor:           Fred Kumi 
//
//  Description:          FibonacciCalculator class. This program calculates the 
//                        approximate amount of time required to perform the 
//                        calculation and the number of calls made to the recursive 
//                        method using static System method current- TimeMillis, 
//                        which returns the computer’s current time in milliseconds. 
//                        Then, determines the number of calls made to method fibonacci.
//********************************************************************;

public class FibonacciCalculator {
    
    private static BigInteger TWO = BigInteger.valueOf(2);
    public static int callCount = 0;
    
    public static BigInteger fibonacci(BigInteger number)
    {   
        callCount++;
        if (number.equals(BigInteger.ZERO) ||
                number.equals(BigInteger.ONE))
        {
            return number;
        }
        else
        {
            return fibonacci(number.subtract(BigInteger.ONE))
                    .add(fibonacci(number.subtract(TWO)));
        }
    } 
    
    public static void developerInfo()
{
   System.out.println ("Name:    Lillian Martinez");
   System.out.println ("Course:  ITSE 2317 Intermediate Java Programming");
   System.out.println ("Program: Seven \n");

}
    
    public static void main(String[] args) 
    {
        developerInfo();
        
        for (int counter = 0; counter <= 40; counter++)
        {
            long startTime = System.currentTimeMillis();
            System.out.printf("Fibonacci of %d is: %d%n", counter, 
                 fibonacci(BigInteger.valueOf(counter)));
            
            long endTime = System.currentTimeMillis();
            System.out.println("Milliseconds required to perform calculation: " + (endTime - startTime));
            System.out.printf("Number of calls made to fibonacci method: %d%n%n", callCount);
        }
        
    }
    
}
