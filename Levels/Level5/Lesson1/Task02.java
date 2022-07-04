package Levels.Level5.Lesson1;

/*
    TASK:
        In the main(String[]) method, you need to fill the strings array with values.
        If the array index is even, then assign the value "Even" (zero is an even number), otherwise assign "Odd".
        The screen output is not tested.
 */

public class Task02 {
    public static final String ODD = "Odd";
    public static final String EVEN = "Even";
    public static String[] strings = new String[5];

    public static void main(String[] args) {
        strings[0] = EVEN;
        strings[1] = ODD;
        strings[2] = EVEN;
        strings[3] = ODD;
        strings[4] = EVEN;

        System.out.print("index = 0");
        System.out.println(" value = " + strings[0]);
        System.out.print("index = 1");
        System.out.println(" value = " + strings[1]);
        System.out.print("index = 2");
        System.out.println(" value = " + strings[2]);
        System.out.print("index = 3");
        System.out.println(" value = " + strings[3]);
        System.out.print("index = 4");
        System.out.println(" value = " + strings[4]);
    }
}
