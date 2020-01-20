import java.util.Scanner;

/**
 * Date: 01/19/2020
 * Starting out with Java Programming Challenge Chapter 5 Problem 9: Distance Traveled Modification
 * A method that calculates the distance a vehicle has travelled.
 */

public class Problem9
{
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the speed of the vehicle in MPH: ");
        double speedVic = keyboardInput.nextDouble();

        // Input Validation
        while(!(speedVic >= 0))
        {
            System.out.println("The speed entered is invalid.");
            System.out.print("Enter the speed of the vehicle in MPH: ");
            speedVic = keyboardInput.nextDouble();
        }

        System.out.print("Enter the hours traveled by the vehicle: ");
        double hoursTraveled = keyboardInput.nextDouble();

        // Input Validation
        while(!(hoursTraveled >= 0))
        {
            System.out.println("The speed entered is invalid.");
            System.out.print("Enter the speed of the vehicle in MPH: ");
            hoursTraveled = keyboardInput.nextDouble();
        }

        System.out.println("Hour\tDistance Traveled");
        System.out.println("-------------------------");

        for(int i = 1; i <= hoursTraveled; i++)
        {
            System.out.printf(i + "\t\t%8.1f\n", distance(speedVic, i));
        }
    }
    public static double distance(double speed, double time)
    {
        return speed * time;
    }
}
