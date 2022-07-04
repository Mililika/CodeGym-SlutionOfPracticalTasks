package Levels.Level3.Lesson4;

/*
    TASK:
        Enter two integers from the keyboard that will be the coordinates of a point. The first number is the x coordinate,
        and the second is the y coordinate). The point must not lie on the X or Y axes.
        Display the number of the quadrant that contains the given point.

        Hint:
        Point (x, y) belongs to a quadrant if the following conditions are true:

        for the first quadrant — x > 0 and y > 0;
        for the second quadrant — x < 0 and y > 0;
        for the third quadrant — x < 0 and y < 0;
        for the fourth quadrant — x > 0 and y < 0.
 */

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println(1);
        } else if (x < 0 && y > 0) {
            System.out.println(2);
        } else if (x < 0 && y < 0) {
            System.out.println(3);
        } else if (x > 0 && y < 0) {
            System.out.println(4);
        }
    }
}
