/**
 * Date: 02/13/2020
 * Starting out with Java Programming Challenge Chapter 15 Algorithm Workbench: Problem 1
 * Method that accepts a String as an argument and use recursion to display each individual character in the String
 */

public class PrefaceProblem1
{
    public static void main(String[] args)
    {
        String str = new String("Hello World");
        reverseString(str, 0);
    }

    public static void reverseString(String str, int position)
    {
        if(position < str.length())
        {
            System.out.println(str.charAt(position));
            reverseString(str, position + 1);
        }
    }
}
