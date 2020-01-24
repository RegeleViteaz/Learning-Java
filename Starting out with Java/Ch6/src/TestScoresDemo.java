import java.util.Scanner;

/**
 * Date: 01/24/2020
 * Starting out with Java Programming Challenge Chapter 6 Problem 6: TestScores class
 * Program that tests the TestScore class
 */

public class TestScoresDemo
{
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the score for test 1: ");
        double testScore1 = keyboardInput.nextDouble();
        System.out.print("Enter the score for test 2: ");
        double testScore2 = keyboardInput.nextDouble();
        System.out.print("Enter the score for test 3: ");
        double testScore3 = keyboardInput.nextDouble();

        TestScores tests = new TestScores();


        tests.setTestScore1(testScore1);
        tests.setTestScore2(testScore2);
        tests.setTestScore3(testScore3);
        double testAverage = tests.averageTestScores();

        System.out.printf("The score of your first test is: " + tests.getTestScore1() +
                                  "\nThe score of your second test is: " + tests.getTestScore2() +
                                  "\nThe score of your third test is: " + tests.getTestScore3() +
                                  "\nThe average of your three test scores are: %3.2f", testAverage);
    }
}
