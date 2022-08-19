package practice.Homework;

import java.util.Scanner;

public class ifStatementHomework2 {
    public static void main(String[] args) {
        //Create three number variables
        //Find and print which number is bigger between the three
        //
        //	ex:
        //		50
        //		45
        //		100
        //
        //		output:
        //		100 is the biggest
        //
        int number1, number2, number3, biggest;

        Scanner number = new Scanner(System.in);
        System.out.println("Could you give me three number? I will tell you which one biggest one .");
        System.out.println("Number one please : ");
        number1 = number.nextInt();
        System.out.println("Thank you! You gave me " + number1 + "\nCould I get another one. ");
        number2 = number.nextInt();
        System.out.println("Thank you! I got your numbers.\nAnother one please.");
        number3 = number.nextInt();
        biggest = number1;
        if (biggest < number2) {
            biggest = number2;
            System.out.println(biggest + " is the biggest");
        } else if (biggest < number3) {
            biggest = number3;
            System.out.println(biggest + " is the biggest");
        } else {
            System.out.println(biggest + " is the biggest");
        }

    }
}
