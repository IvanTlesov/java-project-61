package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void name() {
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        String nameUser = sc.nextLine();
        System.out.println("Hello, " + nameUser + "!");
    }
}
