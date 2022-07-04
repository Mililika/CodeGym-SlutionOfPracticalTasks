package Levels.Level4.Lesson5;

/*
    TASK:
        Let's use a for loop to display a right triangle comprised of numeral eights with sides (legs) of 10 and 10.
        In other words, the first line should contain one 8, forming the left side. The second line should have two 8s, etc.

        Example screen output:
        8
        88
        888
        8888
        88888
        888888
        8888888
        88888888
        888888888
        8888888888
 */

public class Task01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
