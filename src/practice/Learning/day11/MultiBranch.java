package practice.Learning.day11;

import java.util.Scanner;

public class MultiBranch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number from 1-5 to select your language \n\t 1-) English \n\t 2-) Spanish \n\t 3-) Turkish \n\t 4-) Russian \n\t 5-) French");
        int num1 = input.nextInt();

        if (num1 == 1) {
            System.out.println("Hello, thank you your call");
        } else if (num1 == 2) {
            System.out.println("Hola, thank you your call");
        } else if (num1 == 3) {
            System.out.println("Merhaba, thank you your call");
        } else if (num1 == 4) {
            System.out.println("Privet, thank you your call");
        } else if (num1 == 5) {
            System.out.println("Merci, thank you your call");
        }else{
            System.out.println("We will use English by default");
        }

    }
}
