package practice.Homework;

import java.util.Scanner;

public class homeworkOfLoop7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 7;


        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
