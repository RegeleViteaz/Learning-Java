/**
 * Date: 01/24/2020
 * Starting out with Java Programming Challenge Chapter 6 Problem 7: Circle class
 * Test Scores class holds information about a test scores
 */

public class Circle
{
    private double radius;
    private final double PI = 3.14159;

    public Circle(double rad)
    {
        radius = rad;
    }

    public Circle()
    {
        radius = 0.0;
    }

    public void setRadius(double rad)
    {
        radius = rad;
    }

    public double getRadius()
    {
        return radius;
    }

    public double getArea()
    {
        return PI * Math.pow(radius,2);
    }

    public double getDiameter()
    {
        return radius * 2;
    }

    public double getCircumference()
    {
        return 2 * PI * radius;
    }
}
