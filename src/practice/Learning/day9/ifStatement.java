package practice.Learning.day9;

import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me number");
        int number = scanner.nextInt();

        if(number == 0){
            System.out.println(number);

        }

    }
}
