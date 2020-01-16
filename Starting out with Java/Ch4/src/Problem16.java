import java.util.Scanner;

/**
 * Date: 01/15/2020
 * Starting out with Java Programming Challenge Chapter 4 Problem 13: Budget Analysis
 * Program that asks the user to enter the amount that he or she has budgeted for a month and
 * display the amount that the user is over or under budget
 */

public class Problem16
{
    public static void main(String [] args)
    {
        double total = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the amount that you have for this month: ");
        double budget = keyboard.nextDouble();

        while(budget < 0)
        {
            System.out.print("Invalid number. Enter the amount that you have for this month: ");
            budget = keyboard.nextDouble();
        }

        System.out.print("Enter your expenses or -1 to exit: ");
        double expenses = keyboard.nextDouble();

        while(expenses < 0)
        {
            System.out.print("Invalid number. Enter your expenses or -1 to exit: ");
            expenses = keyboard.nextDouble();
        }

        while(expenses != -1)
        {
            total += expenses;
            System.out.print("Enter your expenses or -1 to exit: ");
            expenses = keyboard.nextDouble();
        }

        if(budget > total)
        {
            System.out.println("You are under budget by $" + (budget - total));
        }
        else if(budget < total)
        {
            System.out.println("You are over budget by $" + (total- budget));
        }
        else
        {
            System.out.println("You used your budget exactly");
        }
    }
}
