/**
 * Date: 02/13/2020
 * Starting out with Java Programming Challenge Chapter 15 Problem 4: maxElement Method
 * Method named maxElement which returns the largest value in an array that is passed as an argument.
 */

public class Problem4
{
    public static void main(String[] args)
    {
        int[] arrayValue = {-1, -2, -55, -25, -15, -5, -2452, -5235, -323};
        int low = 0;
        int high = arrayValue.length - 1;
        int largest = 0;
        int lf = maxElement(arrayValue, low, high, largest);
        System.out.print(lf);

    }

    public static int maxElement(int[] array, int low, int high, int largest)
    {
        if (low > high)
        {
            if(largest == 0);

        }
        else if (array[low] == array[high] && array[low] > largest)
            largest = array[low];
        else if (array[low] > array[high] && array[low] > largest)
            largest = array[low];
        else if (array[low] < array[high] && array[high] > largest)
            largest = array[high];
        return maxElement(array, low + 1, high - 1, largest);
    }

}