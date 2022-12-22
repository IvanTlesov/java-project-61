package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static final int EVEN = 2;
    static final String INIT_GAME = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void evenGame() {
        String[][] questionAnswer = new String[Engine.LENGTH_ARRAY][2];
        for (int i = 0; i < Engine.LENGTH_ARRAY; i++) {
            int randomNumber = (int) Math.round(Math.random() * Engine.MAX_RANDOM_LIMIT);
            questionAnswer[i][0] = String.valueOf(randomNumber);
            questionAnswer[i][1] = Even.isEven(randomNumber) ? "yes" : "no";
        }
        Engine.runGame(questionAnswer, INIT_GAME);
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
