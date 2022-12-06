package hexlet.code.games;

public class Prime {
    public static String[][] primeGame() {
        String[][] questionAnswer = new String[3][2];
        for (int i = 0; i < 3; i++) {
            questionAnswer[i][0] = String.valueOf(2 + (int) (Math.random() * 100));
            questionAnswer[i][1] = isPrime(questionAnswer[i][0]);
        }
        return questionAnswer;
    }

    public static String isPrime(String number) {
        String result = "yes";
        int maxCount = Integer.parseInt(number) % 2 == 0 ? Integer.parseInt(number) / 2
                : Integer.parseInt(number) / 2 + 1;
        for (int i = 2; i < maxCount; i++) {
            if (Integer.parseInt(number) % i == 0) {
                result = "no";
            }
        }
        return result;
    }
}
