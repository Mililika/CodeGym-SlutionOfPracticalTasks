package Levels.Level6.Lesson2;

/*
    TASK:
        It would be nice to have one method for solving all sorts of problems. You have the opportunity to write one:
        Create 9 more universalMethod() methods. In total, there should be 10 of them.

        Think of the parameters they should have.
 */

public class Task04 {
    public static void main(String[] args) {

    }

    public static void universalMethod(String name) {
        System.out.println("Hello, " + name);
    }

    public static void universalMethod(String name, String surname) {
        System.out.println("Hello, Mister" + name + " " + surname);
    }

    public static void universalMethod(String name, String surname, int age) {
        System.out.println("Age of Mister " + surname + " " + name + " is: " + age);
    }

    public static void universalMethod(String name, String surname, String address) {
        System.out.println("Mister " + surname + " " + name + " now lives at: " + address);
    }

    public static void universalMethod(String name, int telephone) {
        System.out.println(name + "'s telephone number: " + telephone);
    }

    public static void universalMethod(String product, int Id, boolean isOnStorage, int amount) {
        System.out.println(isOnStorage ? "Product name: " + product + " ID: " + Id + " is on storage in amount " +
                amount : "There are any product with name: " + product + " and ID:" + Id + " in storage");
    }

    public static void universalMethod(int Id, int number) {
        System.out.println("Item id: " + Id + " with number: " + number);
    }

    public static void universalMethod(String name, int Id, double height) {
        System.out.println("Height of Mister: " + name + " id: " + Id + " is: " + height);
    }

    public static void universalMethod(String name, String surname, int id, boolean isStudent) {
        System.out.println(isStudent ? name + " " + surname + " is Student, his number: " + id
                : name + " " + surname + " is not aStudent");
    }

    public static void universalMethod() {
        System.out.println("I make nothing :) Just exist");
    }
}
