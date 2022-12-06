package hexlet.code.games;

public class NewEven {
    public static String[][] evenGame() {
        String[][] questionAnswer = new String[3][2];
        for (int i = 0; i < 3; i++) {
            int randomNumber = (int) Math.round(Math.random() * 100);
            questionAnswer[i][0] = String.valueOf(randomNumber);
            questionAnswer[i][1] = randomNumber % 2 == 0 ? "yes" : "no";
        }
        return questionAnswer;
    }
}
