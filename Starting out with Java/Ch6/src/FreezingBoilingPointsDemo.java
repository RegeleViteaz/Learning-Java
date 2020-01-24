import java.util.Scanner;

/**
 * Date: 01/24/2020
 * Starting out with Java Programming Challenge Chapter 6 Problem 9: FreezingBoilingPoints class
 * Program that tests the  FreezingBoilingPoints class
 */

public class FreezingBoilingPointsDemo
{
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter a temperature in fahrenheit: ");
        double temperature = keyboardInput.nextDouble();

        FreezingBoilingPoints tempObject = new FreezingBoilingPoints(temperature);

        if(tempObject.isEthylFreezing())
            System.out.println("Ethyl Alcohol is freezing");
        if(tempObject.isEthylBoiling())
            System.out.println("Ethyl Alcohol is boiling");
        if(tempObject.isOxygenFreezing())
            System.out.println("Oxygen is freezing");
        if(tempObject.isOxygenBoiling())
            System.out.println("Oxygen is boiling");
        if(tempObject.isWaterFreezing())
            System.out.println("Water is freezing");
        if(tempObject.isWaterBoiling())
            System.out.println("Water is boiling");

    }
}
