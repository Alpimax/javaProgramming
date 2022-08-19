package practice.Homework;

import java.util.Scanner;

public class ChirstmasEmtyTree {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 10;



        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= num - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= 2 * i - 1; j++)
                if (i == num)
                    System.out.print("*");
                else if (j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");


            System.out.println();
        }
    }
}
