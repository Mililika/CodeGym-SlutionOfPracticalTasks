package Levels.Level2.Lesson4;

/*
    TASK:
        Fill space with emptiness... or vice versa.
        Use emptiness, strings consisting of single spaces, and string concatenation to set the fullness variable to
        the string "emptiness emptiness emptiness".
 */

public class Task02 {
    public static void main(String[] args) {
        String emptiness = "emptiness";
        String fullness = emptiness + " " + emptiness + " " + emptiness; //write your code here
        System.out.println(fullness);
    }
}
