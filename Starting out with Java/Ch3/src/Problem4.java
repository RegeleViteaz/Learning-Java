import java.util.Scanner;
/**
 * Date: 17/11/2019
 * Starting out with Java Programming Challenge Chapter 3 Problem 4: Test Scores and Grade
 * User enters a day, a month and a year in numeric form. It then determines if these values are magic
 */
public class Problem4
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to your test score and grade calculation");
        System.out.println("Enter your first test result");
        double testScore1 = keyboard.nextDouble();
        while(testScore1 < 1 || testScore1 > 100)
        {
            System.out.println("Invalid test score entered");
            System.out.println("Enter your first test result");
            testScore1 = keyboard.nextDouble();
        }
        System.out.println("Enter your second test result");
        double testScore2 = keyboard.nextDouble();
        while(testScore2 < 1 || testScore1 > 100)
        {
            System.out.println("Invalid test score entered");
            System.out.println("Enter your first test result");
            testScore2 = keyboard.nextDouble();
        }
        System.out.println("Enter your third test result");
        double testScore3 = keyboard.nextDouble();
        while(testScore3 < 1 || testScore1 > 100)
        {
            System.out.println("Invalid test score entered");
            System.out.println("Enter your first test result");
            testScore3 = keyboard.nextDouble();
        }
        double testScoreAverage = (testScore1 + testScore2 + testScore3)/3;
        if(testScoreAverage < 60)
            System.out.println("Your testScoreAverage is " + testScoreAverage + " which is a letter grade of F");
        else if(testScoreAverage >= 60 && testScoreAverage < 70)
            System.out.println("Your testScoreAverage is " + testScoreAverage + " which is a letter grade of D");
        else if(testScoreAverage >= 70 && testScoreAverage < 80)
            System.out.println("Your testScoreAverage is " + testScoreAverage + " which is a letter grade of C");
        else if(testScoreAverage >= 80 && testScoreAverage < 90)
            System.out.println("Your testScoreAverage is " + testScoreAverage + " which is a letter grade of B");
        else if(testScoreAverage >= 90 && testScoreAverage <= 100)
            System.out.println("Your testScoreAverage is " + testScoreAverage + " which is a letter grade of A");
    }
}
