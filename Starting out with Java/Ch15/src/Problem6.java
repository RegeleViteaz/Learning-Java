/**
 * Date: 02/13/2020
 * Starting out with Java Programming Challenge Chapter 15 Problem 6: Character Counter
 * Method that uses recursion to count the number of times a specific character occurs in an array of characters
 */

public class Problem6
{
    public static void main(String[] args)
    {
        char[] array = {'a', 'b', 'c', 'd', 'e', 'F', 'f'};
        char specificChar = 'F';
        int index = 0;
        int total = 0;

        System.out.print("The total number of times the character occurs is: " + recursiveCharacterCounter(array, index, specificChar, total));
    }

    private static int recursiveCharacterCounter(char[] array, int index, char specificChar, int total)
    {
        if(index > array.length - 1)
            return total;
        else if(Character.toLowerCase(array[index]) == Character.toLowerCase(specificChar))
            total++;
        return recursiveCharacterCounter(array, index + 1, specificChar, total);
    }

}