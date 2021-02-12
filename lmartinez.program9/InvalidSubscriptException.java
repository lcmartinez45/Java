//********************************************************************
//
//  Developer:            Lillian Martinez
//
//  Program #:            Nine
//
//  File Name:            InvalidSubscriptException.java
//
//  Course:               ITSE 2317 Intermediate Java Programming             
//
//  Instructor:           Fred Kumi 
//
//  Chapter:              20
//
//  Description:          Throws an exception for GenericMethodTest class.
//
//********************************************************************

public class InvalidSubscriptException extends Exception {

        InvalidSubscriptException() {
            System.out.println("Subscripts entered are invalid or out of range. "
                    + "Below is a stack trace list.");
        }
    }
