package Levels.Level4.Lesson8;

/*
    TASK:
        Scientists express wind speed in m/s, but that figure doesn't always adequately convey its strength to laypersons.
        For the untrained, it's easier to understand it when measured in km/h, like a car, bicycle or other form of transportation.
        So let's convert speed values from m/s to km/h.
        To get the initial wind speed value in m/s, you need to read it as an integer from the keyboard.
        The ratio for converting speeds is: 1 m/s = 3.6 km/h.
        Display wind speed in km/h rounded to the nearest integer.
        For rounding, use the Math.round() method.
 */

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int speedMS = s.nextInt();

        System.out.println(Math.round(speedMS * 3.6));
    }
}
