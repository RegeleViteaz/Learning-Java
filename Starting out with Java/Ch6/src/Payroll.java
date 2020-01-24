/**
 * Date: 01/23/2020
 * Starting out with Java Programming Challenge Chapter 6 Problem 5: Payroll class
 * Payroll item class holds information about payrolls
 */

public class Payroll
{
    private String name;
    private int idNumber;
    private double hourlyPay;
    private double hoursWorked;

    public Payroll()
    {
        name = "";
        idNumber = 0;
        hourlyPay = 0;
        hoursWorked = 0;
    }

    public Payroll(String empName, int empIdNumber)
    {
        name = empName;
        idNumber = empIdNumber;
        hourlyPay = 0;
        hoursWorked = 0;
    }

    public void setName(String empName)
    {
        name = empName;
    }

    public void setIdNumber(int empIdNumber)
    {
        idNumber = empIdNumber;
    }

    public void setHourlyPay(double empHourlyPay)
    {
        hourlyPay = empHourlyPay;
    }

    public void setHoursWorked(double empHoursWorked)
    {
        hoursWorked = empHoursWorked;
    }

    public String getName()
    {
        return name;
    }

    public int getIdNumber()
    {
        return idNumber;
    }

    public double getHourlyPay()
    {
        return hourlyPay;
    }

    public double getHoursWorked()
    {
        return hoursWorked;
    }

    public double grossPay()
    {
        return hourlyPay * hoursWorked;
    }

}
