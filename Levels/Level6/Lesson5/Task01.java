package Levels.Level6.Lesson5;

/*
    TASK:
        The printSqrt(int[] array) method should print the square root of each element in the past array.
        But this isn't happening due to conflicting variable names. Correct the variable names so that the code compiles.
        The program should display a suitable line on the console for each element of the array.
 */

public class Task01 {
    public static void main(String[] args) {
        int[] array = {15, 64, 9, 51, 42};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        String textSquareRoot = "The square root of ";
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double elementSqrt = Math.sqrt(element);
            System.out.println(textSquareRoot + element + " is " + elementSqrt);
        }
    }
}
