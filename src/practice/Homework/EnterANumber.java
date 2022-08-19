package practice.Homework;

import java.util.Scanner;

public class EnterANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Could you give me a number :");
        int num = scanner.nextInt();

        boolean divisible2 = num % 2 == 0;
        boolean divisible3 = num % 3 == 0;
        boolean divisible5 = num % 5 == 0;
        System.out.println("Your number " + num + " is divisible by 2 : "+ divisible2 );
        System.out.println("Your number " + num + " is divisible by 2 : "+ divisible3 );
        System.out.println("Your number " + num + " is divisible by 2 : "+ divisible5 );
    }
}
