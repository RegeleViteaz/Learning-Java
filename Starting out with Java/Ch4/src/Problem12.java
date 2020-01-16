import java.util.Scanner;
/**
 * Date: 01/15/2020
 * Starting out with Java Programming Challenge Chapter 4 Problem 12: Bar Chart
 * Program that asks the user to enter today's sales for five stores and display a bar chart comparing each store's sales
 */

public class Problem12
{
    public static void main(String[] args)
    {
        double[] sales =  new double[5];
        Scanner keyboard = new Scanner(System.in);

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter today's sales for store: " + (i + 1));
            sales[i] = keyboard.nextDouble();
        }
        System.out.println("SALES BAR CHART");

        for(int i = 0; i < 5; i++)
        {
            System.out.print("Store " + (i + 1) + ": ");

            for(int j = 0; j < sales[i]/100; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        keyboard.close();
    }
}
