/**
 * Date: 01/24/2020
 * Starting out with Java Programming Challenge Chapter 6 Problem 8: BankCharges Class
 * Bank Charges class holds information about bank charges
 */

public class BankCharges
{
    private double beginningBalance;
    private int checksWritten;

    public BankCharges()
    {
        beginningBalance = 0.0;
        checksWritten = 0;
    }

    public BankCharges(double begBalance, int cksWritten)
    {
        beginningBalance = begBalance;
        checksWritten = cksWritten;
    }

    public void setBeginningBalance(double begBalance)
    {
        beginningBalance = begBalance;
    }

    public double getBeginningBalance()
    {
        return beginningBalance;
    }

    public void setChecksWritten(int cksWritten)
    {
        checksWritten = cksWritten;
    }

    public int getChecksWritten()
    {
        return checksWritten;
    }

    public double getServiceFee()
    {
        double serviceFee = 10.0;
        if(beginningBalance < 400)
            serviceFee += 15.0;
        if(checksWritten < 20)
            serviceFee += checksWritten * 0.10;
        if(checksWritten >= 20 && checksWritten < 40)
            serviceFee += checksWritten * 0.08;
        if(checksWritten >= 40 && checksWritten < 60)
            serviceFee += checksWritten * 0.06;
        if(checksWritten >= 60)
            serviceFee += checksWritten * 0.04;

        return serviceFee;
    }

}
