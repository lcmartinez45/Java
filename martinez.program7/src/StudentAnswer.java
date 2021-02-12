/* 
Name: Lillian Martinez
Course: ITSE 2321 Object-Oriented Programming Java
Program: Seven
File Name: StudentAnswer.java
Due Date: 10-27-2019
Instructor: Fred Kumi
Chapter: Chapter 7
Description: This program will use SecureRandom to produce two positive one-digit
integers and will prompt the student with a question. It will then check the 
students answer, if the answer is wrong it will prompt the student to try again.
 */

import java.security.SecureRandom;
import java.util.*;

public class StudentAnswer {
    
    public static void main (String[] args){
        int ans = 0;
        StudentAnswer myObject = new StudentAnswer();
        myObject.getQuestion();
        myObject.getAnswer(ans);
        myObject.Run();
   }
    // This function will ask the user a question and return answer to verify 
    public int getQuestion() { 
    SecureRandom rand = new SecureRandom();
  
    // Generate random integers in range 1 to 9
    int rand_int1 = rand.nextInt(9) + 1;
    int rand_int2 = rand.nextInt(9) + 1;
       
       System.out.print("How much is " + rand_int1 + " times " + rand_int2 + "? ");
      
       return rand_int1 * rand_int2;
   }
   // This function takes the answer from the getQuestion function and compares 
   //it with the users answer
   public boolean getAnswer(int ans) { 
       SecureRandom rand = new SecureRandom();
       Scanner in = new Scanner(System.in);
      
       String[] correct = {"Excellent!", "Very good!", "Nice work!", "Way to go!", "Keep up the good work!"};
       String[] incorrect = {"That is incorrect!", "No. Please try again!", "Wrong, Try once more!", "No. Don’t give up!", "No. Keep trying!"};
       
       // Generate random numbers for response
       int rand_int = rand.nextInt(5); 
       int answer = in.nextInt();
      
       if (ans == answer){
           // print random response
           System.out.println(correct[rand_int]); 
           
           // Return true if answer is correct
           return true; 
       }
       else{
           // Print random responce
           System.out.println(incorrect[rand_int]); 
           
           // Return false if answer is incorrect
           return false; 
       }
   }
  
   @SuppressWarnings("empty-statement")
   //This method will count answers answered by the user, once a limit is reached
   //it will ask the user if they want to continue 
   public void Run () {
       Scanner in = new Scanner(System.in);
       char c;
       // counter which counts number of correct answers
       int count = 1; 
      
       while(true)
       {
           if (count > 5) {
               // If count > 5 then give option to exit
               System.out.print("Want to exit (Y/N) : "); 
               c = in.next().charAt(0);
               if ( c == 'y' || c == 'Y')
                   break;
           }
           // Generate question
           int ans = getQuestion(); 
           
           // Stay in the loop until the answer is correct
           while(!getAnswer(ans)); 
           
           // Increment counter
           count++; 
       } 
   } 
}
