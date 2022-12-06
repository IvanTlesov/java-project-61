package hexlet.code.games;

public class GCD {
    public static String[][] gcdGame() {
        String[][] questionAnswer = new String[3][2];
        for (int i = 0; i < 3; i++) {
            int firstNumber = (int) (Math.random() * 50);
            int secondNumber = (int) (Math.random() * 50);
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
