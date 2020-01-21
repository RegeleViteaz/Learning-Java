import java.util.Random;
import java.util.Scanner;

/**
 * Date: 01/20/2020
 * Starting out with Java Programming Challenge Chapter 5 Problem 17: Rock, Paper, Scissors
 * Program that lets the user play the game of Rock, Paper, Scissors against the computer
 */
public class Problem17
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Rock Paper Scissors Program");
        boolean tie = gameStart();
        while(tie)
        {
            tie = gameStart();
        }
    }

    public static boolean gameStart()
    {
        int computerChoice = computerChoice();
        int playerChoice = playerChoice();
        while(playerChoice == 4)
        {
            System.out.println("Invalid Input. Try again");
            playerChoice = playerChoice();
        }
        computerChoiceConversion(computerChoice);
        playerChoiceConversion(playerChoice);
        return winner(computerChoice, playerChoice);
    }

    public static int computerChoice()
    {
        Random rand = new Random();
        return rand.nextInt((3 - 1) + 1) + 1;
    }

    public static int playerChoice()
    {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Enter your choice between Rock, Paper or Scissors");
        String inputedChoice = keyboardInput.nextLine();

        if(inputedChoice.equalsIgnoreCase("rock"))
            return 1;
        else if(inputedChoice.equalsIgnoreCase("paper"))
            return 2;
        else if(inputedChoice.equalsIgnoreCase("scissors"))
            return 3;
        else
            return 4;
    }

    public static void computerChoiceConversion(int number)
    {
        if(number == 1)
            System.out.println("The computer has selected rock");
        else if(number == 2)
            System.out.println("The computer has selected paper");
        else
            System.out.println("The computer has selected scissors");
    }

    private static void playerChoiceConversion(int number)
    {
        if(number == 1)
            System.out.println("You have selected rock");
        else if(number == 2)
            System.out.println("You have selected paper");
        else
            System.out.println("You have selected scissors");
    }

    public static boolean winner(int computerChoice, int playerChoice)
    {
        if(computerChoice == playerChoice)
        {
            System.out.println("The game is a tie");
            return true;
        }

        if(computerChoice == 1 && playerChoice == 2)
            System.out.println("You win");
        if(computerChoice == 1 && playerChoice == 3)
            System.out.println("You lose");
        if(computerChoice == 2 && playerChoice == 1)
            System.out.println("You lose");
        if(computerChoice == 2 && playerChoice == 3)
            System.out.println("You win");
        if(computerChoice == 3 && playerChoice == 1)
            System.out.println("You win");
        if(computerChoice == 3 && playerChoice == 2)
            System.out.println("You lose");

        return false;
    }
}
