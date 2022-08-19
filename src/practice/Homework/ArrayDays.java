package practice.Homework;

import java.util.Scanner;

public class ArrayDays {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        System.out.println("Enter a number and I will print the number as a word of day.");
        Scanner input = new Scanner(System.in);
        int numberOfDay = input.nextInt();

        System.out.println("You got number "+ numberOfDay+" which is mean "+ days[numberOfDay -1]);
    }
}
