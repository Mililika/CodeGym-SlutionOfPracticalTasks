package Levels.Level3.Lesson5;

/*
    TASK:
        Write a program that reads two real numbers from the keyboard and reports whether these
        numbers are equal to within one one-millionth.
 */

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double firstNum = s.nextDouble();
        double secondNum = s.nextDouble();

        if (Math.abs(firstNum - secondNum) < 0.000001) {
            System.out.println("The numbers are equal");
        } else {
            System.out.println("The numbers are not equal");
        }
    }
}
