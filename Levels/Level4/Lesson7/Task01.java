package Levels.Level4.Lesson7;

/*
    TASK:
        To solve this task, you need to:

        Read a positive radius integer from the keyboard. This represents the radius of a circle.
        Display the area of the circle, calculated using this formula: Area = pi * radius * radius.
        The result should be an integer (int type). To do this, you need to cast the multiplication result to an
        int (discard the fractional part, rounding down to an integer).
        Use 3.14 as the value for pi.

        Clarification:
        If a negative number was entered, then don't display anything on the screen.
 */

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int radius = s.nextInt();

        System.out.println((int)(3.14 * radius * radius));
    }
}
