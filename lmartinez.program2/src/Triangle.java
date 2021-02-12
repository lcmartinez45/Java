//******************************************************************************
//
//  Developer:            <Developer>
//
//  Program #:            Program 2 
//
//  File Name:            Triangle.java
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
// 						  the area of a triangle and extends TwoDimensionalShape class.
//
//******************************************************************************

public class Triangle extends TwoDimensionalShape {
	
	private double base;
	
    private double height;
    
    public Triangle(double base, double height) {
    	
    	this.base = base;
    	
    	this.height = height;
    	
    }
    
    @Override
    
    public double getArea() {
    	
    	//Area of triangle= ( square root (3) / 4 ) * side^2
    	
    	return (base * height) / 2;
    	
    }
    
    // Getters and setters
    
    public double getBase() {
    	
    	return base;
    	
    }
    
    public void setBase(double base) {
    	
    	this.base = base;
    	
    }
    
    public double getHeight() {
    	
    	return height;
    	
    }
    
    public void setHeight(double height) {
    	
    	this.height = height;
    	
    }
    
    @Override
    
    public String toString() {
    	
    	return "Shape: Triangle";
    	
    }

}