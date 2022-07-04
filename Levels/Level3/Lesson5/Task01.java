package Levels.Level3.Lesson5;

/*
    TASK:
        We have a program that reads two numbers from the keyboard and displays the largest of them. If the numbers are
        the same, then display either one.
        Rewrite the program using the ternary operator without changing its functionality.
 */

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();

        System.out.println(numberA > numberB ? numberA : numberB);
    }
}
