package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static final int CLI = 1;
    public static void greeting() {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner scannerName = new Scanner(System.in);
        String nameUser = scannerName.nextLine();

        System.out.println("Hello, " + nameUser + "!");
    }

}
