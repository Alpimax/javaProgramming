package practice.Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }
        }
        ArrayList<Integer> integers;
        integers = new ArrayList<>();
        ArrayList<Integer> number = new ArrayList<>();

    }
}
