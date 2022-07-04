package Levels.Level5.Lesson4;

/*
    TASK:
        In this task, you need to:

        Read 6 strings and fill the strings array with them.
        Remove duplicate strings from the strings array, replacing them with null (null, not the string "null").
 */

import java.util.Scanner;

public class Task01 {
    public static String[] strings;

    public static void main(String[] args) {
        boolean isTherePair;
        Scanner console = new Scanner(System.in);
        strings = new String[6];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = console.nextLine();
        }

        for (int i = 0; i < strings.length - 1; i++) {
            isTherePair = false;
            if (strings[i] == null) continue;
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[j] == null) continue;
                if (strings[i].equals(strings[j])) {
                    strings[j] = null;
                    isTherePair = true;
                }
            }
            if (isTherePair) {
                strings[i] = null;
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
