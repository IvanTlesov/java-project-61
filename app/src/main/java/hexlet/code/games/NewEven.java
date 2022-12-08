package hexlet.code.games;

public class NewEven {
    public static String[][] evenGame(int lengthArray, int maxRandomLimit) {
        String[][] questionAnswer = new String[lengthArray][2];
        for (int i = 0; i < lengthArray; i++) {
            int randomNumber = (int) Math.round(Math.random() * maxRandomLimit);
            questionAnswer[i][0] = String.valueOf(randomNumber);
            questionAnswer[i][1] = randomNumber % 2 == 0 ? "yes" : "no";
        }
        return questionAnswer;
    }
}
