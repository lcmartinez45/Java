//******************************************************************************
//
//  Developer:            <Developer>
//
//  Program #:            Program 2 
//
//  File Name:            Sphere.java
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
// 						  the area and volume of a sphere and extends ThreeDimensionalShape class.
//						 
//******************************************************************************

public class Sphere extends ThreeDimensionalShape {
	
	private double radius;
	
	public Sphere(double radius) {
		
		this.radius = radius;
		
	}
	
	@Override
	
	public double getVolume() {
		
		//Volume= 4/3 * PI * r^3
		
		return (4.0 / 3.0) * Math.PI * (radius * radius * radius);
		
	}
	
	// Getters and setters
	
	@Override
	
	public double getArea() {
		
		//Surface area=4 * PI * r^2
		
		return 4*Math.PI*radius*radius;
		
	}
	
	//Getter and setter to set radius
	
	public double getRadius() {
		
		return radius;
		
	}
	
	public void setRadius(double radius) {

		this.radius = radius;

	}

	@Override

	public String toString() {

		return "Shape: Sphere";

	}

}