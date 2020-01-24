/**
 * Date: 01/23/2020
 * Starting out with Java Programming Challenge Chapter 6 Problem 4: RetailItem class
 * Retail Item class holds information about a retail item
 */

public class RetailItem
{
    private String description;
    private int unitsOnHand;
    private double price;

    public RetailItem()
    {
        description = "";
        unitsOnHand = 0;
        price = 0;
    }

    public RetailItem(String itemDesc, int itemUnitsOnHand, double itemPrice)
    {
        description = itemDesc;
        unitsOnHand = itemUnitsOnHand;
        price = itemPrice;
    }

    public void setDescription(String itemDesc)
    {
        description = itemDesc;
    }

    public void setUnitsOnHand(int itemUnitsOnHand)
    {
        unitsOnHand = itemUnitsOnHand;
    }

    public void setPrice(double itemPrice)
    {
        price = itemPrice;
    }

    public String getDescription()
    {
        return description;
    }

    public int getUnitsOnHand()
    {
        return unitsOnHand;
    }

    public double getPrice()
    {
        return price;
    }
}
