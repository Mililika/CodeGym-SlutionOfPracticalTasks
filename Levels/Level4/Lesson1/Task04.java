package Levels.Level4.Lesson1;

/*
    TASK:
        Using nested while loops (a loop within a loop), display a 5 (height) by 10 (width) rectangle
        filled with the letter 'Q'.

        QQQQQQQQQQ
        QQQQQQQQQQ
        QQQQQQQQQQ
        QQQQQQQQQQ
        QQQQQQQQQQ
 */

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        int h = 0;
        while (h < 5) {
            int w = 0;
            while (w < 10) {
                System.out.print("Q");
                w++;
            }
            System.out.println();
            h++;
        }
    }
}
