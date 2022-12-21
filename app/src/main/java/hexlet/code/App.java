package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
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

        switch (answerUser) {
            case Cli.CLI -> Cli.greeting();
            case NewEven.EVEN -> NewEven.evenGame();
            case Calc.CALC -> Calc.calcGame();
            case Gcd.GCD -> Gcd.gcdGame();
            case Progression.PROGRESSION -> Progression.progressionGame();
            case Prime.PRIME -> Prime.primeGame();
            default -> System.out.println("For game answer must be 1 .. 6");
        }

        scannerGame.close();
    }
}
