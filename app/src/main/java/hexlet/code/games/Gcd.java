package hexlet.code.games;

public class Gcd {
    public static String[][] gcdGame(int lengthArray, int maxRandomLimit) {
        String[][] questionAnswer = new String[lengthArray][2];
        for (int i = 0; i < lengthArray; i++) {
            int firstNumber = 1 + (int) (Math.random() * maxRandomLimit);
            int secondNumber = 1 + (int) (Math.random() * maxRandomLimit);
            questionAnswer[i][0] = firstNumber + " " + secondNumber;
            questionAnswer[i][1] = String.valueOf(gcd(Math.max(firstNumber, secondNumber),
                    Math.min(firstNumber, secondNumber)));
        }
        return questionAnswer;
    }

    public static int gcd(int bigNumber, int smallNumber) {
        return bigNumber % smallNumber == 0 ? smallNumber : gcd(smallNumber, bigNumber % smallNumber);
    }
}
