package Levels.Level3.Lesson1;

/*
    TASK:
        Enter a name and age from the keyboard. If the age is in the range 18-28 (inclusive), then display "<Name>,
        you've been drafted for military service", where <Name> is the name entered earlier from the keyboard.
 */

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        String militaryCommissar = ", you've been drafted for military service";

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();

        if (age >= 18 && age <= 28) {
            System.out.println(name + militaryCommissar);
        }
    }
}
