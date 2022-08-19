package practice.Homework;

import java.util.Scanner;

public class homeworkMethod {

//    create a method that can print odd numbers between 1-100 in the
//    same line saperated by space
//
//    create a method that can print even numbers between 1-100 in the
//    same line saperated by space



    public static void oddNumber(int guess) {
        for (int i = 1; i <= guess; i++) {
            if (i % 2 != 0) // (i %2 == 1)
                System.out.print(i+ " ");

        }

    }

    public static void even(int guess) {

        for (int i = 1; i <= guess; i++) {
            if (i % 2 == 0)
                System.out.print(i+ " ");

        }
    }
    public  static void space(){
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        oddNumber(number);
        space();
        even(number);
        space();
        even(number);
        space();
        even(number);
        space();
        even(number);
        space();
        even(number);



    }
}