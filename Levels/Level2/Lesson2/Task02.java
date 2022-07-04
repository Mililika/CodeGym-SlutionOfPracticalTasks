package Levels.Level2.Lesson2;

/*
    TASK:
        The number variable contains a number.
        Set the lastDigit variable equal to the last digit of this number.
        To perform the calculation, use the number variable and the modulo operator.
        Use a single statement to declare and initialize lastDigit.
 */

public class Task02 {
    public static void main(String[] args) {
        int number = 546;
        int lastDigit = number % 10; //write your code here
        System.out.println(lastDigit);
    }
}
