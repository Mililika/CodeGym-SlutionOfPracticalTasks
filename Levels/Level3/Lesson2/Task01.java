package Levels.Level3.Lesson2;

/*
    TASK:
        There is a program that takes an age as input and determines whether you need to head to school or to college.
        But it doesn't work correctly. For example, a five-year-old child is sent off to college! It isn't difficult to
        fix the program: just put curly braces in the right place.
 */

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 18) {
            if (age >= 6) {
                System.out.println("Off to school with you, my child");
            }
        } else
            System.out.println("Your college class starts soon");
    }
}
