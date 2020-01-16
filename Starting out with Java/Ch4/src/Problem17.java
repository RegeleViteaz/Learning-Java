import java.util.Random;
import java.util.Scanner;

/**
 * Date: 01/15/2020
 * Starting out with Java Programming Challenge Chapter 4 Problem 17 & 18: Random Number Guessing Game
 * Program that generates a random number and asks the user to guess what the number is
 */

public class Problem17
{
    public static void main(String[] args)
    {
        Random randomNumber = new Random();
        int number = randomNumber.nextInt(100);
        System.out.println(number);

        System.out.print("The number is between 0 and 100.\nEnter you guess: ");
        Scanner keyboard = new Scanner(System.in);
        int guessedNumber;
        boolean correct = false;
        int totalTries = 0;

        while(!correct)
        {
            totalTries++;
            guessedNumber = keyboard.nextInt();
            if(guessedNumber > number)
            {
                System.out.print("Lower, try again: ");
            }
            else if(guessedNumber < number)
            {
                System.out.print("Higher, try again: ");
            }
            else
            {
                if(totalTries == 1)
                    System.out.println("You guessed the number after " + totalTries + " try");
                else
                    System.out.println("You guessed the number after " + totalTries + " tries");
                correct = true;
            }
        }

    }
}
