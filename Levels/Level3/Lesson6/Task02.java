package Levels.Level3.Lesson6;

/*
    TASK:
        In the main method, write the code for a pairwise comparison by reference of the string1, string2 and string3
        strings and display a corresponding message after each comparison:
        "The references to the strings are the same" or "The references to the strings are different".

        The order of comparisons should be as follows:
        - string1 and string2
        - string1 and string3
        - string2 and string3
 */

public class Task02 {
    public static String string1 = "Amigo";
    public static String string2 = string1;
    public static String string3 = new String(string1);

    public static void main(String[] args) {
        String same = "The references to the strings are the same";
        String different = "The references to the strings are different";

        System.out.println(string1 == string2 ? same : different);
        System.out.println(string1 == string3 ? same : different);
        System.out.println(string2 == string3 ? same : different);
    }
}
