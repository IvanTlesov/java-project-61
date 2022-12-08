package hexlet.code.games;

public class Calc {
    public static String[][] calcGame(int lengthArray, int maxRandomLimit) {
        String[][] questionAnswer = new String[lengthArray][2];
        for (int i = 0; i < lengthArray; i++) {
            int randomNumber = (int) (Math.random() * maxRandomLimit);
            int firstNumber = (int) (Math.random() * maxRandomLimit);
            int secondNumber = (int) (Math.random() * maxRandomLimit);
            if (randomNumber % lengthArray == 0) {
                questionAnswer[i][0] = firstNumber + " + " + secondNumber;
                questionAnswer[i][1] = String.valueOf(firstNumber + secondNumber);
            } else if (randomNumber % lengthArray == 1) {
                questionAnswer[i][0] = firstNumber + " - " + secondNumber;
                questionAnswer[i][1] = String.valueOf(firstNumber - secondNumber);
            } else if (randomNumber % lengthArray == 2) {
                questionAnswer[i][0] = firstNumber + " * " + secondNumber;
                questionAnswer[i][1] = String.valueOf(firstNumber * secondNumber);
            }
        }
        return questionAnswer;
    }
}
