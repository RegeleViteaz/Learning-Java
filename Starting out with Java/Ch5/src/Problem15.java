import java.util.Random;
import java.util.Scanner;

/**
 * Date: 01/20/2020
 * Starting out with Java Programming Challenge Chapter 5 Problem 15: Coin Toss
 * Program that simulates the tossing of a coin.
 */

public class Problem15
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the coin toss program");
        int tossTimes = tossTimes();
        int totalHeads = 0; // Accumulator
        int totalTails = 0; // Accumulator
        for(int i = 1; i <= tossTimes; i++)
        {
            int number = coinToss();
            if(number == 0)
                totalHeads++;
            else if(number == 1)
                totalTails++;
        }
        System.out.println("Throughout " + tossTimes + " tosses, " + totalHeads +
                           " were heads and "+ totalTails + " were tails");
    }

    /**
     * Method that simulates the tossing of a coin by generating a random number in the range of 0 through 1
     * @return The number: 0 or 1. I need to improve my comments jesus.
     */
    public static int coinToss()
    {
        Random randomGenerate = new Random();
        int number = randomGenerate.nextInt(2);
        if(number == 0)
            System.out.println("Heads");
        else if(number == 1)
            System.out.println("Tails");
        return number;
    }

    /**
     * Method that asks the user for the number of coin toss's and validates the input.
     * @return The number of coin toss's.
     */
    public static int tossTimes()
    {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the number of coin toss's: ");
        int tossNumber = keyboardInput.nextInt();

        while(tossNumber < 1)
        {
            System.out.print("Invalid number: value needs to be 1 or bigger.\nEnter the number of coin toss: ");
            tossNumber = keyboardInput.nextInt();
        }
        return tossNumber;
    }
}
