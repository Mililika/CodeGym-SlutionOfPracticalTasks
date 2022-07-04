package Levels.Level3.Lesson5;

/*
    TASK:
        This program is written using the ternary operator, but it's not clear what it does. We think that the code
        will become much clearer if we get rid of the ternary operator.
        Rewrite the program without using the ternary operator.
 */

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number < 5) {
            System.out.println("The number is less than 5");
        } else if (number > 5) {
            System.out.println("The number is greater than 5");
        } else {
            System.out.println("The number is equal to 5");
        }
    }
}
