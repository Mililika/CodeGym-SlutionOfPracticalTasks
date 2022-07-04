package Levels.Level5.Lesson3;

/*
    TASK:
        In this task, you need to:

        Read a number N from the keyboard.
        Read N integers and fill an array array with them.
        Find the maximum number among the elements of the array.
        Requirements:
 */

import java.util.Scanner;

public class Task03 {
    public static int[] array;

    public static void main(String[] args) {
        int max;

        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = console.nextInt();
        }

        max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
