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

            String operation = switch (randomNumber % Engine.LENGTH_ARRAY) {
                case 0 -> " + ";
                case 1 -> " - ";
                case 2 -> " * ";
                default -> throw new IllegalStateException("Unexpected value: " + randomNumber % Engine.LENGTH_ARRAY);
            };
            questionAnswer[i][0] = firstNumber + operation + secondNumber;
            questionAnswer[i][1] = String.valueOf(calculate(firstNumber, secondNumber, operation));

        }
        Engine.runGame(questionAnswer, INIT_GAME);
    }
    static int calculate(int firstNumber, int secondNumber, String operation) throws IllegalStateException {
        switch (operation) {
            case " + " -> {
                return firstNumber + secondNumber;
            }
            case " - " -> {
                return firstNumber - secondNumber;
            }
            case " * " -> {
                return firstNumber * secondNumber;
            }
            default -> throw new IllegalStateException("Unexpected value: " + operation);
        }
    }
}
