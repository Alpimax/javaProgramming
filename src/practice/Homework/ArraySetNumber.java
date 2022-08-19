package practice.Homework;

import java.util.Scanner;

public class ArraySetNumber {
    public static void main(String[] args) {
        String[] numbers = {"zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
                "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen" };
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int inputNumber = input.nextInt();

        if (inputNumber >= 0 && inputNumber < 16) {
            System.out.println(numbers[inputNumber]);
        } else
            System.out.println("Invalid number!!!");

    }
}