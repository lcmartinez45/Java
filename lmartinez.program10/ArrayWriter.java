//********************************************************************
//
//  Developer:            Lillian Martinez
//
//  Program #:            10
//
//  File Name:            ArrayWriter.java
//
//  Course:               ITSE 2317 Intermediate Programming (Java)
//
//  Instructor:           Fred Kumi 
//
//  Description:          Adds integers to an array shared with other Runnables
//********************************************************************;

import java.security.SecureRandom;

public class ArrayWriter implements Runnable {
   SecureRandom generator = new SecureRandom();
   private final SimpleArray sharedSimpleArray;
   private final int startValue;

   public ArrayWriter(int value, SimpleArray array) {
      startValue = value;
      sharedSimpleArray = array;
   }

   @Override
   public void run() {
      for (int i = startValue; i < startValue + 3750000; i++) {
         sharedSimpleArray.add(); // add an element to the shared array
      } 
   }
}