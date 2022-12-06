package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.NewEven;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    final static int even = 2;
    final static int calc = 3;
    final static int gcd = 4;
    final static int progression = 5;
    final static int prime = 6;
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

        if (answerUser == even) {
            String initGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
            Engine.runGame(NewEven.evenGame(), initGame, nameUser);
        } else if (answerUser == calc) {
            String initgame = "What is the result of the expression?";
            Engine.runGame(Calc.calcGame(), initgame, nameUser);
        } else if (answerUser == gcd) {
            String initgame = "Find the greatest common divisor of given numbers.";
            Engine.runGame(GCD.gcdGame(), initgame, nameUser);
        } else if (answerUser == progression) {
            String initgame = "What number is missing in the progression?";
            Engine.runGame(Progression.progressionGame(), initgame, nameUser);
        } else if (answerUser == prime) {
            String initgame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
            Engine.runGame(Prime.primeGame(), initgame, nameUser);
        }
    }
}
