/*
Name: Sean Fox
Date: 6-2-19
Class: CIT-130
Purpose: Assignment 5, Part 1 - Create DenominatorIsZeroException class
*/

public class Fraction {

    private int num;
    private int den;

    public Fraction() throws DenominatorIsZeroException{
        setNum(1);
        setDenom(2);
    }

    public Fraction(int a, int b) throws DenominatorIsZeroException {
        setNum(a);
        setDenom(b);
    }

    private void setNum(int newNum) {
        num = newNum;
    }

    private void setDenom(int newDen) throws DenominatorIsZeroException {
        if (newDen == 0)
            throw new DenominatorIsZeroException();
        den = newDen;
    }

    private int getNum() {
        return num;
    }

    private int getDenom() {
        return den;
    }

    public String toString() {
        return getNum() + "/" + getDenom();
    }

    public boolean equals(Fraction f) {
        return getNum() * f.getDenom() == f.getNum() * getDenom();
    }
}
