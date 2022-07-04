package Levels.Level4.Lesson3;

/*
    TASK:
        The program must read integers from the keyboard until something else is entered,
        such as a string or a character. Display the maximum even number entered.
        If several numbers are entered, you must display any of them.
 */

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int temp, max = Integer.MIN_VALUE;
        boolean thereIsEven = false;

        if (!s.hasNextInt()) {
        } else {
            while (s.hasNextInt()) {
                temp = s.nextInt();
                if (temp % 2 == 0 && temp >= max) {
                    max = temp;
                    thereIsEven = true;
                }
            }
        }
        System.out.println(thereIsEven ? max : Integer.MIN_VALUE);
    }
}
