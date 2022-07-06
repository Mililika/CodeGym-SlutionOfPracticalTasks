package Levels.Level6.Lesson4;

/*
    TASK:
        This program should display information about the created array. But due to misplaced static modifiers,
        it won't compile.
        Correct these mistakes. Add the static modifier where it is needed.
 */

public class Task02 {
    public static void main(String[] args) {
        int[] array = {123, 7, -14, 67, 16, 98, 75, 576};
        System.out.println("In the array: ");
        printArray(array);
        System.out.println("Minimum: " + getMinValue(array));
        System.out.println("Maximum: " + getMaxValue(array));

    }

    public static int getMaxValue(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int getMinValue(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
