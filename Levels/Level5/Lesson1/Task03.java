package Levels.Level5.Lesson1;

/*
    TASK:
        Implement the main(String[]) method so that it reverses the sign of an element of the array array if
        the element is even.
 */

public class Task03 {
    public static int[] array = new int[]{-1, 2, 3, -4, -5};

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (array[i] % 2 == 0) {
                array[i] = -1 * array[i];
            }
        }

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }
}
