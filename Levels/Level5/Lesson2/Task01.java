package Levels.Level5.Lesson2;

/*
    TASK:
        Implement the main(String[]) method, which needs to copy the contents of the firstArray and secondArray arrays
        into one resultArray array.
        The firstArray array must be at the beginning of the new resultArray array, followed by the secondArray array.
 */

public class Task01 {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        int n = 0;
        resultArray = new int[firstArray.length + secondArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            resultArray[i] = firstArray[i];
        }

        for (int i = firstArray.length; i < resultArray.length; i++) {
            resultArray[i] = secondArray[n];
            n++;
        }

        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}
