//******************************************************************************
//
//  Developer:            <Developer>
//
//  Program #:            Program 4 
//
//  File Name:            CountCharacterOccurences.java
//
//  Course:               ITSE 2317 Intermediate Java Programming
//
//  Due Date:             3-7-2020
//
//  Instructor:           Fred Kumi 
//
//  Chapter:              16
//
//  Description:		Generic Collections:  This program counts the number 
// 						of occurrences of each letter in a sentence treating 
//						upper case and lower case the same ignoring spaces 
//						and punctuation. 
//******************************************************************************
import java.util.Scanner;

public class CountCharacterOccurrences {
	  public static void main(String[] args) {
	    	CountCharacterOccurrences countCharacterOccurrences = new CountCharacterOccurrences();
	    	countCharacterOccurrences.countCharacter();
	    }
	  
	// Method to loop through the string and count characters
	public void countCharacter(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s = scan.nextLine().toLowerCase(); 
		int counts[] = new int[26];
		char ch;

		for(int i = 0;i<counts.length;i++){
			counts[i] = 0;
		}
		
		for(int i = 0;i<s.length();i++){
			ch = s.charAt(i);
				if(ch>='a' && ch<'z'){ 
					counts[ch-'a']+=1;
        	}
		}
		
		for(int i = 0;i<counts.length;i++){
			if(counts[i]>0) {
				ch = (char) ('a'+i);
				System.out.println(ch+" "+counts[i]);
        	}
		}
	}
}