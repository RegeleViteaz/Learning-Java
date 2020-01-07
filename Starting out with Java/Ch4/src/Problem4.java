import java.util.Scanner;

/**
 * Date: 01/07/2020
 * Starting out with Java Programming Challenge Chapter 4 Problem 4: Pennies for pay
 * Program that calculates the amount a person would earn over a period of time
 */
public class Problem4
{
    public static void main(String[] args)
    {
        int totalSalary = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the amount of pennies you currently have");
        int currentPennies = keyboard.nextInt();

        while (!(currentPennies > 0))
        {
            System.out.println("Invalid input.\nEnter the amount of pennies you currently have");
            currentPennies = keyboard.nextInt();
        }
        keyboard.nextLine(); //Consume line in memory

        System.out.println("Enter the amount of days worked");
        int inputDays = keyboard.nextInt();

        while (!(inputDays > 0))
        {
            System.out.println("Invalid input.\nEnter the amount of days you worked");
            inputDays = keyboard.nextInt();
        }

        System.out.println("Days\tSalary in Pennies");
        System.out.println("---------------------------");

        for (int day = 1; day <= inputDays; day++)
        {
            System.out.println(day + "\t\t\t\t" + "$" + (double)currentPennies/100);
            totalSalary += currentPennies;
            currentPennies *= 2;
        }
        System.out.println("Total \t\t\t$" + (double)totalSalary/100);
    }
}
