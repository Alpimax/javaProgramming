package practice.Homework;

import java.util.Scanner;

public class ChirstmasTree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num =10;



        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= num-i; j++)
                System.out.print(" ");

            for (int j = 1; j <= 2*i-1; j++)
                System.out.print("*");


            System.out.println();
        }
    }
}
