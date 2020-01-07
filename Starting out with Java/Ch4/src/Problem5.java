import java.util.Scanner;

/**
 * Date: 01/07/2020
 * Starting out with Java Programming Challenge Chapter 4 Problem 5: Letter Counter
 * Program that asks the user to enter a string and display the number of times a specified character
 * appears in the string.
 */
public class Problem5
{
    public static void main(String[] args)
    {
        int charFound = 0; //Accumulator

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a string ");
        String inputWord = keyboard.nextLine();

        System.out.print("Enter a character ");
        String line = keyboard.nextLine();
        char inputChar = line.charAt(0);

        for(int i = 0; i < inputWord.length(); i++)
        {
            if(inputWord.charAt(i) == inputChar)
            {
                System.out.println("Character found at position " + (i+1));
                charFound += 1;
            }
        }
        if(charFound != 0)
        {
            System.out.println("The character was found a total of " + charFound + " times.");
        }
        else
        {
            System.out.println("Character not found in the string");
        }

    }
}
