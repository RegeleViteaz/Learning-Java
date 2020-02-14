import java.util.Scanner;

/**
 * Date: 02/13/2020
 * Starting out with Java Programming Challenge Chapter 15 Problem 7: Recursive Power Method
 * Method that uses recursion to raise a number to a power.
 * The method should accept two arguments: the number to be raised and the exponent.
 * Assume that the exponent is a nonnegative integer.
 */

public class Problem7
{
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the number to be raised: ");
        int number = keyboardInput.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = keyboardInput.nextInt();

        int result = recursivePower(number, exponent);
        System.out.print(number + "^" + exponent + " = " + result);
    }

    public static int recursivePower(int number, int exponent)
    {
        if(exponent == 1)
            return number;
        else
            return number * recursivePower(number, exponent - 1);
    }

}
