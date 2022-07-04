package Levels.Level2.Lesson4;

/*
    TASK:
        The main method displays four lines. Each of them are superb examples of abuse of capital letters.
        Modify the code so that all the letters in these strings are lowercase.
 */

public class Task06 {
    public static void main(String[] args) {
        String title = "Senior Lead Principal Software Engineer Data Architect";
        String degree = "In college, I Majored in Political Science and Minored in Religious Studies.";
        String career = "Experienced Team Leader with strong Organizational Skills and a Successful career in Management.";

        System.out.println("RESUME".toLowerCase());
        System.out.println(("TITLE: " + title).toLowerCase());
        System.out.println(("DEGREE: " + degree).toLowerCase());
        System.out.println(("CAREER: " + career).toLowerCase());
    }
}
