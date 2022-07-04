package Levels.Level2.Lesson4;

/*
    TASK:
        The main method displays the values of three strings.
        Modify the code so that it displays the length each string instead of the value of each string.
 */

public class Task05 {
    public static void main(String[] args) {
        String emptyString = "";
        System.out.println(emptyString.length());
        System.out.println("Gomu Gomu no Bazooka!".length());
        System.out.println((emptyString + 2 + 2 + "22").length());
    }
}
