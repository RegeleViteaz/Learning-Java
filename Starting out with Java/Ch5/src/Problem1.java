import java.util.Scanner;

/**
 * Date: 01/18/2020
 * Starting out with Java Programming Challenge Chapter 5 Problem 1: showChar Method
 * Simple programs that utilises a method to display the character positon of a string
 */

public class Problem1
{
    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a city name: ");
        String cityName = keyboard.nextLine();

        showChar(cityName, 50);

        keyboard.close();
    }

    public static void showChar(String cityName, int position)
    {
        if((position < 0) || (position > cityName.length() - 1))
        {
            System.out.print("The number entered is not correct. The number should be positive and lower than "
                                     + (cityName.length() - 1));
        }
        else
        {
            System.out.print(cityName.charAt(position));
        }
    }
}
