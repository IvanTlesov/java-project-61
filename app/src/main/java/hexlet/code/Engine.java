package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void runGame(String[][] questionAnswer, String initGame, String nameUser) {
        System.out.println(initGame);
        int count = 0;
        while (count <= 3) {
            if (count == 3) {
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
    }
}
