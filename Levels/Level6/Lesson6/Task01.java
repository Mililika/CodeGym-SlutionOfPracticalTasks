package Levels.Level6.Lesson6;

/*
    TASK:
        Take a look at what the program does. Add the final modifier to standard constants (variables with immutable values).
 */

public class Task01 {
    public static final double pi = 3.14;
    public static final double radius = 2.5;
    public static final double diameter = 5;

    public static void main(String[] args) {
        System.out.println("The area of the circle is: " + pi * radius * radius);
        System.out.println("The perimeter of the circle is: " + pi * diameter);
    }
}
