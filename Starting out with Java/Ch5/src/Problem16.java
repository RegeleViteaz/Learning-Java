import java.util.Scanner;

/**
 * Date: 01/20/2020
 * Starting out with Java Programming Challenge Chapter 5 Problem 16: Present Value
 * Program that calculates the future value of your money placed in a savings account
 */

public class Problem16
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Savings Account Program");
        double futureValue = futureValue();
        double interestRate = interestRate();
        int years = years();
        double presentValue = presentValue(futureValue, interestRate, years);
        System.out.printf("The amount of money that you need to deposit today is %5.2f", presentValue);
    }

    /**
     * Calculates the amount of money required to be deposited today to reach a required sum of money using the
     * present value formula.
     * @param futureValue The future monetary value that you want in your account
     * @param interestRate The annual interest rate
     * @param years The number of years that the money remains in the account
     * @return The amount of money required to be deposited today
     */
    public static double presentValue(double futureValue, double interestRate, int years)
    {
        return futureValue / (Math.pow((1 + (interestRate/100)), years));
    }

    /**
     * Ask the user for the future monetary value that he wants in his account and validate the input
     * @return The future monetary value
     */
    public static double futureValue()
    {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the monetary value you would like to have in your account in the future: ");
        double futureMoney = keyboardInput.nextDouble();
        while(futureMoney < 0)
        {
            System.out.print("Invalid Input: number needs to be positive.\nEnter the monetary value you would " +
                             "like to have in your account in the future: ");
            futureMoney = keyboardInput.nextDouble();
        }
        return futureMoney;
    }

    /**
     * Ask the user for the annual interest rate and validate the input
     * @return The annual interest rate
     */
    public static double interestRate()
    {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the annual interest rate of your account: ");
        double interestRate = keyboardInput.nextDouble();
        while(interestRate < 0)
        {
            System.out.print("Invalid Input: number needs to be positive.\n" +
                             "Enter the annual interest rate of your account: ");
            interestRate = keyboardInput.nextDouble();
        }
        return interestRate;
    }

    /**
     * Ask the user for number of years that the money remains in the account and validate the input
     * @return The number of years
     */
    public static int years()
    {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the number of years that you plan to let the money sit in the account: ");
        int years = keyboardInput.nextInt();
        while(years < 0)
        {
            System.out.print("Invalid Input: number needs to be positive.\nEnter the number of years that you plan " +
                               "to let the money sit in the account: ");
            years = keyboardInput.nextInt();
        }
        return years;
    }
}
