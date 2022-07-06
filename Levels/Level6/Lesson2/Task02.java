package Levels.Level6.Lesson2;

/*
    TASK:
        The createCrew() method displays the positions and names of the crew members on a spacecraft.
        To avoid any confusion inside the method, change the names of the createCrew() method's parameters to
        match the names of the variables passed to the method:

        name1 to navigator
        name2 to pilot
        name3 in secondPilot
        name4 to flightEngineer
        And there should be no change to the execution of the program.
 */

public class Task02 {
    public static void main(String[] args) {
        String navigator = "John";
        String pilot = "Paul";
        String secondPilot = "George";
        String flightEngineer = "Ringo";
        createCrew(navigator, pilot, secondPilot, flightEngineer);
    }

    public static void createCrew(String navigator, String pilot, String secondPilot, String flightEngineer) {
        System.out.println("The four who are to conquer the cosmos:");
        System.out.println("Navigator: " + navigator);
        System.out.println("Pilot: " + pilot);
        System.out.println("Second pilot: " + secondPilot);
        System.out.println("Flight engineer:" + flightEngineer);
    }
}
