import java.util.Scanner;

public class TestFraction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerator for the target fraction: ");
        int primaryNumerator = scanner.nextInt();

        System.out.print("Enter the denominator for the target fraction: ");
        int primaryDenominator = scanner.nextInt();

        Fraction primaryFraction = new Fraction(primaryNumerator, primaryDenominator);

        System.out.println();

        String repeatRequest;

        do {
            System.out.print("Enter the numerator for the next fraction to test: ");
            int nextNumerator = scanner.nextInt();

            System.out.print("Enter the denominator for the next fraction to test: ");
            int nextDenominator = scanner.nextInt();

            Fraction nextFraction = new Fraction(nextNumerator, nextDenominator);

            if(primaryFraction.equals(nextFraction)) {
                System.out.println("The fraction you just entered equals the first fraction of " + primaryFraction + ".");
            } else {
                System.out.println("The fraction you just entered does not equal the first fraction of " + primaryFraction + ".");

            }

            System.out.println();

            System.out.print("Would you like to continue (Y/N)?");
            repeatRequest = scanner.next();

            System.out.println();
        } while(repeatRequest.equalsIgnoreCase("y"));
    }
}
