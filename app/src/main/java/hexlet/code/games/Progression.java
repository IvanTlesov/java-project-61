package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static final int PROGRESSION = 5;
    static final int PROSRESSIONLENGTH = 10;
    static final String INIT_GAME = "What number is missing in the progression?";
    public static void progressionGame() {
        String[][] answerQuestion = new String[Engine.LENGTH_ARRAY][2];
        for (int i = 0; i < Engine.LENGTH_ARRAY; i++) {
            int[] progressionArray = getProgressionArray();
            int randomElement = 1 + (int) (Math.random() * PROSRESSIONLENGTH);
            answerQuestion[i][1] = String.valueOf(progressionArray[randomElement]);//строка-ответ
            answerQuestion[i][0] = String.valueOf(progressionArray[0]);

            for (int j = 1; j < PROSRESSIONLENGTH; j++) {
                if (j == randomElement) {
                    answerQuestion[i][0] = answerQuestion[i][0] + " ..";
                    continue;
                }
                answerQuestion[i][0] = answerQuestion[i][0] + " " + progressionArray[j];
            }
        }
        Engine.runGame(answerQuestion, INIT_GAME);
    }

    static int[] getProgressionArray() {
        int firstElement = (int) (Math.random() * Engine.MAX_RANDOM_LIMIT);
        int differenceProgression = 1 + (int) (Math.random() * Engine.MAX_RANDOM_LIMIT);
        int[] progressionArray = new int[PROSRESSIONLENGTH];
        for (int i = 0; i < PROSRESSIONLENGTH; i++) {
            progressionArray[i] = firstElement + differenceProgression * (i - 1);
        }
        return progressionArray;
    }

}
