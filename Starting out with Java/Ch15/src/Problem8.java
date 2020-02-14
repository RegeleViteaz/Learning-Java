/**
 * Date: 02/13/2020
 * Starting out with Java Programming Challenge Chapter 15 Problem 8: Sum of Numbers
 * Method that accepts an integer argument and returns the sum of all the integers from 1 up to the number
 * passed as an argument.
 * E.g: 5 -> 1 + 2 + 3 + 4 + 5
 */

public class Problem8
{
    public static void main(String[] args)
    {
        int number = 8;
        int total = recursiveSum(number);
        System.out.print("The factorial sum of " + number + " is " + total);
    }

    public static int recursiveSum(int number)
    {
        if (number == 1)
            return number;
        else
            return number + recursiveSum(number - 1);
    }
}
