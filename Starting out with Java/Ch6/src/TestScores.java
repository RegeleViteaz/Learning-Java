/**
 * Date: 01/24/2020
 * Starting out with Java Programming Challenge Chapter 6 Problem 6: TestScores class
 * Test Scores class holds information about a test scores
 */

public class TestScores
{
    private double testScore1;
    private double testScore2;
    private double testScore3;

    public TestScores()
    {
        testScore1 = 0.0;
        testScore2 = 0.0;
        testScore3 = 0.0;
    }

    public TestScores(double tS1, double tS2, double tS3)
    {
        testScore1 = tS1;
        testScore2 = tS2;
        testScore3 = tS3;
    }

    public void setTestScore1(double tS1)
    {
        testScore1 = tS1;
    }

    public double getTestScore1()
    {
        return testScore1;
    }

    public void setTestScore2(double tS2)
    {
        testScore2 = tS2;
    }

    public double getTestScore2()
    {
        return testScore2;
    }

    public void setTestScore3(double tS3)
    {
        testScore3 = tS3;
    }

    public double getTestScore3()
    {
        return testScore3;
    }

    public double averageTestScores()
    {
        return (testScore1 + testScore2 + testScore3)/3;
    }
}
