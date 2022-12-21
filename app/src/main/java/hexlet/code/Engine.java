package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int LENGTH_ARRAY = 3;
    public static final int MAX_RANDOM_LIMIT = 50;
    public static void runGame(String[][] questionAnswer, String initGame) {

        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner scannerName = new Scanner(System.in);
        String nameUser = scannerName.nextLine();

        System.out.println("Hello, " + nameUser + "!");

        System.out.println(initGame);
        int count = 0;
        while (count <= LENGTH_ARRAY) {
            if (count == LENGTH_ARRAY) {
                System.out.printf("Congratulations, %s!\n", nameUser);
                break;
            }

            System.out.printf("Question: %s\n", questionAnswer[count][0]);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String answerUser = scanner.nextLine();

            if (answerUser.equals(questionAnswer[count][1])) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n",
                        answerUser, questionAnswer[count][1]);
                System.out.printf("Let's try again, %s!\n", nameUser);
                break;
            }
        }

        scannerName.close();
    }
}
