package practice.Homework;

import java.util.Scanner;

public class homeworkOfLoop {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int num = 7;

        for (int i = 1; i <= num; i++) {

            System.out.print(i+" ");
            for (int j = 2; j <= i; j++) {

                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}