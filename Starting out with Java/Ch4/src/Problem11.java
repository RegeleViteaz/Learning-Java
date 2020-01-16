import java.util.Scanner;

/**
 * Date: 01/07/2020
 * Starting out with Java Programming Challenge Chapter 4 Problem 11: Celsius to Fahrenheit Table
 * Program that displays a table of Celsius temperatures 0 through 20 and their Fahrenheit equivalents.
 */
public class Problem11
{
    public static void main(String[] args)
    {
        double fahrenheit;
        int celsius = 0;
        System.out.println("Celsius \t Fahrenheit");
        System.out.println("------------------------");
        for(int columns = 1; columns <= 20; columns++)
        {
            fahrenheit = ((double)9/5) * celsius + 32;
            for(int rows = 1; rows <= 2; rows++)
            {
                if(rows == 1)
                {
                    System.out.printf("|%d", celsius);
                }
                else
                {
                    System.out.printf("\t\t\t%3.2f|\n",fahrenheit);
                }
            }
            celsius++;
        }
    }
}
