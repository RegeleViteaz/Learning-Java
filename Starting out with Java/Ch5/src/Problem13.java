import java.util.Scanner;

/**
 * Date: 01/20/2020
 * Starting out with Java Programming Challenge Chapter 5 Problem 13: isPrime
 * Program that determines if a number is prime
 */

public class Problem13
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = keyboard.nextInt();
        boolean prime = isPrime(number);
        if(prime)
            System.out.println("The number is prime");
        else
            System.out.println("Therefore, the number is not prime");
    }

    /**
     * Method that determines whether a number is prime
     * @param number The number to be checked
     * @return False: number is not prime. True: number is prime.
     */
    public static boolean isPrime(int number)
    {
        for(int i = 2; i < number; ++i)
        {
            if((number % i) == 0)
            {
                System.out.println("The number is divisible by " + i);
                return false;
            }
        }
        return true;
    }
}
