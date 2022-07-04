package Levels.Level3.Lesson6;

/*
    TASK:
        Amigo created a secret word to access super secret information, but his keyboard broke and he is no longer able
        to type uppercase letters. Write a program that will perform a case-insensitive comparison of the input string
        with the string in the secret variable.
        If the entered string is equal to the string in the secret variable, the program displays "Access granted".
        Otherwise, it displays "Access denied".
 */

import java.util.Scanner;

public class Task03 {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        System.out.println(secret.equalsIgnoreCase(password) ? "Access granted" : "Access denied");
    }
}
