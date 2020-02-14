/**
 * Date: 02/13/2020
 * Starting out with Java Programming Challenge Chapter 15 Problem 5: Palindrome Detector
 * Method that uses recursion to determine if a String argument is a palindrome,
 */

public class Problem5
{
    public static void main(String[] args)
    {
        String str = "Desserts I stressed";
        int low = 0;
        int high = str.length() - 1;
        if (isPalindrome(str, low, high))
            System.out.print("This is a palindrome");
        else
            System.out.print("This is not a palindrome");
    }

    public static boolean isPalindrome(String str, int low, int high)
    {
        if (low > high)
            return true;
        else if (Character.toLowerCase(str.charAt(low)) != Character.toLowerCase(str.charAt(high)))
            return false;
        else
            return isPalindrome(str, low + 1, high - 1);
    }
}