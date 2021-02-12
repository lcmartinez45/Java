//******************************************************************************
//
//  Developer:            <Developer>
//
//  Program #:            Program 2 
//
//  File Name:            ThreeDimensionalShape.java
//
//  Course:               ITSE 2317 Intermediate Java Programming
//
//  Due Date:             <2-14-20>
//
//  Instructor:           Lillian Martinez 
//
//  Chapter:              10
//
//  Description:		  Polymorphism & Interfaces:  This class is representing
//						  a 3D shape.
//******************************************************************************

public abstract class ThreeDimensionalShape extends Shape{
	
	/** method prototype for surface area */
	
	public abstract double getArea();
	
	/** method prototype for volume */
	
	public abstract double getVolume();

}