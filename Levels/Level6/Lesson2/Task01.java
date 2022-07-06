package Levels.Level6.Lesson2;

/*
    TASK:
        Rename the parameters of the printPersonInfo() method:

        firstName to name;
        lastName to surname;
        favoriteDish to meal;
        without changing the program's functionality.
        Leave the variable names in the main() method unchanged.
 */

public class Task01 {
    public static void main(String[] args) {
        String firstName = "Olivia";
        String lastName = "Klinger";
        String favoriteDish = "Spaghetti";
        printPersonInfo(firstName, lastName, favoriteDish);
    }

    public static void printPersonInfo(String name, String surname, String meal) {
        System.out.println("Short dossier:");
        System.out.println("First name: " + name);
        System.out.println("Last name: " + surname);
        System.out.println("Favorite dish: " + meal);
    }
}
