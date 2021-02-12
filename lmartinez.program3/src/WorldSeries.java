//******************************************************************************
//
//  Developer:            <Developer>
//
//  Program #:            Program 3 
//
//  File Name:            ShapeTest.java
//
//  Course:               ITSE 2317 Intermediate Java Programming
//
//  Due Date:             2-25-2020
//
//  Instructor:           Fred Kumi 
//
//  Chapter:              16
//
//  Description:		Generic Collections:  This program reads a file 
// 						once and creates a HashMap in which the keys are the 
//						years and each key’s associated value is the name of the 
//						team that won that year. This program also creates a 
//						HashMap in which the keys are the names of the teams and 
//						each key’s associated value is the number of times the team 
//						has won the World Series.
//******************************************************************************

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;


public class WorldSeries {
	
	private HashMap<Integer,String> wininingYearTeamsMap;
	private HashMap<String,Integer> movieWininingCountMap;
	
	public WorldSeries() {
		
		wininingYearTeamsMap = new LinkedHashMap<Integer,String>();
		movieWininingCountMap = new LinkedHashMap<String,Integer>();
}
	
	public static void main(String[] args) {
		
		WorldSeries worldSeries = new WorldSeries();
		worldSeries.readInputFile("Program3.txt");
		worldSeries.readUserInput();
		
	}
	
	private void readUserInput () {
		
		Scanner userInput = new Scanner(System.in);
		int year;
		
		do {
			System.out.print("Enter a year between 1903 and 2019: ");
			
			year = userInput.nextInt();
			
			String teamName = getTeamNameBasedOnYear(year);
			
			if (teamName != null && !teamName.equalsIgnoreCase("")) {
				int winningCount = getWinningCount(teamName);
				
				System.out.println(teamName+ " won the World Series in: "+year);
				System.out.println("Total number of times "+teamName+" won the World Series is: "+winningCount);
				
			} else {
				System.out.println("No team won the World Series in: "+year);
			}
		} while (year < 1903 || year > 2019 || year > 0);
		userInput.close();
	}
	
	private void readInputFile(String inputFileName) {
		Scanner sacnnerReader = null;
		
		try {
			File file = new File(inputFileName);
			
			if (file.exists()) {
				int year = 1903;
				
				sacnnerReader = new Scanner(file);
				
				while (sacnnerReader.hasNextLine()) {
					String teamName = sacnnerReader.nextLine();
					
					if (year == 1904 || year == 1994 ) {
						year++;
					}
					
					wininingYearTeamsMap.put(year, teamName);
					
					if (movieWininingCountMap.get(teamName) != null) {
						movieWininingCountMap.put(teamName, movieWininingCountMap.get(teamName)+1);
			
					} else {
						movieWininingCountMap.put(teamName,1);	
					}
					year++;	
				}
			} else {
				System.out.println("Input File not found");	
			}	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (Exception e) {
			e.printStackTrace();	
			
		} finally {
			if (sacnnerReader != null) {
				try {
					sacnnerReader.close();
					
				} catch (Exception e) {	
					e.printStackTrace();	
				}	
			}	
		}
	}
	
	private String getTeamNameBasedOnYear(int year) {
		if (wininingYearTeamsMap.get(year) != null) {
			return wininingYearTeamsMap.get(year);
			
		} else {
			return null;	
		}
	}
	
	private int getWinningCount(String teamName) {
		if (movieWininingCountMap.get(teamName) != null) {
			return movieWininingCountMap.get(teamName);
			
		} else {
			return 0;	
		}	
	}
}