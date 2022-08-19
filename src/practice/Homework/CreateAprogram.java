package practice.Homework;

import java.util.Scanner;

public class CreateAprogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("First number is: " + num1 +"\nSecond number is: "+ num2);

        //Create a program that will ask the user to enter a price and quantity
        // and then calculate the revenue. revenue = price × quantity.
        int price = scanner.nextInt();
        int quantity = scanner.nextInt();
        int revenue = price * quantity;

        System.out.println("One Bedroom Selected\nStarting Price: 1100");

        System.out.println("");
        System.out.println();
    }
}


