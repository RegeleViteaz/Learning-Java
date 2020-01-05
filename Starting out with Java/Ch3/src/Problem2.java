import java.util.Scanner;
/**
 * Date: 17/11/2019
 * Starting out with Java Programming Challenge Chapter 3 Problem 2
 * User enters a day, a month and a year in numeric form. It then determines if these values are magic.
 */
public class Problem2
{
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a month in numeric form (1 to 12)");
        int monthInput = keyboard.nextInt();
        while(monthInput < 1 || monthInput > 12)
        {
            System.out.println("Invalid month entered.");
            System.out.println("Enter a month in numeric form (1 to 12)");
            monthInput = keyboard.nextInt();
        }

        System.out.println("Enter a day in numeric form");
        int dayInput = keyboard.nextInt();
        while(dayInput < 1 || dayInput > 32)
        {
            System.out.println("Invalid day entered.");
            System.out.println("Enter a day in numeric form");
            dayInput = keyboard.nextInt();
        }

        System.out.println("Enter a two digit year");
        int inputYear = keyboard.nextInt();
        while(inputYear < 1 || inputYear > 99)
        {
            System.out.println("Invalid year entered.");
            System.out.println("Enter a two digit year");
            inputYear = keyboard.nextInt();
        }

        int dayMonth = dayInput * monthInput;
        if(dayMonth != inputYear)
        {
            System.out.println("The date is not magic");
        }
        else
        {
            System.out.println("The date is magic");
        }
    }
}

