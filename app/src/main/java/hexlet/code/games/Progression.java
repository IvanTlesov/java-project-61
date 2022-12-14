package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static final int PROGRESSION = 5;
    static final int PROSRESSIONLENGTH = 10;
    static final String INIT_GAME = "What number is missing in the progression?";
    public static void progressionGame() {
        String[][] answerQuestion = new String[Engine.LENGTH_ARRAY][2];
        for (int i = 0; i < Engine.LENGTH_ARRAY; i++) {
            String[] questionArray = new String[PROSRESSIONLENGTH];
            questionArray[0] = String.valueOf((int) (Math.random() * Engine.MAX_RANDOM_LIMIT));
            int differenceProgression = 1 + (int) (Math.random() * Engine.MAX_RANDOM_LIMIT);
            for (int j = 1; j < PROSRESSIONLENGTH; j++) {
                questionArray[j] = String.valueOf(Integer.parseInt(questionArray[j - 1]) + differenceProgression);
            }
            int numberRandomElement = (int) (Math.random() * PROSRESSIONLENGTH);
            answerQuestion[i][1] = questionArray[numberRandomElement];
            questionArray[numberRandomElement] = "..";
            answerQuestion[i][0] = questionArray[0];
            for (int j = 1; j < PROSRESSIONLENGTH; j++) {
                answerQuestion[i][0] = answerQuestion[i][0] + " " + questionArray[j];
            }
        }
        Engine.runGame(answerQuestion, INIT_GAME);
    }
}
