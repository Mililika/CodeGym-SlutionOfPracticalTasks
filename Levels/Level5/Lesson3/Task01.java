package Levels.Level5.Lesson3;

/*
    TASK:
        You need to write a program that:

        Reads an integer N from the console.
        If the number N is greater than 0, then the program reads an additional N integers.
        Print the numbers to the console. If N is odd, display them in the order in which there were entered. Otherwise, display them in reverse order.
        Display each number on a new line. Do not display the number N.
 */

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
        }

        if (n % 2 == 0) {
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.println(array[i]);
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }
}
