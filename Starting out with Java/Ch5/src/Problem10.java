import java.util.Scanner;

/**
 * Date: 01/19/2020
 * Starting out with Java Programming Challenge Chapter 5 Problem 10: Stock Profit
 * Program that calculates the profit from the sale of a stock
 */

public class Problem10
{
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the number of shares: ");
        double numberShares = keyboardInput.nextDouble();
        //Input Validation
        while (numberShares < 0)
        {
            System.out.print("Number must be positive. Enter the number of shares: ");
            numberShares = keyboardInput.nextDouble();
        }

        System.out.print("Enter the purchase price per share: ");
        double purchasePriceShare = keyboardInput.nextDouble();
        //Input Validation
        while (purchasePriceShare < 0)
        {
            System.out.print("Number must be positive. Enter the purchase price per share: ");
            purchasePriceShare = keyboardInput.nextDouble();
        }

        System.out.print("Enter the purchase commission paid: ");
        double purchaseCommissionPaid = keyboardInput.nextDouble();
        //Input Validation
        while (purchaseCommissionPaid < 0)
        {
            System.out.print("Number must be positive. Enter the purchase commission paid: ");
            purchaseCommissionPaid = keyboardInput.nextDouble();
        }

        System.out.print("Enter the sale price per share: ");
        double salesPricePerShare = keyboardInput.nextDouble();
        //Input Validation
        while (salesPricePerShare < 0)
        {
            System.out.print("Number must be positive. Enter the sale price per share: ");
            salesPricePerShare = keyboardInput.nextDouble();
        }

        System.out.print("Enter the sale commission paid: ");
        double saleCommissionPaid = keyboardInput.nextDouble();
        //Input Validation
        while (saleCommissionPaid < 0)
        {
            System.out.print("Number must be positive. Enter the sale commission paid: ");
            saleCommissionPaid = keyboardInput.nextDouble();
        }
        //Input Validation
        double profit = stockProfit(numberShares, purchasePriceShare,
                                    purchaseCommissionPaid, salesPricePerShare, saleCommissionPaid);
        if (profit < 0)
            System.out.printf("You have a loss of %5.3f$", profit);
        else
            System.out.printf("You have made a profit of %5.3f$", profit);
    }

    /**
     * Calculates the profit from the sale of a stock
     *
     * @param numberOfShares         Number of shares
     * @param purchasePricePerShare  Purchase price per share
     * @param purchaseCommissionPaid Purchase commission paid
     * @param salesPricePerShare     Sale price per share
     * @param saleCommissionPaid     Sale commission paid
     * @return The profit from the sale of a stock
     */
    public static double stockProfit(double numberOfShares, double purchasePricePerShare, double purchaseCommissionPaid,
                                     double salesPricePerShare, double saleCommissionPaid)
    {
        return (((numberOfShares * salesPricePerShare) - saleCommissionPaid) -
                ((numberOfShares * purchasePricePerShare) + purchaseCommissionPaid));
    }
}
