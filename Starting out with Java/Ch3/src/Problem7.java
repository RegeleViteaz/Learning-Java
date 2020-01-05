import java.util.Scanner;

/**
 * Date: 17/11/2019
 * Starting out with Java Programming Challenge Chapter 3 Problem 7
 * A program that asks the user to enter three names, and then displays the names sorted in ascending order
 * I cannot use any type of loop
 */
public class Problem7
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter person 1 name");
        String name1 = keyboard.nextLine();
        System.out.println("Enter person 2 name");
        String name2 = keyboard.nextLine();
        System.out.println("Enter person 3 name");
        String name3 = keyboard.nextLine();

        String smallestName;
        String middleName;
        String bigName;

        if(name1.compareToIgnoreCase(name2) <= 0 && name1.compareToIgnoreCase(name3) <= 0 && name2.compareToIgnoreCase(name3) <= 0)
        {
            smallestName = name1;
            middleName = name2;
            bigName = name3;
            System.out.println("In alphabetical order, the names are :\n" + smallestName + "\n" + middleName + "\n" + bigName + "\n");
        }
        else if(name1.compareToIgnoreCase(name2) <= 0 && name1.compareToIgnoreCase(name3) <= 0 && name2.compareToIgnoreCase(name3) > 0)
        {
            smallestName = name1;
            middleName = name3;
            bigName = name2;
            System.out.println("In alphabetical order, the names are :\n" + smallestName + "\n" + middleName + "\n" + bigName + "\n");
        }
        else if(name1.compareToIgnoreCase(name2) > 0 && name1.compareToIgnoreCase(name3) <= 0 && name2.compareToIgnoreCase(name3) <= 0)
        {
            smallestName = name2;
            middleName = name1;
            bigName = name3;
            System.out.println("In alphabetical order, the names are :\n" + smallestName + "\n" + middleName + "\n" + bigName + "\n");
        }
        else if(name1.compareToIgnoreCase(name2) > 0 && name1.compareToIgnoreCase(name3) > 0 && name2.compareToIgnoreCase(name3) <= 0)
        {
            smallestName = name2;
            middleName = name3;
            bigName = name1;
            System.out.println("In alphabetical order, the names are :\n" + smallestName + "\n" + middleName + "\n" + bigName + "\n");
        }
        else if(name1.compareToIgnoreCase(name2) <= 0 && name1.compareToIgnoreCase(name3) > 0 && name2.compareToIgnoreCase(name3) > 0)
        {
            smallestName = name3;
            middleName = name1;
            bigName = name2;
            System.out.println("In alphabetical order, the names are :\n" + smallestName + "\n" + middleName + "\n" + bigName + "\n");
        }
        else if(name1.compareToIgnoreCase(name2) > 0 && name1.compareToIgnoreCase(name3) > 0 && name2.compareToIgnoreCase(name3) > 0)
        {
            smallestName = name3;
            middleName = name2;
            bigName = name1;
            System.out.println("In alphabetical order, the names are :\n" + smallestName + "\n" + middleName + "\n" + bigName + "\n");
        }
    }
}
