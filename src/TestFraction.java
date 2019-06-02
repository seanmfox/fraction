/*
Name: Sean Fox
Date: 5-26-19
Class: CIT-130
Purpose: Assignment 5, Part 1 - Test Fraction class for DenominatorIsZeroException
*/

import java.util.Scanner;

public class TestFraction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean validInputs = false;

        Fraction primaryFraction = null;

        while (!validInputs) {
            try {
                System.out.print("Enter the numerator for the target fraction: ");
                int primaryNumerator = scanner.nextInt();

                System.out.print("Enter the denominator for the target fraction: ");
                int primaryDenominator = scanner.nextInt();

                primaryFraction = new Fraction(primaryNumerator, primaryDenominator);

                validInputs = true;
            } catch (DenominatorIsZeroException e) {
                System.out.println(e.getMessage());
            }

        }


        System.out.println();

        String repeatRequest;
        validInputs = false;
        Fraction nextFraction = null;

        do {
            while (!validInputs) {
                try {
                    System.out.print("Enter the numerator for the next fraction to test: ");
                    int nextNumerator = scanner.nextInt();

                    System.out.print("Enter the denominator for the next fraction to test: ");
                    int nextDenominator = scanner.nextInt();

                    nextFraction = new Fraction(nextNumerator, nextDenominator);

                    validInputs = true;
                } catch (DenominatorIsZeroException e) {
                    System.out.println(e.getMessage());
                }

            }

            if (primaryFraction.equals(nextFraction)) {
                System.out.println("The fraction you just entered equals the first fraction of " + primaryFraction + ".");
            } else {
                System.out.println("The fraction you just entered does not equal the first fraction of " + primaryFraction + ".");

            }

            System.out.println();

            System.out.print("Would you like to continue (Y/N)?");
            repeatRequest = scanner.next();
            if (repeatRequest.equalsIgnoreCase("y"))
                validInputs = false;

            System.out.println();

        } while (repeatRequest.equalsIgnoreCase("y"));
    }
}
