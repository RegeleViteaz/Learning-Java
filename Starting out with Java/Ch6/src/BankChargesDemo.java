/**
 * Date: 01/24/2020
 * Starting out with Java Programming Challenge Chapter 6 Problem 7: BankCharges class
 * Program that tests the BankCharges class
 */

public class BankChargesDemo
{
    public static void main(String[] args)
    {
        BankCharges account = new BankCharges();

        account.setBeginningBalance(390);
        account.setChecksWritten(43);

        System.out.print("Starting balance: " + account.getBeginningBalance() +
                         "\nChecks Written: " + account.getChecksWritten() +
                         "\nService fee: " + account.getServiceFee());
    }
}
