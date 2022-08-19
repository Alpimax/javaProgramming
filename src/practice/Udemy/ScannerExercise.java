package practice.Udemy;

import java.util.Scanner;

public class ScannerExercise {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Scanner readerNumber = new Scanner(System.in);
        System.out.println("What profession do you want to have the next year?");
        String insertedText = reader.nextLine();
        System.out.println("Keep up the good work and next year you will be a " + insertedText);
        System.out.println();
        System.out.println("Welcome to the system. How old are you?");
        int insertedNumber = readerNumber.nextInt();
        System.out.println("Oh I see. You're " + insertedNumber + " years old.");
        System.out.println();
        System.out.println("M or F should be entered in the console");
        String insertedAge = reader.nextLine();
        System.out.println("You picked " + insertedAge);
        System.out.println();
        System.out.println("Could you give me a number");
        int gave1 = readerNumber.nextInt();
        System.out.println("Could you give me a other number");
        int gave2 = readerNumber.nextInt();



    }
}
