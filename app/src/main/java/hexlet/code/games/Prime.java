package hexlet.code.games;

public class Prime {
    public static String[][] primeGame(int lengthArray, int maxRandomLimit) {
        String[][] questionAnswer = new String[lengthArray][2];
        for (int i = 0; i < lengthArray; i++) {
            questionAnswer[i][0] = String.valueOf(2 + (int) (Math.random() * maxRandomLimit));
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
