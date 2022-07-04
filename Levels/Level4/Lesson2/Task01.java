package Levels.Level4.Lesson2;

/*
    TASK:
        We enter data from the keyboard and immediately display it on the screen until the word "enough" is entered.
        Do not output the word "enough".
        To do this, you need to use an infinite loop (while(true)).

        Hint: To terminate an infinite loop, use a break statement.
 */

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while(true) {
            String line = s.nextLine();
            if (line.equals("enough")) break;
            System.out.println(line);
        }
    }
}
