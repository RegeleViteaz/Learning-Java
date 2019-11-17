import java.util.Scanner;
/**
 * Date: 17/11/2019
 * Starting out with Java Programming Challenge Chapter 3 Problem 6
 * User enters an amount of seconds and displays its equivalent in minutes, hours and days
 */
public class problem6
{
    public static void main(String[] args)
    {
        final double SECONDS_IN_MINUTE = 60;
        final double SECONDS_IN_HOUR   = 3600;
        final double SECONDS_IN_DAY    = 86400;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number of seconds");
        int secondsInput = keyboard.nextInt();
        double minutes;
        double hours;
        double days;
        if(secondsInput >= SECONDS_IN_MINUTE)
        {
            minutes = secondsInput/SECONDS_IN_MINUTE;
            System.out.printf("There are %.2f minutes in that many seconds.\n", minutes);
            if(secondsInput >= SECONDS_IN_HOUR)
            {
                hours = secondsInput/SECONDS_IN_HOUR;
                System.out.printf("There are %.2f hours in that many seconds.\n", hours);
                if(secondsInput >= SECONDS_IN_DAY)
                {
                    days = secondsInput/SECONDS_IN_DAY;
                    System.out.printf("There are %.2f days in that many seconds.\n", days);
                }
            }
        }

    }
}
