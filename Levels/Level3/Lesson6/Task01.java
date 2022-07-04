package Levels.Level3.Lesson6;

/*
    TASK:
        Write a program that reads two strings from the keyboard and displays a message indicating whether
        the strings are the same or different.
 */

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine(), s2 = s.nextLine();

        System.out.println(s1.equals(s2) ? "The strings are the same" : "The strings are the different");
    }
}
