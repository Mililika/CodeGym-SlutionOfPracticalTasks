package Levels.Level2.Lesson5;

/*
    TASK:
        Read three lines from the keyboard.
        And then:

        Display the third line unchanged.
        Display the second line after first converting it to uppercase.
        Display the first line after first converting it to lowercase.
 */

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String firstLine = s.nextLine();
        String secondLine = s.nextLine();
        String thirdLine = s.nextLine();

        System.out.println(thirdLine);
        System.out.println(secondLine.toUpperCase());
        System.out.println(firstLine.toLowerCase());
    }
}
