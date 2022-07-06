package Levels.Level6.Lesson3;

/*
    TASK:
        This is the signIn() method that greets website users. Currently, it greets all users, but it should only
        greet registered users. All unregistered users have the name "user".
        Add username validation at the beginning of the signIn() method.
        If the name is "user", use the return keyword to abort execution of the method.
 */

public class Task01 {
    public static void main(String[] args) {

    }

    public static void signIn(String username) {
        if (username.equals("user")) return;

        System.out.println("Welcome, " + username);
        System.out.println("We've really missed you, " + username);
    }
}
