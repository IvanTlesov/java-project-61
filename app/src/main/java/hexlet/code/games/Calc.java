package hexlet.code.games;

public class Calc {
    public static String[][] calcGame() {
        String[][] questionAnswer = new String[3][2];
        for (int i = 0; i < 3; i++) {
            int randomNumber = (int) (Math.random() * 10);
            int firstNumber = (int) (Math.random() * 50);
            int secondNumber = (int) (Math.random() * 50);
            if (randomNumber % 3 == 0) {
                questionAnswer[i][0] = firstNumber + " + " + secondNumber;
                questionAnswer[i][1] = String.valueOf(firstNumber + secondNumber);
            } else if (randomNumber % 3 == 1) {
                questionAnswer[i][0] = firstNumber + " - " + secondNumber;
                questionAnswer[i][1] = String.valueOf(firstNumber - secondNumber);
            } else if (randomNumber % 3 == 2) {
                questionAnswer[i][0] = firstNumber + " * " + secondNumber;
                questionAnswer[i][1] = String.valueOf(firstNumber * secondNumber);
            }
        }
        return questionAnswer;
    }
}
