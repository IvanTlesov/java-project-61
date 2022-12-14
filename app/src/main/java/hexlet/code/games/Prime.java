package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static final int PRIME = 6;
    static final String INIT_GAME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void primeGame() {
        String[][] questionAnswer = new String[Engine.LENGTH_ARRAY][2];
        for (int i = 0; i < Engine.LENGTH_ARRAY; i++) {
            questionAnswer[i][0] = String.valueOf(2 + (int) (Math.random() * Engine.MAX_RANDOM_LIMIT));
            questionAnswer[i][1] = isPrime(questionAnswer[i][0]);
        }

        Engine.runGame(questionAnswer, INIT_GAME);
    }

    public static String isPrime(String number) {
        String result = "yes";
        int maxCount = Integer.parseInt(number) % 2 == 0 ? Integer.parseInt(number) / 2
                : Integer.parseInt(number) / 2 + 1;
        for (int i = 2; i <= maxCount; i++) {
            if (Integer.parseInt(number) % i == 0) {
                result = "no";
            }
        }
        return result;
    }
}
