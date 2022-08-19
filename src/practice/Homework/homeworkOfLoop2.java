package practice.Homework;

import java.util.Scanner;

public class homeworkOfLoop2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = 10;


        for (int i = num; i >= 1; i--) {
            int v1 = 1;
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }
        for (int i = 2; i <= num; i++) {
            int v1 = 1;
            System.out.print(v1 + " ");
            for (int j = 2; j <= i; j++) {
                v1++;
                System.out.print(v1 + " ");
            }
            System.out.println();


        }

    }
}