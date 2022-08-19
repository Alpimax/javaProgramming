package practice.Learning.day28;

import java.util.Arrays;
import java.util.Scanner;

public class homework28_2 {

    public static int sum(int[] a) {
        int total = 0;
        for (int each : a)
            total += each;

        return total;
    }

    public static int[] inputNumbers(int num) {
        Scanner input = new Scanner(System.in);
        int[] numbersArray = new int[num];
        System.out.println("Please enter"+num+" number");
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = input.nextInt();
        }
        return numbersArray;
    }


    public static void main(String[] args) {
        System.out.println();
        System.out.println(sum(inputNumbers(5)));

    }
}
