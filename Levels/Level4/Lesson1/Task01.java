package Levels.Level4.Lesson1;

/*
    TASK:
        Using a while loop, print the quote variable on the screen one hundred times:
        "I'll never work for peanuts. Amigo"
 */

public class Task01 {
    public static void main(String[] args) {
        int i = 0;
        String quote = "I'll never work for peanuts. Amigo";

        while (i < 100) {
            System.out.println(quote);
            i++;
        }
    }
}
