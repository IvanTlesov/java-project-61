package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.NewEven;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");
        Scanner scannerGame = new Scanner(System.in);
        int answerUser = scannerGame.nextInt();

        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner scannerName = new Scanner(System.in);
        String nameUser = scannerName.nextLine();

        System.out.println("Hello, " + nameUser + "!");

        if (answerUser == 2) {
            String initGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
            Engine.runGame(NewEven.evenGame(), initGame, nameUser);
        }

        if (answerUser == 3) {
            String initgame = "What is the result of the expression?";
            Engine.runGame(Calc.calcGame(), initgame, nameUser);
        }

        if (answerUser == 4) {
            String initgame = "Find the greatest common divisor of given numbers.";
            Engine.runGame(GCD.gcdGame(), initgame, nameUser);
        }

        if (answerUser == 5) {
            String initgame = "What number is missing in the progression?";
            Engine.runGame(Progression.progressionGame(), initgame, nameUser);
        }

        if (answerUser == 6) {
            String initgame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
            Engine.runGame(Prime.primeGame(), initgame, nameUser);
        }
    }
}
