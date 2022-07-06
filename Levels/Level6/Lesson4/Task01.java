package Levels.Level6.Lesson4;

/*
    TASK:
        Before you is a program that displays information about a person. Unfortunately, it doesn't compile.
        Change the minimum required number of access modifiers in the Person class for the code to compile.
 */

public class Task01 {
    public static void main(String[] args) {
        Person person = new Person("John", "Dane");
        System.out.println("Dossier:");
        System.out.println("First name: " + person.getFirstName());
        System.out.println("Last name: " + person.getLastName());
        System.out.println("Full name: " + person.getFullName());
    }
}

class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
