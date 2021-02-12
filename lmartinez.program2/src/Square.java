//******************************************************************************
//
//  Developer:            <Developer>
//
//  Program #:            Program 2 
//
//  File Name:            Square.java
//
//  Course:               ITSE 2317 Intermediate Java Programming
//
//  Due Date:             <2-14-20>
//
//  Instructor:           Lillian Martinez 
//
//  Chapter:              10
//
//  Description:		  Polymorphism & Interfaces:  This class is calculating
// 						  the area of a square and extends TwoDimensionalShape class.
//						 
//******************************************************************************

public class Square extends TwoDimensionalShape {
	
	private double side;
	
	// @param side - side length of square
	
	public Square(double side) {
		
		this.side = side;
		
	}
	
	@Override
	
	public double getArea() {
		
		// Area of square=side*side
		
		return side * side;
		
	}
	
	@Override
	
	public String toString() {
		
		return "Shape: Square";
		
	}
	
	//Getters and setters
	
	public double getSide() {
		
		return side;
		
	}
	
	public void setSide(double side) {
		
		this.side = side;
		
	}

}