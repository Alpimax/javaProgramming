package practice.Homework;

import java.util.Scanner;

public class homeworkOfLoop5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 7;


        for (int i = num; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
