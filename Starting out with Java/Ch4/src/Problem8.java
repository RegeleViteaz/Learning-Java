import java.util.Scanner;

/**
 * Date: 01/07/2020
 * Starting out with Java Programming Challenge Chapter 4 Problem 8: Average Rainfall
 * Program that displays the average rainfall over a period of years
 */
public class Problem8
{
    public static void main(String[] args)
    {
        double  totalInches    = 0;
        int     totalMonths    = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of years");
        int inputYears = keyboard.nextInt();
        keyboard.nextLine();

        while(inputYears <= 0)
        {
            System.out.println("Invalid input. Enter the number of years");
            inputYears = keyboard.nextInt();
        }

        for(int year = 1; year <= inputYears; year++)
        {
            for(int month = 1; month <= 12; month++)
            {
                System.out.println("How many inches of rainfall have fallen in year " + year + " month " + month);
                double inchesAmount = keyboard.nextDouble();
                totalInches += inchesAmount;
                totalMonths++;
            }
        }
        double averageRainfall = totalInches / totalMonths;
        System.out.printf("Total number of month: %11d" +
                           "\nTotal inches of rainfall: %11.2f" +
                           "\nAverage rainfall) per month: %8.2f", totalMonths, totalInches, averageRainfall);
    }
}
