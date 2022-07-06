package Levels.Level6.Lesson2;

/*
    TASK:
        Let's write a utility for working with arrays. The main functionality is ready: the printArray() method displays
        all the elements of the array on the console.
        What is left for you is just a trifle: implement the reverseArray() method. It should reverse the order of
        the elements in the array.
        The method should only work with arrays of integer values (int[]).
 */

public class Task03 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int temp;

        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
