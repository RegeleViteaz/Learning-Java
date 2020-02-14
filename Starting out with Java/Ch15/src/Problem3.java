/**
 * Date: 02/13/2020
 * Starting out with Java Programming Challenge Chapter 15 Problem 3: String Reverser
 * Recursive method that accepts a string as its argument and prints the string in reverse order
 */

public class Problem3
{
    public static void main(String[] args)
    {
        String str = new String("Hello World");
        String output = "";
        stringReverse(str, output, str.length() - 1);
    }

    public static void stringReverse(String str, String output, int index)
    {
        if(index == 0)
        {
            output += str.charAt(index);
            System.out.print(output);
        }
        else
        {
            output += str.charAt(index);
            stringReverse(str, output, index - 1);
        }
    }

}
