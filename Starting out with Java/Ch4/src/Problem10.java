import java.util.Scanner;

/**
 * Date: 01/07/2020
 * Starting out with Java Programming Challenge Chapter 4 Problem 10: Largest and Smallest
 * Program where the user enters a series of integers and displays the largest and smallest numbers entered
 */
public class Problem10
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        final int SENTINEL_VALUE = -99;
        int userInt;
        int smallest;
        int largest;

        System.out.print("Enter a series of integers or -99 to exit ");
        userInt = keyboard.nextInt();
        smallest = userInt;
        largest = userInt;

        while(userInt != SENTINEL_VALUE)
        {
            if(userInt < smallest)
                smallest = userInt;
            if(userInt > largest)
                largest = userInt;
            System.out.print("Enter a series of integers or -99 to exit ");
            userInt = keyboard.nextInt();
        }
        System.out.println("Smallest userInt: " + smallest +
                           "\nLargest userInt: " + largest);

        //Problem can be done with do while and while do
        /*
        do
        {
            if(userInt < smallest)
                smallest = userInt;
            if(userInt > largest)
                largest = userInt;
            System.out.println("Enter a series of integers or -99 to exit");
            userInt = keyboard.nextInt();

        }while(userInt != SENTINEL_VALUE);
        */
    }
}
