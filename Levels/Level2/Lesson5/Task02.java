package Levels.Level2.Lesson5;

/*
    TASK:
        Use the keyboard to read three integers.
        Display their arithmetic mean.
 */

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();

        System.out.println((firstNum + secondNum + thirdNum) / 3);
    }
}
