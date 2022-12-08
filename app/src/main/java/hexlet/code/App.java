package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.NewEven;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    static final int PROSRESSIONLENGTH = 10;
    static final int MAX = 50;
    static final int LENGTH = 3;
    static final int EVEN = 2;
    static final int CALC = 3;
    static final int GCD = 4;
    static final int PROGRESSION = 5;
    static final int PRIME = 6;
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

        if (answerUser == EVEN) {
            String initGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
            Engine.runGame(NewEven.evenGame(LENGTH, MAX), initGame, nameUser, LENGTH);
        } else if (answerUser == CALC) {
            String initgame = "What is the result of the expression?";
            Engine.runGame(Calc.calcGame(LENGTH, MAX), initgame, nameUser, LENGTH);
        } else if (answerUser == GCD) {
            String initgame = "Find the greatest common divisor of given numbers.";
            Engine.runGame(Gcd.gcdGame(LENGTH, MAX), initgame, nameUser, LENGTH);
        } else if (answerUser == PROGRESSION) {
            String initgame = "What number is missing in the progression?";
            Engine.runGame(Progression.progressionGame(LENGTH, MAX, PROSRESSIONLENGTH), initgame, nameUser, LENGTH);
        } else if (answerUser == PRIME) {
            String initgame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
            Engine.runGame(Prime.primeGame(LENGTH, MAX), initgame, nameUser, LENGTH);
        }
    }
}
