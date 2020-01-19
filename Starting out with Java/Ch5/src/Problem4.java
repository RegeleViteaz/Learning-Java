import java.util.Scanner;

/**
 * Date: 01/19/2020
 * Starting out with Java Programming Challenge Chapter 5 Problem 4: Paint Job Estimator
 * Program that allows the user to calculate the cost of painting a number of rooms.
 */

public class Problem4
{
    public static void main(String[] args)
    {
        double pricePerGallon = pricePerGallon();
        int numberRoomsToPaint = numberRoomsToPaint();
        double totalSquareFootagePaint = squareFeetWallEachRoom(numberRoomsToPaint);
        double gallonsPaint = numberGallonsPaintRequired(totalSquareFootagePaint);
        double laborHours = hoursLaborRequired(totalSquareFootagePaint);
        double paintCost = costPaint(gallonsPaint, pricePerGallon);
        double laborCharge = laborCharge(laborHours, 18.00);
        double totalCostPaintJob = totalCostPaintJob(paintCost, laborCharge);
        System.out.printf("The total cost of the paint job is: %5.2f", totalCostPaintJob);
    }

    public static double pricePerGallon()
    {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the price of paint per gallon: ");
        double pricePaintPerGallon = keyboardInput.nextDouble();
        while(pricePaintPerGallon < 0)
        {
            System.out.print("Invalid input: the cost of paint cannot be 0 or a negative number" +
                             "Enter the price of paint per gallon: ");
            pricePaintPerGallon = keyboardInput.nextDouble();
        }
        return pricePaintPerGallon;
    }

    public static int numberRoomsToPaint()
    {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the number of rooms to be painted: ");
        int numberRoomsToPaint = keyboardInput.nextInt();
        while(numberRoomsToPaint < 1)
        {
            System.out.print("Invalid input: the number of rooms cannot be 0 or a negative number" +
                             "Enter the number of rooms to be painted: ");
            numberRoomsToPaint = keyboardInput.nextInt();
        }
        return  numberRoomsToPaint;
    }

    public static double squareFeetWallEachRoom(int numberOfRooms)
    {
        double totalSquareFootage = 0;
        double inputSquareFeet;
        Scanner keyboardInput = new Scanner(System.in);
        for(int i = 1; i <= numberOfRooms; i++)
        {
            System.out.print("Enter the square footage to paint for room " + i + " : ");
            inputSquareFeet = keyboardInput.nextDouble();
            while (inputSquareFeet < 1)
            {
                System.out.print("Invalid input: the square footage cannot be 0 or a negative number" +
                                 "Enter the square footage to paint for room " + i + " : ");
                inputSquareFeet = keyboardInput.nextInt();
            }
            totalSquareFootage += inputSquareFeet;
        }
        return totalSquareFootage;
    }

    public static double numberGallonsPaintRequired(double totalSquareFootage)
    {
        return Math.ceil(totalSquareFootage * 1 / 115);
    }

    public static double hoursLaborRequired(double totalSquareFootage)
    {
        return (totalSquareFootage * 8) / 115;
    }

    public static double costPaint(double gallonsPaint, double pricePerGallon)
    {
        return (gallonsPaint * pricePerGallon);
    }

    public static double laborCharge(double hoursLabor, double laborCharge)
    {
        return (hoursLabor * laborCharge) / 8;
    }

    public static double totalCostPaintJob(double paintCost, double laborCost)
    {
        return (paintCost + laborCost);
    }
}
