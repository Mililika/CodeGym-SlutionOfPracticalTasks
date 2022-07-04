package Levels.Level4.Lesson3;

/*
    TASK:
        The program must read integers from the keyboard until something else is entered, such as a string or
        a character. Display the minimum number entered. If several numbers are entered, you must display any of them.
 */

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int temp, min = Integer.MAX_VALUE;

        if (!s.hasNextInt()) {
            System.out.println(Integer.MAX_VALUE);
        } else {
            while (s.hasNextInt()) {
                temp = s.nextInt();
                if (temp <= min) {
                    min = temp;
                }
            }
            System.out.println(min);
        }
    }
}
