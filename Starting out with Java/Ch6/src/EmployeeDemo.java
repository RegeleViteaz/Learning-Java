import java.util.Scanner;

/**
 * Date: 01/23/2020
 * Starting out with Java Programming Challenge Chapter 6 Problem 1: Employee class
 * Program runs a test of the Employee class
 */

public class EmployeeDemo
{
    public static void main(String[] args)
    {
        Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "Position");
        Employee employee2 = new Employee("Mark Jones", 39119);
        Employee employee3 = new Employee();

        employee2.setDepartment("IT");
        employee2.setPosition("Programmer");

        employee3.setName("Joy Rogers");
        employee3.setIdNumber(81774);
        employee3.setDepartment("Manufacturing");
        employee3.setPosition("Engineer");

        System.out.println("Name\t\t\tID Number\tDepartment\t\tPosition");
        System.out.println("--------------------------------------------------------------");
        System.out.println(employee1.getName() + "\t" + employee1.getIdNumber() + "\t\t" +
                           employee1.getDepartment() + "\t\t\t" + employee1.getPosition());
        System.out.println(employee2.getName() + "\t\t" + employee2.getIdNumber() + "\t\t" +
                           employee2.getDepartment() + "\t\t\t\t\t" + employee2.getPosition());
        System.out.println(employee3.getName() + "\t\t" + employee3.getIdNumber() + "\t\t" +
                           employee3.getDepartment() + "\t\t" + employee3.getPosition());

    }
}

