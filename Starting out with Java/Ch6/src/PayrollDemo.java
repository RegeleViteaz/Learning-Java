import java.util.Scanner;

/**
 * Date: 01/23/2020
 * Starting out with Java Programming Challenge Chapter 6 Problem 5: Payroll class
 * Program that test the Payroll class
 */

public class PayrollDemo
{
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the employee's name: ");
        String empName = keyboardInput.nextLine();

        System.out.print("Enter the employee's id number: ");
        int empIdNumber = keyboardInput.nextInt();

        System.out.print("Enter the employee's hourly pay: ");
        double empHourlyPay = keyboardInput.nextDouble();

        System.out.print("Enter the employee's hours worked: ");
        double empHoursWorked = keyboardInput.nextDouble();

        Payroll employee = new Payroll(empName, empIdNumber);

        employee.setHourlyPay(empHourlyPay);
        employee.setHoursWorked(empHoursWorked);
        System.out.print("\n\n");
        System.out.println("Properties of the employee object");
        System.out.print("Name: " + employee.getName() +
                         "\nId number: " + employee.getIdNumber() +
                         "\nHourly pay: " + employee.getHourlyPay() +
                         "\nHours worked: " + employee.getHoursWorked() +
                         "\nGross pay: " + employee.grossPay());
    }
}
