package hexlet.code.games;

import hexlet.code.Engine;


public class Calc {
    public static final int CALC = 3;
    static final String INIT_GAME = "What is the result of the expression?";
    public static void calcGame() {
        String[][] questionAnswer = new String[Engine.LENGTH_ARRAY][2];
        for (int i = 0; i < Engine.LENGTH_ARRAY; i++) {
            int randomNumber = (int) (Math.random() * Engine.MAX_RANDOM_LIMIT);
            int firstNumber = (int) (Math.random() * Engine.MAX_RANDOM_LIMIT);
            int secondNumber = (int) (Math.random() * Engine.MAX_RANDOM_LIMIT);
            if (randomNumber % Engine.LENGTH_ARRAY == 0) {
                questionAnswer[i][0] = firstNumber + " + " + secondNumber;
                questionAnswer[i][1] = String.valueOf(firstNumber + secondNumber);
            } else if (randomNumber % Engine.LENGTH_ARRAY == 1) {
                questionAnswer[i][0] = firstNumber + " - " + secondNumber;
                questionAnswer[i][1] = String.valueOf(firstNumber - secondNumber);
            } else if (randomNumber % Engine.LENGTH_ARRAY == 2) {
                questionAnswer[i][0] = firstNumber + " * " + secondNumber;
                questionAnswer[i][1] = String.valueOf(firstNumber * secondNumber);
            }
        }
        Engine.runGame(questionAnswer, INIT_GAME);
    }
}
