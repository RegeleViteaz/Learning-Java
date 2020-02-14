import java.util.Scanner;

/**
 * Date: 01/07/2020
 * Starting out with Java Programming Challenge Chapter 15 Problem 10: Recursive Population Class
 * Program that will predict the size of a population of organisms using recursion
 */
public class Problem10
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the starting number of organisms: ");
        int startPop = keyboard.nextInt();

        while(!(startPop >= 2))
        {
            System.out.println("Invalid population number.\nEnter the starting number of organisms: ");
            startPop = keyboard.nextInt();
        }
        keyboard.nextLine();
        System.out.println("Enter the average daily increase in percentage (e.g 25): ");
        double percentInc = keyboard.nextDouble();
        percentInc /= 100;

        if(percentInc < 1)
        {
            percentInc += 1;
        }

        while(!(percentInc >= 0))
        {
            System.out.println("Invalid percentage number.\nEnter the average daily increase in percentage (e.g 25): ");
            percentInc = keyboard.nextDouble();
        }

        System.out.println("Enter the number of days they will multiply: ");
        int days = keyboard.nextInt();

        while(!(days >= 1))
        {
            System.out.println("Invalid number.\nEnter the number of days they will multiply: ");
            days = keyboard.nextInt();
        }
        System.out.println("Day \t Population");
        System.out.println("-----------------------");


        recursivePopulation(startPop, percentInc, days, 1);
        System.out.println("\nNow with Recursion\n");
        for(int i = 1; i < days; i++)
        {
            System.out.println(i + "\t\t" + startPop);
            startPop *= percentInc;
        }
        System.out.println(days + "\t\t" + startPop + "\n"); //Printing the last day since it won't be displayed in the for loop
    }

    public static void recursivePopulation(int startPop, double percentInc, int days, int index)
    {
        if(index >= days)
            System.out.println(days + "\t\t" + startPop);
        else
        {
            System.out.println(index + "\t\t" + startPop);
            startPop *= percentInc;
            recursivePopulation(startPop, percentInc, days, index + 1);
        }
    }
}