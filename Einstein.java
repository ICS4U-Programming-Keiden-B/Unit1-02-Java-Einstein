
import java.util.Scanner;

/**
* Calculates how much energy a piece of mass can release.
*
* @author  Keiden B
* @version 1.0
* @since   2023-02-17
*/

public final class Einstein {
    /**
    * Necessary to prevent HideUtilityClass Error.
    *
    * @exception IllegalStateException Utility class
    * @see IllegalStateException
    */
    private Einstein() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * Main lines of code.
    *
    * @param args a placeholder value when making the main function
    */
    public static void main(String[] args) {
        final double lightSpeed = 2.998;
        final Scanner get = new Scanner(System.in);

        System.out.println("Hi! This finds how much energy"
            + " a piece of mass can release.\n"
            + "What size of mass do you want to calculate?");
        final String itemMass = get.nextLine();

        try {
            final double itemMassDouble = Double.parseDouble(itemMass);

            if (itemMassDouble >= 0) {
                final double energy = itemMassDouble * Math.pow(lightSpeed, 2);

                final int energyInt = (int) energy;

                final int energyChar = String.valueOf(energyInt).length() - 1;

                final double energyNotation = energy / Math.pow(10, energyChar);

                // System.out.println(Math.pow(10, energyChar));
                // System.out.println(energy);

                System.out.printf("This mass can release %.3f * 10^%d"
                    + " J of energy.\n", energyNotation, energyChar + 10);
            } else {
                System.out.println("Please enter a valid mass!");
            }
        } catch (NumberFormatException error) {
            System.out.println("Please enter a valid mass! "
                + error.getMessage());
        }
        get.close();
    }
}
