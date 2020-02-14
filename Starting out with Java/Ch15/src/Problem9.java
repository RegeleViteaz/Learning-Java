/**
 * Date: 02/13/2020
 * Starting out with Java Programming Challenge Chapter 15 Problem 9: Ackermann's Function
 * Ackermann's function is a recursive mathematical algorithm that can be used to test how well a computer performs recursion
 */

public class Problem9
{
    public static void main(String[] args)
    {
        int value = ackermann(2, 2);
        System.out.print(value);
    }

    public static int ackermann(int m, int n)
    {
        if (m == 0)
            return n + 1;
        else if (n == 0)
            return ackermann(m - 1, 1);
        else
            return ackermann(m - 1, ackermann(m, n - 1));
    }
}
