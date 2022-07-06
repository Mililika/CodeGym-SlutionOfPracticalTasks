package Levels.Level6.Lesson6;

/*
    TASK:
        Here you have in front of you a digital employee record. It contains the employee's name, position and salary.
        The name of the employee is unlikely to change, but his or her position and salary might.
        These changes are made using the setPosition() and setSalary() methods. Of course, they are not
        working correctly at present.

        Figure out the reason and fix the bugs. In doing this, neither the names of instance variables, nor the
        names of method parameters can be changed.
 */

public class Task03 {
    public String name = "Amigo";
    public String position = "Java developer";
    public int salary = 10_000;

//    public static void main(String[] args) {
//
//    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
