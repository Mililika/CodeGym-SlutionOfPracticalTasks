package Levels.Level4.Lesson7;

/*
    TASK:
        Let's share a case of icy cola at the office. To do this, we will write a program with these requirements:

        You need to read two integers from the keyboard. The first number is the number of cola cans in a case.
        The second is the number of people at the office.
        Display the result of dividing the first number by the second.
        The result should be a real number.
 */

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int colaCans = s.nextInt();
        int peopleAtOffice = s.nextInt();

        System.out.println(colaCans * 1.0 / peopleAtOffice);

    }
}
