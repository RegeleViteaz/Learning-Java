import java.util.Scanner;

/**
 * Date: 5/1/2020
 * Starting out with Java Programming Challenge Chapter 3 Problem 9: Fat Gram Calculator
 * Program that asks the user to enter the number of calories and fat grams in a food item and displays a message.
 */
public class Problem10
{
    public static void main(String[] args)
    {
        Scanner keyboard =  new Scanner(System.in);
        System.out.println("Enter the number of calories in your food item: ");
        double inputTotalCalories = keyboard.nextDouble();
        System.out.println("Enter the number of fat grams in your food item: ");
        double inputFatGrams = keyboard.nextDouble();

        double caloriesFromFat = inputFatGrams * 9;
        double percentageCaloriesFromFat = caloriesFromFat / inputTotalCalories;
        if(!(inputTotalCalories > caloriesFromFat))
        {
            // Learning / Testing to create a string object and passing to the println method
            String s = "It is not possible to have more calories from fat than total calories"
                     + "Your input is thus invalid";
            System.out.println(s);
        }

        if(percentageCaloriesFromFat < 0.30)
        {
            System.out.println("The food is low on fat, it contains " + percentageCaloriesFromFat +"% of fat of the total calories");
        }


    }
}
