package practice.Learning.day28;

import java.util.Scanner;

public class homework28_7 {

    public static int minNumber(int numbers) {
        Scanner input = new Scanner(System.in);
        int[] numbersArray = new int[numbers];
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = input.nextInt();
        }
        System.out.println();
//
        int minNumber = numbersArray[0];

        for (int each : numbersArray) {
            if (minNumber > each) {
                minNumber = each;
            }
        }
        return minNumber;
    }

    public static void main(String[] args) {
        System.out.println(minNumber(5));
    }


}
