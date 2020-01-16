import java.util.Scanner;

/**
 * Date: 01/15/2020
 * Starting out with Java Programming Challenge Chapter 4 Problem 19: Square Display
 * Program that displays a square of character X upon user input.
 */

public class Problem19
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a positive number no greater than 15: ");
        int userInput = keyboard.nextInt();

        while(userInput < 1 || userInput > 15)
        {
            System.out.print("Invalid number. Enter a positive number no greater than 15: ");
            userInput = keyboard.nextInt();
        }
        for(int i = 0; i < userInput; i++)
        {
            for(int j = 0; j < userInput; j++)
            {
                System.out.print("X");
            }
            System.out.print("\n");
        }
        keyboard.close();
    }
}
