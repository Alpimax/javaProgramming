package practice.Udemy;

import java.util.Scanner;

public class TheIfElseInstruction {
    public static void main(String[] args) {
        Scanner reader  = new Scanner(System.in);
        System.out.println("Please enter your age :");
        int insteredNumber = reader.nextInt();
        if ( insteredNumber > 30){
            System.out.println("You are an adult!");
        }
        System.out.println("The program is over.");
    }
}
