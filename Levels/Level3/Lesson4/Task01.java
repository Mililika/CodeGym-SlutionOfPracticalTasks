package Levels.Level3.Lesson4;

/*
    TASK:
        Let's write a program that will calculate the possibility of the existence of a triangle based on the lengths
        of sides.
        To do this, you need to:
        Enter three numbers from the keyboard — the lengths of the sides of the assumed triangle.
        Use the lengths of the sides to determine whether a triangle is possible.
        Depending on the result, display "It's a triangle" or "It's not a triangle".
        To make this determination, you need to compare each side with the sum of the other two sides.
        That is, you will need to perform three comparisons:

        If each comparison indicates that the side is less than the sum of the other two sides, then a triangle
        with these sides does exist.
        If even one comparison indicates that the side is greater than or equal to the sum of the other two sides, then a
        triangle with these sides does not exist.
 */

import java.util.Scanner;

public class Task01 {
    private static final String TRIANGLE_EXISTS = "It's a triangle";
    private static final String TRIANGLE_DOES_NOT_EXIST = "It's not a triangle";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();

        if (firstNum < secondNum + thirdNum && secondNum < firstNum + thirdNum && thirdNum < firstNum + secondNum) {
            System.out.println(TRIANGLE_EXISTS);
        } else {
            System.out.println(TRIANGLE_DOES_NOT_EXIST);
        }
    }
}
