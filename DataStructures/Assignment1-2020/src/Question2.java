import java.lang.reflect.Array;

/**
 * Date: 02/01/2020
 * Data Structure Assignment 1: question 2
 *
 * Develop a well-documented pseudo code that finds the two consecutive elements in the array with
 * the smallest difference in between, and the two consecutive elements with the biggest difference in
 * between. The code must display the values and the indices of these elements. For instance, given the
 * following array [20, 52,400, 3, 30, 70, 72, 47, 28, 38, 41, 53, 20] your code should find and display
 * something similar to the following (notice that this is just an example. Your solution must not refer to
 * this particular example.):
 * The two conductive indices with smallest difference between their values are: index 5 and
 * index 6, storing values 70 and 73.
 * The two conductive indices with largest difference between their values are: index 2 and
 * index 3, storing values 400 and 3.
 * In case of multiple occurrences of the smallest or largest differences, the code should display the first
 * found occurrence.
 */

public class Question2
{
    public static void main(String[] args)
    {
        int[] intArray = new int[]{ 20, 52, 400, 3, 30, 70, 73, 47, 28, 38, 41, 53, 20 };
        // length of 13 System.out.print(intArray.length);
        int leftIndexValue;
        int rightIndexValue;
        int leftIndex = 0;
        int rightIndex = 1;
        int total = 0;
        int smallDifference = 0;
        int bigDifference = 0;
        for(int i = 1; i < intArray.length; i++)
        {
            //boolean newValuesFound = 
            leftIndexValue = intArray[i-1];
            rightIndexValue = intArray[i];
            if(leftIndexValue >= rightIndexValue)
            {
                total = leftIndexValue - rightIndexValue;
            }
            else if(leftIndexValue < rightIndexValue)
            {
                total = rightIndexValue - leftIndexValue;
            }
            if(i == 1)
            {
                smallDifference = total;
                bigDifference = total;
            }
            else
            {
                if(total < smallDifference)
                {
                    smallDifference = total;
                    leftIndex = i-1;
                    rightIndex = i;
                }
                else if(total > bigDifference)
                {
                    bigDifference = total;
                    leftIndex = i-1;
                    rightIndex = i;
                }
            }

            if(i == (intArray.length-1))
            {
                System.out.println("biggest difference values are: " +
                                           "index: " + leftIndex + " and index: " + rightIndex +
                                           " , storing the values " + leftIndexValue + " and " + rightIndexValue +
                                           " Diff: " + bigDifference);
            }
        }

    }
}
