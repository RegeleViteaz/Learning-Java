import java.util.Scanner;
/**
 * Date: 17/11/2019
 * Starting out with Java Programming Challenge Chapter 3 Problem 1
 * User enters a number between 1 and 5 and displays that number in Roman Numeral
 */
public class problem1
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 5");
        int decimalNum = keyboard.nextInt();

        while(decimalNum < 1 || decimalNum > 5)
        {
            System.out.println("You entered an invalid number.");
            System.out.println("Enter a number between 1 and 5");
            decimalNum = keyboard.nextInt();
        }
        switch(decimalNum)
        {
            case 1:
                System.out.println("1 in decimal is I in Roman numeral");
                break;
            case 2:
                System.out.println("2 in decimal is II in Roman numeral");
                break;
            case 3:
                System.out.println("3 in decimal is III in Roman numeral");
                break;
            case 4:
                System.out.println("4 in decimal is IV in Roman numeral");
                break;
            case 5:
                System.out.println("5 in decimal is V in Roman numeral");
                break;
            default:
                System.out.println("Number stored in decimalNum is not between 1 and 5");
        }
    }
}
