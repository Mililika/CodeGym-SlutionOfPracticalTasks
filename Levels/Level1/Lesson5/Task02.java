package Levels.Level1.Lesson5;

/*
    TASK:
        Uncomment one line so that the program displays the numbers 12 and 2 (first 12, and then 2).
*/

public class Task02 {
    public static void main(String[] args) {
        int x = 2;
        int y = 12;

        // y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }
}
