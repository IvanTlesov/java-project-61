package hexlet.code;

import java.util.Scanner;

public class Cli {
    static String NAME_USER = null;
    public static String greeting() {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner scannerName = new Scanner(System.in);
        NAME_USER = scannerName.nextLine();

        System.out.println("Hello, " + NAME_USER + "!");
        return NAME_USER;
    }
}
