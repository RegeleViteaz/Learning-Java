import java.util.Scanner;
/**
 * Date: 17/11/2019
 * Starting out with Java Programming Challenge Chapter 3 Problem 5: Mass and Weight
 * User enters an object's mass, calculates in weight in newtons and displays an appropriate message
 */
public class Problem5
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the object's mass in kg");
        double inputMass = keyboard.nextDouble();
        double weight = inputMass * 9.8;
        if(weight > 1000)
            System.out.println("Object is too heavy, its weight is " + weight + " Newtons.");
        if(weight < 10)
            System.out.println("Object is too light, its weight is " + weight + " Newtons.");
    }
}
