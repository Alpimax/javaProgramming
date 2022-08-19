package practice.Udemy;

import java.util.Scanner;

public class Ifexercise {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        System.out.println("Please enter a number :");
        int number1 = ask.nextInt();
        System.out.println("Please enter an other number :");
        int number2 = ask.nextInt();
        if(number1 == number2){
            System.out.println("You got same number");
        } else{
            System.out.println("You got two different number which was one of them " + number1 +
                    " an other one " + number2 + "." );
        }
    }
}
