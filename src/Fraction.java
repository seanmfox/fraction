/*
Name: Sean Fox
Date: 5-19-19
Class: CIT-130
Purpose: Assignment 2, Part 2 - Write a Counter class
*/

public class Fraction {

    private int num;
    private int den;

    public Fraction() {
        setNum(1);
        setDenom(2);
    }

    public Fraction(int a, int b) {
        setNum(a);
        setDenom(b);
    }

    private void setNum(int newNum) {
        num = newNum;
    }

    private void setDenom(int newDen) {
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
        return getNum()*f.getDenom() == f.getNum()*getDenom();
    }
}
