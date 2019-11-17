import java.util.Scanner;
/**
 * Date: 17/11/2019
 * Starting out with Java Programming Challenge Chapter 3 Problem 3
 * User enters his weight and height and calculates his BMI
 */
public class problem3
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your weight in lbs");
        double weightInput = keyboard.nextDouble();

        while(weightInput < 40 || weightInput > 500)
        {
            System.out.println("Invalid weight entered");
            System.out.println("Enter your weight in lbs");
            weightInput = keyboard.nextDouble();
        }
        System.out.println("Enter your height in inches");
        double heightInput = keyboard.nextDouble();
        while(heightInput < 20 || heightInput > 160)
        {
            System.out.println("Invalid height entered");
            System.out.println("Enter your height in inches");
            heightInput = keyboard.nextDouble();
        }
        System.out.println("BMI = weight * 703 / height^2");
        double BMI = weightInput * 703/(Math.pow(heightInput,2));
        if(BMI < 18.5)
        {
            System.out.println("You are underweight");
            System.out.println("Your BMI is " + BMI);
        }
        if(BMI > 25)
        {
            System.out.println("You are overweight");
            System.out.println("Your BMI is " + BMI);
        }
        if(BMI >= 18.5 && BMI <= 25)
        {
            System.out.println("Your weight is optimal");
            System.out.println("Your BMI is " + BMI);
        }
    }
}