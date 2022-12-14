package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String nameUser;
    public static void greeting() {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner scannerName = new Scanner(System.in);
        nameUser = scannerName.nextLine();

        System.out.println("Hello, " + nameUser + "!");
    }

    static String getNameUser() {
        return nameUser;
    }
}
