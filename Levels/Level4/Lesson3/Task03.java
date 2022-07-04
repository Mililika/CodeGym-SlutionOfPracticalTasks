package Levels.Level4.Lesson3;

/*
    TASK:
        Read integers from the keyboard until something else is entered, such as a string or a character.
        At least two numbers must be entered. If less than two integers are entered, then terminate the program with an
        error. You don't need to handle this situation.
        Display the second-smallest integer entered from the keyboard. If several such numbers are entered,
        you must display any of them. There may also be several minimum numbers.
 */

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt(), secondNum = scanner.nextInt(), firstMin, secondMin, nextInt;

        if (firstNum <= secondNum) {
            firstMin = firstNum;
            secondMin = secondNum;
        } else {
            firstMin = secondNum;
            secondMin = firstNum;
        }


        while (scanner.hasNextInt()) {
            nextInt = scanner.nextInt();

            if (firstMin == secondMin) {
                if (firstMin < nextInt) {
                    secondMin = nextInt;
                } else {
                    firstMin = nextInt;
                }
                continue;
            }

            if (nextInt < firstMin) {
                secondMin = firstMin;
                firstMin = nextInt;
            } else if (nextInt > firstMin && nextInt < secondMin) {
                secondMin = nextInt;
            }
        }
        System.out.println(secondMin);
    }
}
