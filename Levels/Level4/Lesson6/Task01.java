package Levels.Level4.Lesson6;

/*
    TASK:
        In this task, you need to:

        Use the keyboard to read a string and a number (number variable) that is greater than 0 and less than 5.
        Display the string number times using a do-while loop. Display each value on a new line.
        If the value read in for the number variable is less than or equal to 0 or greater than or equal to 5,
        then the entered string must be displayed once.
 */

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int number = scanner.nextInt(), i = 0;

        do {
            System.out.println(str);
            if (number >= 5 || number <= 0) break;
            i++;
        } while (i < number);
    }
}
