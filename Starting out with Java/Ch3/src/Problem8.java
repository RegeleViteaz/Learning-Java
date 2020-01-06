import java.util.Scanner;
/**
 * Date: 5/1/2020
 * Starting out with Java Programming Challenge Chapter 3 Problem 8: Software Sales
 * Program that asks the user to enter the number of packages purchased.
 * The program should then display the amount of the discount and the total amount of the purchase after the discount.
 */

public class Problem8
{
    public static void main(String[] args)
    {
        final int PACKAGE_PRICE = 99;
        final double DISCOUNT_20 = 0.8;
        final double DISCOUNT_30 = 0.7;
        final double DISCOUNT_40 = 0.6;
        final double DISCOUNT_50 = 0.5;
        
        double amountSaved = 0;
        double totalPrice;
        double originalPrice;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the amount of packages you are buying");
        int quantity = keyboard.nextInt();
        keyboard.nextLine();
        

        if(quantity >= 0 && quantity <= 9)
        {
            originalPrice = quantity * PACKAGE_PRICE;
            totalPrice = originalPrice;
        }
        else if(quantity >=10 && quantity <= 19)
        {
            originalPrice = quantity * PACKAGE_PRICE;
            totalPrice = originalPrice * DISCOUNT_20;
            amountSaved = originalPrice - totalPrice;
        }
        else if(quantity >=20 && quantity <= 49)
        {
            originalPrice = quantity * PACKAGE_PRICE;
            totalPrice = originalPrice * DISCOUNT_30;
            amountSaved = originalPrice - totalPrice;
        }
        else if(quantity >=50 && quantity <= 99)
        {
            originalPrice = quantity * PACKAGE_PRICE;
            totalPrice = originalPrice * DISCOUNT_40;
            amountSaved = originalPrice - totalPrice;
        }
        else
        {
            originalPrice = quantity * PACKAGE_PRICE;
            totalPrice = originalPrice * DISCOUNT_50;
            amountSaved = originalPrice - totalPrice;
        }
        System.out.println("This is your receipt: \nOriginal Price: "  + originalPrice + "\n"
                                                    + "Total Price: "  + "\t"  + totalPrice + "\n"
                                                    + "Amount Saved: " + "\t"  + amountSaved);

    }
}
