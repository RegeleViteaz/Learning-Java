import java.util.Scanner;

/**
 * Date: 01/06/2020
 * Starting out with Java Programming Challenge Chapter 4 Problem 2: Distance Traveled
 * Program that asks for the speed of a vehicle(mph) and the numbers of hours it has traveled and displays its distance
 */

public class Problem2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the speed of the vehicle in MPH");
        double speedVic = keyboard.nextDouble();

        // Input Validation
        while(!(speedVic >= 0))
        {
            System.out.println("The speed entered is invalid.");
            System.out.println("Enter the speed of the vehicle in MPH");
            speedVic = keyboard.nextDouble();
        }

        System.out.println("Enter the hours traveled by the vehicle");
        double hoursTraveled = keyboard.nextDouble();

        // Input Validation
        while(!(hoursTraveled >= 0))
        {
            System.out.println("The speed entered is invalid.");
            System.out.println("Enter the speed of the vehicle in MPH");
            hoursTraveled = keyboard.nextDouble();
        }

        System.out.println("Hour\tDistance Traveled");
        System.out.println("-------------------------");

        for(int i = 1; i <= hoursTraveled; i++)
        {
            double distanceTraveled = speedVic * i;
            System.out.print(i + "\t\t\t");
            System.out.printf("%.1f\n", distanceTraveled);
        }
    }
}
