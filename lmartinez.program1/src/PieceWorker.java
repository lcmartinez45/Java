//********************************************************************
//
//  Developer:            Lillian Martinez
//
//  Program #:            One
//
//  File Name:            PieceWorker.java
//
//  Course:               ITSE 2317 Intermediate Java Programming
//
//  Due Date:             2/10/2019
//
//  Instructor:           Fred Kumi 
//
//  Chapter:              10
//
//  Description:
//     Piece Worker class.  This class represents an employee whose 
// 	   pay is based on the number of pieces of merchandise produced. 
//	   It calculates the employees earnings by multiplying the 
//	   number of pieces produced by the wage per piece.
//
//********************************************************************


public class PieceWorker extends Employee {

private double wage; // wage per piece
private double pieces; // number of pieces produced

// Five-argument Constructor
public PieceWorker(String firstName, String lastName, 
	      String socialSecurityNumber, double wage, double pieces) {
	super(firstName, lastName, socialSecurityNumber);
	
	if (wage <= 0.0) // validate 
        throw new IllegalArgumentException(
           "Wage rate must be > 0.0");

     if (pieces < 0.0) // validate
        throw new IllegalArgumentException("Pieces must be >= 0.0");

     this.wage = wage;
     this.pieces = pieces;
  } 

// set wage
public void setWage(double wage) {
	if (wage <= 0.0) // validate 
        throw new IllegalArgumentException(
           "Wage rate must be > 0.0");
	this.wage = wage;
}

// return wage
public double getWage() {
	return wage;
}

// set Pieces
public void setPieces(double pieces) {
	if (pieces < 0.0) // validate
        throw new IllegalArgumentException("Pieces must be >= 0.0");
	this.pieces = pieces;
}

// return pieces
public double getPieces() {
	return pieces;
}

// calculate earnings; override abstract method earnings in Employee
@Override
public double earnings() {
	return getWage() * getPieces();
}

// return String representation of PieceWorker object
@Override
public String toString()                                    
{							
	return String.format("%s: %s%n%s: $%,.2f; %s: %,.2f", "piece-worker", super.toString(), "giving wage/piece", getWage(),
"total pieces outputted", getPieces());
}

}

