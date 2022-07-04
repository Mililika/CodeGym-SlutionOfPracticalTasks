package Levels.Level2.Lesson4;

/*
    TASK:
        Set the hugeAmount variable equal to the number 100500.
        Use the bigAmount and greatAmount variables as well as string-to-number conversion.
        Use a single statement to declare and initialize hugeAmount.
 */

public class Task04 {
    public static void main(String[] args) {
        String bigAmount = "500";
        String greatAmount = "100000";
        int hugeAmount = Integer.parseInt(greatAmount) + Integer.parseInt(bigAmount); //write your code here
        System.out.println(hugeAmount);
    }
}
