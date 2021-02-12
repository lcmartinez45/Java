//********************************************************************
//
//  Developer:            Lillian Martinez
//
//  Program #:            10
//
//  File Name:            SimpleArray.java
//
//  Course:               ITSE 2317 Intermediate Programming (Java)
//
//  Instructor:           Fred Kumi 
//
//  Description:          Class that manages an integer array to be shared 
//                        by multiple threads with synchronization.
//********************************************************************;

import java.security.SecureRandom;

public class SimpleArray {
   private static final SecureRandom generator = new SecureRandom();
   private final int[] array; // the shared integer array
   private final int writeIndex = 0; // index of next element to be written
   private long totalArray;
   
   // construct a SimpleArray of a given size
   public SimpleArray(int size) {
      array = new int[size];
   } 

   // add a value to the shared array
   public synchronized void add() {
        int position = writeIndex; // store the write index
        array[position] = 1 + generator.nextInt(20);   //generate random numbers between 1 and 20 then place in array
        totalArray += array[position];  //increment and add all elements in the array
    }
	
    //method to print the total of array after tasks are done
    public void getTotal() {
	System.out.println("Sum of Array #1: " + totalArray);
    }   
}


