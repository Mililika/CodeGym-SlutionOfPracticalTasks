package Levels.Level4.Lesson4;

/*
    TASK:
        Write a program that uses a for loop to display the even numbers in the range from 1 to 15.
        Each value should be displayed on a new line.
 */

public class Task01 {
    public static void main(String[] args) {
        for (int i = 1; i < 15; i++){
            if (i % 2 == 0) System.out.println(i);
        }
    }
}
