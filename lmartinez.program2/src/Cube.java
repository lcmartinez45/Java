//******************************************************************************
//
//  Developer:            <Developer>
//
//  Program #:            Program 2 
//
//  File Name:            Cube.java
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
// 						  the area and volume of a cube and extends 
// 						  ThreeDimensionalShape class.
//						 
//******************************************************************************

public class Cube extends ThreeDimensionalShape {

	private double side;

	public Cube(double side) {

		this.side=side;

	}

	@Override

	public double getArea() {

		//Surface area of cube= 6*side*side

		return 6*side*side;

	}
	
	// Getters and setters

	@Override

	public double getVolume() {

		//Volume of cube= side*side*side

		return side*side*side;

	}
	
	public void setSide(double side) {

		this.side = side;

	}
	
	public double getSide() {

		return side;

	}
	
	@Override

	public String toString() {

		return "Shape: Cube";

	}

}