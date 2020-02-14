import java.util.Scanner;

/**
 * Date: 02/13/2020
 * Starting out with Java Programming Challenge Chapter 15 Problem 1: Recursive Multiplication
 * Recursive function that accepts two arguments into parameter x and y and returns the value x times y
 */

public class Problem1
{
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Enter 2 values that will multiply themselves");
        int number1 = keyboardInput.nextInt();
        int number2 = keyboardInput.nextInt();
        System.out.print(number1 + " * " + number2 + " = ");
        recursiveMultiplication(number1, number2);
    }

    public static void recursiveMultiplication(int x, int y)
    {
        if (x == 0 || y == 0)
            System.out.print("0");
        else if ((x < 0 && y < 0))
        {
            System.out.print(y + " + ");
            recursiveMultiplication(x + 1, y);
        }
        else if(x > 0 && y > 0)
        {
            System.out.print(y + " + ");
            recursiveMultiplication(x - 1, y);
        }
        else if (x < 0)
        {
            System.out.print("-" + y + " + ");
            recursiveMultiplication(x + 1, y);
        }
        else if(y < 0)
        {
            System.out.print("-" + x + " + ");
            recursiveMultiplication(x, y+1);
        }
    }
}
