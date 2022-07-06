package Levels.Level6.Lesson5;

/*
    TASK:
        The program should display the population of the largest cities in the world and compare them with Tokyo,
        the most populous city of all.
        But the program's algorithm is slightly broken. To correct the error, you need to make it so the line that
        displays information about the world's largest city uses static class variables instead of local method arguments.

        When the program is working correctly, the output should be as follows:
        The population of Jakarta is 25.3 million.
        But in the most populous city, Tokyo, the population is 34.5 million.
        The population of Seoul is 25.2 million.
        But in the most populous city, Tokyo, the population is 34.5 million.
        The population of Delhi is 23.1 million.
        But in the most populous city, Tokyo, the population is 34.5 million.
        The population of New York City is 21.6 million.
        But in the most populous city, Tokyo, the population is 34.5 million.
 */

public class Task02 {
    public static String city = "Tokyo";
    public static double population = 34.5;

    public static void main(String[] args) {
        printCityPopulation("Jakarta", 25.3);
        printCityPopulation("Seoul", 25.2);
        printCityPopulation("Delhi", 23.1);
        printCityPopulation("New York City", 21.6);
    }

    public static void printCityPopulation(String city, double population) {
        System.out.println("The population of " + city + " is " + population + " million.");
        System.out.println("But in the most populous city, " + Task02.city + ", the population is " + Task02.population + " million.");
    }
}
