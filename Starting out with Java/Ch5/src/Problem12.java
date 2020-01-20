import java.util.Scanner;

/**
 * Date: 01/20/2020
 * Starting out with Java Programming Challenge Chapter 5 Problem 12: Kinetic Energy
 * Program that calculates an objects kinetic energy
 */

public class Problem12
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Kinetic Energy Program");
        double objMass = getObjMass();
        double objVelocity = getObjVelocity();
        double objKineticEnergy = kineticEnergy(objMass, objVelocity);
        System.out.print("The object's kinetic energy with a mass of " + objMass +
                         " kg and a velocity of " + objVelocity + " m/s is " + objKineticEnergy);
    }

    /**
     * Method that asks the user for the object's mass in kilograms and validates the input
     * @return The object's mass in kilograms
     */
    public static double getObjMass()
    {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the object's mass in kilograms: ");
        double objMass = keyboardInput.nextDouble();

        while(objMass < 0)
        {
            System.out.print("Invalid input: its mass needs to be higher or equal to 0.\n" +
                             "Enter the object's mass in kilograms: ");
            objMass = keyboardInput.nextDouble();
        }
        return objMass;
    }

    /**
     * Method that asks the user for the object's velocity in meters per second and validates the input
     * @return The object's velocity in meters per second
     */
    public static double getObjVelocity()
    {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the object's velocity in meters per second: ");
        double objVelocity = keyboardInput.nextDouble();

        while(objVelocity < 0)
        {
            System.out.print("Invalid input: its velocity needs to be higher or equal to 0.\n" +
                             "Enter the object's velocity in kilograms: ");
            objVelocity = keyboardInput.nextDouble();
        }
        return objVelocity;
    }

    /**
     * Method that calculates an objects velocity
     * @param objMass The object's mass in kilograms
     * @param objVelocity The object's velocity in meters per second
     * @return The object's kinetic energy
     */
    public static double kineticEnergy(double objMass, double objVelocity)
    {
        return (1.0/2.0) * (objMass * Math.pow(objVelocity, 2));
    }
}
