import java.util.Scanner;

/**
 * Date: 01/19/2020
 * Starting out with Java Programming Challenge Chapter 5 Problem 8: Conversion Program
 * Program that asks the user to enter a distance in meters and enabled the user to select between multiple different
 * conversion or quit the program
 */

public class Problem8
{
    public static void main(String[] args)
    {
        menu();
    }

    /**
     * Converts meters to kilometers
     * @param meters A meter amount
     */
    public static void showKilometers(double meters)
    {
        double kilometers = meters * 0.001;
        System.out.println(meters + " meters is " + kilometers + " kilometers.\n");
    }

    /**
     * Converts meters to inches
     * @param meters A meter amount
     */
    public static void showInches(double meters)
    {
        double inches = meters * 39.37;
        System.out.println(meters + " meters is " + inches + " inches.\n");
    }

    /**
     * Converts meters to feet
     * @param meters A meter amount
     */
    public static void showFeet(double meters)
    {
        double feet = meters * 3.281;
        System.out.println(meters + " meters is " + feet + " feet\n");
    }

    /**
     * Aks the user for the distance in meters
     * @return The distance in meters
     */
    public static double meters()
    {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the distance in meters: ");
        double meters = keyboardInput.nextDouble();

        while(meters < 0)
        {
            System.out.print("Invalid Input: Cannot accept negative numbers.\n" +
                               "Enter the distance in meters: ");
            meters = keyboardInput.nextDouble();
        }
        return meters;
    }

    /**
     * Display a menu of selections until the user enters the sentinel value 4 to quit the program
     * Once a selection has been made, the program will convert the distance to the specified type.
     */
    public static void menu()
    {
        Scanner keyboardInput = new Scanner(System.in);
        double meters = meters();
        System.out.println("Select from one of the following options\n" +
                           "1. Convert to kilometers\n" +
                           "2. Convert to inches\n" +
                           "3. Convert to feet\n" +
                           "4. Quit the program\n");
        System.out.print("Enter your choice: ");
        int selectedOption = keyboardInput.nextInt();

        if(selectedOption == 1)
            showKilometers(meters);
        else if(selectedOption == 2)
            showInches(meters);
        else if(selectedOption == 3)
            showFeet(meters);

        while(selectedOption != 4)
        {
            System.out.println("Select from one of the following options\n" +
                               "1. Convert to kilometers\n" +
                               "2. Convert to inches\n" +
                               "3. Convert to feet\n" +
                               "4. Quit the program\n");
            System.out.print("Enter your choice: ");
            selectedOption = keyboardInput.nextInt();
            while(selectedOption < 1 || selectedOption > 4)
            {
                System.out.println("Invalid input. Enter a number between 1 and 4");
                System.out.println("Select from one of the following options\n" +
                                   "1. Convert to kilometers\n" +
                                   "2. Convert to inches\n" +
                                   "3. Convert to feet\n" +
                                   "4. Quit the program\n");
                System.out.print("Enter your choice: ");
                selectedOption = keyboardInput.nextInt();
            }
            if(selectedOption == 1)
                showKilometers(meters);
            else if(selectedOption == 2)
                showInches(meters);
            else if(selectedOption == 3)
                showFeet(meters);
        }
        System.out.println("Bye!");
    }
}
