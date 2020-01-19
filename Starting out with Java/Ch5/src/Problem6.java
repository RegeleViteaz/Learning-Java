/**
 * Date: 01/19/2020
 * Starting out with Java Programming Challenge Chapter 5 Problem 6: Celsius Temperature Table
 * Method that converts Fahrenheit to Celsius
 */

public class Problem6
{
    public static void main(String[] args)
    {
        System.out.print("Celsius\t\tFahrenheit \n---------\t-----------\n");
        for(int temperature = 0; temperature <= 20; temperature++)
        {
            System.out.printf("%5.2f\t\t " + temperature + "\n", celsius(temperature));
        }
    }

    public static double celsius(double fahrenheit)
    {
        return (5.0/9.0) * (fahrenheit - 32);
    }

}
