import java.util.Scanner;

/**
 * Date: 02/01/2020
 * Data Structure Assignment 1: question 1
 * Given a string of random length and random contents of characters, that do not include digits (0-9),
 * write an algorithm, using pseudo code that will shorten the representation of that string by adding the
 * number of consecutive characters. For instance, given str as “gggN@@@@@KKeeeejjdsmmu” the
 * algorithm should return the following representation of the string: “g3N@5K2e4j2dsm2u”.
 * ggN@@KKeeP
 */

class Question1
{
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        //System.out.print("Enter your string that does not include numbers: ");
        //String input = keyboardInput.nextLine();
        String input = new String("ggee");
        char position = input.charAt(0);
        int accumulator = 1;
        for (int i = 1; i < input.length(); i++)
        {
            boolean lastIndexString = i == (input.length() - 1);
            if (position == input.charAt(i))
            {
                accumulator++;
                if (lastIndexString)
                    System.out.print(input.charAt(i) + "" + accumulator);
            }
            else //(position != input.charAt(i))
            {
                if (accumulator > 1)
                {
                    System.out.print(position + "" + accumulator);
                }
                else
                {
                    System.out.print(position + "");
                }
                position = input.charAt(i);
                accumulator = 1;

                if (lastIndexString)
                    System.out.print(input.charAt(i));
            }
        }
    }
}


