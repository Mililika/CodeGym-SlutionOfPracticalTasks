package Levels.Level5.Lesson5;

/*
    TASK:
        Initialize the MULTIPLICATION_TABLE array as a new int[10][10], fill it with a multiplication table, and then
        display it on the console in the following form:

        1 2 3 4 …
        2 4 6 8 …
        3 6 9 12 …
        4 8 12 16 …
        …
 */

public class Task01 {
    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];

        for (int j = 0; j < MULTIPLICATION_TABLE.length; j++) {
            MULTIPLICATION_TABLE[0][j] = j + 1;
        }

        for (int i = 0; i < MULTIPLICATION_TABLE.length - 1; i++) {
            for (int j = 0; j < MULTIPLICATION_TABLE.length; j++) {
                MULTIPLICATION_TABLE[i + 1][j] = MULTIPLICATION_TABLE[i][j] + MULTIPLICATION_TABLE[0][j];
            }
        }

        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
            for (int j = 0; j < MULTIPLICATION_TABLE.length; j++) {
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            }
            System.out.println();
        }
    }
}
