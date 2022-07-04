package Levels.Level5.Lesson3;

/*
    TASK:
        To complete this task, you need to:

        Read a number N from the keyboard.
        Read N integers and fill an array with them.
        Find the minimum number in the elements of the array and display in on the console.
 */

import java.util.Scanner;

public class Task02 {
    public static int[] array;

    public static void main(String[] args) {
        int min;
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = console.nextInt();
        }

        min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }

}
