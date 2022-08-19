package practice.Udemy;

import java.util.Scanner;

public class IfExercises3 {
    public static void main(String[] args) {
        Scanner numberAbout = new Scanner(System.in);

        System.out.println("What do you want to know about number? \nGive me a number:");
        int number = numberAbout.nextInt();
        if( number > 0){
            System.out.println("Your number " + number +" greater then zero (0) ");
        } else if (number < 0 ) {
            System.out.println("your number " + number + " lower then zero (0)");
        } else{
            System.out.println("your number " + number + " equal to zero (0)");
        }
    }
}
