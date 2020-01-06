import java.util.Scanner;

/**
 * Date: 01/06/2020
 * Starting out with Java Programming Challenge Chapter 4 Problem 1: Sum of Numbers
 * Program that asks the user for a positive nonzero integer value and find its factorial.
 */

public class Problem1
{
    public static void main(String[] args)
    {
         int totalSum = 0;

        Scanner keyboard = new Scanner(System.in);
        String msg = "Enter a positive nonzero integer value ";
        System.out.print(msg);
        int inputValue = keyboard.nextInt();

        while(inputValue < 0)
        {
            System.out.println("You did not enter a positive nonzero integer value");
            System.out.println(msg);
            inputValue = keyboard.nextInt();
        }

        for(int i=1; i <= inputValue; i++)
        {
            if(i != inputValue)
                System.out.print(i + " + ");
            else
                System.out.print(i);
            totalSum += i;
        }
        System.out.print(" = " + totalSum);
    }
}
