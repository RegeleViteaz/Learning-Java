import java.util.Scanner;

/**
 * Date: 01/24/2020
 * Starting out with Java Programming Challenge Chapter 6 Problem 7: Circle class
 * Program that tests the Circle class
 */

public class CircleDemo
{
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the radius of the circle in cm: ");
        double circleRadius = keyboardInput.nextDouble();

        Circle circle = new Circle(circleRadius);
        System.out.printf("Your circle object has radius of: %5.2f" +
                         "\nArea: %5.3f" +
                         "\nDiameter: %5.3f"  +
                         "\nCircumference: %5.3f", circle.getRadius(), circle.getArea()
                                                 , circle.getDiameter(), circle.getCircumference());
    }
}
