package hexlet.code.games;

public class Progression {
    public static String[][] progressionGame(int lengthArray, int maxRandomLimit, int lengthProgression) {
        String[][] answerQuestion = new String[lengthArray][2];
        for (int i = 0; i < lengthArray; i++) {
            String[] questionArray = new String[lengthProgression];
            questionArray[0] = String.valueOf((int) (Math.random() * maxRandomLimit));
            int differenceProgression = 1 + (int) (Math.random() * maxRandomLimit);
            for (int j = 1; j < lengthProgression; j++) {
                questionArray[j] = String.valueOf(Integer.parseInt(questionArray[j - 1]) + differenceProgression);
            }
            int numberRandomElement = (int) (Math.random() * lengthProgression);
            answerQuestion[i][1] = questionArray[numberRandomElement];
            questionArray[numberRandomElement] = "..";
            answerQuestion[i][0] = questionArray[0];
            for (int j = 1; j < lengthProgression; j++) {
                answerQuestion[i][0] = answerQuestion[i][0] + " " + questionArray[j];
            }
        }
        return answerQuestion;
    }
}
