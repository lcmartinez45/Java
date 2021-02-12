//********************************************************************
//
//  Developer:            Lillian Martinez
//
//  Program #:            10
//
//  File Name:            SimpleArrayTest.java
//
//  Course:               ITSE 2317 Intermediate Programming (Java)
//
//  Instructor:           Fred Kumi 
//
//  Description:          Executing two Runnables to add elements to a 
//                        shared SimpleArray.
//********************************************************************;

import java.security.SecureRandom;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class SharedArrayTest {
    public static void main(String[] arg) {
        developerInfo();
        arrayOne();
	arrayTwo();	
    }
//array one synchronized multithreading of an integer array, get the time it takes to run and the sum		
    public static void arrayOne() {
        //start timer
	Instant start = Instant.now();

	//construct the shared object 
	SimpleArray sharedSimpleArray = new SimpleArray(15000000);
				
	//create four tasks to write to the shared simple 
	ArrayWriter writer1 = new ArrayWriter(0, sharedSimpleArray);
	ArrayWriter writer2 = new ArrayWriter(0, sharedSimpleArray);
	ArrayWriter writer3 = new ArrayWriter(0, sharedSimpleArray);
	ArrayWriter writer4 = new ArrayWriter(0, sharedSimpleArray);
				
	//Execute the tasks with an ExecutorService
	ExecutorService executorService = Executors.newCachedThreadPool();
	executorService.execute(writer1);
	executorService.execute(writer2);
	executorService.execute(writer3);
	executorService.execute(writer4);
        executorService.shutdown();
	
        System.out.println("Tasks running, please wait...");
				
	try {
            //wait 1 minute for both writers to finish executing
            boolean tasksEnded = executorService.awaitTermination(1, TimeUnit.MINUTES);
            if(tasksEnded) {
                System.out.printf("%nTasks Completed%n%n");
                System.out.printf("Array #1 is sychronized multithreading implementation of an integer array.%n"); 
            }
            else {
                System.out.println("Timed out while waiting for tasks to finish.");
            }
        }
	catch(InterruptedException ex) {
            ex.printStackTrace();
	}
        
	sharedSimpleArray.getTotal();
        //end timer
	Instant stop = Instant.now();
        
        //get and print the timer using the Duration class and between method 				
	long timer1 = Duration.between(start, stop).toMillis();
	System.out.printf("Array #1 took " + timer1 + " milliseconds to run.%n%n");
}
			
//array two to generate a simple integer array, get the time it takes to run and the sum
public static void arrayTwo() {
    Instant start = Instant.now();  
    int [] array2 = new int[15000000]; 
    SecureRandom generator = new SecureRandom();
				
    //for loop to iterate through the array and assign random numbers to it.  
    int counter = 0; 
    int number; 
    for(int i = 0 ; i < array2.length; i++) {
	number =1 + generator.nextInt(20);
	array2[i] = number;
	counter += number; 
    }
    System.out.printf("Array #2 is a simple single thread integer array.%n");
    System.out.println("Sum of Array #2: " + counter);
    //stop timer
    Instant stop = Instant.now();
			   
    long timer2 = Duration.between(start, stop).toMillis();
    System.out.printf("Array #2 took " + timer2 + " milliseconds to run.%n%n");
}

    private static void developerInfo() {
        System.out.println ("Name:    Lillian Martinez");
        System.out.println ("Course:  ITSE 2317 Intermediate Java Programming");
        System.out.println ("Program: Ten \n");
    }
}