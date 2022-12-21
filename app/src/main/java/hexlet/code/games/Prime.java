package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static final int PRIME = 6;
    static final String INIT_GAME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void primeGame() {
        String[][] questionAnswer = new String[Engine.LENGTH_ARRAY][2];
        for (int i = 0; i < Engine.LENGTH_ARRAY; i++) {
            questionAnswer[i][0] = String.valueOf(2 + (int) (Math.random() * Engine.MAX_RANDOM_LIMIT));
            questionAnswer[i][1] = isPrime(questionAnswer[i][0]) ? "yes" : "no";
        }
        Engine.runGame(questionAnswer, INIT_GAME);
    }

    public static boolean isPrime(String number) {
        boolean isPrime = true;
        int maxCount = (int) Math.sqrt(Integer.parseInt(number));
        for (int i = 2; i <= maxCount; i++) {
            if (Integer.parseInt(number) % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
