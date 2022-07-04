package Levels.Level4.Lesson4;

/*
    TASK:
        The main method reads 3 integers from the keyboard: start, end, and multiple.
        Update the program so that the screen displays the sum of multiples of multiple variable in the range from
        start (inclusive) to end (not inclusive).
        Use a for loop to do this.
        Hint: To move to the next iteration of the loop, use a continue statement.
 */

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        int sum = 0;

        for (int i = start; i < end; i++) {
            if (i % multiple == 0) {
                sum += i;
            } else {
                continue;
            }
        }
        System.out.println(sum);
    }
}
