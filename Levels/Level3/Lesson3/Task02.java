package Levels.Level3.Lesson3;

/*
    TASK:
        Use the keyboard to enter three integers. Determine whether there is at least one pair of equal numbers among
        them. If such a pair exists, display the numbers separated by spaces. If all three numbers are equal,
        then display all three.
 */

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();

        if (firstNum == secondNum) {
            if (firstNum == thirdNum) {
                System.out.println(firstNum + " " + secondNum + " " + thirdNum);
            } else {
                System.out.println(firstNum + " " + secondNum);
            }
        } else if (firstNum == thirdNum) {
            System.out.println(firstNum + " " + thirdNum);
        } else if (secondNum == thirdNum) {
            System.out.println(secondNum + " " + thirdNum);
        }
    }
}
