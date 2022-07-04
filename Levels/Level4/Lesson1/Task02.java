package Levels.Level4.Lesson1;

/*
    TASK:
        Read in a name from the keyboard and then, using a while loop, display <name> loves me (the text variable)
        10 times.
        Each instance of the phrase should be on a new line.
        Example of the screen output for the name "Regina":
 */

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        int i = 0;
        String text = " loves me.";

        Scanner s = new Scanner(System.in);
        String name = s.nextLine();

        while (i < 10) {
            System.out.println(name + text);
            i++;
        }
    }
}
