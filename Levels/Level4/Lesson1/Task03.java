package Levels.Level4.Lesson1;

/*
    TASK:
        Let's write a program that reads integers from the keyboard and calculates their sum until the user enters
        the word "ENTER".
        Display the sum and terminate the program.
 */

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        boolean isEnterTyped = false;
        int sum = 0;
        Scanner s = new Scanner(System.in);

        while (!isEnterTyped) {
            String input = s.nextLine();
            if (input.equals("ENTER")) {
                isEnterTyped = true;
            } else {
                sum += Integer.parseInt(input);
            }
        }
        System.out.println(sum);
    }
}
