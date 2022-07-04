package Levels.Level5.Lesson6;

/*
    TASK:
        A two-dimensional array is an array of arrays. That is, an array where each cell holds a reference to an array.
        But it is much easier to think of it as a table that has a number of rows (first dimension) and a number of
        columns (second dimension).
        In this task, we will create such an array.

        Implement the main(String[]) method, which:

        Reads from the console a number R — the number of rows in the array. The number must be greater than 0.
        Then it reads R numbers from the console (any numbers greater than 0).
        Then it initializes the two-dimensional multiArray array using:
        the number of rows R;
        row arrays whose size corresponds to the numbers entered in step 2 (in the order they are entered).
        Example:

        The number 5 is entered.
        The numbers 1, 7, 5, 9, and 3 are entered.
        And we get an array like this:
        []
        [][][][][][][]
        [][][][][]
        [][][][][][][][][]
        [][][]
 */

import java.util.Scanner;

public class Task02 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int rowsNumber = console.nextInt();
        multiArray = new int[rowsNumber][];

        for (int i = 0; i < multiArray.length; i++) {
            multiArray[i] = new int[console.nextInt()];
        }
    }
}
