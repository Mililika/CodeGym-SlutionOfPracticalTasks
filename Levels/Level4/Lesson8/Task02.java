package Levels.Level4.Lesson8;

/*
    TASK:
        The main() method has a double glass variable equal to 0.5, which symbolizes a half-filled glass.
        For the pessimist, it is half empty. For the optimist, it is half full.
        You need to read a boolean from the keyboard using the nextBoolean() method on a Scanner object.
        Depending on the input data, round the glass variable: down (to 0) if we're dealing with a pessimist (false)
        or up (to 1) if we're dealing with an optimist (true).
        Display the result on the screen.
 */

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double glass = 0.5;

        boolean isOptimist = s.nextBoolean();
        System.out.println(isOptimist ? (int)Math.ceil(glass) : (int)Math.floor(glass));
    }
}
