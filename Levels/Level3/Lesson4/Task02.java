package Levels.Level3.Lesson4;

/*
    TASK:
        Let's write a program that will read an age from the keyboard. If the age is in the range from 20 to 60
        (inclusive), then don't display anything. Otherwise, display the phrase "You don't have to work".
        You can (and must!) do this with only one if statement (without an else block).

        Hint: use the || (OR) boolean operator.
 */

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 20 || age > 60) {
            System.out.println("You don't have to work");
        }
    }
}
