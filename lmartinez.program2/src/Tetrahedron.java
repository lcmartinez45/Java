//******************************************************************************
//
//  Developer:            <Developer>
//
//  Program #:            Program 2 
//
//  File Name:            Tetrahedron.java
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
// 						  the area and volume of a tetrahedron and extends ThreeDimensionalShape
//						  class.
//******************************************************************************

public class Tetrahedron extends ThreeDimensionalShape {
	
	private double edge;
	
	public Tetrahedron(double edge) {
		
		this.edge = edge;
		
	}
	
	@Override
	
	public double getArea() {
		
		//Surface area of tetrahedron= sq root of 3 * edge^2
		
		return Math.sqrt(3) * edge * edge;
		
	}
	
	@Override
	
	public double getVolume() {
		
		//Volume of tetrahedron= edge^3 / 6 * sq root of 2
		
		return Math.pow(edge, 3) / (6.0 * (Math.sqrt(2)));
		
	}
	
	@Override
	
	public String toString() {
		
		return "Shape: Tetrahedron";
		
	}

}