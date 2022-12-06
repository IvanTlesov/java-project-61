package hexlet.code.games;

public class Progression {
    public static String[][] progressionGame() {
        String[][] answerQuestion = new String[3][2];
        for (int i = 0; i < 3; i++) {
            String[] questionArray = new String[10];
            questionArray[0] = String.valueOf((int) (Math.random() * 15));
            int differenceProgression = 1 + (int) (Math.random() * 10);
            for (int j = 1; j < 10; j++) {
                questionArray[j] = String.valueOf(Integer.parseInt(questionArray[j - 1]) + differenceProgression);
            }
            int numberRandomElement = (int) (Math.random() * 10);
            answerQuestion[i][1] = questionArray[numberRandomElement];
            questionArray[numberRandomElement] = "..";
            answerQuestion[i][0] = questionArray[0];
            for (int j = 1; j < 10; j++) {
                answerQuestion[i][0] = answerQuestion[i][0] + " " + questionArray[j];
            }
        }
        return answerQuestion;
    }
}
