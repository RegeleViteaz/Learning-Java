import java.util.Scanner;

/**
 * Date: 01/19/2020
 * Starting out with Java Programming Challenge Chapter 5 Problem 7: Test Average and Grade
 * Program that displays a letter grade for each score and the average test score
 */

public class Problem7
{
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        double scoreInput = 0;
        double testScore1 = 0;
        double testScore2 = 0;
        double testScore3 = 0;
        double testScore4 = 0;
        double testScore5 = 0;


        StringBuilder output = new StringBuilder("Score\t\tLetterGrade\n------------------------\n");
        for(int i = 1; i <= 5; i++)
        {
            System.out.print("Enter the test score for test " + i + ": ");
            scoreInput = keyboardInput.nextDouble();
            System.out.println(scoreInput + "\t\t" + determineGrade(scoreInput));
            if(i == 1)
            {
                testScore1 = scoreInput;
                output.append(scoreInput).append("\t\t").append(determineGrade(scoreInput));
                output.append("\n");
            }
            else if(i == 2)
            {
                testScore2 = scoreInput;
                output.append(scoreInput).append("\t\t").append(determineGrade(scoreInput));
                output.append("\n");
            }
            else if(i == 3)
            {
                testScore3 = scoreInput;
                output.append(scoreInput).append("\t\t").append(determineGrade(scoreInput));
                output.append("\n");
            }
            else if(i == 4)
            {
                testScore4 = scoreInput;
                output.append(scoreInput).append("\t\t").append(determineGrade(scoreInput));
                output.append("\n");
            }
            else
            {
                testScore5 = scoreInput;
                output.append(scoreInput).append("\t\t").append(determineGrade(scoreInput));
                output.append("\n");
            }
        }

        double average = calcAverage(testScore1, testScore2, testScore3, testScore4, testScore5);
        System.out.println(output + "\nAverage test score: " + average + " which is an " + determineGrade(average));
    }

    public static double calcAverage(double testScore1, double testScore2, double testScore3,
                                     double testScore4, double testScore5)
    {
        return (testScore1 + testScore2 + testScore3 + testScore4 + testScore5) / 5.0;
    }

    public static char determineGrade(double percentScore)
    {
        if(percentScore >=90 && percentScore <= 100)
            return 'A';
        else if(percentScore >=80 && percentScore < 90)
            return 'B';
        else if(percentScore >=70 && percentScore < 80)
            return 'C';
        else if(percentScore >=60 && percentScore < 70)
            return 'D';
        else if(percentScore >= 0 && percentScore < 60)
            return 'F';
        else
            return 'R';
    }
}
