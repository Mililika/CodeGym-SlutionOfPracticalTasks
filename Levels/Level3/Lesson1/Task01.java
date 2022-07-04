package Levels.Level3.Lesson1;

/*
    TASK:
        Use the keyboard to enter the outside temperature.
        If the temperature is less than 0, display "It's cold outside". Otherwise, display "It's warm outside".
 */

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        String cold = "It's cold outside";
        String warm = "It's warm outside";

        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();

        if (temperature < 0) {
            System.out.println(cold);
        } else {
            System.out.println(warm);
        }
    }
}
