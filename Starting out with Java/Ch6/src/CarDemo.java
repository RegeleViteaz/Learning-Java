/**
 * Date: 01/23/2020
 * Starting out with Java Programming Challenge Chapter 6 Problem 2: Car class
 * Program runs a test of the Car class
 */

public class CarDemo
{
    public static void main(String[] args)
    {
        Car mercedes = new Car(2015, "Mercedes");

        mercedes.setSpeed(100);

        for(int i = 0; i < 5; i++)
        {
            System.out.println("The car's speed is: " + mercedes.getSpeed());
            System.out.println("Accelerating");
            mercedes.accelerate();
        }

        System.out.println();
        System.out.println("Fuck the cops, he was waiting for me");
        System.out.println();

        for(int i = 0; i < 5; i++)
        {
            System.out.println("The car's speed is: " + mercedes.getSpeed());
            System.out.println("Breaking");
            mercedes.brake();
        }
    }
}
