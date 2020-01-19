
/**
 * Date: 01/19/2020
 * Starting out with Java Programming Challenge Chapter 5 Problem 5: Falling Distance
 * Method that calculates the distance an object has fallen during a specified time
 */

public class Problem5
{
    public static void main(String[] args)
    {
        displayHeader();
        for(int i = 1; i < 11; i++)
        {
            System.out.printf("Second " + i + " %8.2f meters\n ",fallingDistance(i));
        }
    }

    public static double fallingDistance(double fallingTime)
    {
        return ((1.0/2.0) * 9.8 * Math.pow(fallingTime, 2));
    }

    public static void displayHeader()
    {
        System.out.println("Seconds \t\t Meters \n------- \t\t--------");
    }
}
