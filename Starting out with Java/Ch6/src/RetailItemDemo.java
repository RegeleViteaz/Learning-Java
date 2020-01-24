/**
 * Date: 01/23/2020
 * Starting out with Java Programming Challenge Chapter 6 Problem 4: Retail Item class
 * Program that tests the Retail item class
 */

public class RetailItemDemo
{
    public static void main(String[] args)
    {
        RetailItem cookie = new RetailItem("A cookie", 15, 2.15);
        RetailItem pencil = new RetailItem();

        pencil.setDescription("A Pencil");
        pencil.setUnitsOnHand(25);
        pencil.setPrice(100);

        System.out.println("The " + cookie.getClass() +" cookie object has the following properties: " +
                                   "\nItem Description: " + cookie.getDescription() +
                                   "\nItem Units on Hand: " + cookie.getUnitsOnHand() +
                                   "\nItem price: " + cookie.getPrice());
        System.out.println();

        System.out.println("The " + pencil.getClass() +" cookie object has the following properties: " +
                                   "\nItem Description: " + pencil.getDescription() +
                                   "\nItem Units on Hand: " + pencil.getUnitsOnHand() +
                                   "\nItem price: " + pencil.getPrice());
    }
}
