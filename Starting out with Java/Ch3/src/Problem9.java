import java.util.Scanner;
/**
 * Date: 5/1/2020
 * Starting out with Java Programming Challenge Chapter 3 Problem 9: Shipping Charges
 * Program that asks the user to enter the weight of a package and then displays the shipping charges
 */

public class Problem9
{
    public static void main(String[] args)
    {
        final double SMALLEST_RATE = 1.10;
        final double NORMAL_RATE   = 2.10;
        final double HIGH_RATE     = 3.70;
        final double HIGHEST_RATE  = 3.80;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the weight (lbs) of your package: ");
        double inputWeightLbs = keyboard.nextDouble();

        if(inputWeightLbs >= 0 && inputWeightLbs <= 2)
        {
            System.out.println("Your shipping charges are " + SMALLEST_RATE + "$");
        }
        else if(inputWeightLbs > 2 && inputWeightLbs <= 6)
        {
            System.out.println("Your shipping charges are " + NORMAL_RATE + "$");
        }
        else if(inputWeightLbs > 6 && inputWeightLbs <= 10)
        {
            System.out.println("Your shipping charges are " + HIGH_RATE + "$");
        }
        else if(inputWeightLbs >= 10)
        {
            System.out.println("Your shipping charges are " + HIGHEST_RATE + "$");
        }
    }
}
