package Levels.Level4.Lesson1;

/*
    TASK:
        Using nested while loops (a loop within a loop), display an unfilled rectangle (just an outline)
        that is 10 (height) by 20 (width) and made from the letter 'B'.
        The unfilled part consists of spaces.

        BBBBBBBBBBBBBBBBBBBB
        B                  B
        B                  B
        B                  B
        B                  B
        B                  B
        B                  B
        B                  B
        B                  B
        BBBBBBBBBBBBBBBBBBBB
 */

public class Task05 {
    public static void main(String[] args) {
        int h = 0;

        while (h < 10) {
            int w = 0;
            if (h == 0 || h == 9) {
                while (w < 20) {
                    System.out.print("B");
                    w++;
                }
            } else {
                while (w < 20) {
                    if (w == 0 || w == 19) {
                        System.out.print("B");
                    } else {
                        System.out.print(" ");
                    }
                    w++;
                }
            }
            System.out.println();
            h++;
        }
    }
}
