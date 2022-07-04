package Levels.Level4.Lesson2;

/*
    TASK:
        Display the sum of numbers from 1 to 100 inclusive that are not multiples of 3. Use a while loop to do this.

        Hint: To move to the next number in the loop, use a continue statement.
 */

public class Task02 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i <= 100) {
            if (i % 3 == 0) {
                i++;
                continue;
            }
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
