import java.util.Scanner;

/**
 * Date: 01/18/2020
 * Starting out with Java Programming Challenge Chapter 5 Problem 2: Retail Price Calculator
 * Program that asks the user to enter an item's wholesale cost and its markup percentage.
 * It then displays the item's retail price.
 */

public class Problem2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the items wholesale cost: ");
        double wholesaleCost = keyboard.nextDouble();
        System.out.print("Enter the items markup percentage: ");
        int markupPercent = keyboard.nextInt();

        double retailPrice = calculateRetail(wholesaleCost, markupPercent);
        System.out.print("The retailPrice " + retailPrice);
        keyboard.close();
    }

    /**
     * The calculateRetail method calculates an item's retail cost.
     * @param wholesaleCost The item's wholesale cost
     * @param markupPercent The item's markup percentage (e.g 50 for 50%)
     * @return The item's retail price
     */
    private static double calculateRetail(double wholesaleCost, int markupPercent)
    {
        return wholesaleCost * (1 + (double)markupPercent/100);
    }
}
