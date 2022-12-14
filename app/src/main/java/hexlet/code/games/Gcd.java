package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    public static final int GCD = 4;
    static final String INIT_GAME = "Find the greatest common divisor of given numbers.";
    public static void gcdGame() {
        String[][] questionAnswer = new String[Engine.LENGTH_ARRAY][2];
        for (int i = 0; i < Engine.LENGTH_ARRAY; i++) {
            int firstNumber = 1 + (int) (Math.random() * Engine.MAX_RANDOM_LIMIT);
            int secondNumber = 1 + (int) (Math.random() * Engine.MAX_RANDOM_LIMIT);
            questionAnswer[i][0] = firstNumber + " " + secondNumber;
            questionAnswer[i][1] = String.valueOf(gcd(Math.max(firstNumber, secondNumber),
                    Math.min(firstNumber, secondNumber)));
        }
        Engine.runGame(questionAnswer, INIT_GAME);
    }

    public static int gcd(int bigNumber, int smallNumber) {
        return bigNumber % smallNumber == 0 ? smallNumber : gcd(smallNumber, bigNumber % smallNumber);
    }
}
