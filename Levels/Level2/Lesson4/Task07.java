package Levels.Level2.Lesson4;

/*
    TASK:
        The main method displays three strings.
        Modify the code so that all the letters in these strings are capitalized.
 */

public class Task07 {
    public static void main(String[] args) {
        String caps = "if I type in uppercase, ";
        String usa = "usa";

        System.out.println(usa.toUpperCase());
        System.out.println("Winnie the Pooh".toUpperCase());
        System.out.println((caps + "they know I mean business").toUpperCase());
    }
}
