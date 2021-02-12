//******************************************************************************
//
//  Developer:            <Developer>
//
//  Program #:            Program 2 
//
//  File Name:            Circle.java
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
// 						  the area of a circle and extends TwoDimensionalShape class.
//						 
//******************************************************************************

public class Circle extends TwoDimensionalShape {

	private double radius;
	
	// Constructor with argument - radius of the circle

	public Circle(double radius) {

		this.radius = radius;

	}
	
	@Override
	
	public double getArea() {
		
		// Area of circle = PI*r*r
		
		return Math.PI * radius * radius;
		
	}
	
	@Override
	
	public String toString() {
		
		return "Shape: Circle";
		
	}
	
	// Getters and setters
	
	public double getRadius() {
		
		return radius;
		
	}
	
	public void setRadius(double radius) {
		
		this.radius = radius;
		
	}             

}