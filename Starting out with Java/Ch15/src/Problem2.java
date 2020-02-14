/**
 * Date: 02/13/2020
 * Starting out with Java Programming Challenge Chapter 15 Problem 2: isMember Method
 * Recursive boolean method named isMember should search an array for a specified value,
 * and return true if the value is found in the array, or false if the value is not found in the array
 * Basically a binary search using recursion
 */

public class Problem2
{
    public static void main(String[] args)
    {
        int[] array = {1,2,3,4,5,6,7,18,29,39};
        boolean found = isMember(array, 0, array.length-1, 29);
        System.out.print(found);
    }

    public static boolean isMember(int[] array, int low, int high, int target)
    {
        int mid = (low + high)/2;
        if(low > high)
            return false;
        if(target == array[mid])
            return true;
        else if(mid < target)
            return isMember(array, mid + 1, high, target);
        else
            return isMember(array, low, mid - 1, target);
    }
}
