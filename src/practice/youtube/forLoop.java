package practice.youtube;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        // for loop = executes a block of code  a limited amount of times
        // for(int i = 1; i >= 0 ; i--){
        //   System.out.println(i);
        // nested loops = a loop inside of a loop
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a rows number :");
        int row = scanner.nextInt();
        System.out.println("Please enter a columns number :");
        int column = scanner.nextInt();
        System.out.println("Please enter a symbols number :");
        String symbol = scanner.next();

        for (int r = 1; r <= row; r++) {
            System.out.println();
            for (int c = 1; c <= column; c++){
                System.out.print(symbol);
            }
        }
    }
}