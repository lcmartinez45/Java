//********************************************************************
//
//  Developer:            Lillian Martinez
//
//  Program #:            8
//
//  File Name:            RecursiveLinearSearch.java
//
//  Course:               ITSE 2317 Intermediate Programming (Java)
//
//  Instructor:           Fred Kumi 
//
//  Description:          
//
//********************************************************************;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class RecursiveLinearSearch {
	
    public static int recursiveLinearSearch(int[] data, int searchKey, int startIndex) {
	//base case
        if(startIndex == data.length-1){
            return  -1;
        }
        //if key found
        if(data[startIndex] == searchKey) {
            return startIndex;
        }
        else{
            return recursiveLinearSearch(data, searchKey, ++startIndex);
        }	
    }
    public static void main(String[] args) {
        developerInfo();
		
	Scanner input = new Scanner(System.in);
	SecureRandom num = new SecureRandom();
            int[] data = new int[50];
	
            for(int i = 0; i < data.length; i++) {
		data[i] = 10 + num.nextInt(91);
            }
          
        System.out.println(Arrays.toString(data));	
		
	//get user input 
	System.out.println("\nEnter an integer value (-1 to quite):  ");
	int searchKey = input.nextInt(); 
		
	while(searchKey != -1) {
            int index = 0;
            int position = recursiveLinearSearch(data, searchKey, index);
	
            if(position == -1) {
                System.out.printf("%d was not found.%n%n", searchKey);
		}
            else {
                System.out.printf("%d was found in position: %d%n%n", searchKey, position);
            }
            System.out.println("Enter an integer value (-1 to quite):  ");
            searchKey = input.nextInt();		
	}	
    }
        
    public static void developerInfo()
    {
        System.out.println ("Name:    Lillian Martinez");
        System.out.println ("Course:  ITSE 2317 Intermediate Java Programming");
        System.out.println ("Program: Eight \n");

    }
}
