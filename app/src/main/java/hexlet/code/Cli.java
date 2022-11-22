package hexlet.code;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Cli {
    public static void Name() {
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        String nameUser = sc.nextLine();
        System.out.println("Hello, " + nameUser + "!");
    }
}
