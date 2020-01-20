import java.util.Scanner;

/**
 * Date: 01/19/2020
 * Starting out with Java Programming Challenge Chapter 5 Problem 11: Multiple Stock Sales
 * Program that calculates the profit from the sale of a stock
 */

public class Problem11
{
    public static void main(String[] args)
    {
        double totalProfit = 0;
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the number of stock sales to calculate: ");
        int stockSalesAmount = keyboardInput.nextInt();

        for(int i = 1; i <= stockSalesAmount; i++)
        {
            System.out.print("Enter the number of shares for stock " + i + ": ");
            double numberShares = keyboardInput.nextDouble();
            //Input Validation
            while (numberShares < 0)
            {
                System.out.print("Number must be positive. Enter the number of shares for stock " + i + ": ");
                numberShares = keyboardInput.nextDouble();
            }

            System.out.print("Enter the purchase price per share for stock " + i + ": ");
            double purchasePriceShare = keyboardInput.nextDouble();
            //Input Validation
            while (purchasePriceShare < 0)
            {
                System.out.print("Number must be positive. Enter the purchase price per share for stock " + i + ": ");
                purchasePriceShare = keyboardInput.nextDouble();
            }

            System.out.print("Enter the purchase commission paid for stock " + i + ": ");
            double purchaseCommissionPaid = keyboardInput.nextDouble();
            //Input Validation
            while (purchaseCommissionPaid < 0)
            {
                System.out.print("Number must be positive. Enter the purchase commission paid for stock " + i + ": ");
                purchaseCommissionPaid = keyboardInput.nextDouble();
            }

            System.out.print("Enter the sale price per share for stock " + i + ": ");
            double salesPricePerShare = keyboardInput.nextDouble();
            //Input Validation
            while (salesPricePerShare < 0)
            {
                System.out.print("Number must be positive. Enter the sale price per share for stock " + i + ": ");
                salesPricePerShare = keyboardInput.nextDouble();
            }

            System.out.print("Enter the sale commission paid for stock " + i + ": ");
            double saleCommissionPaid = keyboardInput.nextDouble();
            //Input Validation
            while (saleCommissionPaid < 0)
            {
                System.out.print("Number must be positive. Enter the sale commission paid for stock " + i + ": ");
                saleCommissionPaid = keyboardInput.nextDouble();
            }
            System.out.println("\nInformation complete for stock " + i + "\n");
            //Input Validation
            double saleAmount = stockProfit(numberShares, purchasePriceShare,
                                        purchaseCommissionPaid, salesPricePerShare, saleCommissionPaid);
            totalProfit += saleAmount;
        }

        if (totalProfit < 0)
            System.out.printf("You have a loss of %5.3f$", totalProfit);
        else
            System.out.printf("You have made a profit of %5.3f$", totalProfit);
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
