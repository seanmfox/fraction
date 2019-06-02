/*
Name: Sean Fox
Date: 6-2-19
Class: CIT-130
Purpose: Assignment 5, Part 1 - Refactor Faction class with DenominatorIsZeroException
*/

public class DenominatorIsZeroException extends Exception{

    public DenominatorIsZeroException() {
        super("Denominator cannot be zero.");
    }

    public DenominatorIsZeroException(String message) {
        super(message);
    }
}
