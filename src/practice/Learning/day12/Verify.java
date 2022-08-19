package practice.Learning.day12;

import java.util.Scanner;

public class Verify {
    public static void main(String[] args) {
        int systemPin = 1234;
        int systemSsn = 1111;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your pincode:");
        int inputPin = input.nextInt();
        System.out.println("\nPlease enter your last 4 digits of SSN");
        int inputSsn = input.nextInt();

        if (systemPin == inputPin && systemSsn == inputSsn) {
            System.out.println("Authentication successful");
        } else {
            if (systemPin != inputPin) {
                System.out.println("Pin Code is incorrect");
            }
            if (systemSsn != systemSsn) {
                System.out.println("last 4 SSN numbers are incorrect");
            }
        }


    }
}
